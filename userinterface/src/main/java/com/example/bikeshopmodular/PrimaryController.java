package com.example.bikeshopmodular;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {
    private FahrradKonfiguratorApp fkApp;
    private ObservableList<String> OLRahmentypen;
    private ObservableList<String> OLRahmenfarben;
    private ObservableList<String> OLAllReifen;
    private ObservableList<String> OLAntriebe;
    
    @FXML   private ChoiceBox choiceBoxRahmen;
    @FXML   private ChoiceBox choiceBoxRahmenfarbe;
    @FXML   private ChoiceBox choiceBoxReifen;
    @FXML   private ChoiceBox choiceBoxAntriebe;
    @FXML   private TextField textFieldSchritt;
    @FXML   private TextField textFieldGroesse;
    @FXML   private Label preis;
    
    @FXML
    private void initialize() {       
        fkApp = App.getFkApp();
        OLRahmentypen = FXCollections.observableArrayList(fkApp.getRahmentypen());
        OLRahmenfarben = FXCollections.observableArrayList(fkApp.getRahmenfarben());
        OLAllReifen = FXCollections.observableArrayList(fkApp.getAllReifen());
        OLAntriebe = FXCollections.observableArrayList(fkApp.getAntriebe());
        
        choiceBoxRahmen.setItems(OLRahmentypen);
        choiceBoxRahmenfarbe.setItems(OLRahmenfarben);
        choiceBoxReifen.setItems(OLAllReifen);
        choiceBoxAntriebe.setItems(OLAntriebe);
        
        choiceBoxRahmen.setValue(fkApp.getRahmentypen().get(0));
        choiceBoxRahmenfarbe.setValue(fkApp.getRahmenfarben().get(0));
        choiceBoxReifen.setValue(fkApp.getAllReifen().get(0));
        choiceBoxAntriebe.setValue(fkApp.getAntriebe().get(0));
    }
    
    @FXML
    private void clickBerechnen() throws IOException {
        fkApp.setRahmentyp(choiceBoxRahmen.getValue().toString());
        fkApp.setRahmenfarbe(choiceBoxRahmenfarbe.getValue().toString()); 
        fkApp.setReifen(choiceBoxReifen.getValue().toString());
        fkApp.setAntrieb(choiceBoxAntriebe.getValue().toString());
        
        try {
            String _laenge = textFieldSchritt.getText();
            int laenge = Integer.parseInt(_laenge);
            fkApp.setSchrittlaenge(laenge);

            String _groesse = textFieldGroesse.getText();
            int groesse = Integer.parseInt(_groesse);
            fkApp.setKoerpergroesse(groesse);
            
            preis.setText(fkApp.getSumPriceAsString());
        } catch (NumberFormatException er) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Das waren keine Zentimeterangaben");
            alert.setContentText("Bitte nur ganze Zahlen.");
            alert.showAndWait();
        }       
    }
}