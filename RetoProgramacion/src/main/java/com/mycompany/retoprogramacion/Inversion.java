package com.mycompany.retoprogramacion;

public class Inversion {
    
     public static void recomendacionesDeInversion(double monto){
        final int porcentajeCDT=7;
        final int porcentajeAcciones=12;
        final int porcentajeFondos=20;
                 
        
        if(monto>=200000 && monto<=5000000){
            System.out.println("Te recomendamos el producto de CDT");
            System.out.println("Si inviertes en CDT tendrás una ganancia del: " + porcentajeCDT + "%");
           }
           else if(monto>=5000000 && monto<=25000000){
             System.out.println("Te recomendamos el producto de Acciones");
             System.out.println("Si inviertes en acciones tendrás una ganancia del: " + porcentajeAcciones + "%");
           }
           else{
               System.out.println("Te recomendamos el producto de fondos de inversión");
               System.out.println("Si inviertes en fondos de inversión tendrás una ganancia del: " + porcentajeFondos + "%");
           }
    }
}
