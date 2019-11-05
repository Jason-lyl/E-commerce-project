package com.mmall.util;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Properties;
/*
* java 中的properties文件是一种配置文件，主要用于表达配置信息，文件类型为.properties,格式为文本类型，文件的内容是格式是"键=值"的格式，在properties文件
* 中，可以用#来做注释，properties文件在java编程中用到的地方很多，操作很方便
* */
public class PropertiesUtil {
    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private static Properties properties;

    static {
        String fileName = "mmall.properties";
        properties = new Properties();
        try {

            //load(InputStream inStream) 从输入流中读取属性列表（键和元素对）.同偶对指定的文件（比如说上面的mmall.properties文件）进行装载来获取该文件中的所有键值对。以供getProperty(String key)来搜锁

            properties.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName),"UTF-8"));
        }catch (IOException e){
            logger.error("配置文件读取异常", e);
        }
    }

//getProperty(String key),用指定的键在此属性列表中搜索属性。也就是通过参数key，得到key对应的value

    public static String getProperty(String key){
        String value = properties.getProperty(key.trim());
        if (StringUtils.isBlank(value)){
            return null;
        }
        return value.trim();
    }

    public static String getProperty(String key, String defaultValue){
        String value = properties.getProperty(key.trim());
        if (StringUtils.isBlank(value)){
            value = defaultValue;
        }
        return value.trim();
    }
}
