package com.yanyuan.first.service;

import com.yanyuan.first.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yanyuan
 * @Date: 2020/11/11 16:52
 * @Description:
 */
@SpringBootTest
class ArticleServiceTest {

    @Autowired
    ArticleService articleService;

    @Test
    void draft() {
        Article article = Article.builder()
                .title("草稿-标题")
                .content("内容-标题")
                .build();
        articleService.draft(article);
    }

    @Test
    void publish() {
        Article article = Article.builder()
                .title("发布-标题")
                .content("发布-内容")
                .build();
        articleService.publish(article);
    }
}