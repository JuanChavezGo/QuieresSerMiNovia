package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.RoundRectangle2D;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/QSMN-32px.png")).getImage());
        redondearYcentrar();
        btnSalir.setVisible(false);
    }
    
    Random r=new Random();
    
    int x(){
        int n=r.nextInt(getX());
        return n;
    }
    
    int y(){
        int n=r.nextInt(getY());
        return n;
    }
    
    int xx, yy;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        btnNo = new javax.swing.JToggleButton();
        btnSi = new javax.swing.JToggleButton();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QSMN");
        setUndecorated(true);

        pnlGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSuperior.setBackground(new java.awt.Color(204, 204, 204));
        pnlSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlSuperiorMouseDragged(evt);
            }
        });
        pnlSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSuperiorMousePressed(evt);
            }
        });
        pnlSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("¿ QUIERES SER MI NOVIA ?");
        pnlSuperior.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 50, 600, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-32px.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit1-32px.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlSuperior.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize-32px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize1-32px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlSuperior.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        pnlGeneral.add(pnlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 120));

        pnlContenido.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNo.setBackground(new java.awt.Color(0, 0, 0));
        btnNo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnNo.setForeground(new java.awt.Color(255, 255, 255));
        btnNo.setText("NO");
        btnNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNoMouseExited(evt);
            }
        });
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        pnlContenido.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 130, 60));

        btnSi.setBackground(new java.awt.Color(0, 0, 0));
        btnSi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSi.setForeground(new java.awt.Color(255, 255, 255));
        btnSi.setText("SI");
        btnSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiMouseExited(evt);
            }
        });
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        pnlContenido.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 60));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info - 32px.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        pnlContenido.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        pnlGeneral.add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 600, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseEntered
        btnNo.setBounds(x(), y(), btnNo.getWidth(), btnSi.getHeight());
        btnNo.setBackground(Color.red);
    }//GEN-LAST:event_btnNoMouseEntered

    private void btnNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseExited
        btnNo.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnNoMouseExited

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        pnlContenido.setVisible(false);
        pnlSuperior.setBackground(Color.green);
        lblTitulo.setText("Sabia que dirias que si :3");
        btnSalir.setVisible(true);
        this.setSize(new Dimension(600, 120));
        redondearYcentrar();
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseEntered
        btnSi.setBackground(new Color (0,153,51));
    }//GEN-LAST:event_btnSiMouseEntered

    private void btnSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseExited
        btnSi.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnSiMouseExited

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Desarrollado por Juan Chavez\nversion: 1.1", "Info",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void pnlSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMouseDragged
        this.setLocation(this.getX() + evt.getX() - xx, this.getY() + evt.getY() - yy);
    }//GEN-LAST:event_pnlSuperiorMouseDragged

    private void pnlSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnlSuperiorMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        btnNo.setBounds(x(), y(), btnNo.getWidth(), btnSi.getHeight());
    }//GEN-LAST:event_btnNoActionPerformed

    void redondearYcentrar(){
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 27, 27));
        this.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JToggleButton btnNo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnSi;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlSuperior;
    // End of variables declaration//GEN-END:variables
}
