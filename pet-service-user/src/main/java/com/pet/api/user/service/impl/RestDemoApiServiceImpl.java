/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 文件名: UserRestApiServiceImpl
 * 作者:   lsyzx
 * 创建时间:     2018/1/6 上午1:31
 * 描述:
 * 历史修改:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pet.api.user.service.impl;

import com.pet.api.user.request.QUERY_USER_REQ;
import com.pet.api.user.response.QUERY_USER_RES;
import com.pet.api.user.service.RestDemoApiService;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author lsyzx
 * @create 2018/1/6
 * @version 1.0
 */
@Service("restDemoApiService")
@Path("reset_demon")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class RestDemoApiServiceImpl implements RestDemoApiService {

    @POST
    @Path("testList")
    public QUERY_USER_RES testList(@BeanParam final QUERY_USER_REQ req){
        QUERY_USER_RES res = new QUERY_USER_RES();
        res.setData("testList Method SUCCESS!");
        res.setRes_code("0000");
        res.setRes_msg("查询成功");
        return res;
    }

    @POST
    @Path("testInfo")
    public QUERY_USER_RES testInfo(@BeanParam final QUERY_USER_REQ req) {
        QUERY_USER_RES res = new QUERY_USER_RES();
        res.setData("testInfo Method SUCCESS!");
        res.setRes_code("000");
        res.setRes_msg("查询成功");
        return res;
    }

    @GET
    @Path("testString")
    public QUERY_USER_RES testString(@BeanParam final QUERY_USER_REQ req){
        QUERY_USER_RES res = new QUERY_USER_RES();
        res.setData("testString Method SUCCESS!");
        res.setRes_code("000");
        res.setRes_msg("查询成功");
        return res;
    }
}