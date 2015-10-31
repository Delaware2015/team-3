package buttons;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ForumButton extends JButton{
	
	BufferedImage image;
	
	public ForumButton(String x){
		super();
		try {
			image = ImageIO.read(new File("src/buttons/Forums.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	setIcon(new ImageIcon(image));
	}

}
