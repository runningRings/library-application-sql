
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arron
 */
public class formLevel2 extends javax.swing.JFrame {

    /**
     * Creates new form formViceChancellor
     */
    public formLevel2() {
        initComponents();
        this.centerFrame();
        //Set the default close operation, so that the application does not stop upon closing form
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Image i = null;
        try {
            i = ImageIO.read(getClass().getResource("/icon/book.png"));
        } catch (IOException ex) {
            Logger.getLogger(formLevel2.class.getName()).log(Level.SEVERE, null, ex);
        }
        setIconImage(i);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQ1 = new javax.swing.JButton();
        lblQ1 = new javax.swing.JLabel();
        lblQ3 = new javax.swing.JLabel();
        btnQ3 = new javax.swing.JButton();
        lblQ4 = new javax.swing.JLabel();
        btnQ4 = new javax.swing.JButton();
        lblQ5 = new javax.swing.JLabel();
        btnQ5 = new javax.swing.JButton();
        lblQ6 = new javax.swing.JLabel();
        btnQ6 = new javax.swing.JButton();
        lblQ8 = new javax.swing.JLabel();
        btnQ8 = new javax.swing.JButton();
        lblQ9 = new javax.swing.JLabel();
        btnQ9 = new javax.swing.JButton();
        lblQ10 = new javax.swing.JLabel();
        btnQ10 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQ1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ1.setText("<html><em>Q1</em></html>");
        btnQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1ActionPerformed(evt);
            }
        });

        lblQ1.setText("<html><em>Q1.</em> What day of the week has been the busiest, over a specific timeframe?</html>");

        lblQ3.setText("<html><em>Q3. </em>How many loans have been taken out at all the campuses in the last year?</html>");

        btnQ3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ3.setText("<html><em>Q3</em></html>");
        btnQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ3ActionPerformed(evt);
            }
        });

        lblQ4.setText("<html><em>Q4. </em> What was the average retained duration of a loan at a campus, depicted by the financial quarter, over a specific timeframe?</html>");

        btnQ4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ4.setText("<html><em>Q4</em></html>");
        btnQ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4ActionPerformed(evt);
            }
        });

        lblQ5.setText("<html><em>Q5. </em> What is the most popular resource type, over a specific timeframe?</html>");

        btnQ5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ5.setText("<html><em>Q5</em></html>");
        btnQ5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ5ActionPerformed(evt);
            }
        });

        lblQ6.setText("<html><em>Q6. </em> How many loans have been taken out at all the campuses, within a specific quarter period of a specific year?</html>");

        btnQ6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ6.setText("<html><em>Q6</em></html>");
        btnQ6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ6ActionPerformed(evt);
            }
        });

        lblQ8.setText("<html><em>Q8. </em>How many resources have not been returned, at a specific campus, within a specific year; categorised by the quarter period? </html>");

        btnQ8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ8.setText("<html><em>Q8</em></html>");
        btnQ8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ8ActionPerformed(evt);
            }
        });

        lblQ9.setText("<html><em>Q9. </em>What was the busiest day of the year, at a specific campus, of any given financial year? </html>");

        btnQ9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ9.setText("<html><em>Q9</em></html>");
        btnQ9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ9ActionPerformed(evt);
            }
        });

        lblQ10.setText("<html><em>Q10. </em>What was the most popular resource, over a specific timeframe? </html>");

        btnQ10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQ10.setText("<html><em>Q10</em></html>");
        btnQ10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Decision Maker Level 2 - Question Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQ5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQ4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 67, Short.MAX_VALUE)
                        .addComponent(btnQ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblQ9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblQ6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnQ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(194, 194, 194)))
                                    .addGap(14, 14, 14))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnQ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblQ8, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                    .addContainerGap()))
                            .addComponent(lblQ10, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQ6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQ8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(lblQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQ4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQ9, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQ5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQ10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1ActionPerformed
        formQuestion1 objFormQuestion1 = new formQuestion1();
        objFormQuestion1.centerFrame();
        objFormQuestion1.setVisible(true);
        
    }//GEN-LAST:event_btnQ1ActionPerformed

    private void btnQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ3ActionPerformed
        formQuestion3 objFormQuestion3 = new formQuestion3();
        objFormQuestion3.centerFrame();
        objFormQuestion3.setVisible(true);
    }//GEN-LAST:event_btnQ3ActionPerformed

    private void btnQ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4ActionPerformed
        formQuestion4 objFormQuestion4 = new formQuestion4();
        objFormQuestion4.centerFrame();
        objFormQuestion4.setVisible(true);
    }//GEN-LAST:event_btnQ4ActionPerformed

    private void btnQ5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ5ActionPerformed
        formQuestion5 objFormQuestion5 = new formQuestion5();
        objFormQuestion5.centerFrame();
        objFormQuestion5.setVisible(true);
    }//GEN-LAST:event_btnQ5ActionPerformed

    private void btnQ6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ6ActionPerformed
        formQuestion6 objFormQuestion6 = new formQuestion6();
        objFormQuestion6.centerFrame();
        objFormQuestion6.setVisible(true);
    }//GEN-LAST:event_btnQ6ActionPerformed

    private void btnQ8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ8ActionPerformed
        formQuestion8 objFormQuestion8 = new formQuestion8();
        objFormQuestion8.centerFrame();
        objFormQuestion8.setVisible(true);
    }//GEN-LAST:event_btnQ8ActionPerformed

    private void btnQ9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ9ActionPerformed
        formQuestion9 objFormQuestion9 = new formQuestion9();
        objFormQuestion9.centerFrame();
        objFormQuestion9.setVisible(true);
    }//GEN-LAST:event_btnQ9ActionPerformed

    private void btnQ10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ10ActionPerformed
        formQuestion10 objFormQuestion10 = new formQuestion10();
        objFormQuestion10.centerFrame();
        objFormQuestion10.setVisible(true);
    }//GEN-LAST:event_btnQ10ActionPerformed

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
            java.util.logging.Logger.getLogger(formLevel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLevel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLevel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLevel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLevel2().setVisible(true);
            }
        });
    }
    
    void centerFrame() {
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQ1;
    private javax.swing.JButton btnQ10;
    private javax.swing.JButton btnQ3;
    private javax.swing.JButton btnQ4;
    private javax.swing.JButton btnQ5;
    private javax.swing.JButton btnQ6;
    private javax.swing.JButton btnQ8;
    private javax.swing.JButton btnQ9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ10;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ4;
    private javax.swing.JLabel lblQ5;
    private javax.swing.JLabel lblQ6;
    private javax.swing.JLabel lblQ8;
    private javax.swing.JLabel lblQ9;
    // End of variables declaration//GEN-END:variables
}
