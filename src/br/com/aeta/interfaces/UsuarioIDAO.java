/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aeta.interfaces;

import br.com.aeta.model.Usuario;
import java.sql.SQLException;

/**
 *
 * @author guilherme.franco
 */
public interface UsuarioIDAO {
    Boolean salvar (Usuario u);
    public Usuario login(String login, String senha) throws SQLException;
}
