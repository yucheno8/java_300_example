package cn.yucheno8.chapter02.demo018;

import java.util.Scanner;

public class Demo018Recruitment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请应聘者输入姓名：");
        String name = sc.nextLine();
        System.out.println("请应聘者输入要应聘的编程语言：");
        String language = sc.nextLine();

        switch (language.hashCode()) {
            case 3254818:           // java的哈希码
            case 2301506:           // Java的哈希码
            case 2269730:           // JAVA的哈希码
                System.out.println("应聘者" + name + "被分配到Java程序开发部门。");
                break;
            case 3104:              // c#的哈希码
            case 2112:              // C#的哈希码
                System.out.println("应聘者" + name + "被分配到C#项目维护组。");
                break;
            case -70919009:          // asp.net的哈希码
            case 955463181:         //Asp.net的哈希码
            case 9745901:           //ASP.NET的哈希码
                System.out.println("应聘者" + name + "被分配到Asp.net程序测试部门。");
                break;
            default:
                System.out.println("本公司不需要" + language + "语言的程序开发人员。");
        }
    }

}
