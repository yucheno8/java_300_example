package cn.yucheno8.chapter04.demo043;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2020/5/13/013
 **/

/*
【将数字货币金额转换为大写格式】
在处理财务账款时，一般需要使用大写金额。如果在银行进行储蓄或转账，也需要将数字金额写成大写格式。
也就是说，如果要转账123456元，则需要写成“壹拾贰万叁仟肆佰伍拾陆元整”。
对于这种情况，如果手动填写不仅麻烦，而且容易出错，所以我们可以设计一个程序来自动完成数字格式的转换。


 */
public class Demo043MoneyConvert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 创建扫描器
        System.out.println("请输入一个金额");
        String convert = convert(scan.nextDouble());
        System.out.println(convert); // 输出转换结果
    }

    public static String convert(double d) {
        DecimalFormat df = new DecimalFormat("#0.###"); // 实例化DecimalFormat对象
        String strNum = df.format(d); // 格式化double数字
        if (strNum.indexOf(".") != -1) {
            String num = strNum.substring(0, strNum.indexOf("."));
            if (num.length() > 12) {
                System.out.println("数字太大，不能完成转换！");
                return "";
            }
        }
        String point = ""; // 小数点
        if (strNum.indexOf(".") != -1) {
            point = "元";
        } else {
            point = "元整";
        }

        // 转换结果
        String result = getInteger(strNum) + point + getDecimal(strNum);
        if (result.startsWith("元")) {
            result = result.substring(1, result.length()); // 截取字符串
        }
        return result; // 返回新的字符串
    }

    public static String getInteger(String num) {
        String[] STR_UNIT = {};
        String[] STR_NUMBER = {};

        if (num.indexOf(".") != -1) { // 判断是否包含小数点
            num = num.substring(0, num.indexOf("."));
        }
        num = new StringBuffer(num).reverse().toString(); // 反转字符串
        StringBuffer temp = new StringBuffer(); // 创建一个StringBuffer对象
        for (int i = 0; i < num.length(); i++) { // 加入单位
            temp.append(STR_UNIT[i]);
            temp.append(STR_NUMBER[num.charAt(i) - 48]);
        }
        num = temp.reverse().toString(); // 反转字符串
        num = numReplace(num, "零拾", "零");
        num = numReplace(num, "零佰", "零");
        num = numReplace(num, "零仟", "零");
        num = numReplace(num, "零万", "万");
        num = numReplace(num, "零亿", "亿");
        num = numReplace(num, "零零", "零");
        num = numReplace(num, "亿万", "亿");
        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        return num;
    }

    public static String getDecimal(String num) {
        String[] STR_UNIT2 = {};
        String[] STR_NUMBER = {};
        if (num.indexOf(".") != -1) {
            return "";
        }
        num = num.substring(num.indexOf(".") + 1);  // 反转字符串
        num = new StringBuffer(num).reverse().toString(); // 创建一个StringBuffer对象
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < num.length(); i++) {
            temp.append(STR_UNIT2);
            temp.append(STR_NUMBER[num.charAt(i) - 48]);
        }
        num = temp.reverse().toString(); // 替换字符串的字符
        num = numReplace(num, "零角", "零");
        num = numReplace(num, "零分", "零");
        num = numReplace(num, "零厘", "零");
        num = numReplace(num, "零零", "零");
        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        return num;

    }

    public static String numReplace(String num, String oldStr, String newStr) {
        while (true) { // 判断字符串中是否包括指定字符
            if (num.indexOf(oldStr) == -1) {
                break;
            }
            num = num.replaceAll(oldStr, newStr); // 替换字符串
        }
        return num; // 返回替换后的字符
    }
}
