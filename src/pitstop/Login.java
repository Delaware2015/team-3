package pitstop;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;


public class Login extends Screen {
	private String space = "                      ";
	private static String username;
	private static String password;
    public Login() {

        initUI();
    }

    public final void initUI() {
    	getContentPane().setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      
       
        
       
       
        
        JLabel username = new JLabel();
        username.setText("UserName");
      
        
        JLabel password = new JLabel();
        password.setText("PassWord");
        
        final JTextField usernameinput = new JTextField(space);
        final JTextField passwordinput = new JTextField(space);
        
        JButton EnterButton = new JButton("Enter");
        EnterButton.setAlignmentX(CENTER_ALIGNMENT);
        EnterButton.setAlignmentY(CENTER_ALIGNMENT);
      
        
        
        panel.add(username);
        panel.add(usernameinput);
        panel.add(password);
        panel.add(passwordinput);
        panel.add(EnterButton);
        
        Container contentPane = getContentPane();
      
        contentPane.add(panel, BorderLayout.CENTER);
        
       
      
        
       
        
    


      
    

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String username = usernameinput.getText();
                String password = passwordinput.getText();
                System.out.println(username);
                System.out.println(password);
            }
        });

       
    }

    }
