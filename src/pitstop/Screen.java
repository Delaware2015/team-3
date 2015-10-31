package pitstop;

import javax.swing.JFrame;

public abstract class Screen extends JFrame{
	
	public Screen()
	{
		super(Main.TITLE);
		setSize(Main.WIDTH,Main.HEIGHT);
	}
	
	public void switchto(Screen newscreen){
		setVisible(false);
		Main.currentscreen = new MainFrame();
		Main.currentscreen.setVisible(true);
	}

}
