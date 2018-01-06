/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 文件名: BaseController
 * 作者:   lsyzx
 * 创建时间:     2018/1/5 下午11:56
 * 描述:
 * 历史修改:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pet.user.web.base;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈Controller基类〉<br>
 *
 * @author lsyzx
 * @create 2018/1/5
 * @version 1.0
 */
public class BaseController {
    private static Logger logger = Logger.getLogger(BaseController.class);
    public static String SUCCESS = "success";
    public static String SUCCESS_MSG = "提示:操作成功";
    public static String FAIL = "fail";
    public static String FAIL_MSG = "提示:操作失败";

    /**
     * 获取Request对象
     * @return
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        return request;
    }

    /**
     * 获取Response对象
     * @return
     */
    public HttpServletResponse getResponse() {
        return ((ServletWebRequest)RequestContextHolder.getRequestAttributes()).getResponse();
    }


    /**
     * 获取int类型数据
     * @param name
     * @return
     */
    public Integer getParameterInteger(String name) {
        Integer object = 0;
        try {
            object = Integer.parseInt(this.getRequest().getParameter(name));
        } catch (Exception e) {
        }
        return object;
    }

    /**
     * 获取String类型数据
     * @param name
     * @return
     */
    public String getParameterString(String name) {
        String object = "";
        try {
            object = this.getRequest().getParameter(name);
        } catch (Exception e) {
            object = "";
        }
        if (object == null) {
            object = "";
        }
        return object.trim();
    }


}