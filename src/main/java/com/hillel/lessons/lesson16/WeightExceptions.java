package com.hillel.lessons.lesson16;

import java.io.IOException;

public class WeightExceptions extends IOException {

    private String message;
    private String title;

    public WeightExceptions(String message, String title) {
        this.message = message;
        this.title = title;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }
}