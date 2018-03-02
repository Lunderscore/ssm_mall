package com.ou.mall.service.impl;

import com.ou.mall.bean.User;
import com.ou.mall.bean.UserExample;
import com.ou.mall.dao.UserMapper;
import com.ou.mall.exception.HasUsernameException;
import com.ou.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户Service
 *
 * @author: kpkym
 * date: 2018/3/2
 * time: 22:13
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername())
                .andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(example);
        return users.size() == 0 ? null : users.get(0);
    }

    @Override
    public boolean register(User user) throws HasUsernameException {
        // 存在当前用户名则抛出异常
        if (null != getUser(user.getUsername())) {
            throw new HasUsernameException("存在当前用户名: " + user.getUsername());
        }
        return 0 != userMapper.insertSelective(user);
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User getUser(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        return users.size() == 0 ? null : users.get(0);
    }
}