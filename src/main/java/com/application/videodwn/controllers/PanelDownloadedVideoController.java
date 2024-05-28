package com.application.videodwn.controllers;

import com.application.videodwn.models.Model;
import com.application.videodwn.models.PanelDownloadedVideo;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PanelDownloadedVideoController implements Initializable {
    public Button deleteButton;
    public Text textVideoName;
    public Button playButton;

    private final PanelDownloadedVideo panelDownloadedVideo;


    public PanelDownloadedVideoController(PanelDownloadedVideo panelDownloadedVideo) {
        this.panelDownloadedVideo = panelDownloadedVideo;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textVideoName.setText(panelDownloadedVideo.getVideoName());
        addListeners();
    }

    private void addListeners() {
        deleteButton.setOnAction(event -> onDeleteButton());
        playButton.setOnAction(event -> onPlayButton());
    }

    private void onDeleteButton() {
        Model.getInstance().getViewFactory().getSaveVideoBoardController().listView.getItems().remove(this.panelDownloadedVideo);
        File file = new File(this.panelDownloadedVideo.getPath());
        file.delete();

    }

    private void onPlayButton() {
        String command = panelDownloadedVideo.getPath();

        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"D:\\workProgram\\AllJAVA\\JAVA2ndProject\\VideoDWN\\\" && start " +command);
            builder.redirectErrorStream(true);
            Process p = builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
