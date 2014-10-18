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

/**
 *
 * @author guilherme.franco
 */
public class NomeImg {

    public void nomeImg() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
        Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeta_db1", "root", "root");
        Statement stmt = cone.createStatement();
        String sql = "SELECT soc_id FROM socio ORDER BY soc_id DESC LIMIT 1";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            Global.idFoto = rs.getInt("soc_id") + 1;
        }

    }

}
