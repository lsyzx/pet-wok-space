/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 文件名: AesCoderTest
 * 作者:   lsyzx
 * 创建时间:     2018/1/5 下午11:23
 * 描述:
 * 历史修改:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pet.common.utils;

import org.junit.Test;

/**
 * 〈加解密测试类〉<br>
 *
 * @author lsyzx
 * @create 2018/1/5
 * @version 1.0
 */
public class CommonUtilsTest {

    @Test
    public void run() throws Exception {
        String user="root";
        String v = "jdbc:mysql://127.0.0.1:3306/pet?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";
        String key = "lsyzx";
        System.out.println(AESCoder.encrypt(key, user));
        System.out.println(AESCoder.decrypt(key, "a6rnTljAobPE0fH4RtSwzB/7z6imhIT3t/tJWgUJBVCMZ6K5Pj7BJZnxxYqNJ28FZVKJdV6lXuM9NjDYw2EO12yKTuUAa6g1FNc06vKcOhPmxEOzkbHm1CiE1j+J2+dB7aBXiUC29j4bO1hAEgSB4JmH1yqqTM4ywyAbsxVjl+XaCBO0qiog3B80mHm+l9/k"));
    }
}