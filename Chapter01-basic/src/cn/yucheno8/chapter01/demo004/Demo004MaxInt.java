package cn.yucheno8.chapter01.demo004;

/*
整型数据的占用空间和取值范围：

字节型（byte）：  1B   -128  ~  127
短整型（short）： 2B   -2^15 ~ 2^15 - 1
整型（int）：     4B   -2^31 ~ 2^31 - 1
长整形（long）：  8B   -2^63 ~ 2^63 - 1
 */

public class Demo004MaxInt {

    public static void main(String[] args) {

        //笨方法：一直加到最大，溢出后不加，再减一输出
        /*int int_max = 0;
        while (int_max >= 0) {
            int_max++;
        }
        System.out.println("Int的最大值为：" + int_max - 1);*/

        int int_max = Integer.MAX_VALUE;
        System.out.println("Int的最大值为：" + int_max);
    }

}
