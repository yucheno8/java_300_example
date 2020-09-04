package cn.yucheno8.chapter04.demo045;

/**
 * @author yucheno8
 * @date 2020/5/18/018
 **/

/*
【实现不同字符串的连接】

实现方式：
加法（+）或append()方法

append()方法用于向字符串中追加内容，这个方法有多种实现方式，它们可以接受任何类型的数据。

insert()方法的作用是在StringBuffer对象中插入内容，然后形成新的字符串。
它和append()方法的区别就是insert()方法可以在任意特定的位置进行任意数据类型的值的插入

 */
public class Demo045StringConnection {

    public static void main(String[] args) {
        String s1 = "Hello" + "," + "world";
        System.out.println("使用加法运算符输出：" + s1);

        /* 构造StringBuffer对象，并添加一些字符串 */
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello"); // 使用
        sb2.append(",");
        sb2.append(' ');
        sb2.append("world");
        String s2 = sb2.toString(); // 将StringBuffer值转换为字符串，并输出
        System.out.println("使用append()方法输出：" + s2);

        /* 重复上面的工作，但是采用更为简洁的方式 */
        StringBuffer sb3 = new StringBuffer().append("Hello").append(',').append(' ').append("world");
        System.out.println("append()方法的另一种形式输出：" + sb3.toString());
    }
}
