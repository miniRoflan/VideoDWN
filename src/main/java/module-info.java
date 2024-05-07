module com.application.videodwn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.videodwn to javafx.fxml;
    exports com.application.videodwn;
    exports com.application.videodwn.Controllers;
}