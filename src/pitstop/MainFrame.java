package pitstop;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    public MainFrame() {

        initUI();
    }

    private void initUI() {
        
        
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                MainFrame main = new MainFrame();
                main.setVisible(true);
            }
        });
    }
}