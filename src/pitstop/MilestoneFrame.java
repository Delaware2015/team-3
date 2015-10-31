package pitstop;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MilestoneFrame extends Screen {
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JLabel label;
        JCheckBox checkbox;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }
        
        label = new JLabel("Milestones");
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label, c);
        
        checkbox = new JCheckBox("Tests");
        c.gridx = 0;
        c.gridy = 1;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Teacher Recommendations");
        c.gridx = 0;
        c.gridy = 2;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("DEEZ NUTS");
        c.gridx = 0;
        c.gridy = 3;
        removeListeners(checkbox);
        pane.add(checkbox, c);
    }
    
    private static void removeListeners(JCheckBox checkbox) {
    	MouseListener[] m1 = (MouseListener[])checkbox.getListeners(MouseListener.class);
    	for(int i = 0; i<m1.length; i++)
    		checkbox.removeMouseListener(m1[i]);
    	InputMap im = checkbox.getInputMap();
    	im.put(KeyStroke.getKeyStroke("SPACE"), "none");
    	im.put(KeyStroke.getKeyStroke("released SPACE"), "none");
    }
    
    private static void createAndShowGUI() {
    	JFrame.setDefaultLookAndFeelDecorated(true);
    	
    	JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addComponentsToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
    		public void run() {
    			createAndShowGUI();
    		}
    	});
    }
}