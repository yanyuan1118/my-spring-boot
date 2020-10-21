package com.yanyuan.first.service.impl;

import com.yanyuan.first.dao.mybatis.UserMapper;
import com.yanyuan.first.entity.User;
import com.yanyuan.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/10/21 10:42
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }

    @Override
    public Integer add(User user) {
        return userMapper.add(user);
    }

    @Override
    public Integer updateById(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public Integer deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    /**
     * 赠送积分
     * propagation = TransactionDefinition.PROPAGATION_REQUIRED
     * @param fromUid
     * @param toUid
     * @param credits
     * @return
     */
    @Override
    @Transactional()
    public boolean donateCredits(Integer fromUid, Integer toUid, Integer credits){
        User formUser = getById(fromUid);
        User toUser = getById(toUid);
        formUser.setCredits(formUser.getCredits() - credits);
        toUser.setCredits(toUser.getCredits() + credits);
        updateById(formUser);
        int test = 1/0;
        updateById(toUser);
        return true;
    }
}
