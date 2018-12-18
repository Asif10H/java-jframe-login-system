import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SecondFrame extends JFrame 

{
    
   JLabel label;
   SecondFrame()
   {
	   label = new JLabel("My second screeen");
	   add(label);
	   setLayout(new FlowLayout());
	   JMenuBar menuBar = new JMenuBar();
	   JMenu menuFile = new  JMenu("File");
	   JMenuItem menuItemExit = new  JMenuItem("Exite");
	   menuFile.add(menuItemExit);
	   menuBar.add(menuFile); 
	    
   }	   
}
