/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.interfaces;

import br.com.aeta.model.Diretoria;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme.franco
 */
public interface DiretoriaIDAO {
   public boolean salvar(Diretoria d); 
   public void lista (DefaultTableModel modelo);
}
