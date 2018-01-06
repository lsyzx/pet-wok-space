package com.pet.core.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pet.api.user.entity.User;
import com.pet.core.user.dao.UserDao;
import com.pet.core.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    //@Transactional
    @Autowired
    private UserDao userDao;


    @Transactional
    @Override
    public PageInfo<User> getUserList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userDao.getUserList();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return pageInfo;
    }

    @Override
    public User getUserInfo(long id) {
        User user = userDao.getUserInfo(id);
        return user;
    }
}
