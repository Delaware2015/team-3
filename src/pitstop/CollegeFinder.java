package pitstop;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;


public class CollegeFinder extends Screen{

	private HashMap<String,College> collegematcher = new HashMap<String,College>();
	static private String infoname = "";
	static private String infosize = "";
	static private String infodeadline = "";
	public CollegeFinder(){
		College UD = new College("University of Delaware", 18000, 1,31,2016);
		College Cornell = new College("Cornell",14000,12,1,2015);
		collegematcher.put("University of Delaware", UD);
		collegematcher.put("Cornell", Cornell);


		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(Main.WIDTH, 400));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


		JLabel label = new JLabel();
		label.setText("Enter College Name");

		JLabel iname= new JLabel();
		iname.setText(infoname);


		JLabel isize= new JLabel();
		isize.setText(infosize);

		JLabel ideadline= new JLabel();
		ideadline.setText(infodeadline);


		final JTextField collegeinput = new JTextField();
		collegeinput.setPreferredSize(new Dimension(160,20));

		JButton EnterButton = new JButton("Enter");
		EnterButton.setAlignmentX(CENTER_ALIGNMENT);
		EnterButton.setAlignmentY(CENTER_ALIGNMENT);

		JPanel dividor = new JPanel();
		dividor.add(label);
		dividor.add(collegeinput);
		dividor.add(EnterButton);
		dividor.add(iname);
		dividor.add(isize);
		dividor.add(ideadline);

		JPanel spacer1 = new JPanel();
		spacer1.setPreferredSize(new Dimension(400,200));
		JPanel spacer2 = new JPanel();
		spacer2.setPreferredSize(new Dimension(400,200));

		//spacer1.setBorder(BorderFactory.createLineBorder(Color.black));
		//dividor.setBorder(BorderFactory.createLineBorder(Color.black));
		//spacer2.setBorder(BorderFactory.createLineBorder(Color.black));

		panel.add(spacer1);
		panel.add(dividor);
		panel.add(spacer2);


		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout());

        JPanel navi1 = new JPanel();
        JPanel navi2 = new JPanel();
        JButton Milestones = new JButton("Milestones");
        JButton Colleges = new JButton("Colleges");
        JButton Profile = new JButton("Profile");
        navi1.add(Profile);
        navi1.add(new JButton("Calander"));
        navi2.add(new JButton("Forums"));
        navi2.add(Milestones);
        navi2.add(Colleges);
    	
    	JPanel pane = new JPanel();
    	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS)); 
    	pane.add(navi1);
    	pane.add(navi2);
    	bottom.add(pane);
		
		//JButton test = new JButton("Milestones");
		//bottom.add(test);
		//bottom.add(new JButton("College Finder"));
		//bottom.add(new JButton("Calendar"));
		bottom.setVisible(true);

		// test.setPreferredSize(new Dimension(600, 60));
		panel.add(bottom);
		final Container contentPane = getContentPane();

		contentPane.add(panel);










		EnterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				String text = collegeinput.getText();
				College c = collegematcher.get(text);
				infoname = c.getname();
				infosize = c.getsize();
				infodeadline = c.getdeadline();
				switchto(new CollegeFinder());


			}
		});
		
		Profile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				switchto(new DashBoard());


			}
		});
		
		Milestones.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				switchto(new MilestoneFrame());


			}
		});
		}






	}









