package cn.yucheno8.chapter03.demo033;

/**
 * @author yucheno8
 * @date 2020/4/26/026
 **/
public class Demo033DirectInsertion02 {

    public static void main(String[] args) {
        int[] array = new int[]{20, 25, 3, 45, 12};

        System.out.println("排序前：");
        showSort(array);

        directSort(array);
        System.out.println("\n排序后的结果：");
        showSort(array);
    }

    /* 直接插入排序方法 */
    public static void directSort(int n[]) { // 对数组下标为1的开始的元素进行直接插入排序
        int temp = 0; // 临时变量
        int i, j;
        for (i = 1; i < n.length; i++) {
            temp = n[i];
            for (j = i - 1; j >= 0; j--) {
                if (n[j] > temp) {
                    n[j + 1] = n[j];
                } else {
                    break;
                }
            }
            n[j + 1] = temp;
        }
    }

    /* 输出排序 */
    public static void showSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
    }

}
