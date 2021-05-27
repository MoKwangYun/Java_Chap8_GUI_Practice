import java.awt.*;
import javax.swing.*;


public class Exercise01 extends JFrame{
	Exercise01(){
		setTitle("Border Layout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.add(new Button("Menu"),BorderLayout.NORTH);
		c.add(new Button("Dir"),BorderLayout.WEST);
		c.add(new Button("Editor"),BorderLayout.CENTER);
		c.add(new Button("Console"),BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(300, 300);
	}
	public static void main(String[] args) {
		new Exercise01();
	}

}
