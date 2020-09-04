package cn.yucheno8.chapter01.demo008;

/*
三元条件表达式运算时首先判断表达式（布尔型）的值
如果为true，则整个表达式的结果为冒号前的值，否则为冒号后面的值。
 */

import java.util.Scanner;

public class Demo008Odd_even {

    public static void main(String[] args) {

        System.out.println("请输入一个整数：");
        long a = new Scanner(System.in).nextInt();
        String c = (a % 2 == 0) ? "偶数" : "奇数";
        System.out.println("这个数是：" + c);
    }
}
