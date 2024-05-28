package com.application.videodwn;

import com.application.videodwn.models.Model;
import javafx.application.Application;


import javafx.stage.Stage;


public class MainApplication extends Application{


    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showMenu();
    }
}