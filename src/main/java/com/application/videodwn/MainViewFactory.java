package com.application.videodwn;

import com.application.videodwn.controllers.SaveVideoBoardController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainViewFactory {
    private AnchorPane saveVideoBoardView;
    private AnchorPane dwnBoardView;
    private final StringProperty selectedMenu;
    private SaveVideoBoardController saveVideoBoardController;


    public MainViewFactory() {
        this.selectedMenu = new SimpleStringProperty("");
    }

    public StringProperty getSelectedMenu() {
        return selectedMenu;
    }

    public AnchorPane getSaveVideoBoardView() {
        if (saveVideoBoardView == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SaveVideoBoard.fxml"));
                saveVideoBoardView = loader.load();
                this.saveVideoBoardController = loader.getController();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return saveVideoBoardView;
    }

    public AnchorPane getDwnBoardView() {
        if (dwnBoardView == null) {
            try {
                dwnBoardView = new FXMLLoader(getClass().getResource("DwnBoard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return dwnBoardView;
    }

    public SaveVideoBoardController getSaveVideoBoardController() {
        return this.saveVideoBoardController;
    }

    public void showMenu() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Glue.fxml"));

        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
