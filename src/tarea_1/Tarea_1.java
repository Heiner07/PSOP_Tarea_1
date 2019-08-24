/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

/**
 *
 * @author Heiner
 */
public class Tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFVentanaPrincipal ventana=new JFVentanaPrincipal();
        ventana.setVisible(true);
        String prueba1 = "0011 0001 00000101";
        String prueba2 = "0011 0010 00000011";
        String prueba3 = "0001 0001 00000000";
        String prueba4 = "0101 0010 00000000";
        String prueba5 = "0100 0001 00000000";
        String prueba6 = "0010 0001 00000000";   
        Operaciones op = new Operaciones();
        op.Operaciones(prueba1);
        op.Operaciones(prueba2);
        op.Operaciones(prueba3);
        op.Operaciones(prueba4);
        op.Operaciones(prueba5);
        op.Operaciones(prueba6);
    }
    
}
