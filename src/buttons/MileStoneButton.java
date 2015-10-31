package buttons;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MileStoneButton extends JButton{
	
	BufferedImage image;
	
	public MileStoneButton(String x){
		super();
		try {
			image = ImageIO.read(new File("src/buttons/Milestones Button.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	setIcon(new ImageIcon(image));
	}

}
