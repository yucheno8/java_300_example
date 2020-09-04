package cn.yucheno8.chapter03.demo037;

import javafx.scene.transform.Scale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/5/6/006
 **/

/*
【使用数组实现电话号码加密】

问题描述：
某个公司采用公用电话传递数据，数据是八位的电话号码，在传递过程中是加密的，加密规则如下：
每位数字都加上5，然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
public class Demo037PhoneEncryption {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入要加密的电话号码：");
        String phone = new String("");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        phone = stdin.readLine();
        char phoneArray[] = phone.toCharArray();

        System.out.print("您输入的电话号码是：");
        for (int i = 0; i < phoneArray.length; i++) {
            System.out.print(phoneArray[i]);
        }

        int[] a = new int[phoneArray.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = ((phoneArray[i] - '0') + 5) % 10;  // 【核心代码】
        }


        System.out.println("\n==============");
        int temp = 0;
        temp = a[0]; // 第一位和第四位换
        a[0] = a[3];
        a[3] = temp;

        temp = a[1]; // 第二位和第三位换
        a[1] = a[2];
        a[2] = temp;

        System.out.print("您输入的电话号码加密结果为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }

}
