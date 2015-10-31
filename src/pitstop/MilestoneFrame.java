package pitstop;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MilestoneFrame extends Screen {
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
    final static int FONT_SIZE1 = 40;
    final static int FONT_SIZE2 = 20;


    public MilestoneFrame(){
      	super();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(Main.WIDTH, 500));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  
        addComponentsToPane(panel);
        this.getContentPane().add(panel);
    }
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
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE1));        
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label, c);
        
        checkbox = new JCheckBox("Pre-Standardized Test (SAT)");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 1;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Standardized Test (SAT)");
        checkbox.setSelected(true);
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 2;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("American College Testing (ACT)");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 3;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Teacher Recommendations");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 4;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Your mom");
        checkbox.setSelected(true);
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 5;
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
    	
    	JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addComponentsToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	MilestoneFrame f = new MilestoneFrame();
    	f.setVisible(true);
    }
}
