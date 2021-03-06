/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Login.Login;
import java.awt.Color;
import java.sql.ResultSet;

/**
 *
 * @author Luis
 */
public class Usuarios extends javax.swing.JFrame {

    DefaultTableModel ModeloTabla1 = new DefaultTableModel();
    DefaultTableModel ModeloTabla2 = new DefaultTableModel();
    DefaultTableModel ModeloTabla3 = new DefaultTableModel();
    BDUsuario mBD = new BDUsuario();
    int ID = 0;
    String Clave = "";

    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Llena los combobox en las distintas pestañas
        setFilas();
        IMG.Fondo Fondoq = new IMG.Fondo(Fondo);
        Fondo.add(Fondoq).repaint();
        Fondo.setOpaque(false);
        Fondo.setBorder(null);
        Fondo.setBackground(new Color(0, 0, 0, 64));
        //Pestaña 1
        IMG.Fondo FondoA = new IMG.Fondo(Fondo1);
        Fondo1.add(FondoA).repaint();
        Fondo1.setOpaque(false);
        Fondo1.setBorder(null);
        Fondo1.setBackground(new Color(0, 0, 0, 64));
        //Pestaña2
        IMG.Fondo Fondob = new IMG.Fondo(Fondo2);
        Fondo2.add(Fondob).repaint();
        Fondo2.setOpaque(false);
        Fondo2.setBorder(null);
        Fondo2.setBackground(new Color(0, 0, 0, 64));
        //Pestaña3
        IMG.Fondo Fondoc = new IMG.Fondo(Fondo3);
        Fondo3.add(Fondoc).repaint();
        Fondo3.setOpaque(false);
        Fondo3.setBorder(null);
        Fondo3.setBackground(new Color(0, 0, 0, 64));
        //Pestaña4
        IMG.Fondo Fondom = new IMG.Fondo(Fondo4);
        Fondo4.add(Fondom).repaint();
        Fondo4.setOpaque(false);
        Fondo4.setBorder(null);
        Fondo4.setBackground(new Color(0, 0, 0, 64));

        //AutoSizeMode = GrowAndShrink;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Fondo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        TxtNomUser = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        CBTipo = new javax.swing.JComboBox<>();
        BtnCancelar = new javax.swing.JButton();
        TxtPass = new javax.swing.JPasswordField();
        BtnAdd = new javax.swing.JButton();
        Fondo2 = new javax.swing.JPanel();
        TxtEliminar = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBUsuarios1 = new javax.swing.JTable();
        Fondo3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TxtNomUser1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBUsuarios2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        BtnCancelar2 = new javax.swing.JButton();
        TxtPass1 = new javax.swing.JPasswordField();
        BtnMod = new javax.swing.JButton();
        Fondo4 = new javax.swing.JPanel();
        TxtCriterio = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBUsuarios3 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Usuarios");
        setBackground(new java.awt.Color(204, 0, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 255));

        Fondo1.setLayout(null);

        jLabel1.setText("Nombre: ");
        Fondo1.add(jLabel1);
        jLabel1.setBounds(30, 35, 44, 14);

        jLabel2.setText("Nombre de Usuario: ");
        Fondo1.add(jLabel2);
        jLabel2.setBounds(30, 90, 98, 14);

        jLabel3.setText("Correo Electronico: ");
        Fondo1.add(jLabel3);
        jLabel3.setBounds(30, 146, 95, 14);

        jLabel4.setText("Contraseña: ");
        Fondo1.add(jLabel4);
        jLabel4.setBounds(30, 191, 180, 14);

        jLabel6.setText("Tipo de Usuario: ");
        Fondo1.add(jLabel6);
        jLabel6.setBounds(30, 240, 90, 14);

        TxtNom.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TxtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomActionPerformed(evt);
            }
        });
        Fondo1.add(TxtNom);
        TxtNom.setBounds(140, 30, 260, 30);
        Fondo1.add(TxtNomUser);
        TxtNomUser.setBounds(140, 80, 260, 30);
        Fondo1.add(TxtEmail);
        TxtEmail.setBounds(140, 140, 260, 30);

        CBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione Un Tipo De Usuario-", "Administrador", "Lider Tecnico", "Desarrollador" }));
        Fondo1.add(CBTipo);
        CBTipo.setBounds(140, 240, 260, 20);

        BtnCancelar.setText("Cancelar");
        Fondo1.add(BtnCancelar);
        BtnCancelar.setBounds(350, 320, 75, 23);
        Fondo1.add(TxtPass);
        TxtPass.setBounds(140, 190, 260, 30);

        BtnAdd.setText("Aceptar");
        BtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddMouseClicked(evt);
            }
        });
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        Fondo1.add(BtnAdd);
        BtnAdd.setBounds(30, 320, 71, 23);

        jTabbedPane1.addTab("Alta", Fondo1);

        TxtEliminar.setEnabled(false);

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        TBUsuarios1.setModel(ModeloTabla1);
        TBUsuarios1.setEnabled(false);
        TBUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBUsuarios1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBUsuarios1);

        javax.swing.GroupLayout Fondo2Layout = new javax.swing.GroupLayout(Fondo2);
        Fondo2.setLayout(Fondo2Layout);
        Fondo2Layout.setHorizontalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo2Layout.createSequentialGroup()
                        .addComponent(TxtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminar)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        Fondo2Layout.setVerticalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja", Fondo2);

        jLabel7.setText("Nombre Usuario: ");

        jLabel11.setText("Nueva Contraseña");

        TBUsuarios2.setModel(ModeloTabla1);
        TBUsuarios2.setEnabled(false);
        TBUsuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBUsuarios2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBUsuarios2);

        jLabel13.setText("ID:");

        TxtID.setEnabled(false);

        BtnCancelar2.setText("Cancelar");

        BtnMod.setText("Modificar");
        BtnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Fondo3Layout = new javax.swing.GroupLayout(Fondo3);
        Fondo3.setLayout(Fondo3Layout);
        Fondo3Layout.setHorizontalGroup(
            Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo3Layout.createSequentialGroup()
                .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addGap(56, 56, 56)
                        .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtNomUser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(TxtPass1)
                            .addComponent(TxtID)))
                    .addGroup(Fondo3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Fondo3Layout.createSequentialGroup()
                                .addComponent(BtnMod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCancelar2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fondo3Layout.setVerticalGroup(
            Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(52, 52, 52)
                .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCancelar2)
                    .addComponent(BtnMod))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificacion", Fondo3);

        TxtCriterio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCriterioKeyTyped(evt);
            }
        });

        TBUsuarios3.setModel(ModeloTabla1);
        TBUsuarios3.setEnabled(false);
        jScrollPane3.setViewportView(TBUsuarios3);

        javax.swing.GroupLayout Fondo4Layout = new javax.swing.GroupLayout(Fondo4);
        Fondo4.setLayout(Fondo4Layout);
        Fondo4Layout.setHorizontalGroup(
            Fondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(Fondo4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(TxtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fondo4Layout.setVerticalGroup(
            Fondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Consulta", Fondo4);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jMenuBar1.setEnabled(false);

        jMenu5.setText("Inicio");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu1.setText("Proyectos");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Matriz De Riesgos");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setFilas() {

        if (mBD.ConectarUsuario()) {

            ResultSet ListaE = mBD.Consulta();
            ResultSet ListaM = mBD.Consulta();
            ResultSet ListaC = mBD.Consulta();

            this.TBUsuarios1.setModel(Convertidor.convertir(ListaE));
            this.TBUsuarios2.setModel(Convertidor.convertir(ListaM));
            this.TBUsuarios3.setModel(Convertidor.convertir(ListaC));
        }
        mBD.DesconectarUsuario();
    }

    void Borrar() {
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) TBUsuarios1.getModel();
        DefaultTableModel LimpiadoTabla2 = (DefaultTableModel) TBUsuarios2.getModel();
        DefaultTableModel LimpiadoTabla3 = (DefaultTableModel) TBUsuarios3.getModel();
        //Borramosla tabla...
        int a = TBUsuarios1.getRowCount() - 1;
        int b = TBUsuarios2.getRowCount() - 1;
        int c = TBUsuarios3.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {
            LimpiadoTabla.removeRow(LimpiadoTabla.getRowCount() - 1);
        }

        for (int i = b; i >= 0; i--) {
            LimpiadoTabla2.removeRow(LimpiadoTabla2.getRowCount() - 1);
        }

        for (int i = c; i >= 0; i--) {
            LimpiadoTabla3.removeRow(LimpiadoTabla3.getRowCount() - 1);
        }
    }

    void BorrarC() {
        DefaultTableModel LimpiadoTabla3 = (DefaultTableModel) TBUsuarios3.getModel();
        //Borramosla tabla...
        int c = TBUsuarios3.getRowCount() - 1;

        for (int i = c; i >= 0; i--) {
            LimpiadoTabla3.removeRow(LimpiadoTabla3.getRowCount() - 1);
        }
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void TBUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBUsuarios1MouseClicked
        //Obtiene el ID del usuario seleccionado ademas de llenar de mostrar el nombre del usuario en la caja de texto
        int Seleccion = 0;
        ID = 0;
        this.TxtEliminar.setText("");
        Seleccion = this.TBUsuarios1.rowAtPoint(evt.getPoint());
        this.TxtEliminar.setText(this.TBUsuarios1.getModel().getValueAt(Seleccion, 1).toString());
        ID = Integer.parseInt(TBUsuarios1.getModel().getValueAt(Seleccion, 0).toString());
    }//GEN-LAST:event_TBUsuarios1MouseClicked

    private void TBUsuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBUsuarios2MouseClicked
        //Obtiene el ID del usuario seleccionado ademas de llenar de mostrar el nombre de usuario en la caja de texto
        int Seleccion = 0;
        this.TxtID.setText("");

        this.TxtNomUser1.setText(null);
        this.TxtPass.setText(null);

        Seleccion = this.TBUsuarios2.rowAtPoint(evt.getPoint());
        this.TxtID.setText(this.TBUsuarios2.getModel().getValueAt(Seleccion, 0).toString());
        this.TxtNomUser1.setText(this.TBUsuarios2.getModel().getValueAt(Seleccion, 2).toString());
    }//GEN-LAST:event_TBUsuarios2MouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        //Verifica que el ID del usuario no este vacio
        if (this.TxtEliminar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione un usuario antes");
        } else {
            if (mBD.ConectarUsuario()) {
                //Elimina al usuario seleccionado
                if (mBD.EliminarUsuario(ID)) {
                    JOptionPane.showMessageDialog(null, "Usuario dado de baja");
                    TxtEliminar.setText("");
                    Borrar();
                    this.setFilas();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.DesconectarUsuario();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void TxtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomActionPerformed

    private void TxtCriterioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCriterioKeyTyped
        // Verifica que en caso de que el criterio de busqueda este vacio presente todos los usuarios
        if (TxtCriterio.equals("")) {
            Borrar();
            setFilas();
            JOptionPane.showMessageDialog(null, "Indique un criterio para realizar busqueda");
        } else {
            //Borra los elementos de la tabla y vuelve a llenarla dependiendo del criterio escrito en a caja de texto
            BorrarC();
            if (mBD.ConectarUsuario()) {

                ResultSet Lista = null;
                Lista = mBD.ConsultaFiltro(TxtCriterio.getText());

                this.TBUsuarios3.setModel(Convertidor.convertir(Lista));

            } else {
                JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
            }
            mBD.DesconectarUsuario();
        }
    }//GEN-LAST:event_TxtCriterioKeyTyped

    private void BtnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseClicked
        // Verifica que los elementos necesarios no esten vacios
        if ((this.TxtNom.equals(null)) || (this.TxtNomUser.equals(null)) || (this.TxtEmail.equals(null)) 
                || (TxtPass.equals(null)) || CBTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos antes de guardar");

        } else {
            Usuario mUsuario = new Usuario();
            mUsuario.setNombre(TxtNom.getText());
            mUsuario.setNomUser(TxtNomUser.getText());
            mUsuario.setEmail(TxtEmail.getText());
            mUsuario.setPassword(TxtPass.getText());
            mUsuario.setTipoUser(CBTipo.getSelectedItem().toString());
            //Da de alta el usuario
            if (mBD.ConectarUsuario()) {
                if (mBD.AgregarUsuario(mUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario Dado de alta de forma exitosa");
                    TxtNom.setText(null);
                    TxtNomUser.setText(null);
                    TxtEmail.setText(null);
                    TxtPass.setText(null);
                    CBTipo.setSelectedIndex(0);
                    Borrar();
                    setFilas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al dar de Alta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.DesconectarUsuario();
        }
    }//GEN-LAST:event_BtnAddMouseClicked

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        PrincipalAdmin mAdmin = new PrincipalAdmin();
        mAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Proyectos mProyectos = new Proyectos();
        this.dispose();
        mProyectos.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Usuarios mUsuarios = new Usuarios();
        mUsuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Login mLogin = new Login();
        mLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        Matriz mMatriz = new Matriz();
        mMatriz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void BtnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModMouseClicked
        // Verifica que los elementos necesarios no esten vacios
        if (this.TxtNomUser1.getText() == "" || this.TxtPass1.getText() == "" || this.TxtID.getText() == "") {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario y llene los campos");
        } else {
            if (mBD.ConectarUsuario()) {

                Usuario mUsuario = new Usuario();
                Usuario nUsuario = new Usuario();
                String T1 = "";

                mUsuario.setID(Integer.parseInt(TxtID.getText()));
                nUsuario.setNomUser(TxtNomUser1.getText());
                nUsuario.setPassword(TxtPass1.getText());
                //Modifica el usuario seleccionado
                if (mBD.ModificarUsuario(mUsuario, nUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario Modificado con Exito");
                    TxtID.setText("");
                    TxtNomUser1.setText("");
                    TxtPass1.setText((""));
                    Borrar();
                    setFilas();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en la BD");
            }
            mBD.DesconectarUsuario();
        }

    }//GEN-LAST:event_BtnModMouseClicked

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCancelar2;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnMod;
    private javax.swing.JComboBox<String> CBTipo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JPanel Fondo3;
    private javax.swing.JPanel Fondo4;
    private javax.swing.JTable TBUsuarios1;
    private javax.swing.JTable TBUsuarios2;
    private javax.swing.JTable TBUsuarios3;
    private javax.swing.JTextField TxtCriterio;
    private javax.swing.JTextField TxtEliminar;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtNomUser;
    private javax.swing.JTextField TxtNomUser1;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JPasswordField TxtPass1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
