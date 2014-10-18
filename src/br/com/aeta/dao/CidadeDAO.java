package br.com.aeta.dao;

import br.com.aeta.interfaces.CidadeIDAO;
import br.com.aeta.model.Cidade;
import br.com.aeta.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class CidadeDAO implements CidadeIDAO {

    Connection conexao;

    public CidadeDAO() {
        conexao = Conexao.abrir();

    }

    public Boolean salvar(Cidade c) {
        PreparedStatement ps = null;//Statement = declaração
        StringBuffer sb = new StringBuffer(); //string que nao e imutavel, ocupa menos espaço que a string, pois a utilizacao do banco ocupa muito memoria
        Integer codigo = c.getId();
        String cidade = c.getCidade();
        String estado = c.getEstado();
        String sql = "insert into cidade values(" + codigo + " ,'" + cidade + "' ,'" + estado + "')";
        sb.append(sql);//append adciona no final da variavel stringbuffer o texto da variavel sql
        try {
            ps = conexao.prepareStatement(sb.toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A cidade " + cidade + " foi adcionado a base de dados");
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}
