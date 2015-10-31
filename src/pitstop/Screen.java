package pitstop;

import javax.swing.JFrame;

public abstract class Screen extends JFrame{
	
	public Screen()
	{
		super(Main.TITLE);
	//	this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(Main.WIDTH,Main.HEIGHT);
	}
	
	public void switchto(Screen newscreen){
		setVisible(false);
		Main.currentscreen = newscreen;
		Main.currentscreen.setVisible(true);
		Main.currentscreen.enable();
	}

}
