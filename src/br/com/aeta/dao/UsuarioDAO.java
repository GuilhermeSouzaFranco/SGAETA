/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.dao;

import br.com.aeta.interfaces.UsuarioIDAO;
import br.com.aeta.model.Usuario;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme.franco
 */
public class UsuarioDAO implements UsuarioIDAO {

    Connection conexao;

    public UsuarioDAO() {
        conexao = Conexao.abrir();
    }

    @Override
    public Boolean salvar(Usuario u) {
        PreparedStatement ps = null;//Statement = declaração
        StringBuffer sb = new StringBuffer(); //string que nao e imutavel, ocupa menos espaço que a string, pois a utilizacao do banco ocupa muito memoria
        Integer codigo = u.getId();
        String usuario = u.getUsuario();
        String senha = u.getSenha();
        String permissao = u.getPermissao();
        String nome = u.getNome();
        String sobrenome = u.getSobrenome();
        String sql = "insert into usuario values(" + codigo + " ,'" + usuario + "','" + senha + "','" + permissao + "','"+nome+"','"+sobrenome+"')";
        sb.append(sql);//append adciona no final da variavel stringbuffer o texto da variavel sql
        try {
            ps = conexao.prepareStatement(sb.toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "O usuario " + nome + " foi adcionado a base de dados");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public Usuario login(String login, String senha) throws SQLException {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE usu_usuario=? AND usu_senha=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, login);
        ps.setObject(2, senha);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            usuario = new Usuario();
            usuario.setUsuario(rs.getString("usu_usuario"));
            usuario.setSenha(rs.getString("usu_senha"));
            usuario.setNome(rs.getString("usu_nome"));

        }
        return usuario;
    }
}
