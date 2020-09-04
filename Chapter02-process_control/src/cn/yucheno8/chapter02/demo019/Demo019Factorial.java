package cn.yucheno8.chapter02.demo019;

import java.math.BigDecimal;

/*
在计算阶乘的基础上应用while循环语句计算 1+1/2!+1/3!+…+1/10！的和。
BigDecimal类型的数字可以用来做超大的浮点数的运算，如加、减、乘、除等。
使用BigDecimal对象的add()方法可以实现加法运算，使用multiply()方法可以实现乘法运算。
 */
public class Demo019Factorial {

    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(0.0); // 使用BigDecimal类
        BigDecimal factorial = new BigDecimal(1.0); // 阶乘项的计算结果
        int i = 1; // 循环增量
        while (i <= 10) {
            sum = sum.add(factorial); // 累加各项阶乘的和
            ++i; // i加1
            factorial = factorial.multiply(new BigDecimal(1.0 / i)); // 计算阶乘项
        }

        System.out.println("1+1/2!+1/3!+…+1/10！的计算结果为：\n" + sum);
    }
}
