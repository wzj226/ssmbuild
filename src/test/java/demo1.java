package snippet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class demo1 {

    public static void main(String[] args) {
        JFrame f = new JFrame("字体设置");
        f.setSize(400, 400);
        f.setLocation(200, 200);




        //p1
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 50);
        p1.setLayout(new FlowLayout());

        JLabel label = new JLabel("输入");
        JTextField sout = new JTextField("");
        sout.setPreferredSize(new Dimension(80, 30));

        p1.add(label);
        p1.add(sout);

        JCheckBox bCheckBox1 = new JCheckBox("斜体");
        JCheckBox bCheckBox2 = new JCheckBox("粗体");

        p1.add(bCheckBox1);
        p1.add(bCheckBox2);

        JButton button = new JButton("颜色");
        button.setBounds(300, 0, 80, 50);

        p1.add(button);

        f.add(p1);


        //p2
        JPanel p2 = new JPanel();
        p2.setBounds(0, 50, 400, 200);
        JTextArea area = new JTextArea();
        area.setPreferredSize(new Dimension(400, 200));
        p2.add(area);

        f.add(p2);

        //p3
        JPanel p3 = new JPanel();
        //p3.setBackground(Color.BLUE);
        p3.setBounds(0, 250, 400, 100);
        p3.setLayout(new FlowLayout());
		/*String[] arr = {"Arial","okkk"};
		JComboBox comboBox = new JComboBox(arr);
		comboBox.setBounds(100, 300, 100, 30);*/
        String[] heros = new String[] { "卡特琳娜", "库奇" };
        JComboBox cb = new JComboBox(heros);
        cb.setBounds(100, 300, 80, 30);

        p3.add(cb);

        f.add(p3);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


}
