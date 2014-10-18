/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.dao;

import br.com.aeta.interfaces.BolsaIDAO;
import br.com.aeta.model.Bolsa;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme.franco
 */
public class BolsaDAO implements BolsaIDAO {

    Connection conexao;

    public BolsaDAO() {
        
        conexao = Conexao.abrir();
    }
    
    
    
    @Override
    public Boolean salvar(Bolsa b) {
         try {
            String sql = "insert into bolsa values(?, ?, ?)";     
            PreparedStatement p = conexao.prepareStatement(sql);
            p.setInt(1, b.getId());
            p.setInt(2, b.getNome());
            p.setString(3, b.getVencimento_());
            p.execute();
            p.close();
            JOptionPane.showMessageDialog(null, "O Socio "+b.getNome()+" foi cadastrado como membro\nda Comissão de Bolsa de Estudos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O Socio ou o Cargo ja estão inseridos no registro de diretores");
        }
        return false;
    }


    public void lista(DefaultTableModel modelo) {
       String comando = "select a.bol_socio, b.soc_nome, b.soc_telefone, b.soc_email, a.bol_vencimento from bolsa a inner join socio b on a.bol_socio = b.soc_id";        
            try (Statement statement = conexao.createStatement()) {
                ResultSet rs = statement.executeQuery(comando);
            while (rs.next()) {
          
                int id_socio = rs.getInt("a.bol_socio");
                String nome = rs.getString("b.soc_nome");
                String telefone = rs.getString("b.soc_telefone");
                String email = rs.getString("b.soc_email");
                String vencimento = rs.getString("a.bol_vencimento");
                
                modelo.addRow(new Object[]{id_socio, nome, telefone, email, vencimento});
            }
        } catch (SQLException ex) {
      Logger.getLogger(DiretoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados");
        }
    }
    
}
