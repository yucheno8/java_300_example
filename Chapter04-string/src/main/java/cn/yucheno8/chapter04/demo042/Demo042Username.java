package cn.yucheno8.chapter04.demo042;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/5/13/013
 **/

/*
【输入的用户名找回用户密码】
在登录一些网站时，我们需要输入用户名和密码。也许时间久了你就会忘记所设的密码，这时我们可以请求该网站将密码发到注册时的邮箱。
这就需要判断用户输入的用户名是否正确，我们可以通过对比用户输入的用户名字符串是否与数据库中或者已经存在的集合中的字符串相同，来决定用户输入的用户名是否正确。


【知识扩展】
在Java虚拟机中有一个保存字符串的池，它会记录所有的字符串。
例如：
String str1 = "abc";
String str2 = "abc";
String str3 = new String("abc");
System.out.println(str1 == str2);
System.out.println(str1 == str3);
这段代码中str1==str2的判断将返回true，而str1==str3将返回false。
因为Java中基本数据类型使用“==”可以判断操作数是否相等，对于对象使用这个符号判断的是两个对象的内存地址是否相同。
如果字符串已经存在，就不在创建相同的字符串，直接返回该字符串，所以这两个变量引用的是同一个字符串，那么它们的地址也是相同的，所以str1==str2成立，
但是使用new关键字创建的字符串会开辟内存控件，所以str1==str3不成立。

 */
public class Demo042Username {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入您要找回密码的用户名称：");
        String username = new String("");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        username = stdin.readLine();

        do_button_actionPerformed(username);

    }

    public static void do_button_actionPerformed(String name) {
        if (name.equals("admin")) {
            System.out.println("对不起，这个用户名是管理员的，不是你的");
        } else if (name.equals("Lester")) {
            System.out.println("该用户名对应的密码已经发送到注册时的邮箱，请查收");
        } else {
            System.out.println("您输入的用户名不存在");
        }
    }

}
