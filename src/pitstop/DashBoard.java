package pitstop;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DashBoard extends Screen {
		
		
	//constructor
	public DashBoard() {
		super();
		initialize();
		
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

}
