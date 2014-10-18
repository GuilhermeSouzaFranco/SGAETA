/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.interfaces;

import br.com.aeta.model.Socio;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author guilherme.franco
 */
public interface SocioIDAO {
    Boolean salvar (Socio s);
    public JList consultar(String nome);
    public void listar(String nome, Socio s);
}
