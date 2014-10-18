/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.dao;

import br.com.aeta.interfaces.DiretoriaIDAO;
import br.com.aeta.model.Diretoria;
import br.com.aeta.util.Conexao;
import br.com.aeta.util.ObterIdFK;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme.franco
 */
public class DiretoriaDAO implements DiretoriaIDAO {

    Connection conexao;

    public DiretoriaDAO() {
        conexao = Conexao.abrir();
    }
    
    
    @Override
    public boolean salvar(Diretoria d) {
        try {
            String sql = "insert into diretoria values(?, ?, ?, ?)";     
            PreparedStatement p = conexao.prepareStatement(sql);
            p.setInt(1, d.getId());
            p.setInt(2, d.getSocio());
            p.setInt(3, d.getSocio());
            p.setString(4, d.getCargo());
            p.setString(5, d.getVencimento());
            p.execute();
            p.close();
            JOptionPane.showMessageDialog(null, "O Socio "+d.getNome()+" foi cadastrado como: "+d.getCargo()+ "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O Socio ou o Cargo ja estão inseridos no registro de diretores");
        }
        return false;
    }

    @Override
    public void lista(DefaultTableModel modelo) {
            String comando = "select a.dir_socio, a.dir_cargo, a.dir_vencimento, b.soc_nome, b.soc_telefone, b.soc_email from diretoria a inner join socio b on a.dir_socio = b.soc_id";        
            try (Statement statement = conexao.createStatement()) {
                ResultSet rs = statement.executeQuery(comando);
            while (rs.next()) {
          
                int id_socio = rs.getInt("a.dir_socio");
                String nome = rs.getString("b.soc_nome");
                String cargo = rs.getString("a.dir_cargo");
                String telefone = rs.getString("b.soc_telefone");
                String email = rs.getString("b.soc_email");
                String vencimento = rs.getString("a.dir_vencimento");
                
                modelo.addRow(new Object[]{id_socio, nome, cargo, telefone, email, vencimento});
            }
        } catch (SQLException ex) {
      Logger.getLogger(DiretoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados");
        }
    }
} 