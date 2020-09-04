package cn.yucheno8.chapter03.demo031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/4/25/025
 **/

/*
【冒泡排序】（思想2）
 */
public class Demo031BubbleSort02 {

    public static void main(String[] args) throws IOException {
        int[] a = new int[11]; //定义数组用于存储输入数组元素
        String s = new String("");  //定义获取字符串的变量
        System.out.println("Input ten numbers:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        s = stdin.readLine();
        Scanner scan = new Scanner(s);
        for (int i = 1; i < 11; i++) {
            a[i] = scan.nextInt();
        }

        /* 排序前输出 */
        for (int i = 1; i <= 10; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println(); // 战术换行

        /* 冒泡排序（由小到大） */
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j < 10 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        /* 输出排序后的数组元素 */
        for (int i = 1; i <= 10; i++) {
            System.out.print(a[i] + "\t");

        }

    }
}
