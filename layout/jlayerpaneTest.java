package layout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class jlayerpaneTest {

	public static void main(String[] args) {
		//JLayeredPane = Swing container that provides a
		//				 Third dimension for positioning components
		//				 ex. depth, Z-index
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPaned = new JLayeredPane();
		layeredPaned.setBounds(0,0,500,500);
		
//		layeredPaned.add(label1, JLayeredPane.DEFAULT_LAYER);
//		layeredPaned.add(label2, JLayeredPane.DEFAULT_LAYER);
//		layeredPaned.add(label3, JLayeredPane.DRAG_LAYER);
//		
		layeredPaned.add(label1, Integer.valueOf(4));
		layeredPaned.add(label2, Integer.valueOf(2));
		layeredPaned.add(label3, Integer.valueOf(3));
		
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPaned);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
