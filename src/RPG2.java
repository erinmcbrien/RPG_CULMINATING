/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErMcB6406
 */
public class RPG2 extends javax.swing.JFrame {

    /**
     * Creates new form RPG2
     */
    public RPG2() {
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

        Title = new javax.swing.JLabel();
        RPG2 = new javax.swing.JPanel();
        GameText = new javax.swing.JLabel();
        Image3 = new javax.swing.JLabel();
        Continue = new javax.swing.JButton();
        Title1 = new javax.swing.JLabel();

        Title.setFont(new java.awt.Font("Wet Pet", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("In the mists of aeriden");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RPG2.setBackground(new java.awt.Color(0, 0, 0));

        GameText.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText.setForeground(new java.awt.Color(255, 255, 255));
        GameText.setText("<html> * You approach the gates of Aeriden <br> * You pause to look at the lush forest that <br>    &nbsp;  encompases the small dreary town <br> * Moss covers the cracked stones of the <br>    &nbsp; gates and a heavy mist rises from the ground <br> * A sudden chill seeps into you're bones <br> * Is it from the weather or the negative feeling <br> &nbsp; that holds the town hostage?<html>");

        Image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qixpossm9pw11 (1).jpg"))); // NOI18N

        Continue.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        Continue.setText("CONTINUE");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        Title1.setFont(new java.awt.Font("Dinarjev Republika", 0, 48)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("In the mists of aeriden");
        Title1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout RPG2Layout = new javax.swing.GroupLayout(RPG2);
        RPG2.setLayout(RPG2Layout);
        RPG2Layout.setHorizontalGroup(
            RPG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Image3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title1)
                .addContainerGap())
            .addGroup(RPG2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(Continue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RPG2Layout.setVerticalGroup(
            RPG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title1)
                .addGroup(RPG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPG2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Image3))
                    .addGroup(RPG2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(GameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(Continue)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed

        this.setVisible(false);
        new RPG3().setVisible(true);
    }//GEN-LAST:event_ContinueActionPerformed

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
            java.util.logging.Logger.getLogger(RPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPG2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JLabel GameText;
    private javax.swing.JLabel Image3;
    private javax.swing.JPanel RPG2;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    // End of variables declaration//GEN-END:variables
}