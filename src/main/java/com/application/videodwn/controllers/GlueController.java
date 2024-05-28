package com.application.videodwn.controllers;

import com.application.videodwn.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class GlueController implements Initializable {

    public BorderPane pparent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getSelectedMenu().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case "DwnBoard" -> pparent.setCenter(Model.getInstance().getViewFactory().getDwnBoardView());
                case "SaveVideoBoard" -> pparent.setCenter(Model.getInstance().getViewFactory().getSaveVideoBoardView());
            }
        });
    }
}
