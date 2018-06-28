/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Controladores.PrincipalController;
import Modelo.Logueo;
import Vistas.run;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Constantes {

    //VALORES FIJOS
    public static String TITULO_MENSAJE = "Mensaje"; //TITULO DE LA VISTA DE MENSAJE
    public static String NMB_VISTA_MNSJ = "mensaje.fxml"; //NOMBRE DE LA VISTA DE MENSAJE
    public static String USUARIO_DEFAULT = "admin";
    public static String PASS_DEFAULT = "123456";

    //OBJETOS FIJOS
    public static PrincipalController PRINC_CTRL = new PrincipalController(); //CONTROLADOR PRINCIPAL
    public static run RUN = new run(); //RUN
    public static Stage STAGE = new Stage(); //STAGE PARA VISTAS EMERGENTES POP-UP
    public static Logueo LOGUEO = new Logueo(); //LOGUEO DE DATOS

    //RESULTADOS DE LOGUEOS
    public static String DATOS_OK = "Bienvenido..."; // USUARIO Y CONTRASEÑA CORRECTOS
    public static String DATOS_VACIOS = "Ingrese Datos."; //USUARIO Y CONTRASEÑA VACIOS
    public static String USU_VACIO = "Ingrese Usuario."; // USUARIO VACIO
    public static String PASS_VACIO = "Ingrese Contraseña."; // PASS VACIO
    public static String USU_ERR = "Usuario Incorrecto."; // USUARIO INCORRECTO
    public static String PASS_ERR = "Contraseña Incorrecta."; // PASS INCORRECTO
    public static String DATOS_ERR = "Datos Incorrectos."; // USUARIO Y CONTRASEÑA INCORRECTOS
    public static String USU_BLOQ = "Usuario Bloqueado. Intentos Fallidos, comunicarse con el administrador."; //USUARIO BLOQUEADO
    public static int CONT_LOG = 4; // INTENTOS DE LOGUEO
    
}
