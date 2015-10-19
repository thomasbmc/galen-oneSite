package com.galenframework.java.sample.components.Html;

/**
 * Created by tmphillips on 19-10-2015.
 */
public class URL {
    private String url;
    private String title;
    public URL(String url, String title) {
        this.url = url;
        this.title = title;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
