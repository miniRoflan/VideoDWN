package com.application.videodwn;

import com.application.videodwn.Controllers.CheckController;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MainApplication extends Application{
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showMenu();
    }
}