package pitstop;

import javax.swing.*;

public abstract class Screen extends JFrame{
	
	public Screen(String text)
	{
		super(text);
	}
	
	public Screen(){
		
	}
	
	
	public void switchto(Screen newscreen){
		setVisible(false);
		Main.currentscreen = new MainFrame();
		Main.currentscreen.setVisible(true);
	}

}
