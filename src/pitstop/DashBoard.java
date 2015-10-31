package pitstop;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class DashBoard extends Screen {
		
	JPanel backgroundp;
	JPanel infop;
	JPanel bottomp;
	JPanel topp;
	JPanel picturep;
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
    final static int FONT_SIZE1 = 20;
    final static int FONT_SIZE2 = 20;
    final static int FONT_SIZE3 = 20;

		
	//constructor
	public DashBoard()  {
		super();
		
		backgroundp = new JPanel();
    	backgroundp.setLayout(new BoxLayout(backgroundp,BoxLayout.Y_AXIS));
    		
    	//top half
    	topp = new JPanel();
		topp.setBorder(BorderFactory.createLineBorder(Color.black));

    	topp.setLayout(new BoxLayout(topp,BoxLayout.X_AXIS));
    	picturep = new JPanel();
    	BufferedImage image = null;
		try {
			image = ImageIO.read(new File("src/pitstop/Batman.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Image profilepic =  image.getScaledInstance(150, 150, 0);
    			
    	JLabel picLabel = new JLabel(new ImageIcon(profilepic));
    	picLabel.setPreferredSize(new Dimension(150,150));
    	picturep.add(picLabel);
    	infop = new JPanel();
    	
    	genInfo(infop);

    	//inf.setPreferredSize(new Dimension(200,200));

    	topp.add(picturep);
    	topp.add(infop);
    	bottomp = new JPanel();
		bottomp.setBorder(BorderFactory.createLineBorder(Color.black));
    	bottomp.setLayout(new BoxLayout(bottomp,BoxLayout.Y_AXIS));   	
    	bottomp.setPreferredSize(new Dimension(400, 400));

    	JPanel news = new JPanel();
    	genNewsFeed(news);
    	/////////////
    	bottomp.add(news);
    
        JPanel navi1 = new JPanel();
        JPanel navi2 = new JPanel();
        JButton Milestones = new JButton("Milestones");
        JButton Colleges = new JButton("Colleges");
        navi1.add(new JButton("Profile"));
        navi1.add(new JButton("Calander"));
        navi2.add(new JButton("Forums"));
        navi2.add(Milestones);
        navi2.add(Colleges);
        
       

    	
    	JPanel pane = new JPanel();
    	 pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS)); 
    	 pane.add(navi1);
    	 pane.add(navi2);
    	 bottomp.add(pane);
    	

    	backgroundp.add(topp);
    	backgroundp.add(bottomp);
    	JButton removeme = new JButton("helloooooooo");		
		
        Container contentPane = getContentPane();
        
        contentPane.add(backgroundp);
		//initialize();
        
       
        Milestones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
         
            	MilestoneFrame newscreen = new MilestoneFrame();
                switchto(newscreen);
                System.out.println("Test");
             
            }
        });
        
        Colleges.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
         
            	CollegeFinder newscreen = new CollegeFinder();
                switchto(newscreen);
                System.out.println("Test");
             
            }
        });
        
        
	}
	
	//initializes all methods
	public void initialize(){
		MakeScreen();
		
	}
	public static void genInfo(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JLabel label;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }
        
        label = new JLabel("Name: " + Main.username);
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE1));        
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label, c);
                   
        label = new JLabel("School: " + "Concord High");
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE3));        
        c.gridx = 0;
        c.gridy = 1;
        pane.add(label, c);
                
        JProgressBar progressbar = new JProgressBar();
        progressbar.setValue(40);
        progressbar.setToolTipText("Progress");
        progressbar.setPreferredSize(new Dimension(progressbar.getParent().WIDTH, 30));
        c.gridx = 0;
        c.gridy = 2;
        pane.add(progressbar, c);                
        
    }
	public static void genNewsFeed(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JLabel label;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }
        
        label = new JLabel("Today ... \t FASFA Due ");
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE1));        
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label, c);
                   
        label = new JLabel("Tomorrow ... \t Practice for SATs");
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE3));        
        c.gridx = 0;
        c.gridy = 1;
        pane.add(label, c);
                
        label = new JLabel("Soon ... \t University of Delaware App");
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, FONT_SIZE3));        
        c.gridx = 0;
        c.gridy = 2;
        pane.add(label, c);                
        
    }
	/**
	private static void removeListeners(JCheckBox checkbox) {
	    	MouseListener[] m1 = (MouseListener[])checkbox.getListeners(MouseListener.class);
	    	for(int i = 0; i<m1.length; i++)
	    		checkbox.removeMouseListener(m1[i]);
	    	InputMap im = checkbox.getInputMap();
	    	im.put(KeyStroke.getKeyStroke("SPACE"), "none");
	    	im.put(KeyStroke.getKeyStroke("released SPACE"), "none");
	}
	**/
	//makes the screen with background panel, then other panels layered
	public void MakeScreen(){
	//jpanel 
	JPanel Panel = new JPanel();
		setLocationRelativeTo(null);
    	Panel.setPreferredSize(new Dimension(Main.WIDTH, 400));
    	Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
    
	
    //constant panels for scrolling text
	JTextArea Text = new JTextArea();
	JScrollPane scrollFrame = new JScrollPane(Text);
		scrollFrame.setPreferredSize(new Dimension(400,400));
	
    //more panels
    JPanel spacer1 = new JPanel();
    	spacer1.setPreferredSize(new Dimension(400,200));
    JPanel spacer2 = new JPanel();
    	spacer2.setPreferredSize(new Dimension(400,200));
    	spacer2.setBackground(Color.RED);
    
   
	//picture attempt
    ImageIcon image = new ImageIcon("Pitstop/src/pitstop.images/Batman.jpg");
    JLabel label = new JLabel("Profile", image, JLabel.LEFT);
    JPanel IPanel = new JPanel(new BorderLayout());
    	IPanel.add( label, BorderLayout.CENTER );
    	IPanel.setPreferredSize(new Dimension(400,200));
    
    //Assign placements to panels
    	Panel.add(IPanel);
    	Panel.add(scrollFrame);
    	Panel.add(spacer2);
    
    //uneditable bottom nav section
    final JPanel bottom = new JPanel();
    	bottom.setLayout(new FlowLayout());
    	
    	
    	
    JButton Milestones = new JButton("Milestones");   
    
    
        bottom.add(Milestones);
        bottom.add(new JButton("College Finder"));
        bottom.add(new JButton("Calendar"));
        bottom.setVisible(false);
        
        
       
    	Panel.add(bottom);
    	Container contentPane = getContentPane();
        contentPane.add(Panel);
       
      
        
        
	} 
	
	
	
	
	
	

	
}
