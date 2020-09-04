package cn.yucheno8.chapter03.demo030;

/**
 * @author yucheno8
 * @date 2020/4/25/025
 **/

/*
【选择排序】

基本思想：
每一趟从待排序的数据元素中选出最小（或最大）的一个元素，顺序放在已排好序的数列的最后，直到全部待排序的数据元素排完。
 */
public class Demo030SelectSort {

    public static void main(String[] args) {
        int[] nums = orderBy(new int[]{1, 5, 2, 4, 9, 36, 5, 7, 8, 3}, "desc");
        for (int n = 0; n < nums.length; n++) {
            System.out.print(nums[n] + "\t");
        }
    }

    /* 选择排序方法 */
    public static int[] orderBy(int[] nums, String str) {
        if (str.equalsIgnoreCase("desc")) { // 从大到小排
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] < nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        } else if (str.equalsIgnoreCase("esc")) { // 从小到大排序
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
