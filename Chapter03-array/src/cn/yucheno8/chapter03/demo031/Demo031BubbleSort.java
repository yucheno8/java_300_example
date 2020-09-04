package cn.yucheno8.chapter03.demo031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/4/25/025
 **/

/*
【冒泡排序】（思想1）

基本思想：
对所有相邻记录的关键字值进行比较，如果是逆序（a[j]＞a[j+1]），则将其交换，最终达到有序化。

处理过程：
（1）将整个待排序的记录序列划分成有序区和无序区，初始状态有序区为空，无序区包括所有待排序的记录。
（2）对无序区从前向后依次将相邻记录的关键字进行比较，
    若逆序则将其交换，从而使得关键字值小的记录向上“飘浮”（左移）
    关键字值大的记录好像石块，向下“堕落”（右移）。
    每经过一趟冒泡排序，都使无序区中关键字值最大的记录进入有序区，
    对于由n个记录组成的记录序列，最多经过n-1趟冒泡排序，就可以将这n个记录重新按关键字顺序排列。
    比如我们对一个一维数组57、78、90、80、27、32、100、45，利用冒泡排序从小到大排列，
 */
public class Demo031BubbleSort {

    /*冒泡排序方法（由小到大）*/
    public static void sortArray() {
        int[] array = new int[]{2, 1, 5, 8, 21, 12}; // 定义一个数组
        System.out.println("冒泡排序前的结果是：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        /* 冒泡排序 */
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // 把最大的放到最后
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\n冒泡排序后的结果是：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void main(String[] args) {
        sortArray();
    }

}
