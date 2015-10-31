package pitstop;


public class Main {
	static final int WIDTH = 400;
	static final int HEIGHT = 600;
	public static final String TITLE = "Pitstop";

	static Screen currentscreen = new Login();
	static String password;
	static String username;

	public static void main(String[] args) {
		currentscreen.setVisible(true);
	}

}
