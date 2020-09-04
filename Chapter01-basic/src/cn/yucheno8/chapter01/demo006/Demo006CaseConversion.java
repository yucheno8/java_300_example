package cn.yucheno8.chapter01.demo006;

/*
本例是对字符型数据的测试。
字符型用关键字char表示，它是采用Unicode编码的16位字符类型，其表示范围是0~ 65536。
标准的8位ASCII字符集是Unicode字符集的子集，其取值范围为0~ 127。
大小写字母之间正好相差32。
 */

import java.util.Scanner;

public class Demo006CaseConversion {

    public static void main(String[] args) {

        System.out.println("请输入您要进行转换的字母：");
        char c = new Scanner(System.in).next().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            c += 32;
            System.out.println("这里的大写" + (char)(c - 32) + "被转换成了" + c);
        }
        else if (c >= 'a' && c <= 'z') {
            c -= 32;
            System.out.println("这里的小写" + (char)(c + 32) + "被转换成了" + c);
        }
        else {
            System.out.println("不带这种格式的输入，请返回重新输入！");
        }
    }
}
