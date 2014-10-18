/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.view;

import br.com.aeta.dao.BairroDAO;
import br.com.aeta.dao.LogDAO;
import br.com.aeta.interfaces.BairroIDAO;
import br.com.aeta.interfaces.LogIDAO;
import br.com.aeta.login.LoginEntrada;
import br.com.aeta.model.Bairro;
import br.com.aeta.model.Log;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Guilherme
 */
public class TelaInicial extends javax.swing.JFrame {
    LogIDAO daoAcesso = new LogDAO();
    BairroIDAO daobairro = new BairroDAO();
    Connection conexao;
    Bairro b = new Bairro();
    Log l = new Log();
   
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial(String user) {
        initComponents();
       
        lbUsuario.setText(user);
        this.setLocationRelativeTo(null);
        Hora.setText("  Logado como: " + user + "       -       Acesso em: " + new SimpleDateFormat("dd/MM/yyyy - HH:mm").format(new Date(System.currentTimeMillis()))+"        |||       Ultimo acesso realizado em:");
        //this.setIconImage(new ImageIcon(getClass().getResource("br.com.aeta.img/icone_geral_img.png")).getImage());
        log(user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hora = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIS - AETA 2014");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        Hora.setBackground(new java.awt.Color(0, 0, 0));
        Hora.setForeground(new java.awt.Color(255, 51, 51));
        Hora.setCaretColor(new java.awt.Color(255, 0, 0));
        Hora.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        Hora.setEnabled(false);
        Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/background_img.jpg"))); // NOI18N

        jLabel2.setDisplayedMnemonic('t');
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Olá,");

        lbUsuario.setDisplayedMnemonic('t');
        lbUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(300, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(199, 75));

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/gerenciar_socios_img.png"))); // NOI18N
        jMenu3.setText("Gerenciar Sócios");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu3.setIconTextGap(10);

        jMenuItem4.setText("Cadastrar Sócio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Gerenciar Sócio");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem10.setText("Diretoria Executiva e Conselho Fiscal");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem12.setText("Bolsa de Estudos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Projeto Periscópio");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Comissão Desportiva");
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu12.setBackground(new java.awt.Color(0, 0, 0));
        jMenu12.setForeground(new java.awt.Color(255, 255, 255));
        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/1413576316_transportation_service.png"))); // NOI18N
        jMenu12.setText("Transporte Escolar");

        jMenuItem11.setText("Gerenciar Linhas");
        jMenu12.add(jMenuItem11);

        jMenuItem41.setText("Gerenciar Motoristas");
        jMenu12.add(jMenuItem41);

        jMenuBar1.add(jMenu12);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/gerenciar_atividades_img.png"))); // NOI18N
        jMenu2.setText("Atividades Culturais");

        jMenuItem15.setText("Atividades Cultural - Geral");
        jMenu2.add(jMenuItem15);

        jMenuItem16.setText("Atividades Cultural - Parcial");
        jMenu2.add(jMenuItem16);

        jMenuItem17.setText("Atividades Cultural - Extra");
        jMenu2.add(jMenuItem17);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(0, 0, 0));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/gerenciar_divida_img.png"))); // NOI18N
        jMenu4.setText("Dívida ativa");
        jMenu4.setIconTextGap(10);

        jMenuItem18.setText("Anuidade");
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("Mensalidade");
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("Contribuição");
        jMenu4.add(jMenuItem20);

        jMenu9.setText("Débito Eventual");

        jMenuItem21.setText("Serviços");
        jMenu9.add(jMenuItem21);

        jMenuItem22.setText("Multa");
        jMenu9.add(jMenuItem22);

        jMenu4.add(jMenu9);

        jMenuItem23.setText("Registrar Comprovante");
        jMenu4.add(jMenuItem23);

        jMenuBar1.add(jMenu4);

        jMenu10.setBackground(new java.awt.Color(0, 0, 0));
        jMenu10.setForeground(new java.awt.Color(255, 255, 255));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/planejamento (2).png"))); // NOI18N
        jMenu10.setText("Planejamento Financeiro");
        jMenu10.setIconTextGap(10);

        jMenuItem34.setText("Gastos Anuais");
        jMenu10.add(jMenuItem34);

        jMenuItem35.setText("Receitas Anuais");
        jMenu10.add(jMenuItem35);

        jMenuItem36.setText("Estimativa de Saldo");
        jMenu10.add(jMenuItem36);

        jMenuItem37.setText("Relatorios Financeiro");
        jMenu10.add(jMenuItem37);

        jMenuBar1.add(jMenu10);

        jMenu6.setBackground(new java.awt.Color(0, 0, 0));
        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/controle_caixa_img.png"))); // NOI18N
        jMenu6.setText("Fluxo de caixa");
        jMenu6.setIconTextGap(10);

        jMenuItem24.setText("Lançamento");
        jMenu6.add(jMenuItem24);

        jMenuItem25.setText("Emitir Recibo");
        jMenu6.add(jMenuItem25);

        jMenuItem26.setText("Relatórios");
        jMenu6.add(jMenuItem26);

        jMenuBar1.add(jMenu6);

        jMenu5.setBackground(new java.awt.Color(0, 0, 0));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/gerenciar_patrimonio_img.png"))); // NOI18N
        jMenu5.setText("Patrimonio");
        jMenu5.setIconTextGap(10);

        jMenuItem27.setText("Cadastrar Itens");
        jMenu5.add(jMenuItem27);

        jMenuItem28.setText("Gerenciar Itens");
        jMenu5.add(jMenuItem28);

        jMenuItem29.setText("Relatórios");
        jMenu5.add(jMenuItem29);

        jMenuBar1.add(jMenu5);

        jMenu7.setBackground(new java.awt.Color(0, 0, 0));
        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/gerenciar_oficio_img.png"))); // NOI18N
        jMenu7.setText("Ofícios");
        jMenu7.setIconTextGap(10);

        jMenuItem32.setText("Gerar Ofício");
        jMenu7.add(jMenuItem32);

        jMenuItem30.setText("Ofícios Recebidos");
        jMenu7.add(jMenuItem30);

        jMenuItem31.setText("Ofícios Protocolados");
        jMenu7.add(jMenuItem31);

        jMenuItem33.setText("Consultar Ofícios");
        jMenu7.add(jMenuItem33);

        jMenuBar1.add(jMenu7);

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/manutenção_img.png"))); // NOI18N
        jMenu1.setText("Manutenção");
        jMenu1.setIconTextGap(10);

        jMenuItem1.setText("Gerenciar Bairros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Gerenciar Cursos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Gerenciar Instituições de Ensino");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("Gerenciar Cidades");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Gerenciar Usuários e Permissões de Acesso");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu11.setBackground(new java.awt.Color(0, 0, 0));
        jMenu11.setForeground(new java.awt.Color(255, 255, 255));
        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/monitoramento.png"))); // NOI18N
        jMenu11.setText("Logs de operações");

        jMenuItem38.setText("Operações");
        jMenu11.add(jMenuItem38);

        jMenuItem39.setText("Informações");
        jMenu11.add(jMenuItem39);

        jMenuItem40.setText("Financeiro");
        jMenu11.add(jMenuItem40);

        jMenuBar1.add(jMenu11);

        jMenu8.setBackground(new java.awt.Color(0, 0, 0));
        jMenu8.setForeground(new java.awt.Color(255, 255, 255));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.aeta.img/sair_sistema_img.png"))); // NOI18N
        jMenu8.setText("Sair");

        jMenuItem8.setText("Sair do sistema");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuItem9.setText("Efetuar logoff");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hora))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public LogDAO log(String a){
        daoAcesso.salvar(a);
        return null;
    }
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroBairro cb = new CadastroBairro(this, true);
        cb.setModal(true);
        cb.setVisible(true);
        cb = null;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroCurso cc = new CadastroCurso(this, true);
        cc.setModal(true);
        cc.setVisible(true);
        cc = null;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastroInstituicao ci = new CadastroInstituicao(this, true);
        ci.setModal(true);
        ci.setVisible(true);
        ci = null;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastroSocio cs = new CadastroSocio(this, true);
        cs.setModal(true);
        cs.setVisible(true);
        cs = null;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CadastroCidade cidade = new CadastroCidade(this, true);
        cidade.setModal(true);
        cidade.setVisible(true);
        cidade = null;
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CadastroUsuario usuario = new CadastroUsuario(this, true);
        usuario.setModal(true);
        usuario.setVisible(true);
        usuario = null;
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.setVisible(false);
        try {

            LoginEntrada le = new LoginEntrada();
            le.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        GerenciarSocio gs = new GerenciarSocio(this, true);
        gs.setModal(true);
        gs.setVisible(true);
        gs = null;

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CadastroDiretoria cd = new CadastroDiretoria(this, true);
        cd.setModal(true);
        cd.setVisible(true);
        cd = null;
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        CadastroBolsa cb = new CadastroBolsa(this, true);
        cb.setModal(true);
        cb.setVisible(true);
        cb = null;
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        CadastroPeriscopio cp = new CadastroPeriscopio(this, true);
        cp.setModal(true);
        cp.setVisible(true);
        cp = null;
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaInicial("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}