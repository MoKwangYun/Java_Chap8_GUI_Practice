package practice8;

import java.awt.*;
import javax.swing.*;

public class example1 extends JFrame{
	example1(){
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.setBackground(Color.ORANGE);
		c.add(new JButton("OK"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		
		setVisible(true);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new example1();
	}

}
