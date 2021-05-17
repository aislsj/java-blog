package com.ais.entity;



import javax.persistence.*;


//文章图片表
@Entity(name = "article_img")

public class ArticleImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String article_image_path;

    @ManyToOne
    private Article article;


    public ArticleImage() {
    }

    @Override
    public String toString() {
        return "ArticleImage{" +
                "id=" + id +
                ", article_image_path='" + article_image_path + '\'' +
                ", article=" + article +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArticle_image_path() {
        return article_image_path;
    }

    public void setArticle_image_path(String article_image_path) {
        this.article_image_path = article_image_path;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}



