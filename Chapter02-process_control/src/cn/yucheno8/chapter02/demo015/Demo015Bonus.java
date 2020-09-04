package cn.yucheno8.chapter02.demo015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
企业发放的奖金根据利润提成。

利润（I）低于或等于10万元时，奖金可提10%；
利润高于10万元 ，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5% ；
20万到40万之间时，高于20万元的部分，可提成5%；
40万到60万之间时高于40万元的部分，可提成3%；
60万到100万之间时，高于60万元的部分，可提成1.5%，
高于100万元时，超过100万元的部分按1%提成，

从键盘输入当月利润I，求应发放奖金总数。
 */
public class Demo015Bonus {

    public static void main(String[] args) throws IOException {

        float lirun;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入当月利润（万）：");
        lirun = (new Float(stdin.readLine()));

        if (lirun <= 10) {
            System.out.println("当月奖金为（万）：" + ( lirun * 0.1) );
        } else if (lirun <= 20) {
            System.out.println("当月奖金为（万）：" + ( 10 * 0.1 + (lirun - 10) * 0.075) );
        } else if (lirun <= 40) {
            System.out.println("当月奖金为（万）：" + ( 10 * 0.1 + 10 * 0.075 + (lirun - 20) * 0.05) );
        } else if (lirun <= 60) {
            System.out.println("当月奖金为（万）：" + ( 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (lirun - 40) * 0.03) );
        } else if (lirun <= 100) {
            System.out.println("当月奖金为（万）：" + ( 10 *0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (lirun - 60) * 0.015) );
        } else {
            System.out.println("当月奖金为（万）：" + ( 10 *0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (lirun - 100) * 0.01) );
        }
    }
}
