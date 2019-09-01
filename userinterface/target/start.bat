@echo off
rmdir /S /Q .db
java --module-path "javafx-sdk-12.0.1\lib" --add-modules=javafx.controls,javafx.fxml -jar BikeShopModular-1.0-SNAPSHOT-shaded.jar