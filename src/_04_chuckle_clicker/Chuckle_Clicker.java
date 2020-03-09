package _04_chuckle_clicker;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Chuckle_Clicker implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	
	public void createButton() {
		
		// Create a new JButton
		leftButton.setText("joke");
		rightButton.setText("punchline");


	}

	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		leftButton.setText("joke");
		rightButton.setText("punchline");
		frame.setVisible(true);		
		frame.add(panel);
		panel.add(leftButton);
		panel.add(rightButton);
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == leftButton) {
			JOptionPane.showMessageDialog(null, "Why do we tell actors to break a leg? because every play has a cast ;)");
		} else {
			JOptionPane.showMessageDialog(null, "Knock knock ... who's there ... luke ... luke who ... look throught the peek hole to find out");
		}
	}
}
