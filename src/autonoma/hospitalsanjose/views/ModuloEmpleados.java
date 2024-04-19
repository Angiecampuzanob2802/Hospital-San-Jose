/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalsanjose.views;

import autonoma.hospitalsanjose.models.Hospital;
import java.awt.Color;

/**
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @versión 0.1.6
 * @since 2024-04-08
 */

public class ModuloEmpleados extends javax.swing.JDialog {
    
    private int xMouse, yMouse;
    private Hospital hospital;
    private VentanaPrincipal ventanaPrincipal;
    /**
     * Creates new form ModuloEmpleado
     * @param parent
     * @param modal
     * @param hospital
     * @param ventanaPrincipal
     */
    public ModuloEmpleados(java.awt.Frame parent, boolean modal, Hospital hospital, VentanaPrincipal ventanaPrincipal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.hospital = hospital;
        this.ventanaPrincipal = ventanaPrincipal;
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
        logo = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JPanel();
        jLAgregar = new javax.swing.JLabel();
        BtnActualizar = new javax.swing.JPanel();
        jLActualizar = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JPanel();
        jLEliminar = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JPanel();
        JlVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.hospitalsanjose.images/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 290, 140));

        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("NOMBRE EMPRESA");
        jPanel1.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 250, 290, 20));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.hospitalsanjose.images/city.png"))); // NOI18N
        jPanel1.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 0, -1, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 800, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.hospitalsanjose.images/favicon.png"))); // NOI18N
        favicon.setText("LOGO");
        jPanel1.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("EMPLEADOS");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, 150));

        BtnAgregar.setBackground(new java.awt.Color(0, 134, 190));

        jLAgregar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jLAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAgregar.setText("AGREGAR");
        jLAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLAgregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnAgregarLayout = new javax.swing.GroupLayout(BtnAgregar);
        BtnAgregar.setLayout(BtnAgregarLayout);
        BtnAgregarLayout.setHorizontalGroup(
            BtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnAgregarLayout.setVerticalGroup(
            BtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 40));

        BtnActualizar.setBackground(new java.awt.Color(0, 134, 190));

        jLActualizar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLActualizar.setText("ACTUALIZAR");
        jLActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnActualizarLayout = new javax.swing.GroupLayout(BtnActualizar);
        BtnActualizar.setLayout(BtnActualizarLayout);
        BtnActualizarLayout.setHorizontalGroup(
            BtnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnActualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnActualizarLayout.setVerticalGroup(
            BtnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnActualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        BtnEliminar.setBackground(new java.awt.Color(0, 134, 190));

        jLEliminar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEliminar.setText("ELIMINAR");
        jLEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnEliminarLayout = new javax.swing.GroupLayout(BtnEliminar);
        BtnEliminar.setLayout(BtnEliminarLayout);
        BtnEliminarLayout.setHorizontalGroup(
            BtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnEliminarLayout.setVerticalGroup(
            BtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        BtnVolver.setBackground(new java.awt.Color(0, 134, 190));

        JlVolver.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        JlVolver.setForeground(new java.awt.Color(255, 255, 255));
        JlVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlVolver.setText("VOLVER");
        JlVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JlVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JlVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlVolverMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnVolverLayout = new javax.swing.GroupLayout(BtnVolver);
        BtnVolver.setLayout(BtnVolverLayout);
        BtnVolverLayout.setHorizontalGroup(
            BtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnVolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JlVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnVolverLayout.setVerticalGroup(
            BtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnVolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JlVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
        AgregarEmpleado ventanaEmpleado = new AgregarEmpleado(ventanaPrincipal, true, hospital, ventanaPrincipal);
        ventanaEmpleado.setVisible(true);
    }//GEN-LAST:event_jLAgregarMouseClicked

    private void jLAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseEntered
        BtnAgregar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_jLAgregarMouseEntered

    private void jLAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseExited
        BtnAgregar.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_jLAgregarMouseExited

    private void JlVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlVolverMouseClicked
        this.dispose();
    }//GEN-LAST:event_JlVolverMouseClicked

    private void JlVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlVolverMouseEntered
        BtnAgregar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_JlVolverMouseEntered

    private void JlVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlVolverMouseExited
        BtnAgregar.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_JlVolverMouseExited

    private void jLEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseExited
        BtnAgregar.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_jLEliminarMouseExited

    private void jLEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseEntered
        BtnAgregar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_jLEliminarMouseEntered

    private void jLEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLEliminarMouseClicked

    private void jLActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLActualizarMouseExited
        BtnAgregar.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_jLActualizarMouseExited

    private void jLActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLActualizarMouseEntered
        BtnAgregar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_jLActualizarMouseEntered

    private void jLActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLActualizarMouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ModuloEmpleados dialog = new ModuloEmpleados(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnActualizar;
    private javax.swing.JPanel BtnAgregar;
    private javax.swing.JPanel BtnEliminar;
    private javax.swing.JPanel BtnVolver;
    private javax.swing.JLabel JlVolver;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLActualizar;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
