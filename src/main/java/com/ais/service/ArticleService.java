package com.ais.service;

import com.ais.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleService {

    Article saveArticle(Article article);

    Article getArticle(Long id);

    Article updateArticle(Article article,Long id);

    Page<Article> listArticle(Pageable pageable, Article article);

    void  delArticle(Long id);

}
