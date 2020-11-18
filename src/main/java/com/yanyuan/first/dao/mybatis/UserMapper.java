package com.yanyuan.first.dao.mybatis;

import com.yanyuan.first.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/10/13 11:48
 * @Description:
 */
@Mapper
public interface UserMapper {
    User getById(@Param("id") Integer id);
    List<User> queryList();
    Integer add(User user);
    Integer updateById(User user);
    Integer deleteById(@Param("id") Integer id);
    Integer batchInsert(List<User> list);
}
