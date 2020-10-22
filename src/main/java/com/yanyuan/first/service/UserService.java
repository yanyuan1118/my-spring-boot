package com.yanyuan.first.service;

import com.yanyuan.first.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/10/21 10:41
 * @Description:
 */
public interface UserService {
    User getById(Integer id);
    List<User> queryList();
    Integer add(User user);
    Integer updateById(User user);
    Integer deleteById(Integer id);
    boolean donateCredits(Integer fromUid, Integer toUid, Integer credits);
    boolean donateCreditsOpenTransactional(Integer fromUid, Integer toUid, Integer credits);
}
