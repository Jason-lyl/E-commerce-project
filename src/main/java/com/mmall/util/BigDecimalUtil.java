package com.mmall.util;

import java.math.BigDecimal;

/**
 * @author jason
 * @2019/11/5
 */

public class BigDecimalUtil {

    private BigDecimalUtil(){

    }

    public static BigDecimal add(double v1, double v2){
        BigDecimal bigDecimal = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v2));
        return bigDecimal.add(bigDecimal1);
    }

    public static BigDecimal sub(double v1, double v2){
        BigDecimal bigDecimal = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v2));
        return bigDecimal.subtract(bigDecimal1);
    }

    public static BigDecimal mul(double v1, double v2){
        BigDecimal bigDecimal = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v2));
        return bigDecimal.multiply(bigDecimal1);
    }

    public static BigDecimal div(double v1, double v2){
        BigDecimal bigDecimal = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v2));
        return bigDecimal.divide(bigDecimal1,2,BigDecimal.ROUND_HALF_UP);
    }



}
