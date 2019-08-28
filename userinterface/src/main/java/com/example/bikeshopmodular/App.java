package com.example.bikeshopmodular;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import de.ostfalia.businesslogic.businesslogic.BusinessLogic;
//import de.ostfalia.businesslogic.businesslogic.FacBusinessLogic;
//import de.ostfalia.businesslogic.businesslogic.FacBusinessLogicImpl;
import java.util.List;
import java.util.Map;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    protected static String rahmentyp;
    protected static String rahmenfarbe;
    protected static String reifen;
    protected static String antrieb;
    protected static int schrittlaenge;
    protected static int koerpergroesse;
    
    protected static BusinessLogic businesslogic;
    protected static List<String> antriebe;
    protected static List<String> rahmentypen;
    protected static List<String> rahmenfarben;
    protected static List<String> allReifen;
    
    protected static Map m;
    
    //protected static gesamtPreis
 
    @Override
    public void start(Stage stage) throws IOException {
        //FacBusinessLogic facBusinessLogic = new FacBusinessLogicImpl();
        //businesslogic = facBusinessLogic.create(maikstuff);
        
        antriebe = businesslogic.getAllAntriebe();
        rahmentypen = businesslogic.getAllRahmenTypen();
        rahmenfarben = businesslogic.getAllRahmenfarben();
        allReifen = businesslogic.getAllReifen();        
        
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}