/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.dao;

import br.com.aeta.interfaces.CursoIDAO;
import br.com.aeta.model.Curso;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class CursoDAO implements CursoIDAO {

    Connection conexao;

    public CursoDAO() {
        conexao = Conexao.abrir();
    }

    @Override
    public Boolean salvar(Curso c) {
        PreparedStatement ps = null;//Statement = declaração
        StringBuffer sb = new StringBuffer(); //string que nao e imutavel, ocupa menos espaço que a string, pois a utilizacao do banco ocupa muito memoria
        Integer codigo = c.getId();
        String curso = c.getCurso();
        String modalidade = c.getModalidade();
        String sql = "insert into curso values(" + codigo + " ,'" + curso + "','" + modalidade + "')";
        sb.append(sql);//append adciona no final da variavel stringbuffer o texto da variavel sql
        try {
            ps = conexao.prepareStatement(sb.toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "O curso " + curso + " foi adcionado a base de dados");
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}
