/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Util.Constantes;
import Util.Utilitarios;
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
public class MensajeViewController implements Initializable {

    PrincipalController pc = new PrincipalController();

    @FXML
    public Label lblmensaje;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void aceptar(ActionEvent event) {
        try {
            //  Constantes.RUN.admVista(Constantes.STAGE, Constantes.NMB_VISTA_MNSJ, "", false);
            PrincipalController pc = new PrincipalController();
            pc.cerrarVista(Constantes.NMB_VISTA_MNSJ);
        } catch (Exception e) {
            Utilitarios.consola("No se pudo cerrar la vista. Sistema: ---> " + e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //  lblmensaje.setText(Constantes.PRINC_CTRL.validaLogueo());
        lblmensaje.setText(pc.validaLogueo());
    }

}
