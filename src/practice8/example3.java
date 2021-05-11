package practice8;

import java.awt.*;
import javax.swing.*;

public class example3 extends JFrame{
	example3(){
		setTitle("FlowLayout ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
		
		c.setBackground(Color.BLUE);
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		
		setVisible(true);
		setSize(400,  400);
	}
	
	public static void main(String[] args) {
		new example3();
	}

}
