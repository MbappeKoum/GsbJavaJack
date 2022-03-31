/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Model.ModelPageRegionD;
import Tools.FonctionsMetier;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author dim
 */

public class FrmPageRegionDefault extends javax.swing.JFrame {

    FonctionsMetier fm;
    ModelPageRegionD mdlReg;
    static String indice;
    
    public FrmPageRegionDefault() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPRDNavVis = new javax.swing.JButton();
        btnPRDNavReg = new javax.swing.JButton();
        btnPRDNavStats = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPRDReg = new javax.swing.JTable();
        btnPRDAjouterReg = new javax.swing.JButton();
        btnPRDModifReg = new javax.swing.JButton();
        btnDeconnexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true)));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion des Visiteurs");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        btnPRDNavVis.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnPRDNavVis.setText("Visiteurs");
        btnPRDNavVis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnPRDNavVis.setPreferredSize(new java.awt.Dimension(160, 29));
        btnPRDNavVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPRDNavVisMouseClicked(evt);
            }
        });

        btnPRDNavReg.setBackground(new java.awt.Color(255, 204, 0));
        btnPRDNavReg.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnPRDNavReg.setText("Régions");
        btnPRDNavReg.setPreferredSize(new java.awt.Dimension(160, 37));

        btnPRDNavStats.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnPRDNavStats.setText("Statistiques");
        btnPRDNavStats.setMaximumSize(new java.awt.Dimension(160, 37));
        btnPRDNavStats.setMinimumSize(new java.awt.Dimension(160, 37));
        btnPRDNavStats.setPreferredSize(new java.awt.Dimension(160, 37));
        btnPRDNavStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPRDNavStatsMouseClicked(evt);
            }
        });

        tblPRDReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPRDReg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblPRDReg);

        btnPRDAjouterReg.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnPRDAjouterReg.setText("Ajouter une région");
        btnPRDAjouterReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPRDAjouterRegMouseClicked(evt);
            }
        });

        btnPRDModifReg.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnPRDModifReg.setText("Modifier");
        btnPRDModifReg.setPreferredSize(new java.awt.Dimension(160, 37));
        btnPRDModifReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPRDModifRegMouseClicked(evt);
            }
        });

        btnDeconnexion.setText("DECONNEXION");
        btnDeconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeconnexionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(btnPRDNavReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(btnPRDNavVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(322, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPRDAjouterReg, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPRDModifReg, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnPRDNavStats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(86, 86, 86)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeconnexion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeconnexion)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPRDNavReg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRDNavVis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRDNavStats, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPRDModifReg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRDAjouterReg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        fm = new FonctionsMetier();
        mdlReg = new ModelPageRegionD();
        mdlReg.loadDatas(fm.GetAllRegions());
        tblPRDReg.setModel(mdlReg);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnPRDNavVisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPRDNavVisMouseClicked
        // TODO add your handling code here:
        FrmPageVisiteurDefault frm = new FrmPageVisiteurDefault();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPRDNavVisMouseClicked

    private void btnPRDAjouterRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPRDAjouterRegMouseClicked
        // TODO add your handling code here:
        
        FrmPageRegionAdd frm = new FrmPageRegionAdd();
        frm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnPRDAjouterRegMouseClicked

    private void btnPRDModifRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPRDModifRegMouseClicked
        // TODO add your handling code here:
        int column = 0;
        int row = tblPRDReg.getSelectedRow();
//        JOptionPane.showMessageDialog(this, row, "INFOS", JOptionPane.INFORMATION_MESSAGE);
        if (row == -1) 
        {
            JOptionPane.showMessageDialog(this, "Veuillez choisir une région ", "INFOS", JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            indice = tblPRDReg.getValueAt(row, column).toString();

            FrmPageRegionEdit frm = new FrmPageRegionEdit(indice);
            frm.setVisible(true);
            this.setVisible(false);
        }
        
        

        
    }//GEN-LAST:event_btnPRDModifRegMouseClicked

    private void btnDeconnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionMouseClicked
        // TODO add your handling code here:
        
        FrmPageAccueil frm = new FrmPageAccueil();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDeconnexionMouseClicked

    private void btnPRDNavStatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPRDNavStatsMouseClicked
        // TODO add your handling code here:
        
        FrmPageStatistique frm = new FrmPageStatistique();
        frm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnPRDNavStatsMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPageRegionDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPageRegionDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPageRegionDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPageRegionDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPageRegionDefault().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeconnexion;
    private javax.swing.JButton btnPRDAjouterReg;
    private javax.swing.JButton btnPRDModifReg;
    private javax.swing.JButton btnPRDNavReg;
    private javax.swing.JButton btnPRDNavStats;
    private javax.swing.JButton btnPRDNavVis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPRDReg;
    // End of variables declaration//GEN-END:variables
}