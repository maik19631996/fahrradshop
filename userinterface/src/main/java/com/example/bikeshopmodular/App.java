package com.example.bikeshopmodular;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Injector databaseInjector;
    protected static BikeShopInterface bikeShop;
    protected static List<Rahmen> listRahmen;
    protected static List<Antrieb> listAntrieb;
    protected static List<Reifen> listReifen;    
    protected static FahrradKonfiguration f;

    @Override
    public void start(Stage stage) throws IOException {
        bikeShop = databaseInjector.getShop();
        listRahmen = bikeShop.getAllRahmen();
        listAntrieb = bikeShop.getAllAntriebe();
        listReifen = bikeShop.getAllReifen();
              
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