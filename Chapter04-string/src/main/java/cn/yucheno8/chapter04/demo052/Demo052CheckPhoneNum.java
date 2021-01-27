package cn.yucheno8.chapter04.demo052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yucheno8
 * @date 2021/1/24/024
 **/

/*
本实例将演示如何使用正则表达式来确定输入的电话号码格式是否匹配。
 */
public class Demo052CheckPhoneNum {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入您的电话号码：");
        String s = new String("");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        s = stdin.readLine();

        String info = check(s);
    }


    public static String check(String text){
        String str = "请输入您的电话号码：";
        if (text == null || text.isEmpty()) {
            return "请输入电话号码：";
        }
        // 定义正则表达式
        String regex = "^\\d{3}-? \\d{8}|\\d{4}-? \\d{8}$";
        // 判断输入数据是否为电话号码
        if (text.matches(regex)) {
            return text + "\n是一个合法的电话号码！";
        } else {
            return text + "\n不是一个合法的电话号码！";
        }
    }
}
