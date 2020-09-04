package cn.yucheno8.chapter03.demo033;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/4/25/025
 **/
/*
【直接插入排序】

基本思想：
每次从无序表中取出第一个元素，把它插入到有序表的合适位置，使有序表仍然有序。

第一趟比较前两个数，然后把第二个数按大小插入有序表中；
第二趟把第三个数据与前两个数从前向后扫描，把第三个数按大小插入到有序表中；
依次进行下去，进行了(n-1)趟扫描以后就完成了整个排序过程。

特性：稳定

 */
public class Demo033DirectInsertion {

    /* main()方法 */
    public static void main(String[] args) {
        double[] num = {0};
        Scanner scan = new Scanner(System.in);
        double newNumber;
        System.out.println("输入0结束输入");
        while (true) {
            System.out.println("\n请输入合法的数字：");
            newNumber = scan.nextDouble();
            if (newNumber == 0f) {
                System.out.println("用户取消排序。");
                break;
            }
            double[] tmp = new double[num.length + 1]; // 临时数组
            System.arraycopy(num, 0, tmp, 0, num.length); // 复制数组
            tmp[num.length] = newNumber;
            num = tmp; // 指向新的数组
            directSort(num); // 排序
            showSort(num); // 输出
        }

    }

    /* 排序方法 */
    public static void directSort(double n[]) { // 对数组下标为1的开始的元素进行直接插入排序
        int i,j;
        for (i = 2; i < n.length; i++) {
            n[0] = n[i];
            for (j = i - 1; j > 0 && n[j] > n[0]; j--) {
                n[j + 1] = n[j];
            }
            n[j + 1] = n[0];
        }
    }

    /* 排序输出 */
    public static void showSort(double[] num) {
        System.out.println("排序结果为：");
        for (int i = 1; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
    }

}
