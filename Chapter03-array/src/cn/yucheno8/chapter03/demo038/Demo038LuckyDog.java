package cn.yucheno8.chapter03.demo038;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author yucheno8
 * @date 2020/5/6/006
 **/

/*
【幸运观众是如何产生的】

问题描述：
首先将所有的观众姓名生成数组，然后获得数组元素的总数量，最后再随机抽取元素的下标，根据抽取的下标获得幸运观众

重点：
把字符串中的人员名单分割为数组，以及随机生成数组的下标值，这就要用到String类的split()方法和Math类的random()方法。

String类的split()方法可以根据指定的正则表达式对字符串进行分割，并返回一个字符串数组。
例如“a,b,c”。如果以“,”作为分隔符，返回值就是包含“a”、“b”、“c”三个字符串的数组。
该方法的声明如下所示：
public String[] split(String regex)
其中，regex为分割字符串的定界正则表达式。

抽奖当然是随机抽取的，这就需要用到随机数，Java在Math类中提供了静态方法random()来生成0～1之间的double类型的随机数值。
该方法的声明如下：
public static double random()

由于该方法生成的是0～1之间的小数，而数组下标为整数，又要根据数组长度来生成随机数，所以要把生成的随机数与数组长度相乘，就像本实例的算法那样。
关键代码如下所示：
int index = (int) (Math.random() * personnelArray.length);
此代码把随机数与数组长度的乘积转换为整型，作为随机数组下标索引。


 */
public class Demo038LuckyDog extends JFrame {

    private static final long serialVersionUID = -2577935223412903226L;
    private JPanel contentPane;
    private JTextField nameField;
    private JTextArea personnelArea;
    private JTextArea resultArea;

    /**
     * Lunch the application
     */

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Demo038LuckyDog frame = new Demo038LuckyDog();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * creat the frame.
     */
    public Demo038LuckyDog() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 498, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setTitle("利用数组随机抽取幸运观众");
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(
                null,
                "请输入姓名 再按回车",
                TitledBorder.LEADING,
                TitledBorder.TOP,
                null,
                new Color(59, 59, 59)
        ));
        panel.setBounds(10, 10, 174, 242);
        contentPane.add(panel);
        panel.setLayout(new BorderLayout(0, 5));

        nameField = new JTextField();
        nameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                do_textField_keyPressed(e);
            }
        });
        panel.add(nameField, BorderLayout.NORTH);
        nameField.setColumns(10);

        JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane);

        personnelArea = new JTextArea();
        personnelArea.setEditable(false);
        scrollPane.setViewportView(personnelArea);

        JPanel panel1_1 = new JPanel();
        panel1_1.setBorder(new TitledBorder(null,
                "选取观众人员：",
                TitledBorder.LEADING,
                TitledBorder.TOP,
                null,
                new Color(59, 59, 59)));
        panel1_1.setBounds(183, 10, 219, 242);
        contentPane.add(panel1_1);
        panel1_1.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane1 = new JScrollPane();
        panel1_1.add(scrollPane1);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        scrollPane1.setViewportView(resultArea);

        JButton button = new JButton(" 抽取");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_button_actionPerformed(e);
            }
        });
        button.setBounds(407, 164, 63, 25);
        contentPane.add(button);

        JButton button_1 = new JButton("退出");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_button_1_actionPerformed(e);
            }
        });
        button_1.setBounds(407, 215, 63, 25);
        contentPane.add(button_1);
    }

    protected void do_textField_keyPressed(KeyEvent e) {
        if (e.getKeyChar() != '\n')// 不是回车字符不做处理
            return;
        String name = nameField.getText();
        if (name.isEmpty())// 如果文本框没有字符串不做处理
            return;
        personnelArea.append(name + "\n");// 把输入人名与回车符添加到人员列表
        nameField.selectAll();// 选择文本框所有字符
    }

    protected void do_button_actionPerformed(ActionEvent e) {
        String perstring = personnelArea.getText();// 获取人员列表文本
        String[] personnelArray = perstring.split("\n{1,}");// 获取人员数组
        int index = (int) (Math.random() * personnelArray.length);// 生成随机数组索引
        // 定义包含格式参数的中奖信息
        String formatArg = "本次抽取观众人员：\n\t%1$s\n恭喜%1$5s成为本次观众抽奖的大奖得主。"
                + "\n\n我们将为%1$s**颁发：\n\t宝马车一辆！！。";
        // 为中奖信息添加人员参数
        String info = String.format(formatArg, personnelArray[index]);
        resultArea.setText(info);// 在文本域显示中奖信息
    }

    protected void do_button_1_actionPerformed(ActionEvent e) {
        dispose();
    }


}
