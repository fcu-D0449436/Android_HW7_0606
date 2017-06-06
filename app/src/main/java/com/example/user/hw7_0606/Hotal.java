package com.example.user.hw7_0606;

import android.graphics.Bitmap;

/**
 * Created by user on 2017/6/6.
 */

public class Hotal {
    private Bitmap imgUrl;

    private String name;

    private String addr;

    public Bitmap getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Bitmap imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getKind() {
        return name;
    }

    public void setKind(String kind) {
        this.name = kind;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
