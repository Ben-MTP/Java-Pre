package com.jindo.core.model;

/**
 * @author ManhKM on 9/5/2022
 * @project spring-boot-log4j2
 */
public class Page {
    private String name;
    private String url;

    public Page() {
    }

    public Page(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Page{" +
            "name='" + name + '\'' +
            ", url='" + url + '\'' +
            '}';
    }
}
