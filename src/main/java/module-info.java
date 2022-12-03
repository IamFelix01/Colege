module com.example.colege {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colege to javafx.fxml;
    exports com.example.colege;
}