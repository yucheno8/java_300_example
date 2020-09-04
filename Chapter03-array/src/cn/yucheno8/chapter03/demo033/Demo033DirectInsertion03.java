package cn.yucheno8.chapter03.demo033;

/**
 * @author yucheno8
 * @date 2020/4/26/026
 **/

/*
【直接插入排序】

基本思想：
1. 查找出L(i)在L[1,···,i - 1]中的插入位置k；
2. 将L[k,···,i - 1]中所有元素全部后移一个位置；
3. 将L(i)复制到L(k);

空间复杂度：O(1)
时间复杂度：O(n^2)

特性：稳定
适用于顺序表存储和链式存储的线性表

 */
public class Demo033DirectInsertion03 {

    public static void main(String[] args) {

        int[] array = new int[]{0, 15, 25, 65, 2};
        System.out.println("排序前：");
        showArray(array);

        System.out.println("\n排序后的结果：");
        directSort(array);
        showArray(array);
    }

    /* 插入排序方法 */
    public static void directSort(int[] n) {
        int i, j;
        for (i = 2; i <= n.length - 1; i++) { // 依次将n[2]~n[n]插入到前面已排序序列
            if (n[i] < n[i - 1]) { // 若n[i]的关键码，需将n[i]插入有序表
                n[0] = n[i]; // 复制为哨兵，n[0]不存放元素
                for (j = i - 1; n[0] < n[j]; --j) { // 从后往前查找待插入位置
                    n[j + 1] = n[j]; // 向后挪位
                }
                n[j + 1] = n[0]; // 复制到插入位置
            }
        }
    }

    /* 数组输出 */
    public static void showArray(int[] num) {
        for (int i = 1; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
    }

}
