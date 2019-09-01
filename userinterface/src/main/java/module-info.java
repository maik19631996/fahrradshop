module com.example.bikeshopmodular {
    requires javafx.controls;
    requires javafx.fxml;
    
    requires de.ostfalia.businesslogic;
    requires DeOstfaliaDatabaseTest;

    opens com.example.bikeshopmodular to javafx.fxml;
    exports com.example.bikeshopmodular;
    
}