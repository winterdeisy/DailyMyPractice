package newwindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	
	//components
	JFrame frame = new JFrame();
	JButton myButton = new JButton("Hello duckky");
	
	LaunchPage() {
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		frame.add(myButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton) {
//			frame.dispose(); //새로운 페이지가 나타날때 기존 페이지를 삭제
			NewWindow myWindow = new NewWindow();
		}
		
	}

}
