package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	PigLatinTranslator translator = new PigLatinTranslator();
	JFrame frame = new JFrame();
	JTextField English = new JTextField(10);
	JButton button = new JButton();
	JPanel panel = new JPanel();
	
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(English);
		panel.add(button);
		button.setText("translate");
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String english = English.getText();
		String pigLatin = translator.translate(english);
		System.out.println(pigLatin);
	}
}
