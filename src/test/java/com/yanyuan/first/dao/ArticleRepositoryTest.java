package com.yanyuan.first.dao;

import com.yanyuan.first.entity.Article;
import com.yanyuan.first.entity.Author;
import com.yanyuan.first.entity.Comment;
import com.yanyuan.first.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yanyuan
 * @Date: 2020/9/29 09:04
 * @Description:
 */
@SpringBootTest
@Slf4j
class ArticleRepositoryTest {

    @Autowired
    ArticleRepository repository;

    @Test
    void save(){
        repository.deleteAll();
        for (int i = 1; i <= 5; i++){
            Article article = new Article();
            article.setId("docker-" + i);
            article.setTitle("docker部署第" + i + "篇");
            article.setContent("部署nginx");
            article.setPraiseCount(0);
            article.setCommentCount(0);
            article.setVisitCount(0);
            Author author = new Author("张三疯", "http://xxx/avatar.png");
            article.setAuthor(author);
            repository.save(article);
        }
    }

    @Test
    void update(){
        Article article = new Article();
        article.setId("docker-1");
        article.setTitle("docker部署第1篇");
        article.setContent("部署apache");
        Author author = new Author("张三疯", "http://xxx/avatar.png");
        article.setAuthor(author);
        repository.save(article);
    }

    /**
     * 点赞
     */
    @Test
    void increPraise(){
        repository.findById("docker-1").ifPresent(article -> {
            article.setPraiseCount(article.getPraiseCount() + 1);
            article.setVisitCount(article.getVisitCount() + 1);
            repository.save(article);
            log.info("【标题】= {}, 【点赞数】= {},【访客数】= {}", article.getTitle(), article.getPraiseCount(), article.getVisitCount());

        });
    }

    @Test
    void findAll(){
        List<Article> list = repository.findAll();
        log.info("findAll - >  {} ", list );
    }

    @Test
    void findById(){
        Optional<Article> optional = repository.findById("docker-1");
        log.info("findById -> {}", optional.get());
    }

    @Test
    void findByTitle() {
        List<Article> list = repository.findByTitle("docker部署第 1 篇");
        log.info("findByTitle - >  {} ", list );
    }

    @Test
    void findByContent() {
        List<Article> list = repository.findByContent("部署nginx");
        log.info("findByContent - >  {} ", list );
    }
}