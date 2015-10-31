package pitstop;

import javax.swing.JFrame;

public abstract class Screen extends JFrame{
	
	public Screen(String text)
	{
		super(text);
		setSize(Main.WIDTH,Main.HEIGHT);
	}
	
	public Screen(){
		
	}
	
	
	public void switchto(Screen newscreen){
		setVisible(false);
		Main.currentscreen = new MainFrame();
		Main.currentscreen.setVisible(true);
	}

}
