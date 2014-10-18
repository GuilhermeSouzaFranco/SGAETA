/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.util;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author guilherme.franco
 */
public class ValidarCamposTF {

    public static boolean validarCampos(JTextField... jTextFields) {
        for (JTextField jTextField : jTextFields) {
            
            if (jTextField.getText().trim().equals("")) {
                jTextField.requestFocus();
               
                return false;
            }
        }
        return true;
    }
}
