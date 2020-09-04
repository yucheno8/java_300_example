package cn.yucheno8.chapter04.demo048;

import java.util.Date;
import java.util.Locale;

/**
 * @author yucheno8
 * @date 2020/5/18/018
 **/

/*
【当前日期的格式化】

String字符串中日期格式化方法
使用不同的方式输出String类的日期格式参数值，组合这些值实现特殊格式的日期字符串。
 */
public class Demo048DateString {
    public static void main(String[] args) {
        Date today = new Date();

        /* 格式化后的字符串为月份的英文缩写 */
        String a = String.format(Locale.US, "%tb", today);
        System.out.println("格式化后的字符串为月份的英文缩写" + a);

        /* 格式化后的字符串为月份的英文全写 */
        String b = String.format(Locale.US, "%tB", today);
        System.out.println("格式化后的字符串为月份的英文全写" + b);

        /* 格式化后的字符串为星期（如：星期一） */
        String c = String.format("%ta", today);
        System.out.println("格式化后的字符串为星期" + c);

        /* 格式化后的字符串为星期 */
        String d = String.format("%tA", today);
        System.out.println("格式化后的字符串为星期" + c);

        /* 格式化后的字符串为4位的年份值 */
        String e = String.format("%tY", today);
        System.out.println("格式化后的字符串为4位的年份值： " + e);

        /* 格式化后的字符串为2位的年份值 */
        String f = String.format("%ty", today);
        System.out.println("格式化后的字符串为2位的年份值： " + f);

        /* 格式化后的字符串为2位的月份值 */
        String g = String.format("%tm", today);
        System.out.println("格式化后的字符串为2位的月份值： " + g);

        /* 格式化后的字符串为2位的日期值 */
        String h = String.format("%td", today);
        System.out.println("格式化后的字符串为2位的日期值： " + h);
    }
}
