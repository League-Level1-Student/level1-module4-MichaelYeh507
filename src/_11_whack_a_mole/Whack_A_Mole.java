package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_A_Mole implements MouseListener {
	int number = 0;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton mole = new JButton();
	int molesWhacked = 0;
	int molesMissed = 0;
	Date timeStarted;
	
	public void run(){
	if (timeStarted == null) {
		timeStarted = new Date();
	}
	frame.remove(panel);
	frame.setVisible(true);
	panel = new JPanel();
	drawButtons();
	frame.add(panel);
	frame.pack();
	frame.repaint();
	}
	
	public void drawButtons(){
		System.out.println(number);
		Random rand = new Random();
		int num = rand.nextInt(24);
		for(int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.setText("" + i);
			if (i == num) {
				mole = button;
				button.setText("mole!");
			}
			button.addMouseListener(this);
			panel.add(button);
		}
	}

	
	
//	void speak(String words) { 
//	    try { 
//	        Runtime.getRuntime().exec("say " + words).waitFor();
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }
//	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		molesWhacked++;
		if (e.getSource().equals(mole)) {
			System.out.println("yah");
		} else {
			molesMissed++;
		} 
		
		if (molesWhacked == 10) {
			endGame(timeStarted, molesWhacked);
		}
		if (molesMissed == 1) {
			System.out.println("hmm");
		} else if (molesMissed ==2) {
			System.out.println("unlucky");
		} else if (molesMissed == 3) {
			System.out.println("stop missing");
		} else if (molesMissed == 4) {
			System.out.println("You better not miss 1 more");
		} else if (molesMissed ==5) {
			System.exit(0);
		}
		frame.dispose();
		number++;
		run();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

