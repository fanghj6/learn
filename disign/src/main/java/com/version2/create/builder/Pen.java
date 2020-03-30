package com.version2.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Product
 * @Description TODO
 * @date 2020/3/17  22:30
 **/
public class Pen {

    /**
     * 笔芯
     */
    private String core;

    /**
     * 笔壳
     */
    private String shell;

    /**
     * 笔盖
     */
    private String cover;

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "core='" + core + '\'' +
                ", shell='" + shell + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }
}
