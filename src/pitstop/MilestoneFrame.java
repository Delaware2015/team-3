package pitstop;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MilestoneFrame extends Screen {
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
    final static int FONT_SIZE1 = 60;
    final static int FONT_SIZE2 = 17;
    final static int FONT_SIZE3 = 35;



    public MilestoneFrame(){
      	super();
      	JPanel background = new JPanel();
      	background.setLayout(new BoxLayout(background,BoxLayout.Y_AXIS));
      	
        JPanel panel = new JPanel();
       // panel.setPreferredSize(new Dimension(Main.WIDTH, 500));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  
        addComponentsToPane(panel);
        
        JPanel navi1 = new JPanel();
        JPanel navi2 = new JPanel();
        JButton profile = new JButton("Profile");
        JButton colleges = new JButton("Colleges");
        navi1.add(profile);
        navi1.add(new JButton("Forums"));
        navi2.add(new JButton("Calander"));
        navi2.add(new JButton("Milestones"));
        navi2.add(colleges);
     
        
        background.add(panel);
        background.add(navi1);
        background.add(navi2);
        JPanel space = new JPanel();
        space.setPreferredSize(new Dimension(Main.WIDTH,20));
        background.add(space);
        this.getContentPane().add(background);
        
        
        
        profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
         
                DashBoard newscreen = new DashBoard();
                switchto(newscreen);
                
             
            }
        });
        
        colleges.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
         
            	CollegeFinder newscreen = new CollegeFinder();
                switchto(newscreen);
                System.out.println("Test");
             
            }
        });
        
        
        
        
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
        
        label = new JLabel("High School");
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE3));        
        c.gridx = 0;
        c.gridy = 1;
        pane.add(label, c);
        
        checkbox = new JCheckBox("Freshman");
        checkbox.setSelected(true);
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 2;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Sophmore");
        checkbox.setSelected(true);
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 3;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Junior");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 4;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Senior");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 5;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        label = new JLabel("Testing");
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE3));        
        c.gridx = 0;
        c.gridy = 6;
        pane.add(label, c);
        
        checkbox = new JCheckBox("Pre-Standardized Test (SAT)");
        checkbox.setSelected(true);
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 7;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Standardized Test (SAT)");
        checkbox.setSelected(true);
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 8;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("American College Testing (ACT)");
        checkbox.setSelected(true);
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 9;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        label = new JLabel("Applying");
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE3));        
        c.gridx = 0;
        c.gridy = 10;
        pane.add(label, c);
        
        checkbox = new JCheckBox("Teacher Recommendations");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 11;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("Common Application");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 12;
        removeListeners(checkbox);
        pane.add(checkbox, c);
        
        checkbox = new JCheckBox("College Letters");
        checkbox.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE2));        
        c.gridx = 0;
        c.gridy = 13;
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
    
    
}
