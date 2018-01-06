package com.pet.api.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pet.api.user.entity.User;
import com.pet.api.user.request.QUERY_USER_REQ;
import com.pet.api.user.response.QUERY_USER_RES;
import com.pet.api.user.service.UserApiService;
import com.pet.core.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userApiService")
public class UserApiServiceImpl implements UserApiService{

    @Autowired
    private UserService userService;

    public QUERY_USER_RES queryUserList(QUERY_USER_REQ req) {
        QUERY_USER_RES res = new QUERY_USER_RES();
        System.out.println("QUERY_USER_RES:"+JSON.toJSONString(req));
        PageInfo<User> userList = userService.getUserList(req.getPageNum(), req.getPageSize());
        res.setData(userList);
        res.setRes_code("0000");
        res.setRes_msg("查询成功");
        return res;
    }

    public QUERY_USER_RES getUserInfo(QUERY_USER_REQ req) {
        User user = userService.getUserInfo(1);
        QUERY_USER_RES res = new QUERY_USER_RES();
        res.setData(user);
        res.setRes_code("000");
        res.setRes_msg("查询成功");
        return res;
    }

    public QUERY_USER_RES get_string(QUERY_USER_REQ req) {
        User user = new User();
        user.setId(1);
        user.setAge(20);
        user.setName("小明");
        user.setSex('男');
        QUERY_USER_RES res = new QUERY_USER_RES();
        res.setData(user);
        res.setRes_code("000");
        res.setRes_msg("查询成功");
        return res;
    }
}
