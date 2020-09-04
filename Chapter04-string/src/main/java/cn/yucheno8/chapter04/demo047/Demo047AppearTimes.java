package cn.yucheno8.chapter04.demo047;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/5/18/018
 **/

/*
【计算字符串中子串出现的次数】

编写程序，来测试子字符串“ab”在字符串“ackfeabiofabxeabsjabsdesab”中出现的次数。


 */
public class Demo047AppearTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您要测试的字符串：");
        String str = scan.nextLine(); // 读取输入的字符串
        Scanner scan1 = new Scanner(System.in);
        System.out.println("请输入您要查找的子字符串：");
        String str1 = scan1.nextLine();
        int count = 0;
        int start = 0;
        while (str.indexOf(str1, start) >= 0 && start < str.length()) {
            count++;
            start = str.indexOf(str1, start) + str1.length();
        }
        System.out.println(str1 + "在" + str + "出现的次数为：" + count);
    }
}
