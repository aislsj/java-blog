package com.ais.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//文章表
@Entity(name = "article")

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String article_name;
    private String article_describe;
    private String article_keywords;
    private int article_status;
    private int article_img_status;
    private String article_author;
    private int views;
    private int article_praise;
    private String article_url;
    private int recommend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;


    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "article")
    private List<Rmend> rmends = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<ArticleContent> articleContents = new ArrayList<>();


    @OneToMany(mappedBy = "article")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    private List<ArticleImage> articleImages = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();


    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

    public String getArticle_describe() {
        return article_describe;
    }

    public void setArticle_describe(String article_describe) {
        this.article_describe = article_describe;
    }

    public String getArticle_keywords() {
        return article_keywords;
    }

    public void setArticle_keywords(String article_keywords) {
        this.article_keywords = article_keywords;
    }

    public int getArticle_status() {
        return article_status;
    }

    public void setArticle_status(int article_status) {
        this.article_status = article_status;
    }

    public int getArticle_img_status() {
        return article_img_status;
    }

    public void setArticle_img_status(int article_img_status) {
        this.article_img_status = article_img_status;
    }

    public String getArticle_author() {
        return article_author;
    }

    public void setArticle_author(String article_author) {
        this.article_author = article_author;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getArticle_praise() {
        return article_praise;
    }

    public void setArticle_praise(int article_praise) {
        this.article_praise = article_praise;
    }

    public String getArticle_url() {
        return article_url;
    }

    public void setArticle_url(String article_url) {
        this.article_url = article_url;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Rmend> getRmends() {
        return rmends;
    }

    public void setRmends(List<Rmend> rmends) {
        this.rmends = rmends;
    }

    public List<ArticleContent> getArticleContents() {
        return articleContents;
    }

    public void setArticleContents(List<ArticleContent> articleContents) {
        this.articleContents = articleContents;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<ArticleImage> getArticleImages() {
        return articleImages;
    }

    public void setArticleImages(List<ArticleImage> articleImages) {
        this.articleImages = articleImages;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", article_name='" + article_name + '\'' +
                ", article_describe='" + article_describe + '\'' +
                ", article_keywords='" + article_keywords + '\'' +
                ", article_status=" + article_status +
                ", article_img_status=" + article_img_status +
                ", article_author='" + article_author + '\'' +
                ", views=" + views +
                ", article_praise=" + article_praise +
                ", article_url='" + article_url + '\'' +
                ", recommend=" + recommend +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", category=" + category +
                ", rmends=" + rmends +
                ", articleContents=" + articleContents +
                ", comments=" + comments +
                ", articleImages=" + articleImages +
                ", tags=" + tags +
                '}';
    }
}



