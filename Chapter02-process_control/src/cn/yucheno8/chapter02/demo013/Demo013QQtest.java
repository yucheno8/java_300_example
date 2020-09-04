package cn.yucheno8.chapter02.demo013;

import java.util.Scanner;

public class Demo013QQtest {

    public static void main(String[] args) {

        System.out.println("请输入您的QQ等级：");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if (grade < 4) {
            System.out.println("您的活跃天数为5天");
        } else if (grade < 8) {
            System.out.println("您的活跃天数为32天");
        } else if (grade < 12) {
            System.out.println("您的活跃天数为96天");
        } else if (grade < 16) {
            System.out.println("您的活跃天数为192天");
        } else if (grade <32) {
            System.out.println("您的活跃天数为320天");
        } else if (grade <48) {
            System.out.println("您的活跃天数为1152天");
        } else if (grade <64) {
            System.out.println("您的活跃天数为2496天");
        } else if (grade >= 64) {
            System.out.println("您的活跃天数为4352天");
        } else {
            System.out.println("您输入的等级有错误！");

        }
    }
}
