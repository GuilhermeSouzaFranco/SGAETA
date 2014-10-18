/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.dao;

import br.com.aeta.interfaces.BairroIDAO;
import br.com.aeta.model.Bairro;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class BairroDAO implements BairroIDAO {

    Connection conexao;

    public BairroDAO() {
        conexao = Conexao.abrir();
    }

    @Override
    public Boolean salvar(Bairro b) {
        PreparedStatement ps = null;//Statement = declaração
        StringBuffer sb = new StringBuffer(); //string que nao e imutavel, ocupa menos espaço que a string, pois a utilizacao do banco ocupa muito memoria
        Integer codigo = b.getId();
        String bairro = b.getBairro();
        String sql = "insert into bairro values(" + codigo + " ,'" + bairro + "')";
        sb.append(sql);//append adciona no final da variavel stringbuffer o texto da variavel sql
        try {
            ps = conexao.prepareStatement(sb.toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "O bairro " + bairro + " foi adcionado a base de dados");
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    
    @Override
    public void consultar(Bairro b) {
      String comando = "Select id_usuario from usuario where";        
            try (Statement statement = conexao.createStatement()) {
                ResultSet resultSet = statement.executeQuery(comando);
                resultSet.next();
                    b.setId(resultSet.getInt("bai_id"));
                    b.setBairro(resultSet.getString("baio_bairro"));             
            } catch (SQLException ex) {
                Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

    }

    
}




