package cn.yucheno8.chapter03.demo031;

/**
 * @author yucheno8
 * @date 2020/4/25/025
 **/
/*
【冒泡排序】
 */
public class Demo031BubbleSort03 {

    public static void main(String[] args) {
        int[] array = new int[]{9, 5, 4, 14};
        sortArray(array,4);

        //排序后
        System.out.println("\n排序后的结果是：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    /* 冒泡排序方法 */
    public static void sortArray(int[] arr, int n) {

        //排序前
        System.out.println("排序前的结果是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // 用冒泡排序将序列中的元素从小到大排序
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
             flag = false; // 表示本躺冒泡是否发生交换的标志
            for (int j = n - 1; j > i; j--) { // 一趟冒泡排序过程
                if (arr[j - 1] > arr[j]) { // 若为逆序
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag)
                return; // 本趟遍历没有发生交换，说明表已经有序
        }

    }


}
