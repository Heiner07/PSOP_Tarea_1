/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

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
    
    
    public int registroPosicion(String registro){       
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
    void decimalABinaro(int a) {
        String temp = Integer.toBinaryString(a);
        while(temp.length() !=8){
            temp = "0"+temp;
        }
        System.out.println(temp);
    }
}
