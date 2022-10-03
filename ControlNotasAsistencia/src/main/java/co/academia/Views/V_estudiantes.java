/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.Views;

import co.academia.Beans.Estudiante;
import co.academia.Beans.Matricula;
import co.academia.DAO.DAO_estudiante;
import co.academia.DAO.DAO_matricula;
import co.academia.Table.Tb_estudiante;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author ROBERT
 */
public class V_estudiantes extends javax.swing.JFrame {

    private Tb_estudiante modelo;
    DAO_estudiante daoE;
    DAO_matricula daoM;

    public V_estudiantes() throws SQLException {
        initComponents();
        daoE = new DAO_estudiante();
        this.modelo = new Tb_estudiante(daoE.read_estudiante());

        tb_estudiantes.setModel(modelo);
        tb_estudiantes.setEditingColumn(6);
        
        //le indicamos que cundo se cierre solo se oculte pero el program no se cierre;
        //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_estudiantes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_mensualidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        cbx_grupo = new javax.swing.JComboBox<>();
        txt_estado = new javax.swing.JLabel();
        cbx_estado1 = new javax.swing.JComboBox<>();
        txt_estado1 = new javax.swing.JLabel();
        dc_fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_amaterno = new javax.swing.JLabel();
        txt_apaterno1 = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        menu_bar = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        btn_estudiantes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        asistencia_diaria_btn = new javax.swing.JMenuItem();
        asistencia_mensual_btn = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(0, 0, 0));

        tb_estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_estudiantes.setColumnSelectionAllowed(true);
        tb_estudiantes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_estudiantes.setRowHeight(25);
        tb_estudiantes.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tb_estudiantes.getTableHeader().setReorderingAllowed(false);
        tb_estudiantes.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(tb_estudiantes);
        tb_estudiantes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tb_estudiantes.getColumnModel().getColumnCount() > 0) {
            tb_estudiantes.getColumnModel().getColumn(0).setResizable(false);
            tb_estudiantes.getColumnModel().getColumn(2).setResizable(false);
            tb_estudiantes.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRAR ESTUDIANTES ");

        btn_insert.setBackground(new java.awt.Color(35, 115, 61));
        btn_insert.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_insert.setText("REGISTRAR");
        btn_insert.setBorder(null);
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(51, 51, 255));
        btn_update.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("MODIFICAR");
        btn_update.setBorder(null);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("A. Paterno");

        txt_apaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apaternoActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DNI");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Monto");

        txt_mensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mensualidadActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Edad");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("E-mail");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });

        cbx_grupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbx_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_grupoActionPerformed(evt);
            }
        });

        txt_estado.setForeground(new java.awt.Color(0, 0, 0));
        txt_estado.setText("Estado");

        cbx_estado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccionar -- ", "Grupo1", "Grupo2" }));

        txt_estado1.setForeground(new java.awt.Color(0, 0, 0));
        txt_estado1.setText("Grupo");

        dc_fecha.setBackground(new java.awt.Color(204, 204, 204));
        dc_fecha.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Matricula");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de");

        txt_amaterno.setForeground(new java.awt.Color(0, 0, 0));
        txt_amaterno.setText("A. Materno");

        txt_apaterno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apaterno1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_mensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(txt_estado1))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbx_estado1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(52, 52, 52)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_estado)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_amaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_apaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_apaterno)
                            .addComponent(txt_dni)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apaterno1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_estado1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_estado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        btn_search.setBackground(new java.awt.Color(0, 0, 255));
        btn_search.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("BUSCAR ESTUDIANTE");
        btn_search.setBorder(null);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        txt_search.setToolTipText("SEARCH");

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_search, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txt_search, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu_bar.setBackground(new java.awt.Color(255, 102, 51));

        jMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jMenu6.setForeground(new java.awt.Color(0, 0, 0));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda2.png"))); // NOI18N
        jMenu6.setText("HOME");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("HOME");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        menu_bar.add(jMenu6);

        btn_estudiantes.setBackground(new java.awt.Color(255, 255, 255));
        btn_estudiantes.setForeground(new java.awt.Color(0, 0, 0));
        btn_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda2.png"))); // NOI18N
        btn_estudiantes.setText("ESTUDIANTES");
        btn_estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estudiantesActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Registrar Estudiante");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btn_estudiantes.add(jMenuItem1);

        menu_bar.add(btn_estudiantes);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda2.png"))); // NOI18N
        jMenu4.setText("NOTAS");

        jMenuItem4.setText("INGRESAR NOTAS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenu2.setText("VIZUALIZAR NOTAS");

        jMenuItem5.setText("NOTAS POR PARCIAL");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("NOTAS GENERALES");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenu4.add(jMenu2);

        menu_bar.add(jMenu4);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda2.png"))); // NOI18N
        jMenu1.setText("ASISTENCIA");

        jMenuItem3.setText("REGISTRAR ASISTENCIA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu3.setText("VIZUALIZAR ASISTENCIA");

        asistencia_diaria_btn.setText("ASISTENCIA DIARIA");
        asistencia_diaria_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistencia_diaria_btnActionPerformed(evt);
            }
        });
        jMenu3.add(asistencia_diaria_btn);

        asistencia_mensual_btn.setText("ASISTENCIA MENSUAL");
        asistencia_mensual_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistencia_mensual_btnActionPerformed(evt);
            }
        });
        jMenu3.add(asistencia_mensual_btn);

        jMenu1.add(jMenu3);

        menu_bar.add(jMenu1);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda2.png"))); // NOI18N
        jMenu5.setText("PAGOS");

        jMenuItem7.setText("REGISTRAR PAGOS");
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("REVISAR PAGOS");
        jMenu5.add(jMenuItem8);

        menu_bar.add(jMenu5);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edadActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_mensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mensualidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mensualidadActionPerformed

    private void txt_apaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apaternoActionPerformed

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dniActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed

        try {
            //capturamos los datos:
            String DNI = txt_dni.getText();
            String nombre = txt_nombre.getText();
            String apaterno = txt_apaterno.getText();
            String amaterno = txt_amaterno.getText();
            float mensualidad = Float.parseFloat(txt_mensualidad.getText());
            String email = txt_email.getText();
            int edad = Integer.parseInt(txt_edad.getText());
            int estado = 1;
            if ("Inactivo".equals(String.valueOf(cbx_grupo.getSelectedItem()))) {
                estado = 0;
            }

            DAO_estudiante daoE = new DAO_estudiante();
            Estudiante estudiante = new Estudiante();
            estudiante.setDni(DNI);
            estudiante.setNombre(nombre);
            estudiante.setApellido_paterno(apaterno);
            estudiante.setApellido_materno(amaterno);
            estudiante.setCorreo_electronico(email);
            estudiante.setEdad(edad);
            estudiante.setEstado(estado);

            daoE.ESTUDIANTE_INSERT(estudiante);
            
            daoM = new DAO_matricula(); 
            Matricula matricula = new Matricula();
            matricula.setDNI(DNI);
            matricula.setEstado(1);
            matricula.setMensualidad(mensualidad);
            
            java.util.Date fecha = dc_fecha.getDate();
            DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String fecha2 = f.format(fecha);
            Date date_matricula = Date.valueOf(fecha2);
            matricula.setFecha_matricula(date_matricula);
            daoM.ESTUDIANTE_UPDATE(matricula);
            
            
            txt_dni.setText("");
            txt_nombre.setText("");
            txt_apaterno.setText("");
            txt_amaterno.setText("");
            txt_mensualidad.setText("");
            txt_estado.setText("");
            txt_edad.setText("");
            txt_email.setText("");
            JOptionPane.showMessageDialog(null, "Insertado Correctamente [ok]");

            modelo.AgregarEstudiante(estudiante);

        } catch (SQLException ex) {
            Logger.getLogger(V_estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {
            //capturamos los datos:
            String DNI = txt_dni.getText();
            String nombre = txt_nombre.getText();
            String apaterno = txt_apaterno.getText();
            String amaterno = txt_apaterno.getText();
            float mensualidad = Float.parseFloat(txt_mensualidad.getText());
            String email = txt_email.getText();
            int edad = Integer.parseInt(txt_edad.getText());
            int estado = 1;
            if ("Inactivo".equals(String.valueOf(cbx_grupo.getSelectedItem()))) {
                estado = 0;
            }

            DAO_estudiante daoE = new DAO_estudiante();
            Estudiante estudiante = new Estudiante();
            estudiante.setDni(DNI);
            estudiante.setNombre(nombre);
            estudiante.setApellido_paterno(apaterno);
            estudiante.setApellido_materno(amaterno);
            estudiante.setCorreo_electronico(email);
            estudiante.setEdad(edad);
            estudiante.setEstado(estado);
            daoE.ESTUDIANTE_UPDATE(estudiante);
            
            
            daoM = new DAO_matricula(); 
            Matricula matricula = new Matricula();
            matricula.setDNI(DNI);
            matricula.setEstado(1);
            matricula.setMensualidad(mensualidad);
            
            java.util.Date fecha = dc_fecha.getDate();
            DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String fecha2 = f.format(fecha);
            Date date_matricula = Date.valueOf(fecha2);
            matricula.setFecha_matricula(date_matricula);
            daoM.ESTUDIANTE_UPDATE(matricula);
            

            
            txt_dni.setText("");
            txt_nombre.setText("");
            txt_apaterno.setText("");
            txt_amaterno.setText("");
            txt_mensualidad.setText("");
            txt_estado.setText("");
            txt_edad.setText("");
            txt_email.setText("");
            JOptionPane.showMessageDialog(null, "Actualizado Correctamente [ok]");
        } catch (SQLException ex) {
            Logger.getLogger(V_estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        Tb_estudiante modelo_search;
        List<Estudiante> lista_search;
        try {
            String clave = txt_search.getText();
            System.out.println(clave + ": valor de clave");
            if (!clave.equals("") ) {
                DAO_estudiante daoE = new DAO_estudiante();
                Estudiante estudiante = daoE.ESTUDIANTE_SELECT_ID(clave);
                lista_search = new ArrayList<>();
                lista_search.add(estudiante);

                modelo_search = new Tb_estudiante(lista_search);
                tb_estudiantes.setModel(modelo_search);
            } else {
                tb_estudiantes.setModel(modelo);
                System.out.println("TABLA ORIGINAL [OK]");
            }
        } catch (SQLException ex) {
            Logger.getLogger(V_estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_searchActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        V_estudiantes V;
        try {
            V = new V_estudiantes();
            V.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estudiantesActionPerformed

    }//GEN-LAST:event_btn_estudiantesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        registrar_notas rn;
        try {
            rn = new registrar_notas();
            rn.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(V_estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        V_notas_parcial vnp = new V_notas_parcial();
        vnp.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        V_notas_general vng = new V_notas_general();
        vng.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        registrar_asistencia ra;
        try {
            ra = new registrar_asistencia();
            ra.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(V_estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void asistencia_diaria_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistencia_diaria_btnActionPerformed
        v_asistencia_diaria ad = new v_asistencia_diaria();
        ad.setVisible(true);
    }//GEN-LAST:event_asistencia_diaria_btnActionPerformed

    private void asistencia_mensual_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistencia_mensual_btnActionPerformed
        V_asistencia_mensual am = new V_asistencia_mensual();
        am.setVisible(true);
    }//GEN-LAST:event_asistencia_mensual_btnActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed

    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        home h = new home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cbx_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_grupoActionPerformed

    private void txt_apaterno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apaterno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apaterno1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new V_estudiantes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(V_estudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem asistencia_diaria_btn;
    private javax.swing.JMenuItem asistencia_mensual_btn;
    private javax.swing.JMenu btn_estudiantes;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbx_estado1;
    private javax.swing.JComboBox<String> cbx_grupo;
    private com.toedter.calendar.JDateChooser dc_fecha;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JTable tb_estudiantes;
    private javax.swing.JLabel txt_amaterno;
    private javax.swing.JTextField txt_apaterno;
    private javax.swing.JTextField txt_apaterno1;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_email;
    private javax.swing.JLabel txt_estado;
    private javax.swing.JLabel txt_estado1;
    private javax.swing.JTextField txt_mensualidad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
