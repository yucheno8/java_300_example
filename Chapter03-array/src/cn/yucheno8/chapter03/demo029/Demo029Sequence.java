package cn.yucheno8.chapter03.demo029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/4/25/025
 **/

/*
使用最简单的for循环对数组进行排序
 */
public class Demo029Sequence {

    public static void main(String[] args) throws IOException {

        String s =  new String("");
        int[] array = new int[3];
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入三个整数（以空格隔开）：");
        s = stdin.readLine();
        Scanner scan = new Scanner(s);
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }

        /* 升序排列 */
        Arrays.sort(array);

        /* 输出排列后的数组元素 */
        System.out.print("三个数的升序排列为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
