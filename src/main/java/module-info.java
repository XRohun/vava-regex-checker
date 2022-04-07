module com.example.vavaregexchecker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vavaregexchecker to javafx.fxml;
    exports com.example.vavaregexchecker;
}