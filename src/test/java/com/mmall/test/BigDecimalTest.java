package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author jason
 * @2019/11/5
 */

public class BigDecimalTest {

    @Test
    public void test1(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }

    @Test
    public void test2(){
        BigDecimal bigDecimal = new BigDecimal(0.05);
        BigDecimal bigDecimal1 = new BigDecimal(0.01);
        System.out.println(bigDecimal.add(bigDecimal1));
    }

    /**
     * float double 用于科学工程计算 BigDecimal 的string 构造器 用于商业计算
     */

    @Test
    public void test3(){
        BigDecimal bigDecimal = new BigDecimal("0.05");
        BigDecimal bigDecimal1 = new BigDecimal("0.01");
        System.out.println(bigDecimal.add(bigDecimal1));

    }


}
