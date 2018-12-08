package lt.bt.Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Main  {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 430;
	private static final String VIENAS = "1";
	private static final String DU = "2";
	private static final String TRYS = "3";
	private static final String KETURI = "4";
	private static final String PENKI = "5";
	private static final String SESI = "6";
	private static final String SEPTYNI = "7";
	private static final String ASTUONI = "8";
	private static final String DEVYNI = "9";
	private static final String NULIS = "0";
	private static final String LYGU = "=";
	private static final String SUDETIS = "+";
	private static final String DALYBA = "/";
	private static final String DAUGYBA = "*";
	private static final String ATIMTIS = "-";
	private static final String TASKAS = ".";
	private static final String RESET = "C";
	private static String labelText = "0";
	private static double sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Calculator");
		frame.setResizable(false);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JFrame layout
		frame.setLayout(null);
		
		JButton vienasButton = new JButton(VIENAS);
		frame.add(vienasButton);
		//vienasButton.setLocation(0, 0);
		vienasButton.setVerticalTextPosition(AbstractButton.CENTER);
		vienasButton.setHorizontalTextPosition(AbstractButton.CENTER);
		vienasButton.setBounds(0, 240, 125, 80);
		vienasButton.setFont(new Font("Dialog", Font.BOLD, 20));

		JButton duButton = new JButton(DU);
		frame.add(duButton);
		//duButton.setLocation(0, 0);
		duButton.setVerticalTextPosition(AbstractButton.CENTER);
		duButton.setHorizontalTextPosition(AbstractButton.CENTER);
		duButton.setBounds(125, 240, 125, 80);
		duButton.setFont(new Font("Dialog", Font.BOLD, 20));

		JButton trysButton = new JButton(TRYS);
		frame.add(trysButton);
		trysButton.setLocation(0, 0);
		trysButton.setVerticalTextPosition(AbstractButton.CENTER);
		trysButton.setHorizontalTextPosition(AbstractButton.CENTER);
		trysButton.setBounds(250, 240, 125, 80);
		trysButton.setFont(new Font("Dialog", Font.BOLD, 20));

		JButton keturiButton = new JButton(KETURI);
		frame.add(keturiButton);
		keturiButton.setLocation(0, 0);
		keturiButton.setVerticalTextPosition(AbstractButton.CENTER);
		keturiButton.setHorizontalTextPosition(AbstractButton.CENTER);
		keturiButton.setBounds(0, 160, 125, 80);
		keturiButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton penkiButton = new JButton(PENKI);
		frame.add(penkiButton);
		penkiButton.setLocation(0, 0);
		penkiButton.setVerticalTextPosition(AbstractButton.CENTER);
		penkiButton.setHorizontalTextPosition(AbstractButton.CENTER);
		penkiButton.setBounds(125, 160, 125, 80);
		penkiButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton sesiButton = new JButton(SESI);
		frame.add(sesiButton);
		sesiButton.setLocation(0, 0);
		sesiButton.setVerticalTextPosition(AbstractButton.CENTER);
		sesiButton.setHorizontalTextPosition(AbstractButton.CENTER);
		sesiButton.setBounds(250, 160, 125, 80);
		sesiButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton septyniButton = new JButton(SEPTYNI);
		frame.add(septyniButton);
		septyniButton.setLocation(0, 0);
		septyniButton.setVerticalTextPosition(AbstractButton.CENTER);
		septyniButton.setHorizontalTextPosition(AbstractButton.CENTER);
		septyniButton.setBounds(0, 80, 125, 80);
		septyniButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton astuoniButton = new JButton(ASTUONI);
		frame.add(astuoniButton);
		astuoniButton.setLocation(0, 0);
		astuoniButton.setVerticalTextPosition(AbstractButton.CENTER);
		astuoniButton.setHorizontalTextPosition(AbstractButton.CENTER);
		astuoniButton.setBounds(125, 80, 125, 80);
		astuoniButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton devyniButton = new JButton(DEVYNI);
		frame.add(devyniButton);
		devyniButton.setLocation(0, 0);
		devyniButton.setVerticalTextPosition(AbstractButton.CENTER);
		devyniButton.setHorizontalTextPosition(AbstractButton.CENTER);
		devyniButton.setBounds(250, 80, 125, 80);
		devyniButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton nulisButton = new JButton(NULIS);
		frame.add(nulisButton);
		nulisButton.setLocation(0, 0);
		nulisButton.setVerticalTextPosition(AbstractButton.CENTER);
		nulisButton.setHorizontalTextPosition(AbstractButton.CENTER);
		nulisButton.setBounds(125, 320, 125, 80);
		nulisButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton dalybaButton = new JButton(DALYBA);
		frame.add(dalybaButton);
		dalybaButton.setLocation(0, 0);
		dalybaButton.setVerticalTextPosition(AbstractButton.CENTER);
		dalybaButton.setHorizontalTextPosition(AbstractButton.CENTER);
		dalybaButton.setBounds(375, 80, 125, 80);
		dalybaButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton daugybaButton = new JButton(DAUGYBA);
		frame.add(daugybaButton);
		daugybaButton.setLocation(0, 0);
		daugybaButton.setVerticalTextPosition(AbstractButton.CENTER);
		daugybaButton.setHorizontalTextPosition(AbstractButton.CENTER);
		daugybaButton.setBounds(375, 160, 125, 80);
		daugybaButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton atimtisButton = new JButton(ATIMTIS);
		frame.add(atimtisButton);
		atimtisButton.setLocation(0, 0);
		atimtisButton.setVerticalTextPosition(AbstractButton.CENTER);
		atimtisButton.setHorizontalTextPosition(AbstractButton.CENTER);
		atimtisButton.setBounds(375, 240, 125, 80);
		atimtisButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton pliusButton = new JButton(SUDETIS);
		frame.add(pliusButton);
		pliusButton.setLocation(0, 0);
		pliusButton.setVerticalTextPosition(AbstractButton.CENTER);
		pliusButton.setHorizontalTextPosition(AbstractButton.CENTER);
		pliusButton.setBounds(375, 320, 125, 80);
		pliusButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton lyguButton = new JButton(LYGU);
		frame.add(lyguButton);
		lyguButton.setLocation(0, 0);
		lyguButton.setVerticalTextPosition(AbstractButton.CENTER);
		lyguButton.setHorizontalTextPosition(AbstractButton.CENTER);
		lyguButton.setBounds(250, 320, 125, 80);
		lyguButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton taskasButton = new JButton(TASKAS);
		frame.add(taskasButton);
		taskasButton.setLocation(0, 0);
		taskasButton.setVerticalTextPosition(AbstractButton.CENTER);
		taskasButton.setHorizontalTextPosition(AbstractButton.CENTER);
		taskasButton.setBounds(0, 320, 125, 80);
		taskasButton.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton resetButton = new JButton(RESET);
		frame.add(resetButton);
		resetButton.setLocation(0, 0);
		resetButton.setVerticalTextPosition(AbstractButton.CENTER);
		resetButton.setHorizontalTextPosition(AbstractButton.CENTER);
		resetButton.setBounds(0, 0, 125, 80);
		resetButton.setFont(new Font("Dialog", Font.BOLD, 20));

		JLabel label1 = new JLabel();
		label1.setBounds(125, 0, 369, 80);
		label1.setOpaque(true);
		label1.setBackground(Color.WHITE);

		// create a line border with the specified color and width
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		label1.setBorder(border);
		frame.add(label1);
		label1.setText(Main.labelText);
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setVerticalAlignment(SwingConstants.CENTER);

		label1.setFont(new Font("Dialog", Font.BOLD, 20));

		
		vienasButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "1";
				} else {
					Main.labelText += "1";
				}
				label1.setText(Main.labelText);
			}
		});
		
		duButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "2";
				} else {
					Main.labelText += "2";
				}
				label1.setText(Main.labelText);			
			}
		});
		
		trysButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "3";
				} else {
					Main.labelText += "3";
				}
				label1.setText(Main.labelText);
			}
		});
		
		keturiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "4";
				} else {
					Main.labelText += "4";
				}
				label1.setText(Main.labelText);
			}
		});
		
		penkiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "5";
				} else {
					Main.labelText += "5";
				}
				label1.setText(Main.labelText);
			}
		});
		
		sesiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "6";
				} else {
					Main.labelText += "6";
				}
				label1.setText(Main.labelText);
			}
		});
		
		septyniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "7";
				} else {
					Main.labelText += "7";
				}
				label1.setText(Main.labelText);
			}
		});
		
		astuoniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "8";
				} else {
					Main.labelText += "8";
				}
				label1.setText(Main.labelText);

			}
		});
		
		devyniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "9";
				} else {
					Main.labelText += "9";
				}
				label1.setText(Main.labelText);

			}
		});
		
		nulisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")) {
					Main.labelText = "0";
				} else {
					Main.labelText += "0";
				}
				label1.setText(Main.labelText);

			}
		});		
		
		taskasButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main.labelText.equals("0")){
					Main.labelText = "0.";
				} else if (!Character.isDigit(Main.labelText.charAt(Main.labelText.length() - 1))) {
					Main.labelText += "0.";
				} else {
					Main.labelText += ".";
				}
				label1.setText(Main.labelText);

			}
		});
		
		pliusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(!Character.isDigit(Main.labelText.charAt(Main.labelText.length() - 1))) {
					Main.labelText = Main.labelText.substring(0,Main.labelText.length() - 1);
					Main.labelText += "+";
				} else {
					Main.labelText += "+";
				}
				label1.setText(Main.labelText);

			}
		});
		
		atimtisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(!Character.isDigit(Main.labelText.charAt(Main.labelText.length() - 1))) {
					Main.labelText = Main.labelText.substring(0,Main.labelText.length() - 1);
					Main.labelText += "-";
				} else {
					Main.labelText += "-";
				}
				label1.setText(Main.labelText);

			}
		});
		
		daugybaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(!Character.isDigit(Main.labelText.charAt(Main.labelText.length() - 1))) {
					Main.labelText = Main.labelText.substring(0,Main.labelText.length() - 1);
					Main.labelText += "*";
				} else {
					Main.labelText += "*";
				}
				label1.setText(Main.labelText);

			}
		});
		
		dalybaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(!Character.isDigit(Main.labelText.charAt(Main.labelText.length() - 1))) {
					Main.labelText = Main.labelText.substring(0,Main.labelText.length() - 1);
					Main.labelText += "/";
				} else {
					Main.labelText += "/";
				}
				label1.setText(Main.labelText);

			}
		});
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Main.labelText = "0";
				label1.setText(Main.labelText);
				sum = 0;
				//number = "";
			}
		});
		
		lyguButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

					if(!Character.isDigit(Main.labelText.charAt(Main.labelText.length() - 1))) {
						Main.labelText = Main.labelText.substring(0,Main.labelText.length() - 1);
					}
								
					String[] result = Main.labelText.split("[-+*/]");
					char[] c = Main.labelText.toCharArray();
					List<Character> operators = new ArrayList<Character>();
					for (char a : c) {
						if(!Character.isDigit(a)  && a != '.') {
							operators.add(a);
						}
					}				
					sum= Double.parseDouble(result[0]);
					
					for(int i =1 ; i<result.length; i++) {
						char o = operators.get(i-1);
						if (o=='+') {
							sum = sum + Double.parseDouble(result[i]);
						} else if (o=='-'){
							sum = sum - Double.parseDouble(result[i]);
						} else if (o=='*') {
							sum = sum * Double.parseDouble(result[i]);
					    } else if (o=='/') {
					    	if(Double.parseDouble(result[i]) == 0) {
								Main.labelText = "Cannot divide by zero";
								label1.setText(Main.labelText);
								Main.labelText = "0";
								return;
					    	} else {
								sum = sum / Double.parseDouble(result[i]);
					    	}						
						}
					}					
					if (sum == (int) sum) {
						Main.labelText = Integer.toString((int)sum);
						label1.setText(Main.labelText);
					} else {
						Main.labelText = Double.toString(sum);
						label1.setText(Main.labelText);
					}
			}
		});
	}
}
