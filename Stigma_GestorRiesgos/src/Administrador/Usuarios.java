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

/**
 *
 * @author Luis
 */
public class Usuarios extends javax.swing.JFrame {

    DefaultTableModel ModeloTabla1 = new DefaultTableModel();
    DefaultTableModel ModeloTabla2 = new DefaultTableModel();
    DefaultTableModel ModeloTabla3 = new DefaultTableModel();
    BD mBD = new BD();
    public Usuarios() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        TxtEliminar = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBUsuarios1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TxtNom1 = new javax.swing.JTextField();
        TxtNomUser1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtEmail1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CBTipo1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBUsuarios2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        BtnCancelar2 = new javax.swing.JButton();
        TxtPass1 = new javax.swing.JPasswordField();
        TxtTemp1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Nombre de Usuario: ");

        jLabel3.setText("Correo Electronico: ");

        jLabel4.setText("Contraseña: ");

        jLabel6.setText("Tipo de Usuario: ");

        TxtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomActionPerformed(evt);
            }
        });

        CBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione Un Tipo De Usuario-", "Administrador", "Lider Tecnico", "Desarrollador" }));

        BtnCancelar.setText("Cancelar");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtEmail)
                            .addComponent(TxtPass)
                            .addComponent(CBTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 282, Short.MAX_VALUE)
                            .addComponent(TxtNom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNomUser, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPass)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnAdd))
                .addGap(139, 139, 139))
        );

        jTabbedPane1.addTab("Alta", jPanel1);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BtnEliminar)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja", jPanel2);

        jLabel7.setText("Nombre: ");

        jLabel8.setText("Nombre de Usuario: ");

        jLabel9.setText("Correo Electronico: ");

        jLabel10.setText("Contraseña Actual: ");

        jLabel11.setText("Repetir Contraseña");

        CBTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione Un Tipo De Usuario-", "Administrador", "Lider Tecnico", "Desarrollador" }));

        jLabel12.setText("Tipo de Usuario: ");

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

        jButton1.setText("Modificar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtNom1)
                    .addComponent(TxtNomUser1)
                    .addComponent(TxtEmail1)
                    .addComponent(CBTipo1, 0, 260, Short.MAX_VALUE)
                    .addComponent(TxtID)
                    .addComponent(TxtPass1)
                    .addComponent(TxtTemp1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(304, 304, 304)
                        .addComponent(BtnCancelar2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtNomUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(TxtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtTemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CBTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar2)
                    .addComponent(jButton1))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificacion", jPanel3);

        TxtCriterio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCriterioKeyTyped(evt);
            }
        });

        TBUsuarios3.setModel(ModeloTabla1);
        TBUsuarios3.setEnabled(false);
        jScrollPane3.setViewportView(TBUsuarios3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(TxtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(TxtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta", jPanel4);

        jMenu5.setText("Inicio");
        jMenuBar1.add(jMenu5);

        jMenu1.setText("Proyectos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Matriz De Riesgos");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void setFilas() {
        
        BD mBD = new BD();
        Usuario mUsuario = new Usuario();
        
        if (mBD.Conectar()) {
            ArrayList mLista = mBD.Consulta();
            String[] Datos;
            ModeloTabla1.addColumn("IdUsuario");
            ModeloTabla1.addColumn("Nombre");
            ModeloTabla1.addColumn("Nombre Usuario");
            ModeloTabla1.addColumn("EMail");
            ModeloTabla1.addColumn("Tipo Usuario");

            for (Object mListaU : mLista) {
                Datos = new String[5];

                
                mUsuario = (Usuario) mListaU;
                Datos[0] = "" + mUsuario.getID();
                Datos[1] = mUsuario.getNombre();
                Datos[2] = mUsuario.getNomUser();
                Datos[3] = mUsuario.getEmail();
                Datos[4] = mUsuario.getTipoUser();
                

                ModeloTabla1.addRow(Datos);
            }
            
            this.TBUsuarios1 = new javax.swing.JTable();
            this.TBUsuarios1.setModel(ModeloTabla1);

            this.TBUsuarios1.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBUsuarios1.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBUsuarios1.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBUsuarios1.getColumnModel().getColumn(3).setPreferredWidth(150);
            this.TBUsuarios1.getColumnModel().getColumn(4).setPreferredWidth(100);

            if (this.TBUsuarios1.getRowCount() > 0) {
                this.TBUsuarios1.setRowSelectionInterval(0, 0);
            }
            
            this.TBUsuarios2 = new javax.swing.JTable();
            this.TBUsuarios2.setModel(ModeloTabla1);

            this.TBUsuarios2.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBUsuarios2.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBUsuarios2.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBUsuarios2.getColumnModel().getColumn(3).setPreferredWidth(150);
            this.TBUsuarios2.getColumnModel().getColumn(4).setPreferredWidth(100);

            if (this.TBUsuarios2.getRowCount() > 0) {
                this.TBUsuarios2.setRowSelectionInterval(0, 0);
            }
            
            this.TBUsuarios3 = new javax.swing.JTable();
            this.TBUsuarios3.setModel(ModeloTabla1);

            this.TBUsuarios3.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBUsuarios3.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBUsuarios3.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBUsuarios3.getColumnModel().getColumn(3).setPreferredWidth(150);
            this.TBUsuarios3.getColumnModel().getColumn(4).setPreferredWidth(100);

            if (this.TBUsuarios3.getRowCount() > 0) {
                this.TBUsuarios3.setRowSelectionInterval(0, 0);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar...");
        }
        mBD.Desconectar();
    }
    private void Llenar() {
        if (mBD.Conectar()) {
            ArrayList mLista = mBD.Consulta();
            Usuario mUsuario = new Usuario();
            String[] Datos;

            for (Object mListaUsuarios : mLista) {
                Datos = new String[4];

                mUsuario = (Usuario) mListaUsuarios;
                Datos[0] = "" + mUsuario.getID();
                Datos[1] = mUsuario.getNombre();
                Datos[2] = mUsuario.getNomUser();
                Datos[3] = mUsuario.getEmail();
                Datos[4] = mUsuario.getTipoUser();
                

                ModeloTabla1.addRow(Datos);
            }
            
            this.TBUsuarios1 = new javax.swing.JTable();
            this.TBUsuarios1.setModel(ModeloTabla1);

            this.TBUsuarios1.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBUsuarios1.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBUsuarios1.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBUsuarios1.getColumnModel().getColumn(3).setPreferredWidth(150);
            this.TBUsuarios1.getColumnModel().getColumn(4).setPreferredWidth(100);

            if (this.TBUsuarios1.getRowCount() > 0) {
                this.TBUsuarios1.setRowSelectionInterval(0, 0);
            }
            
            this.TBUsuarios2 = new javax.swing.JTable();
            this.TBUsuarios2.setModel(ModeloTabla1);

            this.TBUsuarios2.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBUsuarios2.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBUsuarios2.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBUsuarios2.getColumnModel().getColumn(3).setPreferredWidth(150);
            this.TBUsuarios2.getColumnModel().getColumn(4).setPreferredWidth(100);

            if (this.TBUsuarios2.getRowCount() > 0) {
                this.TBUsuarios2.setRowSelectionInterval(0, 0);
            }
            
            this.TBUsuarios3 = new javax.swing.JTable();
            this.TBUsuarios3.setModel(ModeloTabla1);

            this.TBUsuarios3.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBUsuarios3.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBUsuarios3.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBUsuarios3.getColumnModel().getColumn(3).setPreferredWidth(150);
            this.TBUsuarios3.getColumnModel().getColumn(4).setPreferredWidth(100);

            if (this.TBUsuarios3.getRowCount() > 0) {
                this.TBUsuarios3.setRowSelectionInterval(0, 0);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar...");
        }
        mBD.Desconectar();
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
        
        for (int i = a; i >= 0; i--) {
            LimpiadoTabla2.removeRow(LimpiadoTabla.getRowCount() - 1);
        }
        
        for (int i = a; i >= 0; i--) {
            LimpiadoTabla3.removeRow(LimpiadoTabla.getRowCount() - 1);
        }
    }    
    
   
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setFilas();
    }//GEN-LAST:event_formWindowActivated

    private void TBUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBUsuarios1MouseClicked
        int Seleccion = 0;
        this.TxtEliminar.setText("");
        Seleccion = this.TBUsuarios1.rowAtPoint(evt.getPoint());
        this.TxtEliminar.setText(this.TBUsuarios1.getModel().getValueAt(Seleccion, 1).toString());
    }//GEN-LAST:event_TBUsuarios1MouseClicked

    private void TBUsuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBUsuarios2MouseClicked
        int Seleccion = 0;
        this.TxtID.setText("");
        this.TxtNom.setText(null);
        this.TxtNomUser.setText(null);
        this.TxtEmail.setText(null);
        this.TxtPass.setText(null);
        this.CBTipo.setSelectedIndex(0);
        
        Seleccion = this.TBUsuarios2.rowAtPoint(evt.getPoint());
        this.TxtID.setText(this.TBUsuarios2.getModel().getValueAt(Seleccion, 0).toString());
    }//GEN-LAST:event_TBUsuarios2MouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (this.TxtEliminar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione un usuario antes");
        } else {
            int ID = Integer.parseInt(TxtEliminar.getText());
            if (mBD.Conectar()) {
                if (mBD.EliminarUsuario(ID)) {
                    JOptionPane.showMessageDialog(null, "Usuario dado de baja");
                    TxtEliminar.setText("");
                    Borrar();
                    Llenar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.Desconectar();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void TxtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomActionPerformed

    private void TxtCriterioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCriterioKeyTyped
        // TODO add your handling code here:
        if (TxtCriterio.equals("")) {
            Borrar();
            Llenar();
            JOptionPane.showMessageDialog(null, "Indique un criterio para realizar busqueda");
        } else {
            if (mBD.Conectar()) {

            ArrayList Lista = mBD.ConsultaFiltro(TxtCriterio.getText());
            Usuario mUsuario = new Usuario();
            String[] Datos;

            for (Object mListaUsuarios : Lista) {
                Datos = new String[4];

                mUsuario = (Usuario) mListaUsuarios;
                Datos[0] = "" + mUsuario.getID();
                Datos[1] = mUsuario.getNombre();
                Datos[2] = mUsuario.getNomUser();
                Datos[3] = mUsuario.getEmail();
                Datos[4] = mUsuario.getTipoUser();
                

                ModeloTabla1.addRow(Datos);
            }
 
            this.TBUsuarios1 = new javax.swing.JTable();
            this.TBUsuarios1.setModel(ModeloTabla1);
            this.TBUsuarios1.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBUsuarios1.getColumnModel().getColumn(1).setPreferredWidth(300);
            this.TBUsuarios1.getColumnModel().getColumn(2).setPreferredWidth(300);
            this.TBUsuarios1.getColumnModel().getColumn(3).setPreferredWidth(300);
            this.TBUsuarios1.getColumnModel().getColumn(4).setPreferredWidth(300);
                    if (this.TBUsuarios1.getRowCount() > 0) {
                        this.TBUsuarios1.setRowSelectionInterval(0, 0);
                    }
            } else {
                JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
            }
            mBD.Desconectar();
        }
    }//GEN-LAST:event_TxtCriterioKeyTyped

    private void BtnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseClicked
        // TODO add your handling code here:
        if ((this.TxtNom.equals(null)) || (this.TxtNomUser.equals(null)) || (this.TxtEmail.equals(null)) || (TxtPass.equals(null)) || CBTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos antes de guardar");
            
        } else {
            Usuario mUsuario = new Usuario();
            mUsuario.setNombre(TxtNom.getText());
            mUsuario.setNomUser(TxtNomUser.getText());
            mUsuario.setEmail(TxtEmail.getText());
            mUsuario.setPassword(TxtPass.getText());
            mUsuario.setTipoUser(CBTipo.getSelectedItem().toString());
            
            if (mBD.Conectar()) {
                if (mBD.AgregarUsuario(mUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario Dado de alta de forma exitosa");
                    TxtNom.setText(null);
                    TxtNomUser.setText(null);
                    TxtEmail.setText(null);
                    TxtPass.setText(null);
                    CBTipo.setSelectedIndex(0);
                    Borrar();
                    Llenar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al dar de Alta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.Desconectar();
        }
    }//GEN-LAST:event_BtnAddMouseClicked

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddActionPerformed

    
    
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
    private javax.swing.JComboBox<String> CBTipo;
    private javax.swing.JComboBox<String> CBTipo1;
    private javax.swing.JTable TBUsuarios1;
    private javax.swing.JTable TBUsuarios2;
    private javax.swing.JTable TBUsuarios3;
    private javax.swing.JTextField TxtCriterio;
    private javax.swing.JTextField TxtEliminar;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEmail1;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtNom1;
    private javax.swing.JTextField TxtNomUser;
    private javax.swing.JTextField TxtNomUser1;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JPasswordField TxtPass1;
    private javax.swing.JPasswordField TxtTemp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}