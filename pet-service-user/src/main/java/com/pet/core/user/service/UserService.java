package com.pet.core.user.service;

import com.github.pagehelper.PageInfo;
import com.pet.api.user.entity.User;

import java.util.List;

public interface UserService {

    PageInfo<User> getUserList(int pageNum,int pageSize);

    User getUserInfo(long id);

}
