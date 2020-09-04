package cn.yucheno8.chapter03.demo025;

/**
 * @author yucheno8
 * @date 2020/4/24/024
 **/

/*
问题描述：实现数组在矩阵运算中的转置运算，即实现一个二维数组的行列互换
 */
public class Demo025MatrixTranspose {

    public static void main(String[] args) {
        int[][] array1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        /* 转置前 */
        System.out.println("转置前的数组：");
        printArray(array1);

        /* 转置运算 */
        int[][] array2 = new int[array1.length][array1.length]; // 定义另个同样大小的二维数组，用于存储转置后的数组元素
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("转置后的数组：");
        printArray(array2);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t"); // 不换行输出数组元素
            }
            System.out.println(); // 战术换行
        }
    }
}
