/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Controladores.PrincipalController;
import Modelo.Logueo;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Constantes {

    //VALORES FIJOS
    public static String TITULO_MENSAJE = "Mensaje"; //TITULO DE LA VISTA DE MENSAJE
    public static String NMB_VISTA_MNSJ = "MensajeView.fxml"; //NOMBRE DE LA VISTA DE MENSAJE
    public static String USUARIO_DEFAULT = "admin"; //USUARIO PREDETERMINADO
    public static String PASS_DEFAULT = "123456"; //PASS DETERMINADO

    //OBJETOS FIJOS
    public static PrincipalController PRINC_CTRL = new PrincipalController(); //CONTROLADOR PRINCIPAL
    public static Stage STAGE = new Stage(); //STAGE PARA VISTAS EMERGENTES POP-UP
    public static Logueo LOGUEO = new Logueo(); //LOGUEO DE DATOS

    //DATOS DE LOGUEOS
    public static String DATOS_OK = "Bienvenido..."; // USUARIO Y CONTRASEÑA CORRECTOS
    public static String DATOS_VACIOS = "Ingrese Datos."; //USUARIO Y CONTRASEÑA VACIOS
    public static String USU_VACIO = "Ingrese Usuario."; // USUARIO VACIO
    public static String PASS_VACIO = "Ingrese Contraseña."; // PASS VACIO
    public static String USU_ERR = "Usuario Incorrecto."; // USUARIO INCORRECTO
    public static String PASS_ERR = "Contraseña Incorrecta.Te quedan "; // PASS INCORRECTO
    public static String DATOS_ERR = "Datos Incorrectos."; // USUARIO Y CONTRASEÑA INCORRECTOS
    public static int CONT_LOG = 3; // INTENTOS DE LOGUEO

    //DATOS DE CONEXION
    public static String CNX_URL = "jdbc:sqlserver://localhost:1433;databaseName=Proyecto;user=alejandro;password=magno201696"; 
    public static String CNX_ERR = "No se pudo establecer la conexion. ";
    
    //ESTADOS DE USUARIO
    public static String USU_ACT = "Usuario Habilitado";
    public static String USU_INAC = "Usuario Eliminado";
    public static String USU_BLOQ = "Usuario Bloqueado, comuniquese con el administrador.";
    
    //PROCEDIMIENTOS ALMACENADOS
    public static String SP_VALIDA_LOGUEO = "dbo.validaLogueo ?,?";
    public static String SP_ACT_ESTADO = "dbo.actEstado ?,?";
    
    //ESTADOS REGISTROS
    public static String ACTIVO = "Activo";
    public static String INACTIVO = "Inactivo";
    public static String BLOQUEADO = "Bloqueado";
    
    //ERRORES ESTADOS USUARIO
    public static String USU_ACT_ERR = "No se pudo habilitar el usuario.";
    public static String USU_INAC_ERR = "No se pudo eliminar el usuario.";
    public static String USU_BLOQ_ERR = "No se pudo bloquear el usuario.";
    
    
}
