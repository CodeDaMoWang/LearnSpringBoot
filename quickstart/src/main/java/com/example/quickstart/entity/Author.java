package com.example.quickstart.entity;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class Author {

    private String avatar;
    private String name;
    private String date;

    private String preview;
    private String title;
    private String text;

    public Author(String avatar, String name, String date, String preview, String title, String text) {
        this.avatar = avatar;
        this.name = name;
        this.date = date;
        this.preview = preview;
        this.title = title;
        this.text = text;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Author() {
    }
}
