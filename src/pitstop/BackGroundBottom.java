package pitstop;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackGroundBottom extends JPanel{

	 public void paintComponent(Graphics g){
         Image image=new ImageIcon("src/pitstop/jpmcbackground.png").getImage();
         g.drawImage(image,0,0,this);
        
     }
	
	
}
