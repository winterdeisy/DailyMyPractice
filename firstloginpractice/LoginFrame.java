package firstloginpractice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginFrame extends JFrame{
	public LoginFrame() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pwd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log In");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pwd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Seo";
				String pass = "1234";
				
				if(id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
				
			}
		});
		
		add(panel);
		
		setVisible(true);
		setSize(600,400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new LoginFrame();
	}

}
