/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Logueo;
import Util.Constantes;
import Util.Utilitarios;
import Vistas.run;

/**
 *
 * @author Usuario
 */
public class PrincipalController {

    public static Logueo logueo = new Logueo();
    public run run;
    
    public PrincipalController() {
        run = new run();
    }
    
    public String validaLogueo() {
        
        
        
        
        
        
       return "en mantenimiento";
    } 
    
    public void abrirVista(String vista, String titulo) {
        try {
          //  Constantes.RUN.admVista(Constantes.STAGE, vista, titulo, true);           
            run.admVista(Constantes.STAGE, vista, titulo, true);
        } catch (Exception ex) {
           Utilitarios.consola("error: " + ex.getMessage());
        }
    }

    public void cerrarVista(String vista){
         try {
          //  Constantes.RUN.admVista(Constantes.STAGE, vista, titulo, true);           
            run.admVista(Constantes.STAGE, vista, "", false);
        } catch (Exception ex) {
            Utilitarios.consola("error: " + ex.getMessage());
        }
    }
    
    public void mostrarMensaje() {
        abrirVista(Constantes.NMB_VISTA_MNSJ, Constantes.TITULO_MENSAJE);
    }   

}
