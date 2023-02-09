module com.example.t8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t8 to javafx.fxml;
    exports com.example.t8;
}