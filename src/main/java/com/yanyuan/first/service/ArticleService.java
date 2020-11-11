package com.yanyuan.first.service;

import com.yanyuan.first.entity.Article;

/**
 * @author: yanyuan
 * @Date: 2020/11/11 15:44
 * @Description:
 */
public interface ArticleService {
    /**
     * 存草稿
     * @param article
     * @return
     */
    String draft(Article article);

    /**
     * 发布文章
     * @param article
     * @return
     */
    String publish(Article article);
}
