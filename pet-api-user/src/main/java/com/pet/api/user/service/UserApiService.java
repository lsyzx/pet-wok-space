package com.pet.api.user.service;

import com.github.pagehelper.PageInfo;
import com.pet.api.user.entity.User;
import com.pet.api.user.entity.UserRequest;
import com.pet.api.user.entity.UserResponse;

public interface UserApiService {

    UserResponse queryUserList(UserRequest userRequest);

    User getUserInfo();

    String get_string();
}
