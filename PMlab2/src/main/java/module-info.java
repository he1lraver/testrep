module com.example.pmlab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pmlab2 to javafx.fxml;
    exports com.example.pmlab2;
}