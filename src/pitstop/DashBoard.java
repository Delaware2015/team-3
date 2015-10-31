package pitstop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
		scrollFrame.setPreferredSize(new Dimension( 400,200));
		MakeScreen();
		
	}
	
	
	
	//makes the screen with background panel, then other panels layered
	public void MakeScreen(){
	JPanel Background = new JPanel();
	Background.setBackground(Color.RED);
	Background.setSize(400,600);
	Background.setLayout(new BoxLayout(Background, BoxLayout.Y_AXIS));
	Background.add(scrollFrame);
	} 

}
