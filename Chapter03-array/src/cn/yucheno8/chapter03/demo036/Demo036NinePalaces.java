package cn.yucheno8.chapter03.demo036;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/5/6/006
 **/

/*
问题描述：
创建一个九宫格程序，即创建一个n维矩阵，要求矩阵中数字为0-n²之间的数，且纵向、横向、斜向上的三个数字之和相等。

代码解析：
解九宫格的方法有很多，我们推荐一种Merzirac法：
（1）在第一行居中的方格内放1，依次向右上方填入2，3，4…；
（2）如果这个数所要放的格已经超出了顶行那么就把它放在底行，仍然要放在右一列；
（3）如果这个数所要放的格已经超出了最右列那么就把它放在最左列，仍然要放在上一行；
（4）如果右上方已有数字出了对角线，则向下移一格继续填写。
 */
public class Demo036NinePalaces {

    public static void main(String[] args) {
        System.out.println("请输入要计算的九宫格维数：");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(); //  输入长度
        int h = 0; // h表示行号

        int l = x / 2; // 在矩阵中，1在第一行正中
        int[][] a = new int[x][x];
        for (int i = 1; i <= x * x; i++) {
            a[h][l] = i; // 运行提示溢出
            // 随后的数字应放到上一个数字的右上方方格中
            h--;
            l++;
            // 如果都不行，就放到上一个数字的正下方
            if (h < 0 && l >= x) { // 先返回一个数字
                h++;
                l--; // 再下移一行
                h++;
            }
            // 如果向上不行，就放到该列的最下方格子
            else if (h < 0) {
                h = x - 1;
            }
            // 如果向右不行，就放到该行的最左边
            else if (l >= x) {
                l = 0;
            }
            // 如果目标格子已经有数字，也放到上一个数字的正下方
            else if (a[h][l] > 0) {
                h++; // 先返回上一个数字
                l--;
                h++;
            }
        }

        // 打印九宫格
        for (int j = 0; j < x; j++) {
            for (int k = 0; k < x; k++) {
                System.out.print(a[j][k] + "\t");
            }
            System.out.println(); // 换行
        }

    }
}
