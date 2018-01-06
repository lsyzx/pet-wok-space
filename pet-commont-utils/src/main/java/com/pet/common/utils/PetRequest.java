/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 文件名: PetRequest
 * 作者:   lsyzx
 * 创建时间:     2018/1/5 上午12:44
 * 描述:
 * 历史修改:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pet.common.utils;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author lsyzx
 * @create 2018/1/5
 * @version 1.0
 */
public class PetRequest {
    private String timestamp;
    private String token;
    private String sign;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}