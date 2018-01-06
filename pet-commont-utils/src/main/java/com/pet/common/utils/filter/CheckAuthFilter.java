/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 文件名: RequestFilter
 * 作者:   lsyzx
 * 创建时间:     2018/1/6 下午3:57
 * 描述:
 * 历史修改:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pet.common.utils.filter;

import com.alibaba.dubbo.rpc.*;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author lsyzx
 * @version 1.0
 * @create 2018/1/6
 */
public class CheckAuthFilter implements Filter {

    private static Logger logger = Logger.getLogger(CheckAuthFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//        HttpServletRequest request = (HttpServletRequest) RpcContext.getContext().getRequest();
//        HttpServletResponse response = (HttpServletResponse) RpcContext.getContext().getResponse();
//        String jsonData = "";
        String methodName = invocation.getMethodName();
        Object[] data = invocation.getArguments();
        logger.error("请求方法："+methodName+"请求参数：data"+ JSON.toJSONString(data));
        return invoker.invoke(invocation);
    }

//    /**
//     * 设置参数
//     *
//     * @param data
//     * @param response
//     * @return
//     */
//    protected RpcResult getRpcResult(String data, HttpServletRequest request, HttpServletResponse response) {
//
//        PrintWriter writer = null;
//        try {
//            response.setContentType("application/json; charset=utf-8");
//            writer = response.getWriter();
//            writer.print(data);
//        } catch (Exception e) {
//
//        } finally {
//            writer.close();
//        }
//        return new RpcResult();
//    }
}