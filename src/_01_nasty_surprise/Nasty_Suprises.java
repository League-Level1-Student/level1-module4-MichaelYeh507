package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Nasty_Suprises implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
	JFrame frame = new JFrame();
	
	public void run() {
		treat.setText("Treat");
		trick.setText("Trick");
		frame.add(treat);
		frame.pack();
		frame.add(trick);
		frame.pack();
		frame.setVisible(true);
		trick.addActionListener(this);
		treat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == trick) {
			showPictureFromTheInternet("https://lh3.googleusercontent.com/proxy/vvQHeFgMyp8pfKBVrvipZaXl-kFltW1ceFzRqeRI22zX3ExZ2yfoErIIUlSzJJ5p241Wtm4mA_7EJOjxHJkyCXiQj7vN-XnSyzkXB9uJ3K--mGYRQUb6BJQ61w");
		} else if (e.getSource() == treat) {
			showPictureFromTheInternet("https://media.gettyimages.com/photos/path-through-a-misty-forest-during-a-foggy-winter-day-picture-id870867476?s=612x612");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
}
