package com.example.bikeshopmodular;

import de.ostfalia.businesslogic.businesslogic.BusinessLogic;
import de.ostfalia.businesslogic.businesslogic.BusinessLogicImpl;
import de.ostfalia.businesslogic.businesslogic.FacBusinessLogic;
import de.ostfalia.businesslogic.businesslogic.FacBusinessLogicImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static BusinessLogic b;
    private static FahrradKonfiguratorApp fkApp; 
    
    public static FahrradKonfiguratorApp getFkApp() {
        return fkApp;
    }
    
    @Override
    public void start(Stage stage) throws IOException {        
        FacFahrradKonfiguratorApp fkFac = new FacFahrradKonfiguratorAppImpl();
        FacBusinessLogic facB = new FacBusinessLogicImpl();
        
        fkApp = fkFac.create(facB.create(new DbTestImpl()));
        
        fkApp = new FahrradKonfiguratorAppImpl(new BusinessLogicImpl(new DbTestImpl()));
        
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