package com.ais.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


//分类表
@Entity(name = "category")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  int sub_id;
    private  int sort;
    private String name;
    private String image;

    @OneToMany(mappedBy = "category")
    private List<com.ais.entity.Article> articles = new ArrayList<>();

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", sub_id=" + sub_id +
                ", sort=" + sort +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", articles=" + articles +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}



