package com.ais.service;

import com.ais.dao.ArticleRepository;
import com.ais.entity.Article;
import com.ais.entity.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article getArticle(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public Article updateArticle(Article article, Long id) {
        Article a = articleRepository.getOne(id);
        BeanUtils.copyProperties(article,a);
        return  articleRepository.save(a);
    }

    @Override
    public Page<Article> listArticle(Pageable pageable, Article article) {
        return articleRepository.findAll(new Specification<Article>() {
            @Override
            public Predicate toPredicate(Root<Article> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if(!"".equals(article.getArticle_name()) && article.getArticle_name()!= null){
                    predicates.add(cb.like(root.<String>get("Article_name"),"%"+article.getArticle_name()+"%"));
                }
//                if(article.getCategory().getId() != null){
//                    predicates.add(cb.equal(root.<Category>get("category").get("id"),article.getCategory().getId()));
//                }
//                if(article.isRecommend()){
//                    predicates.add(cb.equal(root.<Boolean>get("recommend"),article.isRecommend()));
//                }
                cq.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        },pageable);
    }

    @Override
    public void delArticle(Long id) {
        articleRepository.deleteById(id);

    }
}
