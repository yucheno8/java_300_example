 package cn.yucheno8.chapter02.demo011;
import java.util.Scanner;

/*
问题描述：
输入年份，判断所输入的年份是否为闰年

问题分析：
判断一个年份是否为闰年，要满足两个条件：
一个是能被4整除但不能被100整除，另一个是能被400整除。

判断格式：
year % 4 == 0 && year % 100 != 0 year % 400 == 0

 */
public class Demo011JudgeYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year;

        try {
            year = scan.nextLong();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "是闰年！");
            } else {
                System.out.println(year + "不是闰年！");
            }
        } catch (Exception e) {
            System.out.println("您输入的不是有效的年份！");
        }
        // 该类的nextLong()方法可以将输入信息扫描为一个long型的数据，如果输入的信息不能被成功转为long型，将会抛出java.util.InputMismatchException异常。

    }

}
