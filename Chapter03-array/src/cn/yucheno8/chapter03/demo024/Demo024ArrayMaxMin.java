package cn.yucheno8.chapter03.demo024;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/4/24/024
 **/
public class Demo024ArrayMaxMin {

    public static void main(String[] args) {

        int max;
        int min;
        int[] array = new int[6];

        System.out.println("请输入六个整数：");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            array[i] = scan.nextInt();
        }

        max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值是" + max);

        min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小值是：" + min);
    }
}
