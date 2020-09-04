package cn.yucheno8.chapter03.demo039;

import javax.swing.*;
import java.awt.*;

/**
 * @author yucheno8
 * @date 2020/5/10/010
 **/

/*
【使用数组来实现计算器页面】

实现方法：
在该类的主方法中创建JFrame窗体类，然后在窗体类中添加一个文本框控件用于模拟计算器的液晶屏。
接着在构造方法中创建布局管理器，及JButton控件的二维数组，其中每个数组元素都初始化为一个按钮控件。

关键：
在于GridLayout布局管理器的应用，通过它可以自动完成控件的布局与大小控制，否则还要在程序中单独创建控制每个控件位置与大小的代码，
其代码复杂度可想而知，通过GridLayout布局管理器，只要指定布局的行列数量即可。

创建指定行列数量的布局管理器可以在GridLayout布局管理器的构造方法中传递两个int类型的参数，分别指定布局的行数与列数。
其方法的声明如下：
public GirdLayout(int roes, int cols)
其中，rows代表布局的行数，cols代表列数

设置容器的布局管理器，可以在创建容器之后，将其添加到某个容器的layout属性中，这需要调用容器的布局管理器的方法来实现。
该方法的声明如下：
public void setLayout(LayoutManager mgr)
其中，mgr代表布局管理器对象。
 */

public class Demo039Calculator extends JFrame { // 创建一个类继承Frame类
    private static final long serialVersionUID = 6626440733001287873L;
    private JTextField textField;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        Demo039Calculator frame = new Demo039Calculator();
        frame.setVisible(true); // 设置窗体可见，默认为不可见
    }

    public Demo039Calculator() {  // 构造方法
        super(); // 继承父类的构造方法
        BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
        borderLayout.setHgap(20);
        borderLayout.setVgap(10);
        setTitle("按钮数组实现计算机界面"); //设置窗体的标题
        setBounds(100, 100, 290, 282); // 设置窗体的显示位置及大小，窗体左上角的位置坐标和窗体的大小，前两个数是位置坐标，后两个数是窗体大小，其单位均为像素
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭按钮的动作为退出
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.TRAILING);
        textField.setPreferredSize(new Dimension(12, 50));
        getContentPane().add(textField, BorderLayout.NORTH);
        textField.setColumns(10);
        final GridLayout gridLayout = new GridLayout(4, 0); // 创建网格布局管理器对象
        gridLayout.setHgap(5); // 设置组件的水平间距
        gridLayout.setVgap(5); // 设置组件的垂直间距
        JPanel panel = new JPanel();  // 获得容器对象
        panel.setLayout(gridLayout); // 设置容器采用网格布局管理器
        getContentPane().add(panel, BorderLayout.CENTER);
        String[][] names = {{"1", "2", "3", "+"}, {"4", "5", "6", "-"}, {"7", "8", "9", "x"}, {".", "0", "=", "÷"}};
        JButton[][] buttons = new JButton[4][4];
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names.length; col++) {
                buttons[row][col] = new JButton(names[row][col]); // 创建按钮对象
                panel.add(buttons[row][col]); // 将按钮添加到面板中
            }
        }

    }
}
