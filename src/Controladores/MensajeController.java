/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Util.Constantes;
import Vistas.run;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class MensajeController implements Initializable {

    @FXML
    public Label lblmensaje;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void aceptar(ActionEvent event) {
        try {
            Constantes.RUN.admVista(Constantes.STAGE, Constantes.NMB_VISTA_MNSJ, "", false);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblmensaje.setText(Constantes.PRINC_CTRL.validaLogueo());
    }

}
