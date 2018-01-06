package com.pet.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Properties;

/**
 * jdbc解密
 */
public class PropertyPlaceholderConfigurer extends org.springframework.beans.factory.config.PropertyPlaceholderConfigurer {

    protected void processProperties(
            ConfigurableListableBeanFactory beanFactory, Properties props)
            throws BeansException {
        System.out
                .println("正在解密系统文件...");
        try {
            String key = props.getProperty("jdbckey");/**从配置文件读取加密key*/
            // rk----------------------
            String rkUserName = props.getProperty("db_user");
            if (rkUserName != null) {
                String usernameVal = AESCoder.decrypt(key, rkUserName);/**加密方式为AES*/
                props.setProperty("db_user", usernameVal);
            }
            String rkPassword = props.getProperty("db_password");
            if (rkPassword != null) {
                String passwordVal = AESCoder.decrypt(key, rkPassword);
                props.setProperty("db_password", passwordVal);
            }


            String rkDriverClassName = props.getProperty("db_driverClass");

            if (rkDriverClassName != null) {
                String driverClassNameVal = AESCoder.decrypt(key, rkDriverClassName);
                props.setProperty("db_driverClass", driverClassNameVal);
            }

            String rkUrl = props.getProperty("db_jdbcUrl");
            if (rkUrl != null) {
                String urlVal = AESCoder.decrypt(key, rkUrl);
                props.setProperty("db_jdbcUrl", urlVal);
            }
            super.processProperties(beanFactory, props);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BeanInitializationException(e.getMessage());
        }
    }
}
