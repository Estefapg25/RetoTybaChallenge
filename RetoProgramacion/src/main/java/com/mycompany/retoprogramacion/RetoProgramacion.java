package com.mycompany.retoprogramacion;

import java.util.Scanner;

/**
 *
 * @author estefaniaperez
 */
public class RetoProgramacion {

    public static void main(String[] args) {
        String nombre;
        String tipoDocumento;
        double monto;
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        nombre = entrada.next();
        System.out.println("Ingrese su tipo de documento asi:\n" + "CC: cédula de ciudadanía\n" + "CE: cédula de extranjería\n" +
                "Pasaporte: pasaporte\n" + "Permisos especial de permanencia: Permiso Permanencia\n" +
                "Registro civil: RC\n" + "Tarjeta de identidad: TI");
        tipoDocumento = entrada.next();  
        
        if(ValidacionesTipoDocumento.tipoDocumentoPermitido(tipoDocumento).equals(true)){
            
        System.out.println("Ingrese el monto de la inversión: ");
        monto = entrada.nextDouble();   
        
            if(ValidacionesMonto.montoPermitido(monto).equals(true)){
            Inversion.recomendacionesDeInversion(monto);
            }
            else{
               System.out.println("Lo sentimos, el monto minimo de inversión es apartir de 200000");
            }         
        }
        else{
               System.out.println("Lo sentimos, tu tipo de documento no es válido para invertir");
            } 
        
    }    
    
   

}
        
 

