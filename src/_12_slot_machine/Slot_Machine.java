package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton spin = new JButton();
	Random rand = new Random();
	JLabel cherry = new JLabel();
	JLabel seven = new JLabel();
	JLabel bell = new JLabel();
	
	public void run(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(spin);
		spin.addActionListener(this);
		for (int i = 0; i < 3; i++) {
			makeLabels();	
			System.out.println("labels");
		}
		frame.pack();a
	}
	 
	private JLabel createLabelImage(String fileName){
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
   
	public void makeLabels() {
		int randomNum = rand.nextInt(3);
		JLabel label = new JLabel();
		if (randomNum == 0) {
			panel.add(createLabelImage("cherry.jpg"));
			System.out.println("cherry");
		} else if(randomNum == 1) {
			panel.add(createLabelImage("seven.png"));
			System.out.println("seven");
		} else {
			panel.add(createLabelImage("bell.png"));
			System.out.println("bell");
		}
		panel.add(label);
		
	}
}
