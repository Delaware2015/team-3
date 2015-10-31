package pitstop;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buttons.CalendarButton;
import buttons.CollegeFinderButton;
import buttons.MileStoneButton;


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
		dividor.setLayout(new BoxLayout(dividor, BoxLayout.Y_AXIS));
		JPanel dividorTop = new JPanel();
		dividorTop.add(label);
		dividorTop.add(collegeinput);
		dividorTop.add(EnterButton);
		dividor.add(dividorTop);
		//dividor.add(EnterButton);
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
        JButton Milestones = new MileStoneButton("Milestones");
        JButton Colleges = new CollegeFinderButton("Colleges");
        JButton Profile = new JButton("Profile");
        navi1.add(Profile);
        navi1.add(new CalendarButton("Calander"));
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









