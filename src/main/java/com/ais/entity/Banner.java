package com.ais.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//轮播图表
@Entity(name = "banner")

public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  int sort;
    private String banner_title;
    private String banner_img;
    private String articlelink;
    private String interlink;

    public Banner() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getBanner_title() {
        return banner_title;
    }

    public void setBanner_title(String banner_title) {
        this.banner_title = banner_title;
    }

    public String getBanner_img() {
        return banner_img;
    }

    public void setBanner_img(String banner_img) {
        this.banner_img = banner_img;
    }

    public String getArticlelink() {
        return articlelink;
    }

    public void setArticlelink(String articlelink) {
        this.articlelink = articlelink;
    }

    public String getInterlink() {
        return interlink;
    }

    public void setInterlink(String interlink) {
        this.interlink = interlink;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", sort=" + sort +
                ", banner_title='" + banner_title + '\'' +
                ", banner_img='" + banner_img + '\'' +
                ", articlelink='" + articlelink + '\'' +
                ", interlink='" + interlink + '\'' +
                '}';
    }
}



