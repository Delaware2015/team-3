package pitstop;

import javax.swing.JFrame;

public abstract class Screen extends JFrame{
	
	public Screen()
	{
		super(Main.TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(Main.WIDTH,Main.HEIGHT);
	}
	
	public void switchto(Screen newscreen){
		setVisible(false);
		Main.currentscreen = new MainFrame();
		Main.currentscreen.setVisible(true);
	}

}
