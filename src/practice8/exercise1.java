package practice8;

import java.awt.*;
import javax.swing.*;

public class exercise1 extends JFrame{
	exercise1(){
		setTitle("Border Layout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.add(new JButton("Menu"),BorderLayout.NORTH);
		c.add(new JButton("Div"),BorderLayout.WEST);
		c.add(new JButton("Editor"),BorderLayout.CENTER);
		c.add(new JButton("Console"),BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(400,300);
	}
	
	public static void main(String[] args) {
		new exercise1();
	}

}
