package com.yanyuan.first.service;

import com.yanyuan.first.entity.Article;

/**
 * @author: yanyuan
 * @Date: 2020/11/11 15:44
 * @Description:
 */
public interface ArticleService {
    //存草稿
    String draft(Article article);

    //发布文章
    String publish(Article article);
}
