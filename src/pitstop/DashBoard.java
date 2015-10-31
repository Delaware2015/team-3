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
	
	
	//constant panels for scrolling text
		JTextArea Text = new JTextArea(400,200);
		JScrollPane scrollFrame = new JScrollPane(Text);
		
		
	//constructor
	public DashBoard() {
		super();
		initialize();
		
	}
	
	//initializes all methods
	public void initialize(){
		scrollFrame.setPreferredSize(new Dimension(400,200));
		MakeScreen();
		
	}
	
	
	
	//makes the screen with background panel, then other panels layered
	public void MakeScreen(){
	//jpanel 
	JPanel Background = new JPanel();
	Background.setBackground(Color.RED);
	Background.setLayout(new BoxLayout(Background, BoxLayout.Y_AXIS));
	Background.add(scrollFrame);
	//container and placement
	getContentPane().setLayout(new FlowLayout());
	Container contentPane = getContentPane();
    contentPane.add("TimeLine", Background);
    //picture attempt
    ImageIcon image = new ImageIcon("Pitstop/src/pitstop.images/Batman.jpg");
    JLabel label = new JLabel("Profile", image, JLabel.CENTER);
    JPanel panel = new JPanel(new BorderLayout());
    panel.add( label, BorderLayout.CENTER );
	} 

}
