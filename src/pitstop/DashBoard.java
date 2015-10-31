package pitstop;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class DashBoard extends Screen {
		
	JPanel backgroundp;
	JPanel infop;
	JPanel bottomp;
	JPanel topp;
	JPanel picturep;
		
	//constructor
	public DashBoard() {
		super();
		
		backgroundp = new JPanel();
    	backgroundp.setLayout(new BoxLayout(backgroundp,BoxLayout.Y_AXIS));
    		
    	//top half
    	topp = new JPanel();
    	topp.setLayout(new BoxLayout(topp,BoxLayout.X_AXIS));
    	picturep = new JPanel();
    	JButton image = new JButton("picture here");
    	image.setPreferredSize(new Dimension(175,175));
    	picturep.add(image);
    	infop = new JPanel();
    	
    	JLabel inf = new JLabel();
        inf.setFont(new Font(inf.getFont().getName(), Font.PLAIN,20));    
    	inf.setText("Name: ");
    	JLabel inf2 = new JLabel();
        inf2.setFont(new Font(inf2.getFont().getName(), Font.BOLD, 20));        
    	inf2.setText("  " + Main.username);

    	//inf.setPreferredSize(new Dimension(200,200));
    	infop.add(inf);
    	infop.add(inf2);


    	topp.add(picturep);
    	topp.add(infop);

    	bottomp = new JPanel();
    	bottomp.setLayout(new BoxLayout(bottomp,BoxLayout.Y_AXIS));   	    	
    	
    	backgroundp.add(topp);
    	backgroundp.add(bottomp);
		
		
        Container contentPane = getContentPane();
        
        contentPane.add(backgroundp);
		//initialize();
	}
	
	//initializes all methods
	public void initialize(){
		MakeScreen();
		
	}
	
	
	
	//makes the screen with background panel, then other panels layered
	public void MakeScreen(){
	//jpanel 
	JPanel Panel = new JPanel();
		setLocationRelativeTo(null);
    	Panel.setPreferredSize(new Dimension(Main.WIDTH, 400));
    	Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
    
	
    //constant panels for scrolling text
	JTextArea Text = new JTextArea();
	JScrollPane scrollFrame = new JScrollPane(Text);
		scrollFrame.setPreferredSize(new Dimension(400,400));
	
    //more panels
    JPanel spacer1 = new JPanel();
    	spacer1.setPreferredSize(new Dimension(400,200));
    JPanel spacer2 = new JPanel();
    	spacer2.setPreferredSize(new Dimension(400,200));
    	spacer2.setBackground(Color.RED);
    
   
	//picture attempt
    ImageIcon image = new ImageIcon("Pitstop/src/pitstop.images/Batman.jpg");
    JLabel label = new JLabel("Profile", image, JLabel.LEFT);
    JPanel IPanel = new JPanel(new BorderLayout());
    	IPanel.add( label, BorderLayout.CENTER );
    	IPanel.setPreferredSize(new Dimension(400,200));
    
    //Assign placements to panels
    	Panel.add(IPanel);
    	Panel.add(scrollFrame);
    	Panel.add(spacer2);
    
    //uneditable bottom nav section
    final JPanel bottom = new JPanel();
    	bottom.setLayout(new FlowLayout());
    	
    	
    	
    JButton test = new JButton("Milestones");   
        bottom.add(test);
        bottom.add(new JButton("College Finder"));
        bottom.add(new JButton("Calendar"));
        bottom.setVisible(false);
    	Panel.add(bottom);
    Container contentPane = getContentPane();
        contentPane.add(Panel);
	} 

	public static void main(String args[]){
		Main.username = "Shane O'Neill";
		DashBoard d = new DashBoard();
		d.setVisible(true);
		
	}
}
