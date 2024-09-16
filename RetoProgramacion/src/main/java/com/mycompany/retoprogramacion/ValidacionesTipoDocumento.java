package com.mycompany.retoprogramacion;

/**
 *
 * @author estefaniaperez
 */
public class ValidacionesTipoDocumento {
    
          
    public static Boolean tipoDocumentoPermitido(String tipoDocumento){
        return ((Constantes.CEDULA_CIUDADANIA.contains(tipoDocumento))
                || (Constantes.CEDULA_EXTRANJERIA.contains(tipoDocumento)));
                   
    }

    
    
}
