module com.example.studentgradingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentgradingsystem to javafx.fxml;
    exports com.example.studentgradingsystem;
}