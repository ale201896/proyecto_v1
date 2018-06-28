/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Util.Constantes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class loginController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private TextField txtusuario;
    @FXML
    private PasswordField txtpass;

    @FXML
    private void ingresar(ActionEvent event) {
        validaLogueo();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    private void validaLogueo() {
        Constantes.CONT_LOG --;
        Constantes.LOGUEO.setUsuario(txtusuario.getText());
        Constantes.LOGUEO.setContraseña(txtpass.getText());
        Constantes.PRINC_CTRL.mostrarMensaje();
    }

}
