/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.interfaces;

import br.com.aeta.model.Periscopio;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme.franco
 */
public interface PeriscopioIDAO {
    public Boolean salvar (Periscopio p);
    public void lista (DefaultTableModel modelo);
}
