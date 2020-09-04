package cn.yucheno8.chapter04.demo049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.lang3.math.NumberUtils;



/**
 * @author yucheno8
 * @date 2020/5/21/021
 **/

/*
【判断字符串是否为数字】

 */
public class Demo049CheckNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("输入金额：");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String text = stdin.readLine();
        boolean isNum = NumberUtils.isNumber(text);
        if (isNum) {
            System.out.println("输入正确，是数字格式");
        } else {
            System.out.println("输入错误，请确认格式再输入");
        }
    }
}
