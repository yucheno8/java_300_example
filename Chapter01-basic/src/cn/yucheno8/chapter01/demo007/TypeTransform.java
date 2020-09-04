package cn.yucheno8.chapter01.demo007;

/*
在该类的主方法中创建各种基本类型的变量，在输出语句中分别输出所有变量累加值。
最后将高类型数据向低类型数据进行强制类型转换，并注意运算结果是否丢失数据。
 */

public class TypeTransform {

    public static void main(String[] args) {

        byte b = 50;
        char c = 'G';
        short s = 12345;
        int i = 6789;
        long l = 10000L;
        float f = 3.14159F;
        double d = 3.1415926;

        // 低类型向高类型自动转换
        System.out.println("累加byte等于：" + b);
        System.out.println("累加char等于：" + (b + c));
        System.out.println("累加short等于：" + (b + c + s));
        System.out.println("累加int等于：" + (b + c + s + i));
        System.out.println("累加long等于：" + (b + c + s + i + l));
        System.out.println("累加float等于：" + (b + c + s + i + l + f));
        System.out.println("累加double等于：" + (b + c + s + i + l + f + d));
        System.out.println("===============");


        System.out.println("把long强制转换为int：" + (int) l); // 高类型到低类型的强制转换
        System.out.println("把long强制转换为short：" + (short) l); // 高类型向低类型转换丢失数据
        System.out.println("把double强制转换为int：" + (int) d);  // 实数到整数转换将舍弃小数部分
        System.out.println("把short强制转换为char:" + (char) s); // 整数到字符类型的转换获取对应编码的字符

    }

}
