package lt.bt.Calculator.gridExample;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GridBagLayoutExample
{
  /*static final boolean shouldFill = true;
  static final boolean shouldWeightX = true;
  static final boolean RIGHT_TO_LEFT = false;*/
  
  
  
  public static void addComponentsToPane(Container pane)  {
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    

    c.fill = 2;
    

    JButton button = new JButton("Button 1");
    
    c.weightx = 0.5D;
    
    c.fill = 2;
    c.gridx = 0;
    c.gridy = 0;
    pane.add(button, c);
    
    button = new JButton("Button 2");
    c.fill = 2;
    c.weightx = 0.5D;
    c.gridx = 1;
    c.gridy = 0;
    pane.add(button, c);
    
    button = new JButton("Button 3");
    c.fill = 2;
    c.weightx = 0.5D;
    c.gridx = 2;
    c.gridy = 0;
    pane.add(button, c);
    
    button = new JButton("Long-Named Button 4");
    c.fill = 2;
    c.ipady = 40;
    c.weightx = 0.0D;
    c.gridwidth = 3;
    c.gridx = 0;
    c.gridy = 1;
    pane.add(button, c);
    
    button = new JButton("5");
    c.fill = 2;
    c.ipady = 0;
    c.weighty = 1.0D;
    c.anchor = 20;
    c.insets = new Insets(10, 0, 0, 0);
    c.gridx = 1;
    c.gridwidth = 2;
    c.gridy = 2;
    pane.add(button, c);
  }
  


private static void createAndShowGUI() {
    JFrame frame = new JFrame("GridBagLayoutExample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addComponentsToPane(frame.getContentPane());
    

    frame.pack();
    frame.setVisible(true);
}



  

  public static void main(String[] args)
  {
	  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		  public void run() {
			  createAndShowGUI();
		  }
	  });
	    


  }
}
