/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 文件名: PetResponse
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
public class PetResponse {
    private String res_code;
    private String res_msg;

    public String getRes_code() {
        return res_code;
    }

    public void setRes_code(String res_code) {
        this.res_code = res_code;
    }

    public String getRes_msg() {
        return res_msg;
    }

    public void setRes_msg(String res_msg) {
        this.res_msg = res_msg;
    }
}