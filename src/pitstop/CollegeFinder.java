package pitstop;

import java.awt.*;
import javax.swing.*;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;


public class CollegeFinder extends JPanel implements ActionListener{
	
	private JButton go;
	private JTextPane textPane;
	private String[] searchText = {"Look up a College:"};
	private StyledDocument doc;
	
	
	public CollegeFinder()
	{
		
		makeButtons();
		makeTextPane();
		add(textPane);
		add(go);
		
	}
	
	public void setSearchText(String s)
	{
		searchText = s.split("");
	}
	
	private void makeButtons()
	{
		go = new JButton("Go"/*, Image Here*/);
	    go.setVerticalTextPosition(AbstractButton.CENTER);
	    go.setHorizontalTextPosition(AbstractButton.LEADING);
	    go.setMnemonic(KeyEvent.VK_D);
	    go.setActionCommand("go");
	    go.addActionListener(this);
	}
	
	private void makeTextPane()
	{	

		String[] initStyles = {};

		textPane = new JTextPane();
		textPane.setPreferredSize(new Dimension(200, 20));
		doc = textPane.getStyledDocument();
		addStylesToDocument(doc);
		
		try {
			for (int i=0; i < searchText.length; i++) {
				doc.insertString(doc.getLength(), searchText[i], doc.getStyle("regular"));
			}
		} catch (BadLocationException ble) {
			System.err.println("Couldn't insert initial text into text pane.");
		}
	}
	
	protected void addStylesToDocument(StyledDocument doc) {
        Style def = StyleContext.getDefaultStyleContext().
                        getStyle(StyleContext.DEFAULT_STYLE);

        Style regular = doc.addStyle("regular", def);
        StyleConstants.setFontFamily(def, "SansSerif");

        Style s = doc.addStyle("italic", regular);
        StyleConstants.setItalic(s, true);

        s = doc.addStyle("bold", regular);
        StyleConstants.setBold(s, true);

        s = doc.addStyle("small", regular);
        StyleConstants.setFontSize(s, 10);

        s = doc.addStyle("large", regular);
        StyleConstants.setFontSize(s, 16);

        s = doc.addStyle("icon", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
       
    }
	
	private static void createAndShowGUI() throws Exception {
		
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CollegeFinder newContentPane = new CollegeFinder();
        frame.add(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }
	
	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
					createAndShowGUI();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
            }
        });
    }

	public void actionPerformed(ActionEvent arg0) {
		if("go".equals(arg0.getActionCommand()))
		{
			//setSearchText("Look for a College:");
			go.setEnabled(false);
		}
		
	}
	

}
