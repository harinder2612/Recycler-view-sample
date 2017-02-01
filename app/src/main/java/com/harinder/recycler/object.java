package com.harinder.recycler;

/**
 * Created by WIN8.1 on 24-01-2017.
 */

public class object {
    private String name;
    int col,imgrs;

    public object(String name, int col, int imgrs) {
        this.name = name;
        this.col=col;
        this.imgrs=imgrs;
    }

    public String getName() {
        return name;
    }

    public int getCol() {
        return col;
    }

    public int getImgrs() {
        return imgrs;
    }
}
