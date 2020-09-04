package cn.yucheno8.chapter02.demo012;

/*
字符串属于对象而非基本数据类型，不能使用"=="来判断两个字符串是否相等

使用equals()方法来判断两个字符串内容是否相同。
使用“==”判断的将是两个字符串的内存地址，而非字符串内容。
 */

import java.util.Scanner;

public class Demo012CheckLogin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入登录用户名：");
        String user = scan.next();
        System.out.println("请输入登录密码：");
        String password = scan.next();


        /*if (user.equals("lester")  && password.equals("123456")) {
            System.out.println("恭喜您，登录信息通过验证。");
        } else if (user.equals("lester") && !password.equals("123456")) {
            System.out.println("密码错误！");
        } else {
            System.out.println("用户名非法。");
        }*/

        if (!user.equals("lester")) {
            System.out.println("用户名非法。");
        } else if (!password.equals("123456")) {
            System.out.println("密码错误！");
        } else {
            System.out.println("恭喜您，登录信息通过验证。");
        }

    }
}
