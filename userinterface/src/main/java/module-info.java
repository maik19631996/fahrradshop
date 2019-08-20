module com.example.bikeshopmodular {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.bikeshopmodular to javafx.fxml;
    exports com.example.bikeshopmodular;
}