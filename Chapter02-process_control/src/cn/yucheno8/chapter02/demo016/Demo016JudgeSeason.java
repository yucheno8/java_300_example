package cn.yucheno8.chapter02.demo016;

import java.util.Scanner;

public class Demo016JudgeSeason {

    public static void main(String[] args) {

        System.out.println("请输入您要判断的月份：");
        int month = new Scanner(System.in).nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("您输入的月份是冬季。");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("您输入的月份是春季。");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("您输入的月份是夏季。");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("您输入的月份是秋季。");
                break;
            default:
                System.out.println("您的输入有误！");
        }


    }

}
