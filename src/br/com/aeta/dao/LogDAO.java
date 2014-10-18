/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 ;
package br.com.aeta.dao;

import br.com.aeta.interfaces.LogIDAO;
import br.com.aeta.model.Log;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme.franco
 */


public class LogDAO implements LogIDAO {

    Connection conexao;

    public LogDAO() {
        conexao = Conexao.abrir();
    }

    public Boolean salvar(String user) {
        PreparedStatement ps = null;
        StringBuffer sb = new StringBuffer();
        Integer codigo = null;

        Date date = new Date(System.currentTimeMillis());
        Time time = new Time(System.currentTimeMillis());
        String sql = "insert into acesso values(" + codigo + " , '" + user + "' , '" + date + "' , '" + time + "')";
        sb.append(sql);
        try {
            ps = conexao.prepareStatement(sb.toString());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public String ultimo_acesso(String user) {
        String comando = "select * from acesso where ace_usuario = '"+user+"' order by  ace_id desc limit 1;";
        try (Statement statement = conexao.createStatement()) {
            ResultSet rs = statement.executeQuery(comando);
            while (rs.next()) {
                Date data_acesso = rs.getDate("ace_data");
                Time hora_acesso = rs.getTime("ace_hora");
                            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DiretoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados");
        }
        return null;
    }

}
