package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Typing_Tutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	public void run() {
		currentLetter = generateRandomLetter();
		frame.setVisible(true);
		frame.addKeyListener(this);
		System.out.println(currentLetter);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		if (currentLetter == e.getKeyChar()) {
			frame.setBackground(Color.green);
		} else {
			frame.setBackground(Color.red);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
