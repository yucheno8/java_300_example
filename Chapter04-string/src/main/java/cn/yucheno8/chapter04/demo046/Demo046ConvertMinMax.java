package cn.yucheno8.chapter04.demo046;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/5/18/018
 **/

/*
【字符串大小写转换】

toUpperCase()和toLowerCase()方法

字符串在创建后就成为不可变的对象
当调用字符串对象的方法操作字符串时，会产生新的字符串对象，而不是更改原来的字符串对象。
 */
public class Demo046ConvertMinMax {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入要转换的字符：");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String str = stdin.readLine();
        System.out.println(str + "转换为大写形式为：" + toMax(str));
        System.out.println(str + "转换为小写形式为：" + toMin(str));
    }

    /* 转换成大写 */
    public static String toMax(String string) {
        String maxStr = string.toUpperCase();
        return maxStr;
    }
    /* 转换成小写 */
    public static String toMin(String string) {
        String minStr = string.toLowerCase();
        return minStr;
    }


}
