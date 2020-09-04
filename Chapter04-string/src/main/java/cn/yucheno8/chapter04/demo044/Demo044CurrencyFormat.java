package cn.yucheno8.chapter04.demo044;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/5/18/018
 **/

/*
【将数字格式化为货币字符串】
在该类的主方法中创建标准输入流的扫描器对象，接收用户输入的数字
通过NumberFormat类的format()方法把接收的数字格式转换为货币字符串。

 */
public class Demo044CurrencyFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 创建标准输入流扫描器
        System.out.println("请输入一个数字：");
        double number = scan.nextDouble(); // 获得用户输入数字
        System.out.println("该数字用Locale类的以下常量作为格式化对象的构造参数，将获得不同的货币格式：");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA); // 创建格式化对象
        System.out.println("Locale.CHINA：" + format.format(number)); // 输出格式化货币格式
        format = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Locale.US：" + format.format(number)); // 输出格式化货币格式
        format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println("Locale.ENGLISH：" + format.format(number)); // 输出格式化货币格式
    }
}
