package practice8;

import java.awt.*;
import javax.swing.*;

public class exercise2 extends JFrame{
	exercise2(){
		setTitle("Panel demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();//c�� SOUTH�� �� �ǳ�
		jp.setLayout(new GridLayout(1, 2));
		jp.add(new JButton("Test"));
		
		JPanel jp1 = new JPanel();//jp�� �������� ä�� �ǳ�
		jp1.setLayout(new GridLayout(2, 1));
		jp1.add(new JButton("Test1"));
		jp1.add(new JButton("Test2"));
		
		jp.add(jp1);
		c.add(jp,BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(300, 300);
	}
	
	public static void  main(String[] args) {
		new exercise2();
	}

}
