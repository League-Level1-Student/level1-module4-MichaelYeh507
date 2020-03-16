package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public class Calculator implements ActionListener {
	void add(int x, int y){
		System.out.println(x += y);
	}
	void subtract() {
		System.out.println(firstInt -= secondInt);
	}
	void multiply(int x, int y) {
		System.out.println(x * y);
	}
	void divide(int x, int y) {
		System.out.println(x / y);
	}
	JTextField firstInt = new JTextField(10);
	JTextField secondInt = new JTextField(10);
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();	
	JFrame frame = new JFrame();
	
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(firstInt);
		panel.add(secondInt);
		panel.add(add);
		add.setText("add");
		panel.add(sub);
		sub.setText("sub");
		panel.add(mul);
		mul.setText("mul");
		panel.add(div);
		div.setText("div");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		firstInt.getText();
		if (e.getSource() == add) {
			
		}
	}
}
