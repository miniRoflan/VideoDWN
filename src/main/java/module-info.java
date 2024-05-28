module com.application.videodwn {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.youtube.downloader;
    requires jakarta.persistence;
    requires spring.data.commons;
    requires spring.beans;


    opens com.application.videodwn to javafx.fxml;
    exports com.application.videodwn;
    exports com.application.videodwn.controllers;
    exports com.application.videodwn.models;
    opens com.application.videodwn.models to javafx.fxml;
    exports com.application.videodwn.factory;
    opens com.application.videodwn.factory to javafx.fxml;
}