package cn.yucheno8.chapter03.demo028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/4/24/024
 **/

/*
统计出数组中各种字符的个数
 */
public class Demo028StatisticsChar {

    public static void main(String[] args) throws IOException {

        /* 字符串的输入、取值 */
        System.out.println("请输入一行字符：");
        String s = new String("");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        s = stdin.readLine();

        /* 不同字符个数的获取 */
        /*int cnNum = 0;int enNum = 0;int nullNum = 0; int digitalNum = 0; int otherNum = 0;*/
        int cnNum = 0, enNum = 0, nullNum = 0, digitalNum = 0, otherNum = 0;
        byte[] bytes = s.getBytes(); // 将输入的字符串转换成字符串数组

        for (int i = 0; i < bytes.length; i++) {
            if ((bytes[i] >= 65 && bytes[i] <= 90) || (bytes[i] >= 97 && bytes[i] <= 122))
                enNum++;
            else if (bytes[i] == 32)
                nullNum++;
            else if (bytes[i] >= 48 && bytes[i] <= 57)
                digitalNum++;
            else if (bytes[i] < 0)
                cnNum++;
            else
                otherNum++;
        }

        System.out.println("字符串所占字节个数为：" + bytes.length);
        System.out.println("汉字个数为：" + cnNum/2);
        System.out.println("英文字母个数为：" + enNum);
        System.out.println("空格个数为：" + nullNum);
        System.out.println("数字个数为：" + digitalNum);
        System.out.println("其他字符的个数为：" + otherNum);
    }

}
