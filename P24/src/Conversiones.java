/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18PROGB0061
 */
public class Conversiones extends javax.swing.JFrame {

    /**
     * Creates new form Conversiones
     */
    public Conversiones() {
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

        lblTitulo = new javax.swing.JLabel();
        lblMetros = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        rbCentimetros = new javax.swing.JRadioButton();
        rbMilimetros = new javax.swing.JRadioButton();
        lblResultadoM = new javax.swing.JLabel();
        txtResultadoM = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        rbMinutos = new javax.swing.JRadioButton();
        rbSegundos = new javax.swing.JRadioButton();
        lblResultadoH = new javax.swing.JLabel();
        txtResultadoH = new javax.swing.JTextField();
        lblKGR = new javax.swing.JLabel();
        lblKG = new javax.swing.JLabel();
        txtKG = new javax.swing.JTextField();
        lblGramos = new javax.swing.JLabel();
        txtGramos = new javax.swing.JTextField();
        rbKG = new javax.swing.JRadioButton();
        rbGramos = new javax.swing.JRadioButton();
        lblConversion = new javax.swing.JLabel();
        txtConversion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo.setText("Conversiones");

        lblMetros.setText("Metros");

        rbCentimetros.setText("Centimetros");

        rbMilimetros.setText("Milímetros");

        lblResultadoM.setText("Resultado");

        txtResultadoM.setEditable(false);
        txtResultadoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoMActionPerformed(evt);
            }
        });

        lblHoras.setText("Horas");

        rbMinutos.setText("Minutos");

        rbSegundos.setText("Segundos");

        lblResultadoH.setText("Resultado");

        txtResultadoH.setEditable(false);

        lblKGR.setText("Kilos-Gramos");

        lblKG.setText("KG");

        lblGramos.setText("Gramos");

        rbKG.setText("KG");

        rbGramos.setText("Gramos");

        lblConversion.setText("Conversión");

        txtConversion.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblKG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGramos)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblMetros))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(lblHoras))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbMilimetros)
                                        .addComponent(rbCentimetros))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtResultadoM, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblResultadoM)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(rbSegundos)
                                        .addGap(48, 48, 48)
                                        .addComponent(txtResultadoH, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbMinutos)
                                        .addGap(68, 68, 68)
                                        .addComponent(lblResultadoH))
                                    .addComponent(lblKGR, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHoras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(txtMetros, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(txtKG, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbKG)
                                        .addComponent(rbGramos)
                                        .addComponent(lblConversion))
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)))
                            .addComponent(txtGramos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblTitulo)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMetros)
                    .addComponent(rbCentimetros)
                    .addComponent(lblResultadoM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMilimetros)
                    .addComponent(txtResultadoM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHoras)
                            .addComponent(lblResultadoH))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtResultadoH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(rbMinutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSegundos)))
                .addGap(46, 46, 46)
                .addComponent(lblKGR)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKG)
                            .addComponent(lblGramos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGramos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbKG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbGramos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConversion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoMActionPerformed
     
       
    }//GEN-LAST:event_txtResultadoMActionPerformed

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
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblConversion;
    private javax.swing.JLabel lblGramos;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblKG;
    private javax.swing.JLabel lblKGR;
    private javax.swing.JLabel lblMetros;
    private javax.swing.JLabel lblResultadoH;
    private javax.swing.JLabel lblResultadoM;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbCentimetros;
    private javax.swing.JRadioButton rbGramos;
    private javax.swing.JRadioButton rbKG;
    private javax.swing.JRadioButton rbMilimetros;
    private javax.swing.JRadioButton rbMinutos;
    private javax.swing.JRadioButton rbSegundos;
    private javax.swing.JTextField txtConversion;
    private javax.swing.JTextField txtGramos;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtKG;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtResultadoH;
    private javax.swing.JTextField txtResultadoM;
    // End of variables declaration//GEN-END:variables
}
