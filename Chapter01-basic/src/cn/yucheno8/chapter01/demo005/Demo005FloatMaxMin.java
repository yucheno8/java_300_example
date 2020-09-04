package cn.yucheno8.chapter01.demo005;

/*
浮点型数据的占用空间和取值范围：

单精度浮点型（float）   4B  3.43-038 ~ 3.4e+038
双精度浮点型（double）  8B  1.7e-308 ~ 1.7e+308

指数形式：
-2.9E-7
    科学计数法：表示-2.9*10^-7
    字母E（或者e）之前必须有数字，后面的指数必须是整数
    正数最前面的正号可以省略

浮点型数据默认为双精度数，如果需要指定为单精度数，需要在末尾加上F或f，比如12.5F。

 */

public class Demo005FloatMaxMin {

    public static void main(String[] args) {
        float float_max = java.lang.Float.MAX_VALUE;
        float float_min = java.lang.Float.MIN_VALUE;
        System.out.println("单精度浮点数的最大值为：" + float_max);
        System.out.println("单精度浮点数的最小值为" + float_min);

        double double_max = java.lang.Double.MAX_VALUE;
        double double_min = java.lang.Double.MIN_VALUE;
        System.out.println("双精度浮点数的最大值为：" + double_max);
        System.out.println("双精度浮点数的最小值为：" + double_min);


    }

}
