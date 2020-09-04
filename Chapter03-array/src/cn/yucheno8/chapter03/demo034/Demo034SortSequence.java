package cn.yucheno8.chapter03.demo034;

import java.util.Arrays;
import java.util.Random;

/**
 * @author yucheno8
 * @date 2020/5/6/006
 **/

/*
sort()方法

Java的Arrays类提供了一个sort方法，使用该方法可以很方便地对各种数组进行排序
它有很多重载格式，可以接收任何数据类型进行不同类型的排序。
 */
public class Demo034SortSequence {

    public static void main(String[] args) {

        int[] array = new int[15]; // 声明数组
        Random r = new Random();
        System.out.println("没有使用sort方法前的数组：");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(20); // 给array数组赋值
            System.out.print(array[i] + "\t");
            if ((i + 1) % 5 == 0)
                System.out.println();
        }

        //对array数组进行升序排序
        Arrays.sort(array);
        System.out.println("使用sort方法后的数组：");
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0 && i != 0)
                System.out.println();
            System.out.print(array[i] + "\t");
        }

    }
}
