/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Acceso.LogueoDAO;
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
        String resultado;
        if (Utilitarios.esVacio(logueo.getUsuario())
                && Utilitarios.esVacio(logueo.getContraseña())) {
            return Constantes.DATOS_VACIOS;
        } else {
            if (Utilitarios.esVacio(logueo.getUsuario())) {
                return Constantes.USU_VACIO;
            } else {
                if (Utilitarios.esVacio(logueo.getContraseña())) {
                    return Constantes.PASS_VACIO;
                } else {
                    resultado = LogueoDAO.validaLogueo(logueo.getUsuario(), logueo.getContraseña());
                    if (resultado.equalsIgnoreCase(Constantes.PASS_ERR)) {
                        if (Constantes.CONT_LOG <= 0) {
                            LogueoDAO.bloquearUsuario(logueo.getUsuario());
                            return resultado;
                        } else {
                            return resultado + Constantes.CONT_LOG + " intentos";
                        }
                    } else {
                        return resultado;
                    }

                }
            }
        }
    }

    public void abrirVista(String vista, String titulo) {
        try {
            //  Constantes.RUN.admVista(Constantes.STAGE, vista, titulo, true);           
            run.admVista(Constantes.STAGE, vista, titulo, true);
        } catch (Exception ex) {
            Utilitarios.consola("Error: No se pudo abrir la vista. : " + ex.getMessage());
        }
    }

    public void cerrarVista(String vista) {
        try {
            //  Constantes.RUN.admVista(Constantes.STAGE, vista, titulo, true);           
            run.admVista(Constantes.STAGE, vista, "", false);
        } catch (Exception ex) {
            Utilitarios.consola("Erro: No se pudo cerrar la vista" + ex.getMessage());
        }
    }

}
