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
import javax.swing.JPasswordField;
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
    	//getContentPane().setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(Main.WIDTH, 400));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      
       
        
       
       
        
        JLabel username = new JLabel();
        username.setText("Username");
      
        
        JLabel password = new JLabel();
        password.setText("Password");
        
        final JTextField usernameinput = new JTextField();
        usernameinput.setPreferredSize(new Dimension(85,20));
        final JPasswordField passwordinput = new JPasswordField();
        passwordinput.setPreferredSize(new Dimension(85,20));
        

        
        JButton EnterButton = new JButton("Enter");
        EnterButton.setAlignmentX(CENTER_ALIGNMENT);
        EnterButton.setAlignmentY(CENTER_ALIGNMENT);
      
        
        JPanel dividor = new JPanel();
        //dividor.setPreferredSize(new Dimension(Main.WIDTH, 400));
              
        
        dividor.add(username);
        dividor.add(usernameinput);
        dividor.add(password);
        dividor.add(passwordinput);
        dividor.add(EnterButton);
        
        JPanel spacer1 = new JPanel();
        spacer1.setPreferredSize(new Dimension(400,200));
        JPanel spacer2 = new JPanel();
        spacer2.setPreferredSize(new Dimension(400,200));

        panel.add(spacer1);
        panel.add(dividor);
        panel.add(spacer2);
        
        final JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());

        
        JButton test = new JButton("Milestones");
        
        bottom.add(test);
        bottom.add(new JButton("College Finder"));
        bottom.add(new JButton("Calendar"));
        bottom.setVisible(false);
        
       // test.setPreferredSize(new Dimension(600, 60));
        panel.add(bottom);
        Container contentPane = getContentPane();
      
        contentPane.add(panel);
        
       
      
        
       
        
    


        setSize(400, 600);
        setLocationRelativeTo(null);
    

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Main.username = usernameinput.getText();
                Main.password = passwordinput.getText();
           
                switchto(new MilestoneFrame());
            }
        });

       
    }

    }
