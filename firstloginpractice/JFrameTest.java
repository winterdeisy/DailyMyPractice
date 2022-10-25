package firstloginpractice;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JFrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("some text");
		JButton btn1 = new JButton("Click me!!");
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea(); //많은 글씨
		JTextField txtField = new JTextField(); //한 줄
		
		JPanel btnPanel = new JPanel();
		
		panel.setLayout(new BorderLayout()); //원하는 위치에
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				label.setText(txtArea.getText());
				txtArea.append("You are amazing\n");
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		frame.add(panel);
		
		frame.setSize(840, 840/12*9);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
