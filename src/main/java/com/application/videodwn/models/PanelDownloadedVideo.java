package com.application.videodwn.models;


import com.application.videodwn.data_base.VideoInf;
import com.application.videodwn.data_base.VideoInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PanelDownloadedVideo {
    private String videoName;
    private String path;
    //@Autowired
    //VideoInfoRepository videoInfoRepository;


    public PanelDownloadedVideo(String videoName, String path) {
        this.videoName = videoName;
        this.path = path;
        //VideoInf videoInf = new VideoInf();
        //videoInf.setName(videoName);
        //videoInf.setPath(path);
        //videoInfoRepository.save(videoInf);
    }

    public String getVideoName() {
        return videoName;
    }

    public String getPath() {
        return path;
    }
}
