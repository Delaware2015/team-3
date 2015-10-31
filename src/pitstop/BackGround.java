package pitstop;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackGround extends JPanel{

	 public void paintComponent(Graphics g){
         Image image=new ImageIcon("src/pitstop/LoginScreen.png").getImage();
         g.drawImage(image,0,0,this);
        
     }
	
	
}
