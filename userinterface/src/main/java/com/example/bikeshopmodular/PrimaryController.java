package com.example.bikeshopmodular;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class PrimaryController {
    private ChoiceBox choiceBoxRahmen;
    private ChoiceBox choiceBoxReifen;
    private ChoiceBox choiceBoxAntriebe;

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
}
