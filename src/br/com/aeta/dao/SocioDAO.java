/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.dao;

import br.com.aeta.interfaces.SocioIDAO;
import br.com.aeta.model.Global;
import br.com.aeta.model.Socio;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme.franco
 */
public class SocioDAO implements SocioIDAO {

    Connection conexao;

    public SocioDAO() {
        conexao = Conexao.abrir();
    }

    public Boolean alterarData(Socio s) {
        try {
            String sql = "update socio set soc_nascimento = STR_TO_DATE('" + s.getNascimento() + "', '%d/%m/%Y') where soc_cpf = '" + s.getCpf() + "';";
            PreparedStatement p = conexao.prepareStatement(sql);
            p.execute();
            p.close();
            p = conexao.prepareStatement(sql);
            p.execute();

            JOptionPane.showMessageDialog(null, "O Socio " + s.getNome() + " foi incluido à \n base de dados com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(SocioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public Boolean salvar(Socio s) {
        try {
            s.setFoto(Global.img);
            String sql = "insert into socio values(?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            String sql2 = "update socio set soc_nascimento = STR_TO_DATE('" + s.getNascimento() + "', '%d/%m/%Y') where soc_id = 1;";
            PreparedStatement p = conexao.prepareStatement(sql);
            p.setInt(1, s.getId());
            p.setInt(2, s.getBairro());
            p.setInt(3, s.getInstituicao());
            p.setInt(4, s.getCurso());
            p.setString(5, s.getNome());
            p.setString(6, s.getCpf());
            p.setString(7, s.getRg());
            p.setString(8, s.getTitulo());
            p.setString(9, s.getZona());
            p.setString(10, s.getSecao());
            p.setString(11, s.getEndereco());
            p.setString(12, s.getNumero());
            p.setString(13, s.getTelefone());
            p.setString(14, s.getCelular());
            p.setDate(15, null);
            p.setString(16, s.getEmail());
            p.setString(17, s.getEstadocivil());
            p.setString(18, s.getSexo());
            p.setString(19, s.getDuracao());
            p.setString(20, s.getCursando());
            p.setBytes(21, s.getFoto());
            p.setInt(22, 0);
            p.execute();
            p = conexao.prepareStatement(sql2);
            p.execute();
            p.close();
            alterarData(s);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public JList consultar(String nome) {
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        int i = 0;
        String comando = "SELECT * FROM socio where soc_nome like ('%" + nome + "%')";
        try {
            java.sql.Statement stmt = conexao.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(comando);
            while (rs.next()) {
                model.add(i, rs.getString("soc_nome"));
            }
            stmt.close();

            return list;
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    /**
     *
     * @param nome
     */
    @Override
    public void listar(String nome, Socio s) {
        try {
            String comando = "SELECT a.soc_id, a.soc_nome, a.soc_cpf, a.soc_rg, a.soc_titulo, a.soc_zona, a.soc_secao, "
                    + "a.soc_endereco, a.soc_numero, b.bai_bairro, a.soc_telefone, a.soc_celular, "
                    + "DATE_FORMAT(a.soc_nascimento,'%d%m%Y') AS Date, a.soc_email, a.soc_estadocivil, "
                    + "a.soc_sexo, c.ins_instituicao, d.cur_curso, a.soc_duracao, a.soc_cursando, a.soc_status, a.soc_foto "
                    + "FROM socio a "
                    + "INNER JOIN bairro b ON a.soc_bairro = b.bai_id "
                    + "INNER JOIN instituicao c ON a.soc_instituicao = c.ins_id "
                    + "INNER JOIN curso d ON a.soc_curso = d.cur_id "
                    + "WHERE a.soc_nome = '" + nome + "'";
            java.sql.Statement stmt = conexao.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(comando);
            while (rs.next()) {
                s.setId(rs.getInt("a.soc_id"));
                s.setNome(rs.getString("soc_nome"));
                s.setCpf(rs.getString("a.soc_cpf"));
                s.setRg(rs.getString("a.soc_rg"));
                s.setTitulo(rs.getString("a.soc_titulo"));
                s.setZona(rs.getString("a.soc_zona"));
                s.setSecao(rs.getString("a.soc_secao"));
                s.setEndereco(rs.getString("a.soc_endereco"));
                s.setNumero(rs.getString("a.soc_numero"));
                s.setBairro2(rs.getString("b.bai_bairro"));
                s.setTelefone(rs.getString("a.soc_telefone"));
                s.setCelular(rs.getString("a.soc_celular"));
                //s.setDataNascimento(rs.getDate("a.soc_nascimento"));
                s.setEmail(rs.getString("a.soc_email"));
                s.setEstadocivil(rs.getString("a.soc_estadocivil"));
                s.setSexo(rs.getString("a.soc_sexo"));
                s.setInstituicao2(rs.getString("c.ins_instituicao"));
                s.setCurso2(rs.getString("d.cur_curso"));
                s.setDuracao(rs.getString("a.soc_duracao"));
                s.setCursando(rs.getString("a.soc_cursando"));
                s.setStatus(rs.getInt("a.soc_status"));
                s.setFoto(rs.getBytes("a.soc_foto"));              
            }
            stmt.close();
           //conexao.close();
          
        } catch (SQLException ex) {
            Logger.getLogger(SocioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
