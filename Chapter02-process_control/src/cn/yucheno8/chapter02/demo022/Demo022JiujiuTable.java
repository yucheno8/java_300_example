package cn.yucheno8.chapter02.demo022;

/**
 * @author yucheno8
 * @date 2020/4/24/024
 **/

/*
九九乘法表

第一层for循环，也称外循环，用于控制表格的行；
第二层for循环，也称内循环，用与控制表格的列。
然后我们通过输出内层与外层循环控制变量的乘积，就可以得到九九乘法表。
 */
public class Demo022JiujiuTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1;j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
                if (i == j) {
                    System.out.println(); // 换行
                }
            }
        }
    }
}
