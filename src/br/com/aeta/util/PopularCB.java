/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.util;

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
public class PopularCB {
    public static boolean popularCB(JComboBox jComboBox, String tabela, String campo) {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeta_db1", "root", "root");
            Statement stm = con.createStatement();
            String sql = "select * from  "+tabela+"";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                jComboBox.addItem(rs.getString(campo));
            }
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao carregar o ComboBox");
        }
        return true;
    }
}
