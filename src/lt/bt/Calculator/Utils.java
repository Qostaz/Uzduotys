package lt.bt.Calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Utils {
	public static JFrame addFrame (int FRAME_WIDTH, int FRAME_HEIGHT) {
		JFrame frame = new JFrame("Calculator");
		frame.setResizable(false);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		return frame;
	}
	
	public static JLabel addLabel(JFrame frame, String labelText) {
		JLabel label1 = new JLabel();
		label1.setBounds(125, 0, 369, 80);
		label1.setOpaque(true);
		label1.setBackground(Color.WHITE);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		label1.setBorder(border);
		frame.add(label1);
		label1.setText(labelText);
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setVerticalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Dialog", Font.BOLD, 20));		
		return label1;
	}
	
	public static String numberAction(String text, String number) {
		if (text.equals("0")) {
			text = number;
			return text;
		} else {
			text += number;
			return text;
		}
	}
	
	public static String operatorAction(String text, String operator) {
		if(!Character.isDigit(text.charAt(text.length() - 1))) {
			text = text.substring(0,text.length() - 1);
			text += operator;
			return text;
		} else {
			text += operator;
			return text;
		}
	}

}
