/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Usuario
 */
public class Utilitarios {

    public static void consola(String mensaje) {
        System.out.println(mensaje);
    }

    public static boolean esVacio(String texto) {
        if (texto.isEmpty() || texto.equalsIgnoreCase("")) {
            return true;
        }else{
            return false;
        }
    }

}
