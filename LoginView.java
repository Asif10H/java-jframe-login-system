import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 

public class LoginView {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Log In");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Student-ID  :");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password  :");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("Log-in");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(180, 80, 80, 25);
		panel.add(closeButton);
		
		loginButton.addActionListener(new ActionListener() {
      	   
      	   public void actionPerformed(ActionEvent e)
      	   {
      			 //System.out.println("Hi java!");
      		   
      		 String uname = userText.getText();  
   			 String  pass = passwordText.getText();
   			 if(uname.equals("password") && pass.equals("password"))
   			 {
   				 JOptionPane.showMessageDialog(panel, "you are sucessfully login");
   				 if(e.getActionCommand() != null)
       		                  {
   					MenuExample fr = new MenuExample();
  				  }
   		        }
   			  else
   			     {
   				    JOptionPane.showMessageDialog(panel, "invalid username or passworld");
   			     }
      	
		  }
 
         });
  
		 
	}
  
}

