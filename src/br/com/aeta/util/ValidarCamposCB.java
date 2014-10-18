/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.util;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

/**
 *
 * @author guilherme.franco
 */
public class ValidarCamposCB {
    public static boolean validarCampos(JComboBox... jComboBoxs) {
        for (JComboBox jComboBox : jComboBoxs) {
          
            if (jComboBox.getSelectedItem().equals("")) {
                jComboBox.requestFocus();
         
                return false;
            }
        }
        return true;
    }
}
