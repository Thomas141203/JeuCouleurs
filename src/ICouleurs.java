
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tm325716
 */
public class ICouleurs extends javax.swing.JFrame {

    /**
     * Creates new form ICouleurs
     */
    public ICouleurs() {
        initComponents();
        num = 1;
        couleur1 = null;
        couleur2 = null;
    }
    
    private Color couleur1;
    private Color couleur2;
    private int num;
    
    public Color melanger(){
        int r = (this.couleur1.getRed() + this.couleur2.getRed())/2;
        int v = (this.couleur1.getGreen() + this.couleur2.getGreen())/2;
        int b = (this.couleur1.getBlue() + this.couleur2.getBlue())/2;
        Color melange = new Color(r, v, b);
        return melange;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ZoneColor = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Le jeu des couleurs");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        jButton1.setBackground(new java.awt.Color(0, 0, 251));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 255, 21));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 0, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 167, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        ZoneColor.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(ZoneColor, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        jButton5.setBackground(new java.awt.Color(101, 59, 16));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 0, 124));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);

        jButton8.setBackground(new java.awt.Color(139, 2, 134));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);

        getContentPane().add(jPanel4, java.awt.BorderLayout.EAST);

        jLabel2.setText("M??langez les couleurs en cliquant sur deux boutons !");
        jPanel5.add(jLabel2);

        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Color c = jButton1.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Color c = jButton2.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Color c = jButton3.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Color c = jButton4.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Color c = jButton5.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Color c = jButton6.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Color c = jButton7.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Color c = jButton8.getBackground();
        if(num == 1){
            this.couleur1= c;
            num = 2;
        }
        if(num == 2){
            this.couleur2 = c;
            num = 1;
        }
        if(this.couleur1 != null && this.couleur2 != null)
                ZoneColor.setBackground(melanger());
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(ICouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ICouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ICouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICouleurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ZoneColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
