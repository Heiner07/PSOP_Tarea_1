/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author home
 */
public class Operaciones {
    
    
    //[0] = AC
    //[1] = AX
    //[2] = BX
    //[3] = CX
    //[4] = DX
    int[] arregloRegistros = {0,0,0,0,0};
    static String[] memoria = new String[99];
    
    
    public void Operaciones(String instrucciones){
        String[] parts;
        parts = instrucciones.split(" ");
        String operacion = parts[0];
        String registro = parts[1];
        String numero = parts[2];
        System.out.println("operador: "+operacion);
        System.out.println("Registro: "+registro);
        System.out.println("Numero: "+numero);
        
        switch(operacion) {
            case "0001"://LOAD
                arregloRegistros[0] = arregloRegistros[registroPosicion(registro)];              
                break;    
                
            case "0010"://STORE
                arregloRegistros[registroPosicion(registro)] = arregloRegistros[0];
                break;
                
            case "0011"://MOV
               movimiento(registro,numero);
                break; 
                
            case "0100"://SUB
                restar(registro,numero);
                break;
                
            case "0101"://ADD
                sumar(registro, numero);
                break;

            default:             
                break;
        }
        System.out.println("AX: "+arregloRegistros[1]);
        System.out.println("BX: "+arregloRegistros[2]);
        System.out.println("CX: "+arregloRegistros[3]);
        System.out.println("DX: "+arregloRegistros[4]);
        System.out.println("AC: "+arregloRegistros[0]);
    }
     
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        String cadena2 ="";
        
        FileReader f = new FileReader(archivo);
        try (BufferedReader b = new BufferedReader(f)) {
            while((cadena = b.readLine())!=null) {
                cadena2 += cadena +"\n";               
              //  System.out.println(i+" -> "+cadena);
            }
        }
        memoria = cadena2.split("\n");
        memoriaToBits();
    }
    
    public static void memoriaToBits(){
        String[] parteOperacion,parteResto; 
        String instruccionEnbits;       
        for(int i=0;i<memoria.length;i++){
            parteOperacion = memoria[i].split(" ");
            instruccionEnbits = parteOperacion[0];
            parteResto = parteOperacion[1].split(",");
            if(parteResto.length >=2){
                memoria[i] = toBinario(instruccionEnbits)+" "+toBinario(parteResto[0])+" "+decimalABinaro(Integer.parseInt(parteResto[1]));              
            }else{
               memoria[i] = toBinario(instruccionEnbits)+" "+toBinario(parteResto[0])+" 00000000";
            }
            System.out.println(memoria[i]);
        }
    }
    
    public static int registroPosicion(String registro){       
            switch(registro) {
                case "0001"://AX                    
                     return 1;   
                case "0010"://BX
                    return 2;                                  
                case "0011"://CX
                    return 3;
                case "0100"://DX
                   return 4;
                default:
                    return 0;
                   
            }    

    }
    
    public static String toBinario(String registro){      
            switch(registro) {
                case "AX"://AX                    
                     return "0001";   
                case "BX"://BX
                    return "0010";                                  
                case "CX"://CX
                    return "0011";
                case "DX"://DX
                   return "0100";
                case "LOAD"://LOAD
                   return "0001";
                case "STORE"://STORE
                   return "0010";
                case "MOV"://MOV
                   return "0011";
                case "SUB"://SUB
                   return "0100";                
                case "ADD"://ADD
                   return "0101";
                default:
                    return "0000";
                   
            }    

    }
    
    
   
        
            
    public void movimiento(String registro, String numero){
        
            int numeroDecimal = Integer.parseInt(numero.substring(1, 8),2);
            if("1".equals(numero.substring(0,1))){
                numeroDecimal *= -1;           
            }
            arregloRegistros[registroPosicion(registro)] = numeroDecimal;                             
    }
    
    public void sumar(String registro, String numero){
        int numeroDecimal = Integer.parseInt(numero.substring(1, 8),2);
        if(numero.equals("00000000")){
            arregloRegistros[0] += arregloRegistros[registroPosicion(registro)];
        }else{            
            if("1".equals(numero.substring(0,1))){
                numeroDecimal *= -1;           
            }
            arregloRegistros[registroPosicion(registro)] += numeroDecimal;
        }       
    }
    
    
    public void restar(String registro, String numero){
        int numeroDecimal = Integer.parseInt(numero.substring(1, 8),2);
        if(numero.equals("00000000")){
            arregloRegistros[0] -= arregloRegistros[registroPosicion(registro)];
        }else{            
            if("1".equals(numero.substring(0,1))){
                numeroDecimal *= -1;           
            }
            arregloRegistros[registroPosicion(registro)] -= numeroDecimal;
        }     
           
    }
    public static String decimalABinaro(int a) {
        boolean negativo = false;
        if(a<0){
            a *=-1;
            negativo = true;
        }       
        String temp = Integer.toBinaryString(a);
        
        while(temp.length() !=7){
            temp = "0"+temp;
        }
        if(negativo){temp="1"+temp;}else{temp="0"+temp;}
        return temp;
    }
}
