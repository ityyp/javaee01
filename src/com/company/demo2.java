package com.company;

import java.util.Random;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        double num = 3.44777;
        //调用方法
        int abs = round(num);
        //打印结果
        System.out.println(num +"四舍五入之后是" + abs);
    }
    //定义四舍五入方法
    public static int round(double num){
        //将小数乘以10后强转为int,再对10取余，能过获取到十分位(小数第一位)
        int a = (int)(num * 10) % 10;
        if(a < 5){
            //如果a小于5,则四舍
            return (int)num;
        }else{
            //如果a大于等于5,则五入
            return (int)num + 1;
        }
    }
    }
