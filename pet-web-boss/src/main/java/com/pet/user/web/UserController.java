/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 文件名: UserController
 * 作者:   lsyzx
 * 创建时间:     2018/1/5 下午11:59
 * 描述:
 * 历史修改:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pet.user.web;

import com.pet.api.user.request.QUERY_USER_REQ;
import com.pet.api.user.response.QUERY_USER_RES;
import com.pet.api.user.service.UserApiService;
import com.pet.api.user.service.RestDemoApiService;
import com.pet.user.web.base.BaseController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author lsyzx
 * @create 2018/1/5
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserApiService userApiService;

    @Autowired
    private RestDemoApiService restDemoApiService;

    @RequestMapping(value = "/to_login")
    public String to_login(HttpServletRequest request,HttpServletResponse response){
        QUERY_USER_REQ req = new QUERY_USER_REQ();
        req.setPageNum(1);
        req.setPageSize(2);
        QUERY_USER_RES res = userApiService.queryUserList(req);
        System.out.println(res.getRes_code()+"========="+res.getRes_msg());
        QUERY_USER_RES res2 = restDemoApiService.testList(req);
        System.out.println(res2.getRes_code()+"========="+res2.getRes_msg());

        return "/login/login";
    }
}