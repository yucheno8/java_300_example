package cn.yucheno8.chapter01.demo010;

/*
本实例通过位运算的异或运算符“^”把字符串与一个指定的值进行异或运算，从而改变字符串中每个字符的值
这样就可以得到一个加密后的字符串
当把加密后的字符串作为程序输入内容，异或运算会把加密后的字符串还原为原有字符串的值，

关键技术:异或运算
如果某个字符（或数值）x与一个数值m进行异或运算得到y，则再用y与m进行异或运算就可以还原为x

 */

import java.util.Scanner;

public class Demo010Encryption {

    public static void main(String[] args) {
        System.out.println("请输入一个英文字符串或解密字符串：");
        String password = new Scanner(System.in).next(); //

        char[] array = password.toCharArray(); // 获取字符数组
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ 20000); // 对每个数组元素进行异或运算
        }
        System.out.println("解密或解密结果如下：");
        System.out.println(new String(array));
    }
}
