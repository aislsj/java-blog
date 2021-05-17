package com.ais.entity;



import javax.persistence.*;


//首页推荐表
@Entity(name = "rmend")

public class Rmend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  int sort;
    private String img_auth;
    private String title;

    @ManyToOne
    private Article article;

    public Rmend() {
    }

    @Override
    public String toString() {
        return "Rmend{" +
                "id=" + id +
                ", sort=" + sort +
                ", img_auth='" + img_auth + '\'' +
                ", title='" + title + '\'' +
                ", article=" + article +
                '}';
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

    public String getImg_auth() {
        return img_auth;
    }

    public void setImg_auth(String img_auth) {
        this.img_auth = img_auth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}



