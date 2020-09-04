package cn.yucheno8.chapter04.demo051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yucheno8
 * @date 2020/8/4/004
 *
 **/

/*
【知识扩展】在正则表达式中，“.”代表任何一个字符，
因此在正则表达式中如果想使用普通意义的点字符“.”，必须使用转义字符“\”。
 */

public class Demo051CheckIP {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入IP地址：");
        String s = new String("");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        s = stdin.readLine();

        String info = matches(s); // 对输入文本进行IP验证
        System.out.println(info);
    }

    public static String matches(String text) {
        String str = "请输入您的IP地址：";
        if (text != null && !text.isEmpty()) { //定义正则表达式
            String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
            if (text.matches(regex)) {
                return text + "\n是一个合法的IP地址！";
            } else {
                return text + "\n不是一个合法的IP地址！";
            }
        }
        return str;
    }
}
