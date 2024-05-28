package com.application.videodwn;

import com.application.videodwn.controllers.PanelDownloadedVideoController;
import com.application.videodwn.models.PanelDownloadedVideo;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class PanelDownloadedVideoCell extends ListCell<PanelDownloadedVideo> {
    @Override
    protected void updateItem(PanelDownloadedVideo panelDownloadedVideo, boolean empty) {
        super.updateItem(panelDownloadedVideo, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PanelDownloadedVideo.fxml"));
            PanelDownloadedVideoController controller = new PanelDownloadedVideoController(panelDownloadedVideo);
            loader.setController(controller);

            setText(null);
            try {
                setGraphic(loader.load());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
