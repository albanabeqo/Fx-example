/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 *
 * @author alban
 */
public class FXMLExampleController {
    @FXML private Text actiontarget;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
//        if (fxmlexample.FXMLExample.)
        actiontarget.setText("Sign in button pressed");
    }

}

