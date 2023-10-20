module com.example.java_fx_hello {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_fx_hello to javafx.fxml;
    exports com.example.java_fx_hello;
}