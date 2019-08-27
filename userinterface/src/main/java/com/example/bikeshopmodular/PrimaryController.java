package com.example.bikeshopmodular;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class PrimaryController {
    private ChoiceBox choiceBoxRahmen;
    private ChoiceBox choiceBoxRahmenFarbe;
    private ChoiceBox choiceBoxReifen;
    private ChoiceBox choiceBoxAntriebe;
    private TextField TextFieldSchritt;
    private TextField TextFieldGroesse;

    @FXML
    private void switchToSecondary() throws IOException {        
        App.setRoot("secondary");
    }
    @FXML
    private void getRahmen() {
        for(Rahmen r : App.listRahmen) {
            choiceBoxRahmen.getItems().add(r.getType());
        }
    }
    @FXML
    private void getRahmenFarbe() {
        for(Rahmen r : App.listRahmen) {
            choiceBoxRahmenFarbe.getItems().add(r.getFarbe());
        }
    }
    @FXML
    private void getReifen() {
        for(Reifen r : App.listReifen) {
            choiceBoxReifen.getItems().add(r.getType());
        }
    }
    @FXML
    private void getAntriebe() {
        for(Antrieb a : App.listAntrieb) {
            choiceBoxAntriebe.getItems().add(a.getName());
        }
    }
    @FXML
    private void getSchritt() {
       isInt(TextFieldGroesse.getText() );
            
        
    }
    @FXML
    private void getGroesse() {
        isInt(TextFieldSchritt.getText());
              
    }

    private void isInt(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
