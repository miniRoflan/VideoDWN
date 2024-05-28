package com.application.videodwn.controllers;

import com.application.videodwn.factory.DownloadFactory;
import com.application.videodwn.models.Model;
import com.application.videodwn.models.PanelDownloadedVideo;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DwnBoardController implements Initializable {
    public Button Download_Button;
    public TextField videoLink_TextField;
    public TextField videoName_TextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        Download_Button.setOnAction(event -> onDownload_Button());
    }

    private void onDownload_Button() {
        String link = videoLink_TextField.getText();
        videoLink_TextField.clear();
        String name = videoName_TextField.getText();
        videoName_TextField.clear();


        DownloadFactory.downloadVideo(link);
        Model.getInstance().getViewFactory().getSaveVideoBoardController().listView.getItems().add(new PanelDownloadedVideo(name, DownloadFactory.data.getPath()));

    }
}
