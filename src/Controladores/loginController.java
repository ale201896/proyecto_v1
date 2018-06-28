/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Util.Constantes;
import Util.Utilitarios;
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

    public static PrincipalController pc = new PrincipalController();
    
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
        
        PrincipalController.logueo.setUsuario(txtusuario.getText());
       PrincipalController.logueo.setContraseña(txtpass.getText());
        
    //    Logueo logueo = new Logueo();
     //   logueo.setUsuario(txtusuario.getText());
       // logueo.setContraseña(txtpass.getText());
        //pc.setLogueo(logueo);
        
       Utilitarios.consola(pc.validaLogueo());
       
        Constantes.PRINC_CTRL.mostrarMensaje();
        
        pc.mostrarMensaje();
    }

}
