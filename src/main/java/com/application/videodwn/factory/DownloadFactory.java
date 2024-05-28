package com.application.videodwn.factory;

import com.github.kiulian.downloader.YoutubeDownloader;
import com.github.kiulian.downloader.downloader.request.RequestVideoFileDownload;
import com.github.kiulian.downloader.downloader.request.RequestVideoInfo;
import com.github.kiulian.downloader.downloader.response.Response;

import com.github.kiulian.downloader.model.videos.VideoInfo;
import com.github.kiulian.downloader.model.videos.formats.Format;
import com.github.kiulian.downloader.model.videos.formats.VideoWithAudioFormat;

import java.io.File;
import java.util.List;

public class DownloadFactory {
    public static File data;

    public static void downloadVideo(String videoId) {
        File outputDir = new File("my_videos");


        YoutubeDownloader downloader = new YoutubeDownloader();
        RequestVideoInfo requestInfo = new RequestVideoInfo(videoId);
        Response<VideoInfo> response = downloader.getVideoInfo(requestInfo);
        VideoInfo video = response.data();

        List<VideoWithAudioFormat> videoWithAudioFormats = video.videoWithAudioFormats();


        Format format = videoWithAudioFormats.get(0);
        RequestVideoFileDownload requestDownload = new RequestVideoFileDownload(format).saveTo(outputDir);
        Response<File> response1 = downloader.downloadVideoFile(requestDownload);
        data = response1.data();
    }
}
