/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lider_Tecnico;
import Login.Login;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Luis
 */
public class Contingencia extends javax.swing.JFrame {

    /**
     * Creates new form Contingencia
     */
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    boolean listo=false;
    int ID = 0;
    BDAcciones mBD = new BDAcciones();
    public Contingencia() {
        initComponents();
       LlenarC();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CBProyecto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TXTmit = new javax.swing.JTextArea();
        BTNagrear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBproyecto = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnCan.setText("Cancelar");

        jLabel3.setText("Seleccione Un Riesgo:");

        CBProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBProyecto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBProyectoItemStateChanged(evt);
            }
        });

        jLabel1.setText("Clave De Proyecto:");

        jLabel2.setText("Accion De Contingencia:");

        TXTmit.setColumns(20);
        TXTmit.setLineWrap(true);
        TXTmit.setRows(5);
        jScrollPane3.setViewportView(TXTmit);

        BTNagrear.setText("Agregar");
        BTNagrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNagrearMouseClicked(evt);
            }
        });

        TBproyecto.setModel(ModeloTabla);
        TBproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBproyectoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBproyecto);

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

        jMenu9.setText("Asignacion de Riesgos");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu3.setText("Acciones de Mitigacion");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BTNagrear)
                                    .addGap(18, 18, 18)
                                    .addComponent(BtnCan)
                                    .addGap(142, 142, 142))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(31, 31, 31)
                                        .addComponent(CBProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel3)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNagrear)
                    .addComponent(BtnCan))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNagrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNagrearMouseClicked
        // TODO add your handling code here:
        Riesgo mR = new Riesgo();
        mR.setID(ID);
        mR.setContingencia(this.TXTmit.getText());
        
        if (mBD.ConectarAcciones()) {
            if (mBD.AgregarContingencia(mR)) {
                JOptionPane.showMessageDialog(null, "Se agrego Accion de Contingencia\ncon Exito");
                listo = false;
                LlenarC();
                TXTmit.setText("");
                CBProyecto.setSelectedIndex(0);
                Borrar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar Accion de Contingencia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en BD");
        }
    }//GEN-LAST:event_BTNagrearMouseClicked

    private void CBProyectoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBProyectoItemStateChanged
        // TODO add your handling code here:
        if(listo) {
       if (mBD.ConectarAcciones())  {
            String C = "";
            C = CBProyecto.getSelectedItem().toString();
            ResultSet Lista = mBD.ConsultaRiesgos1(C);
            
            this.TBproyecto.setModel(Convertidor.convertir(Lista));
        }
        mBD.DesconectarAcciones();
      }
    }//GEN-LAST:event_CBProyectoItemStateChanged

    private void TBproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBproyectoMouseClicked
        // TODO add your handling code here:
        int Seleccion = 0;
        ID = 0;
        Seleccion = this.TBproyecto.rowAtPoint(evt.getPoint());
        if (!this.TBproyecto.getModel().getValueAt(Seleccion, 2).toString().equals("-")) {
            this.TXTmit.setText(this.TBproyecto.getModel().getValueAt(Seleccion, 2).toString());
        } else {
            TXTmit.setText("");
        }
        
        ID = Integer.parseInt(TBproyecto.getModel().getValueAt(Seleccion,0).toString());
    }//GEN-LAST:event_TBproyectoMouseClicked

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

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        // TODO add your handling code here:
        AsignarRiesgo mAR = new AsignarRiesgo();
        mAR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        Mitigacion mM = new Mitigacion();
        mM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

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
        CBProyecto.removeAllItems();
        if (mBD.ConectarAcciones()) {
            mBD.ConsultarCombo(CBProyecto);
            listo=true;
        } else {
            JOptionPane.showMessageDialog(null, "Error BD");
        }
        mBD.DesconectarAcciones();
    }
    
    void Borrar() {
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) TBproyecto.getModel();
        //Borramosla tabla...
        int c = this.TBproyecto.getRowCount() - 1;
        
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
            java.util.logging.Logger.getLogger(Contingencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contingencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contingencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contingencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contingencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNagrear;
    private javax.swing.JButton BtnCan;
    private javax.swing.JComboBox<String> CBProyecto;
    private javax.swing.JTable TBproyecto;
    private javax.swing.JTextArea TXTmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
