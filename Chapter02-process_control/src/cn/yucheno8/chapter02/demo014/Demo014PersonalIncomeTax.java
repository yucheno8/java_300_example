package cn.yucheno8.chapter02.demo014;

import java.util.Scanner;

/*
个税免征额为3500元
工资个税的计算公式为：应纳税额=（工资薪金所得-“五险一金” -扣除数）×适用税率-速算扣除数

个人所得税税率表:

超过9000元至35000元的部分       25      1005
超过35000元至55000元的部分      30      2755
超过55000元至80000元的部分      35      5505
超过80000元的部分               45      13505


 */
public class Demo014PersonalIncomeTax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的工资额（去除五险金后）：");
        int i = scan.nextInt();

        //接收用户输入的工资额
        if(i <= 3500) { // 工资低于3500元时
            System.out.println("您不需要纳税");
        } else if(0< i-3500 && i-3500 <= 1500) { // 工资与免征额之差不超过1500元时
            System.out.println(" 您的纳税金额为："+ (( i - 3500 ) * 0.03));
        } else if (1500< i-3500&&i-3500<=4500) { // 工资与免征额之差在1500到4500元之间时
            System.out.println("您的纳税金额为："+ ( (i - 3500) * 0.1 - 105 ));
        } else if(4500 < i - 3500 && i - 3500 <= 9000) { // 工资与免征额之差在4500到9000元之间时
            System.out.println("您的纳税金额为：" +( (i-3500) * 0.2 - 555));
        } else if(9000 < i-3500 && i-3500 <= 35000){ // 工资与免征额之差在9000到35000元之间时
            System.out.println("您的纳税金额为：" +( (i-3500) * 0.25 - 1005));
        } else if(35000 < i-3500 && i-3500 <=55000) { //工资与免征额之差在35000到55000元之间时
            System.out.println("您的纳税金额为：" +((i - 3500) * 0.3 - 2755));
        } else if(55000 < i - 3500 && i - 3500 <= 80000) { //工资与免征额之差在55000到80000元之间时
            System.out.println("您的纳税金额为：" + ( (i-3500) * 0.35 - 5505));
        } else { //工资与免征额之差在80000之上时
            System.out.println("您的纳税金额为：" +(( i - 3500 ) * 0.45 - 13505));
        }

    }
}
