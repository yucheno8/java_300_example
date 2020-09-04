package cn.yucheno8.chapter03.demo041;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author yucheno8
 * @date 2020/5/12/012
 **/

/*
【反转输出数组元素】


 */
public class Demo041Reversion extends JFrame {
    private static final long serialVersionUID = -3170085780519526446L;
    private JPanel contentPane;

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
                    Demo041Reversion frame = new Demo041Reversion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Demo041Reversion() {
        setTitle("反转数组中元素的顺序");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        textField = new JTextField();
        GridBagConstraints gbc_textFiled = new GridBagConstraints();
        gbc_textFiled.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFiled.insets = new Insets(0, 0, 5, 0);
        gbc_textFiled.gridx = 0;
        gbc_textFiled.gridy = 1;
        contentPane.add(textField, gbc_textFiled);
        label_1 = new JLabel("数组元素反转");
        GridBagConstraints gbc_label_1 = new GridBagConstraints();
        gbc_label_1.anchor = GridBagConstraints.WEST;
        gbc_label_1.insets = new Insets(0, 0, 5, 0);
        gbc_label_1.gridx = 0;
        gbc_label_1.gridy = 2;
        contentPane.add(label_1, gbc_label_1);

    }

    private JTextField textField;
    private JTextArea textArea;
    private JLabel label;
    private JLabel label_1;

    protected void do_button_1_actionPerformed(ActionEvent e) {
        String inText = textField.getText(); // 获取用户输入
        String[] array = inText.split(" {1,}"); // 把字符串分割为数组
        int len = array.length; // 获取数组长度
        textArea.setText(""); // 清空文本域控件内容
        for (int i = 0; i < len / 2; i++) { // 反转数组元素
            String temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
            for (String string : array) { // 在文本域显示数组排序过程
                textArea.append(string + " ");
            }
            textArea.append("\n"); // 追加换行符
        }

    }
}
