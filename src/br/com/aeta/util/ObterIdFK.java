/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.util;

import br.com.aeta.model.Global;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author guilherme.franco
 */
public class ObterIdFK {

    Global g = new Global();

    public int obterID(JComboBox jComboBox, String campo, String tabela, String descricao) throws SQLException {
        
              String valor = (String) jComboBox.getSelectedItem();
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
        Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeta_db1", "root", "root");
        Statement stmt = cone.createStatement();
        String sql = "select " + campo + " from " + tabela + " where " + descricao + " = '" + valor + "'";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            g.id = rs.getInt(campo);           
        }
        return rs.getInt(campo);
    }
    
    public int obterIDTF(JTextField jTextField, String campo, String tabela, String descricao) throws SQLException {
        
              String valor = jTextField.getText();
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
        Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeta_db1", "root", "root");
        Statement stmt = cone.createStatement();
        String sql = "select " + campo + " from " + tabela + " where " + descricao + " = '" + valor + "'";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            g.id = rs.getInt(campo);           
        }
        return rs.getInt(campo);
    }
    
}
