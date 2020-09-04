package cn.yucheno8.chapter02.demo023;

/**
 * @author yucheno8
 * @date 2020/4/24/024
 **/

/*
猴子分桃问题

海滩上有一堆桃子，五只猴子来分。
第一只猴子把这堆桃子平均分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份。
第三、第四、第五只猴子都是这样做的。
问海滩上原来最少有多少个桃子，此时第五只猴子得到多少桃子？
 */
public class Demo023MonkeyPeach {

    public static void main(String[] args) {
        int n = 1; // 每份n个
        int m = 0; // 桃子数
        int flag = 1;
        int monkeyNum = 5; // 猴子数
        while (true) {
            flag = 1;
            m = monkeyNum * n + 1; // 桃子数
            for (int i = monkeyNum; i >= 1; i--) { // 猴子数从5变化到1
                if (m % (monkeyNum - 1) == 0) {
                    m = m / (monkeyNum - 1) * monkeyNum + 1;
                    flag++; // 计算多少次的桃子数量被4整除
                } else
                    break;
            }
            if (flag == monkeyNum) // 每次的桃子数量都被4整除
                break;
            n++;
        }
        System.out.println("开始的桃子数至少是：" + m);
        System.out.println("此时第五个猴子得到的桃子数是：" + n);
    }
}
