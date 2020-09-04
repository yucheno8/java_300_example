package cn.yucheno8.chapter03.demo035;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * @author yucheno8
 * @date 2020/5/6/006
 **/

/*
【猴子选大王】

问题描述：
n只猴子要选大王
选举方法是：参选猴子按1，2，…， n编号并按照顺序围成一圈，
从第k只猴子起，由1开始报数，报到m时，该猴子就跳出圈外，下一只猴子再次由1开始报数，
如此循环，直到圈内剩下一只猴子时，这只猴子就是大王。

问题分析：
在该类的主方法中创建3个输入流的扫描器对象，分别接收用户输入的猴子总数、起始报数号，以及出局号。
然后将所有报此号的猴子排除，最后剩下的就是猴王。

根据问题描述可知，该问题中n只猴子围坐在一起形成首尾相接的环，因此可用循环链表解决。
从第k只猴子开始出列相当于从链表中删除一个结点。
该程序主要有三个模块组成，建立单链表，报数，利用do-while循环实现猴子的出列，最终剩下的猴子即猴王。

具体步骤如下：
（1）首先创建循环链表。向单链表中填入猴子的编号。
（2）找第一个开始报数的猴子。
（3）数到n让这个猴子出列。
（4）接着开始报数，重复第三步。
    然后在使用for循环将出局的猴子依次找出，就可以确定猴王是谁了。
 */
public class Demo035MonkeyKing {

    public static void main(String[] args) {
        String s;
        int n,k,m,n1;
        s = JOptionPane.showInputDialog("请输入猴子总数：");
        n = Integer.parseInt(s); // n为猴子总数
        n1 = n + 1;
        s = JOptionPane.showInputDialog("请输入起始报数猴子编号：");
        k = Integer.parseInt(s); // k为起始报数的猴子编号
        s = JOptionPane.showInputDialog("请输入出局数字：");
        m = Integer.parseInt(s); // m为出局号

        int a[] = new int[n + 1]; // 创建一个比猴子数大一的整型数组a[]
        a[0] = 0;
        System.out.println("出局的猴子编号：");
        for (int i = 1; i < a.length; i++) { // a.length == n + 1
            a[i] = 1; // 数组a[]的1~n（n为猴子数）号元素全部赋值为1
        }

        for (int i = 1; i <= m; i++) { // 从1到出局号m依次遍历
            if (n == 1) { // 若猴子数n为1，直接跳出for循环
                break;
            } else if (i == m) { // 当遍历到出局号m时
                n--;
                i = 0;
                a[k] = 0;
                System.out.print(k + " ");
            }


            do {
                k++;
                k = k % n1;
            } while (a[k] != 1);

        }
        System.out.println("\n猴王编号为：" + k);
    }
}
