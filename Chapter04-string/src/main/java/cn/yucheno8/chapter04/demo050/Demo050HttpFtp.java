package cn.yucheno8.chapter04.demo050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yucheno8
 * @date 2020/8/4/004
 **/
public class Demo050HttpFtp {
    public static void main(String[] args) throws IOException {

        System.out.println("请输入请求网址：");
        String s = new String("");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        s = stdin.readLine();

        if (s.startsWith("http")) {
            System.out.println("您输入的网址是" + s + "\n您输入的是网址，希望浏览某个网址。");
        } else if (s.startsWith("ftp")) {
            System.out.println("您输入的网址是" + s + "\n您输入的是FTP网址，希望访问FTP服务器。");
        }
    }
}
