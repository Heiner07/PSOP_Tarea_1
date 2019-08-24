/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author Heiner
 */
public class JFVentanaPrincipal extends javax.swing.JFrame {
    
    int paso=1;

    /**
     * Creates new form JFVentanaPrincipal
     */
    public JFVentanaPrincipal() {
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

        lbCargarArchivo = new javax.swing.JLabel();
        tfCargarArchivo = new javax.swing.JTextField();
        btCargarArchivo = new javax.swing.JButton();
        btAnalizarArchivo = new javax.swing.JButton();
        btSiguiente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelInstrucciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea_1");
        setPreferredSize(new java.awt.Dimension(820, 730));

        lbCargarArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCargarArchivo.setText("Cargar archivo:");

        tfCargarArchivo.setEditable(false);
        tfCargarArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btCargarArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btCargarArchivo.setText("Cargar");

        btAnalizarArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btAnalizarArchivo.setText("Analizar");
        btAnalizarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnalizarArchivoActionPerformed(evt);
            }
        });

        btSiguiente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btSiguiente.setText("Siguiente");
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });

        panelInstrucciones.setLayout(new java.awt.GridLayout(0, 2));
        jScrollPane2.setViewportView(panelInstrucciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCargarArchivo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCargarArchivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAnalizarArchivo)))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCargarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCargarArchivo)
                    .addComponent(btAnalizarArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSiguiente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAnalizarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnalizarArchivoActionPerformed
        
    }//GEN-LAST:event_btAnalizarArchivoActionPerformed

    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed
        JPPaso ejecucion=new JPPaso(paso);
        panelInstrucciones.add(ejecucion);
        panelInstrucciones.updateUI();
        paso++;
    }//GEN-LAST:event_btSiguienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnalizarArchivo;
    private javax.swing.JButton btCargarArchivo;
    private javax.swing.JButton btSiguiente;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCargarArchivo;
    private javax.swing.JPanel panelInstrucciones;
    private javax.swing.JTextField tfCargarArchivo;
    // End of variables declaration//GEN-END:variables
}
