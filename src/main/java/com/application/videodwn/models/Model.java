package com.application.videodwn.models;

import com.application.videodwn.MainViewFactory;

public class Model {
    private static Model model;
    private final MainViewFactory mainViewFactory;


    public Model() {
        this.mainViewFactory = new MainViewFactory();
    }

    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }

        return model;
    }

    public MainViewFactory getViewFactory() {
        return mainViewFactory;
    }
}
