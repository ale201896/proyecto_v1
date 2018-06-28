/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Logueo;
import Util.Constantes;

/**
 *
 * @author Usuario
 */
public class PrincipalController {

    public PrincipalController() {
    }

    public String validaLogueo() {
        if ((Constantes.LOGUEO.getUsuario().length() == 0) && (Constantes.LOGUEO.getContraseña().length() == 0)) {
            return Constantes.DATOS_VACIOS;
        } else {
            if (Constantes.LOGUEO.getUsuario().length() == 0) {
                return Constantes.USU_VACIO;
            } else {
                if (Constantes.LOGUEO.getContraseña().length() == 0) {
                    return Constantes.PASS_VACIO;
                } else {
                    if (!(Constantes.LOGUEO.getUsuario().equalsIgnoreCase(Constantes.USUARIO_DEFAULT))
                            && !(Constantes.LOGUEO.getContraseña().equalsIgnoreCase(Constantes.PASS_DEFAULT))) {
                        return Constantes.DATOS_ERR;
                    } else {
                        if (!Constantes.LOGUEO.getUsuario().equalsIgnoreCase(Constantes.USUARIO_DEFAULT)) {
                            return Constantes.USU_ERR;
                        } else {
                            if (!Constantes.LOGUEO.getContraseña().equalsIgnoreCase(Constantes.PASS_DEFAULT)) {
                                if (Constantes.CONT_LOG < 1) {
                                    return Constantes.USU_BLOQ;
                                } else {
                                    return Constantes.PASS_ERR + " (" + Constantes.CONT_LOG + ") intentos.";
                                }
                            } else {
                                return Constantes.DATOS_OK;
                            }
                        }
                    }
                }
            }
        }
    }

    public void abrirVista(String vista, String titulo) {
        try {
            Constantes.RUN.admVista(Constantes.STAGE, vista, titulo, true);
        } catch (Exception ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }

    public void mostrarMensaje() {
        abrirVista(Constantes.NMB_VISTA_MNSJ, Constantes.TITULO_MENSAJE);
    }

}
