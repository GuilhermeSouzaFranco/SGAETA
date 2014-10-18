/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.dao;

import br.com.aeta.interfaces.InstituicaoIDAO;
import br.com.aeta.model.Instituicao;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme.franco
 */
public class InstituicaoDAO implements InstituicaoIDAO {

    Connection conexao;

    public InstituicaoDAO() {
        conexao = Conexao.abrir();
    }

    @Override
    public Boolean salvar(Instituicao i) {
        
        PreparedStatement ps = null;//Statement = declaração
        StringBuffer sb = new StringBuffer(); //string que nao e imutavel, ocupa menos espaço que a string, pois a utilizacao do banco ocupa muito memoria
        Integer codigo = i.getId();
        Integer cidade = i.getCid();     
        String instituicao = i.getInstituicao();
        String cep = i.getCep();
        String endereco = i.getEndereco();
        String telefone1 = i.getTelefone1();
        String telefone2 = i.getTelefone2();
        String email = i.getEmail();
        String sql = "insert into instituicao values(" + codigo + " ," + cidade + ",'" + instituicao + "','" + cep + "','" + endereco + "','" + telefone1 + "','" + telefone2 + "','" + email + "')";
        sb.append(sql);//append adciona no final da variavel stringbuffer o texto da variavel sql
        try {
            ps = conexao.prepareStatement(sb.toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A Instituição " + instituicao + " foi adcionado a base de dados");
        } catch (SQLException ex) {
            Logger.getLogger(InstituicaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
