
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arron
 */
public class formHomeMenu extends javax.swing.JFrame {

    /**
     * Creates new form formHomeMenu
     */
    public formHomeMenu() {
        initComponents();
        Image i = null;
        try {
            i = ImageIO.read(getClass().getResource("/icon/book.png"));
        } catch (IOException ex) {
            Logger.getLogger(formHomeMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        setIconImage(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoanBook = new javax.swing.JButton();
        btnReturnBook = new javax.swing.JButton();
        btnTotalFinePaid = new javax.swing.JButton();
        btnViewLoanHistory = new javax.swing.JButton();
        btnPayFine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoanBook.setText("Loan A Book");
        btnLoanBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanBookActionPerformed(evt);
            }
        });

        btnReturnBook.setText("Return A Book");
        btnReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookActionPerformed(evt);
            }
        });

        btnTotalFinePaid.setText("View Student Fine History");
        btnTotalFinePaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalFinePaidActionPerformed(evt);
            }
        });

        btnViewLoanHistory.setText("View Loan History");
        btnViewLoanHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLoanHistoryActionPerformed(evt);
            }
        });

        btnPayFine.setText("Pay Fine");
        btnPayFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayFineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewLoanHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoanBook, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTotalFinePaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnPayFine, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoanBook, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTotalFinePaid, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewLoanHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnPayFine, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoanBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanBookActionPerformed
        // TODO add your handling code here:
        formLoanBook objFormLoanBook = new formLoanBook();
        objFormLoanBook.centerFrame();
        objFormLoanBook.setVisible(true);
    }//GEN-LAST:event_btnLoanBookActionPerformed

    private void btnTotalFinePaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalFinePaidActionPerformed
        // TODO add your handling code here:
        formFinePaidHistory objFinePaidHistory = new formFinePaidHistory();
        objFinePaidHistory.centerFrame();
        objFinePaidHistory.setVisible(true);
    }//GEN-LAST:event_btnTotalFinePaidActionPerformed

    private void btnViewLoanHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLoanHistoryActionPerformed
        // TODO add your handling code here:
        formLoanHistory objFormLoanHistory = new formLoanHistory();
        objFormLoanHistory.centerFrame();
        objFormLoanHistory.setVisible(true);
    }//GEN-LAST:event_btnViewLoanHistoryActionPerformed

    private void btnPayFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayFineActionPerformed
        // TODO add your handling code here:
        formPayFine objFormPayFine = new formPayFine();
        objFormPayFine.centerFrame();
        objFormPayFine.setVisible(true);
        
    }//GEN-LAST:event_btnPayFineActionPerformed

    private void btnReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookActionPerformed
        // TODO add your handling code here:
        formReturnBook objFormReturnBook = new formReturnBook();
        objFormReturnBook.centerFrame();
        objFormReturnBook.setVisible(true);
    }//GEN-LAST:event_btnReturnBookActionPerformed

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
            java.util.logging.Logger.getLogger(formHomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formHomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formHomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formHomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formHomeMenu home = new formHomeMenu();
                home.centerFrame();
                home.setVisible(true);
               // new formHomeMenu().setVisible(true);
            }
        });
    }
    
    /** 
    This method centres the form on screen 
    **/
    public void centerFrame() {

            Dimension windowSize = getSize();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();

            int dx = centerPoint.x - windowSize.width / 2;
            int dy = centerPoint.y - windowSize.height / 2;    
            setLocation(dx, dy);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoanBook;
    private javax.swing.JButton btnPayFine;
    private javax.swing.JButton btnReturnBook;
    private javax.swing.JButton btnTotalFinePaid;
    private javax.swing.JButton btnViewLoanHistory;
    // End of variables declaration//GEN-END:variables
}