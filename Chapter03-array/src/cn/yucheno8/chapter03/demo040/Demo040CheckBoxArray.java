package cn.yucheno8.chapter03.demo040;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author yucheno8
 * @date 2020/5/10/010
 **/

/*
【使用数组实现复选框设置】

【代码解析】本实例中应用的主要技术是在JPanel面板中应用复选框控件数组添加复选框控件。
具体实现步骤如下：
（1）定义一个字符串数组，内容为复选框的标题文本。
（2）创建JCheckBox类型的控件数组，即复选框控件数组，其长度与步骤（1）中创建的字符串数组长度相同。
（3）通过for循环遍历刚刚创建的复选框控件数组，并将数组元素（即每个复选框）添加到面板中。

【知识扩展】在编写一个方法时，要考虑方法的通用性，尽量对方法进行抽象，让方法适合更多的模块调用。
例如本实例中的getPanel()方法完全可以把控件标签文本数组作为方法的参数，这样其他模块就可以为该方法传递参数创建爱好选择面板了。

 */
public class Demo040CheckBoxArray extends JFrame {
    private static final long serialVersionUID = -5338362310060106193L;
    private JPanel contentPane;
    private JPanel panel;

    /**
     * Launch the application.
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
                    Demo040CheckBoxArray frame = new Demo040CheckBoxArray();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Demo040CheckBoxArray() {
        setTitle("通过复选框控件数组实现添加多个复选框控件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 409, 331);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JLabel label = new JLabel("你的爱好有哪些：");
        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(getPanel(), BorderLayout.CENTER);
    }

    private JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel(); // 创建面板对象
            panel.setLayout(new GridLayout(0, 4)); // 设值网格布局管理器
            // 创建控制文本数组
            String[] labels = {"足球", "篮球", "魔术", "兵乓球", "看电影", "魔兽世界", "CS战队", "羽毛球", "游泳", "旅游", "爬山", "唱歌",
                    "写博客", "动物世界", "拍照", "弹吉他", "读报纸", "飄车", "逛街", "逛商场", "麻将", "看书", "上网看资料", "新闻", "军事",
                    "八卦", "饮茶"};
            JCheckBox[] boxes = new JCheckBox[labels.length]; // 创建控件数组
            for (int i = 0; i < boxes.length; i++) {
                boxes[i] = new JCheckBox(labels[i]); // 初始化附件中的复选组件
                panel.add(boxes[i]); // 把数组元素（即每个复选框）添加到面板中
            }
        }
        return panel;
    }

}
