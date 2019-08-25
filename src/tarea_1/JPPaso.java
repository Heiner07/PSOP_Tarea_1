/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

import javax.swing.JTextField;

/**
 *
 * @author Heiner
 */
public class JPPaso extends javax.swing.JPanel {

    
    JTextField[] camposOperaciones;
    
    /**
     * Creates new form JPPaso
     * @param paso
     * @param posicionMemoria
     */
    public JPPaso(int paso,int posicionMemoria) {
        initComponents();
        Operaciones op = new Operaciones();
        op.Operaciones(Operaciones.memoria[posicionMemoria]);
        int instrucciones=Operaciones.numeroInstrucciones-paso;
        String[] parts;
        parts = Operaciones.memoria[posicionMemoria].split(" ");
        tfOperacion1.setText(parts[0]);
        tfRegistro1.setText(parts[1]);
        tfValor1.setText(parts[2]);
        lbMemoria1.setText(String.valueOf(posicionMemoria));
        if(instrucciones>=2){
            parts = Operaciones.memoria[posicionMemoria+1].split(" ");
            tfOperacion2.setText(parts[0]);
            tfRegistro2.setText(parts[1]);
            tfValor2.setText(parts[2]);
            lbMemoria2.setText(String.valueOf(posicionMemoria+1));
            parts = Operaciones.memoria[posicionMemoria+2].split(" ");
            tfOperacion3.setText(parts[0]);
            tfRegistro3.setText(parts[1]);
            tfValor3.setText(parts[2]);
            lbMemoria3.setText(String.valueOf(posicionMemoria+2));
        }else if(instrucciones==1){
            parts = Operaciones.memoria[posicionMemoria+1].split(" ");
            tfOperacion2.setText(parts[0]);
            tfRegistro2.setText(parts[1]);
            tfValor2.setText(parts[2]);
            lbMemoria2.setText(String.valueOf(posicionMemoria+1));
            tfOperacion3.setText("0000");
            tfRegistro3.setText("0000");
            tfValor3.setText("000000000");
            lbMemoria3.setText(String.valueOf(posicionMemoria+2));
        }else{
            tfOperacion2.setText("0000");
            tfRegistro2.setText("0000");
            tfValor2.setText("00000000");
            lbMemoria2.setText(String.valueOf(posicionMemoria+1));
            tfOperacion3.setText("0000");
            tfRegistro3.setText("0000");
            tfValor3.setText("000000000");
            lbMemoria3.setText(String.valueOf(posicionMemoria+2));
        }
        tfRegistroAC.setText(Integer.toString(Operaciones.arregloRegistros[0]));
        tfRegistroAX.setText(Integer.toString(Operaciones.arregloRegistros[1]));
        tfRegistroBX.setText(Integer.toString(Operaciones.arregloRegistros[2]));
        tfRegistroCX.setText(Integer.toString(Operaciones.arregloRegistros[3]));
        tfRegistroDX.setText(Integer.toString(Operaciones.arregloRegistros[4]));
        tfRegistroIR.setText(Operaciones.memoria[posicionMemoria]);
        tfRegistroPC.setText(Integer.toString(posicionMemoria));
        //tfRegistroAC.setText(Integer.toString(Operaciones.arregloRegistros[0]));
        lbPaso.setText("Paso: "+paso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMemoria = new javax.swing.JLabel();
        lbMemoria1 = new javax.swing.JLabel();
        lbMemoria2 = new javax.swing.JLabel();
        lbMemoria3 = new javax.swing.JLabel();
        tfValor1 = new javax.swing.JTextField();
        tfValor2 = new javax.swing.JTextField();
        tfValor3 = new javax.swing.JTextField();
        tfRegistroPC = new javax.swing.JTextField();
        tfRegistroAC = new javax.swing.JTextField();
        tfRegistroIR = new javax.swing.JTextField();
        tfRegistroAX = new javax.swing.JTextField();
        tfRegistroBX = new javax.swing.JTextField();
        tfRegistroCX = new javax.swing.JTextField();
        lbMemoria4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfRegistroDX = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbPaso = new javax.swing.JLabel();
        tfOperacion1 = new javax.swing.JTextField();
        tfRegistro1 = new javax.swing.JTextField();
        tfOperacion2 = new javax.swing.JTextField();
        tfRegistro2 = new javax.swing.JTextField();
        tfOperacion3 = new javax.swing.JTextField();
        tfRegistro3 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(380, 330));

        lbMemoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbMemoria.setText("Memoria");

        lbMemoria1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbMemoria1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMemoria1.setText("001");
        lbMemoria1.setPreferredSize(new java.awt.Dimension(20, 17));

        lbMemoria2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbMemoria2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMemoria2.setText("002");
        lbMemoria2.setPreferredSize(new java.awt.Dimension(20, 17));

        lbMemoria3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbMemoria3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMemoria3.setText("003");
        lbMemoria3.setPreferredSize(new java.awt.Dimension(20, 17));

        tfValor1.setEditable(false);
        tfValor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfValor1.setText("00000001");
        tfValor1.setPreferredSize(new java.awt.Dimension(70, 30));

        tfValor2.setEditable(false);
        tfValor2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfValor2.setText("00000002");
        tfValor2.setPreferredSize(new java.awt.Dimension(70, 30));

        tfValor3.setEditable(false);
        tfValor3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfValor3.setText("00000003");
        tfValor3.setPreferredSize(new java.awt.Dimension(70, 30));

        tfRegistroPC.setEditable(false);
        tfRegistroPC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistroPC.setText("0001");
        tfRegistroPC.setPreferredSize(new java.awt.Dimension(80, 30));

        tfRegistroAC.setEditable(false);
        tfRegistroAC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistroAC.setText("0002");
        tfRegistroAC.setPreferredSize(new java.awt.Dimension(80, 30));

        tfRegistroIR.setEditable(false);
        tfRegistroIR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistroIR.setText("0003");
        tfRegistroIR.setPreferredSize(new java.awt.Dimension(80, 30));

        tfRegistroAX.setEditable(false);
        tfRegistroAX.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistroAX.setText("0004");
        tfRegistroAX.setPreferredSize(new java.awt.Dimension(80, 30));

        tfRegistroBX.setEditable(false);
        tfRegistroBX.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistroBX.setText("0005");
        tfRegistroBX.setPreferredSize(new java.awt.Dimension(80, 30));

        tfRegistroCX.setEditable(false);
        tfRegistroCX.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistroCX.setText("0006");
        tfRegistroCX.setPreferredSize(new java.awt.Dimension(80, 30));

        lbMemoria4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbMemoria4.setText("Registros CPU");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("PC");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("AC");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("IR");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("AX");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("BX");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("CX");

        tfRegistroDX.setEditable(false);
        tfRegistroDX.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistroDX.setText("0007");
        tfRegistroDX.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("DX");

        lbPaso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPaso.setText("Paso:");

        tfOperacion1.setEditable(false);
        tfOperacion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfOperacion1.setText("00000003");
        tfOperacion1.setPreferredSize(new java.awt.Dimension(35, 30));

        tfRegistro1.setEditable(false);
        tfRegistro1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistro1.setText("00000003");
        tfRegistro1.setPreferredSize(new java.awt.Dimension(35, 30));

        tfOperacion2.setEditable(false);
        tfOperacion2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfOperacion2.setText("00000003");
        tfOperacion2.setPreferredSize(new java.awt.Dimension(35, 30));

        tfRegistro2.setEditable(false);
        tfRegistro2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistro2.setText("00000003");
        tfRegistro2.setPreferredSize(new java.awt.Dimension(35, 30));

        tfOperacion3.setEditable(false);
        tfOperacion3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfOperacion3.setText("00000003");
        tfOperacion3.setPreferredSize(new java.awt.Dimension(35, 30));

        tfRegistro3.setEditable(false);
        tfRegistro3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRegistro3.setText("00000003");
        tfRegistro3.setPreferredSize(new java.awt.Dimension(35, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfOperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbMemoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfOperacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbMemoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfOperacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfRegistro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRegistro3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRegistro2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMemoria4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRegistroDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRegistroAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRegistroBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRegistroCX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRegistroAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRegistroIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRegistroPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMemoria)
                    .addComponent(lbMemoria4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfRegistro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfRegistroPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfRegistroAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfRegistroIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfOperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMemoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfOperacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMemoria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfOperacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRegistroAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRegistroBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRegistroCX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPaso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfRegistroDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbMemoria;
    private javax.swing.JLabel lbMemoria1;
    private javax.swing.JLabel lbMemoria2;
    private javax.swing.JLabel lbMemoria3;
    private javax.swing.JLabel lbMemoria4;
    private javax.swing.JLabel lbPaso;
    private javax.swing.JTextField tfOperacion1;
    private javax.swing.JTextField tfOperacion2;
    private javax.swing.JTextField tfOperacion3;
    private javax.swing.JTextField tfRegistro1;
    private javax.swing.JTextField tfRegistro2;
    private javax.swing.JTextField tfRegistro3;
    private javax.swing.JTextField tfRegistroAC;
    private javax.swing.JTextField tfRegistroAX;
    private javax.swing.JTextField tfRegistroBX;
    private javax.swing.JTextField tfRegistroCX;
    private javax.swing.JTextField tfRegistroDX;
    private javax.swing.JTextField tfRegistroIR;
    private javax.swing.JTextField tfRegistroPC;
    private javax.swing.JTextField tfValor1;
    private javax.swing.JTextField tfValor2;
    private javax.swing.JTextField tfValor3;
    // End of variables declaration//GEN-END:variables
}
