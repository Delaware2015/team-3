package pitstop;

//A program to demonstrate the use of JTextFields's
//Import Statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends Screen {

	//Class Declarations
	JTextField jtfText1;
	String disp = "";
	TextHandler handler = null;
	//Constructor
	public Login() {
		super();
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		jtfText1 = new JTextField(10);
		
		
		container.add(jtfText1);
		
		handler = new TextHandler();
		jtfText1.addActionListener(handler);
		
		setSize(400, 600);
		setVisible(false);
	}
	//Inner Class TextHandler
	private class TextHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jtfText1) {
				disp = "text1 : " + e.getActionCommand();
				switchto(new MainFrame());
			} 
			JOptionPane.showMessageDialog(null, disp);
		}
	}
	//Main Program that starts Execution
	//public static void main(String args[]) {
	//	Login test = new Login();
	//	test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//}
}// End of class TextFieldTest