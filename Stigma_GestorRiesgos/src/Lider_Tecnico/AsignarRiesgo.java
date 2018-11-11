/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lider_Tecnico;

import Login.Login;
import Administrador.BDUsuario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class AsignarRiesgo extends javax.swing.JFrame {

    /**
     * Creates new form AsignarRiesgo
     */
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    boolean listo=false;
    boolean listo2=false;
    int ID = 0;
    BDUsuario mBDU = new BDUsuario();
    BDAcciones mBD = new BDAcciones();
    public AsignarRiesgo() {
        initComponents();
        LlenarC();
        LlenarD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TBrisgos = new javax.swing.JTable();
        CBproyecto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CBDesarrolladores = new javax.swing.JComboBox<>();
        BTNasignar = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TBrisgos.setModel(ModeloTabla);
        TBrisgos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBrisgosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBrisgos);

        CBproyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBproyecto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBproyectoItemStateChanged(evt);
            }
        });
        CBproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBproyectoMouseClicked(evt);
            }
        });

        jLabel2.setText("Desarrollador a cargo");

        jLabel1.setText("Clave De Proyecto:");

        CBDesarrolladores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBDesarrolladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDesarrolladoresActionPerformed(evt);
            }
        });

        BTNasignar.setText("Asignar");
        BTNasignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNasignarMouseClicked(evt);
            }
        });

        BTNCancelar.setText("Cancelar");

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestion de Riesgos");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acciones de Mitigacion");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu10.setText("Acciones de Contingencia");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        jMenu4.setText("Matriz de Riesgos");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(CBDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(CBproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCancelar)
                    .addComponent(BTNasignar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBDesarrolladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDesarrolladoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBDesarrolladoresActionPerformed

    private void CBproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBproyectoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CBproyectoMouseClicked

    private void CBproyectoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBproyectoItemStateChanged
        // TODO add your handling code here:
        if(listo) {
       if (mBD.ConectarAcciones())  {
            String C = "";
            C = CBproyecto.getSelectedItem().toString();
            ResultSet Lista = mBD.ConsultaRiesgos2(C);
            
            this.TBrisgos.setModel(Convertidor.convertir(Lista));
        }
        mBD.DesconectarAcciones();
      }
    }//GEN-LAST:event_CBproyectoItemStateChanged

    private void BTNasignarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNasignarMouseClicked
        // TODO add your handling code here:
        Riesgo mR = new Riesgo();
        mR.setID(ID);
        mR.setNombreUser(this.CBDesarrolladores.getSelectedItem().toString());
        
        if (CBDesarrolladores.getSelectedIndex() == 0 || CBproyecto.getSelectedIndex() == 0 || ID == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Riesgo y un Desarrollador");
        } else {
            if (mBD.ConectarAcciones()) {
            if (mBD.AgregarUsuario(mR)) {
                JOptionPane.showMessageDialog(null, "Se Asigno Desarrollador a Riesgo\ncon Exito");
                listo = false;
                listo2 = false;
                LlenarC();
                LlenarD();
                CBproyecto.setSelectedIndex(0);
                CBDesarrolladores.setSelectedIndex(0);
                Borrar();
                ID = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar Accion de Contingencia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en BD");
        }
        }
    }//GEN-LAST:event_BTNasignarMouseClicked

    private void TBrisgosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBrisgosMouseClicked
        // TODO add your handling code here:
         int Seleccion = 0;
        ID = 0;
        Seleccion = this.TBrisgos.rowAtPoint(evt.getPoint());
        
        ID = Integer.parseInt(TBrisgos.getModel().getValueAt(Seleccion,0).toString());
    }//GEN-LAST:event_TBrisgosMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        PrincipalLider mP = new PrincipalLider();
        mP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Riesgos mR = new Riesgos();
        mR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        Mitigacion mM = new Mitigacion();
        mM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        // TODO add your handling code here:
        Contingencia mC = new Contingencia();
        mC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        Matriz mMZ = new Matriz();
        mMZ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        Login mL = new Login();
        mL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    void LlenarC(){
        this.setLocationRelativeTo(null);
        CBproyecto.removeAllItems();
        if (mBD.ConectarAcciones() ) {
            mBD.ConsultarCombo(CBproyecto);
            listo=true;
        } else {
            JOptionPane.showMessageDialog(null, "Error BD");
        }
        mBD.DesconectarAcciones();
    }

    void LlenarD(){
        this.setLocationRelativeTo(null);
        CBDesarrolladores.removeAllItems();
        if (mBDU.ConectarUsuario() ) {
            mBDU.ConsultarComboU(this.CBDesarrolladores);
            listo2=true;
        } else {
            JOptionPane.showMessageDialog(null, "Error BD");
        }
        mBD.DesconectarAcciones();
    }

    void Borrar() {
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) TBrisgos.getModel();
        //Borramosla tabla...
        int c = this.TBrisgos.getRowCount() - 1;
        
        for (int i = c; i >= 0; i--) {
            LimpiadoTabla.removeRow(LimpiadoTabla.getRowCount() - 1);
        }
    }
    
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
            java.util.logging.Logger.getLogger(AsignarRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarRiesgo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTNasignar;
    private javax.swing.JComboBox<String> CBDesarrolladores;
    private javax.swing.JComboBox<String> CBproyecto;
    private javax.swing.JTable TBrisgos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
