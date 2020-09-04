package cn.yucheno8.chapter02.demo017;

public class Demo017DiscountPrice {

    public static void main(String[] args) {
        float money = 1500; // 金额
        String discount; // 折扣

        if (money > 200) {
            int grade = (int) money / 200;
            switch (grade) {
                case 1:
                    discount = "九五折";
                    break;
                case 2:
                    discount = "九折";
                    break;
                case 3:
                    discount = "八五折";
                    break;
                case 4:
                    discount = "八三折";
                    break;
                case 5:
                    discount = " 八折";
                    break;
                case 6:
                    discount = "七八折";
                    break;
                case 7:
                    discount = "七五折";
                    break;
                case 8:
                    discount = "七三折";
                    break;
                case 9:
                    discount = "七折";
                    break;
                case 10:
                    discount = "六五折";
                    break;
                default:
                    discount = "六折";
            }

            System.out.println("您的累计消费金额为：" + money);
            System.out.println("您将享受" + discount + "优惠！");
        }
    }
}
