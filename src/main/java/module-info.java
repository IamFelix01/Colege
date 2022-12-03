module com.example.gestion-college {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestion-college to javafx.fxml;
    exports com.example.gestion-college;
}