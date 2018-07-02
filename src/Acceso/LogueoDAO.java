/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import Util.*;
import java.sql.*;

/**
 *
 * @author Usuario
 */
public class LogueoDAO {

    public LogueoDAO() {

    }

    public static int buscaLogueo(String usuario, String contraseña) {
        int rst = 0;
        try {
            String s_sql = "execute " + Constantes.SP_VALIDA_LOGUEO;
            Connection con = Utilitarios.conectar_BD();
            PreparedStatement ps = con.prepareStatement(s_sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rst = rs.getInt(1);
            }
            return rst;
        } catch (SQLException e) {
            return rst;
        }
    }

    public static String validaLogueo(String usuario, String contraseña) {
        int logueo = buscaLogueo(usuario, contraseña);
        String resultado = "No hay opcion";
        if (logueo == 0) {
            resultado = Constantes.DATOS_OK;
        }
        if (logueo == 1) {
            resultado = Constantes.PASS_ERR;
        }
        if (logueo == 2) {
            resultado = Constantes.USU_BLOQ;
        }
        if (logueo == 3) {
            resultado = Constantes.USU_ERR;
        }
        return resultado;
    }

    public static int actEstadoUsuario(String usuario, String estado) {
        try {
            String s_sql = "execute " + Constantes.SP_ACT_ESTADO;
            Connection con = Utilitarios.conectar_BD();
            PreparedStatement ps = con.prepareStatement(s_sql);
            ps.setString(1, usuario);
            ps.setString(2, estado);
            if (ps.executeUpdate() > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 2;
        }
    }

    public static String activarUsuario(String usuario) {
        int resultado = actEstadoUsuario(usuario, Constantes.ACTIVO);
        if (resultado == 1) {
            return Constantes.USU_ACT;
        } else {
            return Constantes.USU_ACT_ERR + " (" + resultado + ")";
        }
    }

    public static String eliminarUsuario(String usuario) {
        int resultado = actEstadoUsuario(usuario, Constantes.INACTIVO);
        if (resultado == 1) {
            return Constantes.USU_INAC;
        } else {
            return Constantes.USU_INAC_ERR + " (" + resultado + ")";
        }
    }

    public static String bloquearUsuario(String usuario) {
        int resultado = actEstadoUsuario(usuario, Constantes.BLOQUEADO);
        if (resultado == 1) {
            return Constantes.USU_BLOQ;
        } else {
            return Constantes.USU_BLOQ_ERR + " (" + resultado + ")";
        }
    }

}
