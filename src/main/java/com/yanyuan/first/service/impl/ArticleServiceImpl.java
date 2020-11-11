package com.yanyuan.first.service.impl;

import com.yanyuan.first.dao.ArticleRepository;
import com.yanyuan.first.entity.Article;
import com.yanyuan.first.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: yanyuan
 * @Date: 2020/11/11 15:54
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public String draft(Article article) {
        article.setStatus("DRAFT");
        articleRepository.save(article);
        //do something
        //模拟异常
        int i = 1/0;
        return article.getId();
    }

    @Override
    @Transactional
    public String publish(Article article) {
        article.setStatus("PUBLISH");
        articleRepository.save(article);
        //模拟异常
        int i = 1/0;
        //do something
        return article.getId();
    }
}
