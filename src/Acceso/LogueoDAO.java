/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import Conexion.Conexion;
import Util.Constantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class LogueoDAO {

    public LogueoDAO() {

    }

    public static String validaLogueo(String usuario, String contraseña) {
        String resultado;
        int rst = 0;
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement("execute dbo.validaLogueo ?,?");
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rst = rs.getInt(1);
            }
            resultado = asgnLogueo(rst);
        } catch (SQLException e) {
            resultado = Constantes.CNX_ERR + e.getMessage();
        }
        return resultado;
    }

    public static String asgnLogueo(int opcion) {
        switch (opcion) {
            case 0:
                return Constantes.DATOS_OK; //datos correctos
            case 1:
                return Constantes.PASS_ERR; //error de pass
            case 2:
                return Constantes.USU_ERR; //error de usuario
            default:
                return "Opcion no definida";
        }
    }
}
