package com.qfedu.pojo;

import java.util.Date;

public class Info {
    private Integer fid;

    private String text;

    private Date date;

    private String infocont;

    private String img;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInfocont() {
        return infocont;
    }

    public void setInfocont(String infocont) {
        this.infocont = infocont == null ? null : infocont.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}