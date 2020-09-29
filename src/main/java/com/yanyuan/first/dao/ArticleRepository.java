package com.yanyuan.first.dao;

import com.yanyuan.first.entity.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/9/29 09:03
 * @Description:
 */
public interface ArticleRepository extends MongoRepository<Article, String> {
    List<Article> findByTitle(String title);
    List<Article> findByContent(String content);
}
