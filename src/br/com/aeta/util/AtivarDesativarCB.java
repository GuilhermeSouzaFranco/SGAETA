/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.util;

import javax.swing.JComboBox;

/**
 *
 * @author guilherme.franco
 */
public class AtivarDesativarCB {
    public static boolean adCB(boolean v, JComboBox... jComboBoxs) {
        for (JComboBox jComboBox : jComboBoxs) {
            jComboBox.setEnabled(v);
        }
        return true;
    }
}
