module com.example.eighthjavaproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eighthjavaproject to javafx.fxml;
    exports com.example.eighthjavaproject;
}