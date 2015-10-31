package buttons;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CollegeFinderButton extends JButton{
	
	BufferedImage image;
	
	public CollegeFinderButton(){
		super();
		try {
			image = ImageIO.read(new File("src/buttons/College Finder Button.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    			
    	JLabel picLabel = new JLabel(new ImageIcon(image));
    	picLabel.setPreferredSize(new Dimension(150,150));
    	this.add(picLabel);
	}
	public CollegeFinderButton(String x){
		super();
		try {
			image = ImageIO.read(new File("src/buttons/College Finder Button.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Image profilepic =  image.getScaledInstance(30, 30, 0);
    	setIcon(new ImageIcon(image));
	}
	
}
