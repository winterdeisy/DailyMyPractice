package boxLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutTest {
	JFrame frame = new JFrame("BoxLayout tutorial");
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("First");
	JButton buttonTwo = new JButton("Second");
	
	public BoxLayoutTest() {
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.add(buttonOne);
		panel.add(buttonTwo);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		BoxLayoutTest BoxLayoutTest = new BoxLayoutTest();
	}
}