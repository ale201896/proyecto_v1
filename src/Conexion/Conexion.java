/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Util.Constantes;
import Util.Utilitarios;
import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Conexion {

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(Constantes.CNX_URL);
        } catch (Exception e) {
            Utilitarios.consola("Error Conexion: " + e.getMessage());
        }
        return con;
    }

}
