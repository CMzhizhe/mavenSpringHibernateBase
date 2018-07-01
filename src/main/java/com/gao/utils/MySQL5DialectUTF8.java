package com.gao.utils;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * 因为hibernate自动创建的表，不是utf-8的，
 * 采用如下方式，让他创建的表是utf-8的
 * @author Gao
 *
 */
public class MySQL5DialectUTF8 extends MySQL5InnoDBDialect{
    @Override  
    public String getTableTypeString() {  
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";    
    }  

}