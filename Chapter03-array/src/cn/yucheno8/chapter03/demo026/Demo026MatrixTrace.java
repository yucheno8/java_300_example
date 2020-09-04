package cn.yucheno8.chapter03.demo026;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/4/24/024
 **/

/*
求矩阵的迹（主对角线之和）
 */
public class Demo026MatrixTrace {
    public static void main(String[] args) {

        /* 确定数组的大小 */
        System.out.println("请输入数组的大小：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        /* 确定数组的呢穿破能 */
        int[][] array = new int[n][n]; // 定义数组
        System.out.println("请根据您输入数组的大小输入数组的内容：");
        for (int i = 0; i < array.length; i++) { // 接受数组的内容
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        /* 输出确定的数组 */
        printArray(array);

        /* 计算矩阵的迹（对角线元素的和） */
        int trace = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    trace += array[i][j];
                }
            }
        }

        /* 输出迹的值 */
        System.out.println("矩阵的迹为：" + trace);
    }

    public static void printArray(int[][] arr) {
        System.out.println("您输入的矩阵是：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t"); // 不换行输出数组元素
            }
            System.out.println(); // 战术换行
        }
    }
}
