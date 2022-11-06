package newwindow;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello");
	ImageIcon icon = new ImageIcon("duck.png");
	
	NewWindow() {
		label.setBounds(0, 0, 300, 300);
		label.setFont(new Font("Serif", Font.PLAIN, 30));
		label.setIcon(icon);
		
		frame.add(label);
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
