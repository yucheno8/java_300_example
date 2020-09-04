package cn.yucheno8.chapter03.demo027;

/**
 * @author yucheno8
 * @date 2020/4/24/024
 **/

/*
1、2、3、4能组成多少个各位互不相同的三位数
 */
public class Demo027ThreeDigit {

    public static void main(String[] args) {
        // 定义一个数组存储1，2,3,4
        int[] array = new int[]{1, 2, 3, 4};
        System.out.println("满足条件的三位数有：");

        /* 四层for循环 */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j)
                    continue; // continue语句只结束本次循环,而不终止整个循环的执行。
                for (int k = 0; k < array.length; k++) {
                    if (k == i || k == j)
                        continue;
                    for (int h = 0; h < array.length; h++) {
                        if (h == i ||h == j ||h == k)
                            continue;
                        System.out.print(array[j] * 100 +array[k] * 10 + array[h] + "\t");
                    }
                }
            }
        }
    }

}
