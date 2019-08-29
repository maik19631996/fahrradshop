package com.example.bikeshopmodular;

import de.ostfalia.businesslogic.businesslogic.InvalidConfigException;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimaryController {
    ObservableList<String> OLRahmentypen;
    ObservableList<String> OLRahmenfarben;
    ObservableList<String> OLAllReifen;
    ObservableList<String> OLAntriebe;
    
    @FXML   private ChoiceBox choiceBoxRahmen;
    @FXML   private ChoiceBox choiceBoxRahmenfarbe;
    @FXML   private ChoiceBox choiceBoxReifen;
    @FXML   private ChoiceBox choiceBoxAntriebe;
    @FXML   private TextField textFieldSchritt;
    @FXML   private TextField textFieldGroesse;
    @FXML   private Label preis;
    
    @FXML
    public void initialize() {        
        OLRahmentypen = FXCollections.observableArrayList(App.rahmentypen);
        OLRahmenfarben = FXCollections.observableArrayList(App.rahmenfarben);
        OLAllReifen = FXCollections.observableArrayList(App.allReifen);
        OLAntriebe = FXCollections.observableArrayList(App.antriebe);
        
        choiceBoxRahmen.setItems(OLRahmentypen);
        choiceBoxRahmenfarbe.setItems(OLRahmenfarben);
        choiceBoxReifen.setItems(OLAllReifen);
        choiceBoxAntriebe.setItems(OLAntriebe);
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.rahmentyp = choiceBoxRahmen.getValue().toString();
        App.rahmenfarbe = choiceBoxRahmenfarbe.getValue().toString();
        App.reifen = choiceBoxReifen.getValue().toString();
        App.antrieb = choiceBoxAntriebe.getValue().toString();

        String _laenge = textFieldSchritt.getText();
        int laenge = Integer.parseInt(_laenge);
        App.schrittlaenge = laenge;
        
        String _groesse = textFieldGroesse.getText();
        int groesse = Integer.parseInt(_groesse);
        App.koerpergroesse = groesse;
        
        try {
            App.businesslogic.setFahrradKonfiguration(App.rahmentyp, App.rahmenfarbe, App.reifen, App.antrieb, App.schrittlaenge, App.koerpergroesse);
            App.m = App.businesslogic.getPrices();
        } catch (InvalidConfigException er) {
            System.out.println(er);
        }
       preis.setText(App.m.get("sum").toString());
       //App.m.get("rahmen");
       //App.m.get("reifen");
       //App.m.get("antrieb");
       //App.m.get("sum");
    }
}
