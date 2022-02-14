package com.shallowcopy;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 */
public class Obj {
    private String content;

    public Obj(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "content='" + content + '\'' +
                '}';
    }
}
