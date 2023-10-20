module com.example.baic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baic to javafx.fxml;
    exports com.example.baic;
}