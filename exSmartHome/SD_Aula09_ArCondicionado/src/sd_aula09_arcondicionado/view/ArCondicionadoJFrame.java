package sd_aula09_arcondicionado.view;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sd_aula09_arcondicionado.controller.AC_Controller;
import sd_aula09_arcondicionado.model.ArCondicionado;

public class ArCondicionadoJFrame extends javax.swing.JFrame {

    private ArCondicionado ac = new ArCondicionado();
    private AC_Controller acController = new AC_Controller(ac);

    public ArCondicionadoJFrame() {
        initComponents();
        TemperaturaAtualjLabel.setVisible(false);
        TempjButton.setVisible(false);
        ValorTempAtualjLabel1.setVisible(false);
        jTextField1.setVisible(false);

        WindjButton1.setVisible(false);
        WindjLabel.setVisible(false);
        ValorVentojLabel1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PowerjButton = new javax.swing.JButton();
        TemperaturaAtualjLabel = new javax.swing.JLabel();
        ValorTempAtualjLabel1 = new javax.swing.JLabel();
        WindjLabel = new javax.swing.JLabel();
        ValorVentojLabel1 = new javax.swing.JLabel();
        LigaDesligajLabel = new javax.swing.JLabel();
        ValorLigaDesligajLabel1 = new javax.swing.JLabel();
        TempjButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        WindjButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PowerjButton.setBackground(java.awt.Color.white);
        PowerjButton.setText("Liga");
        PowerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerjButtonActionPerformed(evt);
            }
        });

        TemperaturaAtualjLabel.setText("Temperatura Atual");

        ValorTempAtualjLabel1.setText("23");

        WindjLabel.setText("Vento");

        ValorVentojLabel1.setText("Desligado");

        LigaDesligajLabel.setBackground(java.awt.Color.red);
        LigaDesligajLabel.setText("Ar Condicionado");

        ValorLigaDesligajLabel1.setText("Desligado");

        TempjButton.setBackground(java.awt.Color.white);
        TempjButton.setText("Alterar");
        TempjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempjButtonActionPerformed(evt);
            }
        });

        WindjButton1.setBackground(java.awt.Color.white);
        WindjButton1.setText("Liga");
        WindjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WindjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ValorLigaDesligajLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PowerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(ValorVentojLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ValorTempAtualjLabel1)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WindjButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(TempjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TemperaturaAtualjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WindjLabel)
                            .addComponent(LigaDesligajLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LigaDesligajLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorLigaDesligajLabel1)
                    .addComponent(PowerjButton))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TemperaturaAtualjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValorTempAtualjLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TempjButton)))
                .addGap(18, 18, 18)
                .addComponent(WindjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorVentojLabel1)
                    .addComponent(WindjButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Ar Condicionado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void PowerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerjButtonActionPerformed
        try {
            acController.turnOffOn();
        } catch (RemoteException ex) {
            Logger.getLogger(ArCondicionadoJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!ac.isPowerButton()) {
            ValorLigaDesligajLabel1.setText("Desligado");
            PowerjButton.setText("Liga");

            TemperaturaAtualjLabel.setVisible(false);
            TempjButton.setVisible(false);
            ValorTempAtualjLabel1.setVisible(false);
            jTextField1.setVisible(false);

            WindjButton1.setVisible(false);
            WindjLabel.setVisible(false);
            ValorVentojLabel1.setVisible(false);

        } else {
            ValorLigaDesligajLabel1.setText("Ligado");
            PowerjButton.setText("Desliga");

            TemperaturaAtualjLabel.setVisible(true);
            TempjButton.setVisible(true);
            ValorTempAtualjLabel1.setVisible(true);
            jTextField1.setVisible(true);

            WindjButton1.setVisible(true);
            WindjLabel.setVisible(true);
            ValorVentojLabel1.setVisible(true);
        }

    }//GEN-LAST:event_PowerjButtonActionPerformed

    private void WindjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WindjButton1ActionPerformed
        try {
            acController.turnWindOffOn();
        } catch (RemoteException ex) {
            Logger.getLogger(ArCondicionadoJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!ac.isWind()) {
            ValorVentojLabel1.setText("Desligado");
            WindjButton1.setText("Liga");
        } else {
            ValorVentojLabel1.setText("Ligado");
            WindjButton1.setText("Desliga");
        }
    }//GEN-LAST:event_WindjButton1ActionPerformed

    private void TempjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempjButtonActionPerformed

        try {
            acController.changeTemperature(Float.valueOf(jTextField1.getText()));
        } catch (RemoteException ex) {
            Logger.getLogger(ArCondicionadoJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ValorTempAtualjLabel1.setText(String.valueOf(ac.getTemperature()));

    }//GEN-LAST:event_TempjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArCondicionadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArCondicionadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArCondicionadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArCondicionadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArCondicionadoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LigaDesligajLabel;
    private javax.swing.JButton PowerjButton;
    private javax.swing.JLabel TemperaturaAtualjLabel;
    private javax.swing.JButton TempjButton;
    private javax.swing.JLabel ValorLigaDesligajLabel1;
    private javax.swing.JLabel ValorTempAtualjLabel1;
    private javax.swing.JLabel ValorVentojLabel1;
    private javax.swing.JButton WindjButton1;
    private javax.swing.JLabel WindjLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
