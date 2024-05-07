package com.application.videodwn;

import com.application.videodwn.Controllers.MenuController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    private AnchorPane saveVideoBoardView;
    private AnchorPane dwnBoardView;
    private final StringProperty selectedMenu;


    public ViewFactory() {
        this.selectedMenu = new SimpleStringProperty("");
    }

    public StringProperty getSelectedMenu() {
        return selectedMenu;
    }

    public AnchorPane getSaveVideoBoardView() {
        if (saveVideoBoardView == null) {
            try {
                saveVideoBoardView = new FXMLLoader(getClass().getResource("SaveVideoBoard.fxml")).load();
            } catch (Exception e) {

            }
        }

        return saveVideoBoardView;
    }

    public AnchorPane getDwnBoardView() {
        if (dwnBoardView == null) {
            try {
                dwnBoardView = new FXMLLoader(getClass().getResource("DwnBoard.fxml")).load();
            } catch (Exception e) {

            }
        }

        return dwnBoardView;
    }

    public void showMenu() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Glue.fxml"));
        //MenuController menuController = new MenuController();
        //loader.setController(menuController);

        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {

        }

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
