package pitstop;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class CollegeFinder extends JPanel{
	
	private JButton go;
	private JTextPane textPane;
	
	
	public CollegeFinder()
	{
		makeButtons();
		makeTextPane();
		add(textPane);
		add(go);
		
	}
	
	private void makeButtons()
	{
		go = new JButton("Go"/*, Image Here*/);
	    go.setVerticalTextPosition(AbstractButton.CENTER);
	    go.setHorizontalTextPosition(AbstractButton.LEADING);
	    go.setMnemonic(KeyEvent.VK_D);
	    go.setActionCommand("disable");
	}
	
	private void makeTextPane()
	{
		String[] initString =
	        {"Look up a College:"};
		
		

		String[] initStyles =
	        {};

		textPane = new JTextPane();
		textPane.setPreferredSize(new Dimension(200, 20));
		StyledDocument doc = textPane.getStyledDocument();
		addStylesToDocument(doc);
		
		try {
			for (int i=0; i < initString.length; i++) {
				doc.insertString(doc.getLength(), initString[i], doc.getStyle("regular"));
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
	
	private static void createAndShowGUI() {

        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CollegeFinder newContentPane = new CollegeFinder();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

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
