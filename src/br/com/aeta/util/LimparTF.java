/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.util;

import javax.swing.JTextField;

/**
 *
 * @author guilherme.franco
 */
public class LimparTF {
    public static boolean limparTf(JTextField... jTextFields) {
        for (JTextField jTextField : jTextFields) {
            jTextField.setText(null);
        }
        return true;
    }
}
