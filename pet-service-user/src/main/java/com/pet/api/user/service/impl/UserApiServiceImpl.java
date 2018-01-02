package com.pet.api.user.service.impl;

import com.github.pagehelper.PageInfo;
import com.pet.api.user.entity.User;
import com.pet.api.user.entity.UserRequest;
import com.pet.api.user.entity.UserResponse;
import com.pet.api.user.service.UserApiService;
import com.pet.core.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Service("userApiService")
@Path("users")
public class UserApiServiceImpl implements UserApiService{

    @Autowired
    private UserService userService;

    @POST
    @Path("getlist")
    @Consumes({MediaType.APPLICATION_JSON})
    public UserResponse queryUserList(UserRequest userRequest) {
        UserResponse userResponse = new UserResponse();
        PageInfo<User> userList = userService.getUserList(userRequest.getPageNum(),userRequest.getPageSize());
        userResponse.setObj(userList);
        userResponse.setRes_code("0000");
        userResponse.setRes_msg("查询成功");
        return userResponse;
    }

    @GET
    @Path("getinfo")
    @Consumes({MediaType.APPLICATION_JSON})
    public User getUserInfo() {
        User user = userService.getUserInfo(1);
        return user;
    }

    @GET
    @Path("get_string")
    @Consumes({MediaType.APPLICATION_JSON})
    public String get_string() {
        return "ssssss";
    }
}
