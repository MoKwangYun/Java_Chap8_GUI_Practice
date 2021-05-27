import java.awt.*;
import javax.swing.*;

public class Exercise02 extends JFrame{
	Exercise02(){
		setTitle("Panel Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		c.add(p, BorderLayout.SOUTH);
		
		p.setLayout(new GridLayout(1,2));
		p.add(new JButton("Test"));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 1));
		p1.add(new JButton("Test1"));
		p1.add(new JButton("Test2"));
		
		p.add(p1);
		
		
		
		setVisible(true);
		setSize(300,300);
	}
	
	public static void main(String[] args) {
		new Exercise02();
	}
}
