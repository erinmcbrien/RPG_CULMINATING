/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErMcB6406
 */
public class RPG4_LEAVE extends javax.swing.JFrame {

    /**
     * Creates new form RPG4_LEAVE
     */
    public RPG4_LEAVE() {
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

        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        RPG4_LEAVE = new javax.swing.JPanel();
        NORTH = new javax.swing.JButton();
        GameText2 = new javax.swing.JLabel();
        EAST = new javax.swing.JButton();
        SOUTH = new javax.swing.JButton();
        WEST = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel7.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel3.setText("jLabel2");

        Title.setFont(new java.awt.Font("Wet Pet", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("In the mists of aeriden");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RPG4_LEAVE.setBackground(new java.awt.Color(0, 0, 0));

        NORTH.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        NORTH.setText("NORTH");
        NORTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NORTHActionPerformed(evt);
            }
        });

        GameText2.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText2.setForeground(new java.awt.Color(255, 255, 255));
        GameText2.setText("<html> * You are at the crossroads <br> * If you go south, you will <br> &nbsp; return to the gates of the town <br> * Where will you go?");

        EAST.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        EAST.setText("EAST");
        EAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EASTActionPerformed(evt);
            }
        });

        SOUTH.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        SOUTH.setText("SOUTH");
        SOUTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOUTHActionPerformed(evt);
            }
        });

        WEST.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        WEST.setText("WEST");
        WEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WESTActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel8.setText("jLabel2");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel9.setText("jLabel2");

        Title1.setFont(new java.awt.Font("Dinarjev Republika", 0, 48)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("In the mists of aeriden");
        Title1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout RPG4_LEAVELayout = new javax.swing.GroupLayout(RPG4_LEAVE);
        RPG4_LEAVE.setLayout(RPG4_LEAVELayout);
        RPG4_LEAVELayout.setHorizontalGroup(
            RPG4_LEAVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG4_LEAVELayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RPG4_LEAVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPG4_LEAVELayout.createSequentialGroup()
                        .addComponent(Title1)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(RPG4_LEAVELayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG4_LEAVELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(RPG4_LEAVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NORTH)
                    .addComponent(SOUTH, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(283, 283, 283))
            .addGroup(RPG4_LEAVELayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(WEST)
                .addGap(103, 103, 103)
                .addComponent(EAST)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RPG4_LEAVELayout.setVerticalGroup(
            RPG4_LEAVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG4_LEAVELayout.createSequentialGroup()
                .addGroup(RPG4_LEAVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPG4_LEAVELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9))
                    .addGroup(RPG4_LEAVELayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(RPG4_LEAVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(NORTH)
                .addGap(22, 22, 22)
                .addGroup(RPG4_LEAVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WEST)
                    .addComponent(EAST))
                .addGap(23, 23, 23)
                .addComponent(SOUTH)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG4_LEAVE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPG4_LEAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NORTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NORTHActionPerformed

        this.setVisible(false);
        new RPG5_NORTH().setVisible(true);
    }//GEN-LAST:event_NORTHActionPerformed

    private void EASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EASTActionPerformed
        this.setVisible(false);
        new RPG5_EAST().setVisible(true);
    }//GEN-LAST:event_EASTActionPerformed

    private void SOUTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOUTHActionPerformed
        this.setVisible(false);
        new RPG3().setVisible(true);
    }//GEN-LAST:event_SOUTHActionPerformed

    private void WESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WESTActionPerformed
        this.setVisible(false);
        new RPG5_WEST().setVisible(true);
    }//GEN-LAST:event_WESTActionPerformed

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
            java.util.logging.Logger.getLogger(RPG4_LEAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPG4_LEAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPG4_LEAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPG4_LEAVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPG4_LEAVE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EAST;
    private javax.swing.JLabel GameText2;
    private javax.swing.JButton NORTH;
    private javax.swing.JPanel RPG4_LEAVE;
    private javax.swing.JButton SOUTH;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton WEST;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}