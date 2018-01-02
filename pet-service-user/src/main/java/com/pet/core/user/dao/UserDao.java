package com.pet.core.user.dao;

import com.pet.api.user.entity.User;

import java.util.List;

public interface UserDao {

    List<User> getUserList();

    User getUserInfo(long id);
}
