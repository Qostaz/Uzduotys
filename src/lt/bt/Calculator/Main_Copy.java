package lt.bt.Calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_Copy  {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 430;
	private static String labelText = "0";
	private static double sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = Utils.addFrame(FRAME_WIDTH, FRAME_HEIGHT); 		
		JLabel label1 = Utils.addLabel(frame, Main_Copy.labelText);
	
		String[] calcValues = {"C","7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+"};
		Map <String, JButton> calculatorFields = new HashMap<String, JButton>();		
		
		for(String a : calcValues) {
			calculatorFields.put(a, new JButton(a));
			calculatorFields.get(a).setFont(new Font("Dialog", Font.BOLD, 20));
			calculatorFields.get(a).setVerticalTextPosition(AbstractButton.CENTER);
			calculatorFields.get(a).setHorizontalTextPosition(AbstractButton.CENTER);			
		}
		
		frame.add(calculatorFields.get("C"));
		calculatorFields.get("C").setBounds(0, 0, 125, 80);
		calculatorFields.get("C").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = "0";
				label1.setText(labelText);
				sum = 0;
			}
		});		
		
		frame.add(calculatorFields.get("7"));
		calculatorFields.get("7").setBounds(0, 80, 125, 80);	
		calculatorFields.get("7").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "7");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("8"));
		calculatorFields.get("8").setBounds(125, 80, 125, 80);	
		calculatorFields.get("8").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "8");
				label1.setText(labelText);
			}
		});

		frame.add(calculatorFields.get("9"));
		calculatorFields.get("9").setBounds(250, 80, 125, 80);
		calculatorFields.get("9").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "9");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("/"));
		calculatorFields.get("/").setBounds(375, 80, 125, 80);
		calculatorFields.get("/").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.operatorAction(labelText, "/");
				label1.setText(Main_Copy.labelText);
			}
		});
		
		frame.add(calculatorFields.get("4"));
		calculatorFields.get("4").setBounds(0, 160, 125, 80);
		calculatorFields.get("4").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "4");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("5"));
		calculatorFields.get("5").setBounds(125, 160, 125, 80);
		calculatorFields.get("5").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "5");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("6"));
		calculatorFields.get("6").setBounds(250, 160, 125, 80);
		calculatorFields.get("6").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "6");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("*"));
		calculatorFields.get("*").setBounds(375, 160, 125, 80);
		calculatorFields.get("*").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.operatorAction(labelText, "*");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("1"));
		calculatorFields.get("1").setBounds(0, 240, 125, 80);
		calculatorFields.get("1").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "1");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("2"));
		calculatorFields.get("2").setBounds(125, 240, 125, 80);
		calculatorFields.get("2").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "2");
				label1.setText(labelText);			
			}
		});

		frame.add(calculatorFields.get("3"));
		calculatorFields.get("3").setBounds(250, 240, 125, 80);
		calculatorFields.get("3").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.numberAction(labelText, "3");
				label1.setText(labelText);
			}
		});

		frame.add(calculatorFields.get("-"));
		calculatorFields.get("-").setBounds(375, 240, 125, 80);
		calculatorFields.get("-").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.operatorAction(labelText, "-");
				label1.setText(labelText);
			}
		});
		
		frame.add(calculatorFields.get("."));
		calculatorFields.get(".").setBounds(0, 320, 125, 80);
		calculatorFields.get(".").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main_Copy.labelText.equals("0")){
					Main_Copy.labelText = "0.";
				} else if (!Character.isDigit(Main_Copy.labelText.charAt(Main_Copy.labelText.length() - 1))) {
					Main_Copy.labelText += "0.";
				} else {
					Main_Copy.labelText += ".";
				}
				label1.setText(Main_Copy.labelText);
			}
		});
		
		frame.add(calculatorFields.get("0"));
		calculatorFields.get("0").setBounds(125, 320, 125, 80);
		calculatorFields.get("0").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Main_Copy.labelText.equals("0")) {
					Main_Copy.labelText = "0";
				} else {
					Main_Copy.labelText += "0";
				}
				label1.setText(Main_Copy.labelText);
			}
		});	
		
		frame.add(calculatorFields.get("="));
		calculatorFields.get("=").setBounds(250, 320, 125, 80);
		calculatorFields.get("=").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
					if(!Character.isDigit(Main_Copy.labelText.charAt(Main_Copy.labelText.length() - 1))) {
						Main_Copy.labelText = Main_Copy.labelText.substring(0,Main_Copy.labelText.length() - 1);
					}
								
					String[] result = Main_Copy.labelText.split("[-+*/]");
					char[] c = Main_Copy.labelText.toCharArray();
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
								Main_Copy.labelText = "Cannot divide by zero";
								label1.setText(Main_Copy.labelText);
								Main_Copy.labelText = "0";
								return;
					    	} else {
								sum = sum / Double.parseDouble(result[i]);
					    	}						
						}
					}					
					if (sum == (int) sum) {
						Main_Copy.labelText = Integer.toString((int)sum);
						label1.setText(Main_Copy.labelText);
					} else {
						Main_Copy.labelText = Double.toString(sum);
						label1.setText(Main_Copy.labelText);
					}
			}
		});
		
		frame.add(calculatorFields.get("+"));
		calculatorFields.get("+").setBounds(375, 320, 125, 80);
		calculatorFields.get("+").addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				labelText = Utils.operatorAction(labelText, "+");
				label1.setText(Main_Copy.labelText);
			}
		});
	}
}