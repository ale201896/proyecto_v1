/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Util.Constantes;
import Util.Utilitarios;
import com.sun.webkit.CursorManager;
import com.sun.webkit.graphics.WCImage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


/**
 *
 * @author Usuario
 */
public class LoguinViewController implements Initializable {

    public static PrincipalController pc = new PrincipalController();

    @FXML
    private Button button;
    @FXML
    private TextField txtusuario;
    @FXML
    private PasswordField txtpass;
    @FXML
    private Label lblregistrar;

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
        pc.abrirVista(Constantes.NMB_VISTA_MNSJ, Constantes.TITULO_MENSAJE);
    }

    @FXML
    public void mouseClicked() {
        Utilitarios.consola("click");
    }

    @FXML
    public void mouseEntered() {
        lblregistrar.setCursor(Cursor.HAND);
    }

    @FXML
    public void mouseExited() {
        lblregistrar.setCursor(Cursor.DEFAULT);
    }
}
