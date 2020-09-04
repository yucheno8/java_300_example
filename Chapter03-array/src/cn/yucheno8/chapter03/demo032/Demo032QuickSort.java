package cn.yucheno8.chapter03.demo032;

/**
 * @author yucheno8
 * @date 2020/4/25/025
 **/

/*
【快速排序】

基本思想：
通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据要小，
然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列的目的。

最坏情况的时间复杂度为O(n2)
最好情况时间复杂度为O(nlog2n)
 */
public class Demo032QuickSort {

    public static void main(String[] args) {
        int[] intArray = {12, 11, 45, 6, 8, 43, 40, 57, 3, 20};
        System.out.println("排序前的数组：");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("\t" + intArray[i]);
        }
        System.out.println(); // 战术换行
        int[] b = quickSort(intArray, 0, intArray.length - 1); // 调用quickSort
        System.out.println("使用快速排序法后的数组：");
        for (int i = 0; i < b.length; i++) {
            System.out.print("\t" + b[i]);
        }
    }

    /* 获取中心点 */
    public static int getMiddle(int[] array, int left, int right) { // 进行一趟快速排序，返回中心点位置
        int temp;
        int mid = array[left]; // 把中心位置置于a[0]
        while (left < right) {
            while (left < right && array[right] >= mid)
                right--;
            temp = array[right]; // 将比中心点小的数据移到左边
            array[right] = array[left];
            array[left] = temp;
            while (left < right && array[left] <= mid)
                left++;
            temp = array[right];
            array[right] = array[left];
            array[left] = temp;
        }
        array[left] = mid; // 中心移到正确位置
        return left; // 返回中心点
    }

    /* 快速排序法 */
    public static int[] quickSort(int[] array, int left, int right) {
        // 如果开始点和结束点没有重叠的时候，也就是指针没有执行到结尾
        if (left < right - 1) {
            int mid = getMiddle(array, left, right); // 重新获取中心点
            quickSort(array, left, mid - 1);
            quickSort(array, mid + 1, right);
        }
        return array;
    }
}
