package cn.yucheno8.chapter01.demo009;

/*
不借助第三者实现两个变量值的互换

按位异或运算符“^”是双目运算符。
其功能是参与运算的两数各对应的二进位相异或
当两对应的二进位相异时，结果为1。

 */

import java.util.Scanner;

public class Demo009ExchangeValue {

    public static void main(String[] args) {

        System.out.println("请输入变量A的值：");
        long A = new Scanner(System.in).nextInt(); // 接受第一个变量的值
        System.out.println("请输入变量B的值：");
        long B = new Scanner(System.in).nextInt(); // 接受第二个变量的值
        System.out.print("A=" + A + "\tB=" + B + "执行变量互换...\t");

        // 执行变量互换
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A=" + A + "\tB" + B);


    }
}
