package com.mycompany.retoprogramacion;

/**
 *
 * @author estefaniaperez
 */
public class ValidacionesMonto {
    
   
    
    public static Boolean montoPermitido(double monto){
        if(monto<200000){
            return false;
        }
        return true;
    }

    
    
}
