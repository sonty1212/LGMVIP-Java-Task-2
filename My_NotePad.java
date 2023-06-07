import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class My_NotePad implements ActionListener {
	private JFrame jFrame;
	private JMenuBar jMenuBar;
	private JMenu jMenuFile, jMenuEdit, jMenuAbout;
	private JMenuItem jMenuItemNew, jMenuItemOpen, jMenuItemSave, jMenuItemSaveas, jMenuItemExit, jMenuItemCut, jMenuItemCopy, jMenuItemPaste, jMenuItemAboutUs;
	private JTextArea jTextAreaMain;
	
	
	public My_NotePad() {
		jFrame = new JFrame("Texty - Text Editor");
		jTextAreaMain = new JTextArea();
		
		jMenuBar = new JMenuBar();
		
		//menu items
		jMenuFile = new JMenu("File");
		jMenuEdit = new JMenu("Edit");
		jMenuAbout = new JMenu("About");
		
		//sub menu items for File Menu
		jMenuItemNew = new JMenuItem("New");
		jMenuItemOpen = new JMenuItem("Open");
		jMenuItemSave = new JMenuItem("Save");
		jMenuItemSaveas = new JMenuItem("Save as");
		jMenuItemExit = new JMenuItem("Exit");
		
		//sub menu items for Edit Menu
		jMenuItemCut = new JMenuItem("Cut");
		jMenuItemCopy = new JMenuItem("Copy");
		jMenuItemPaste = new JMenuItem("Paste");
		
		//sub menu items for About Menu
		jMenuItemAboutUs = new JMenuItem("About Us");
		
		setAllMenuItems();
		setComponentsProperties();
		setMenuItemsListeners();
		setFrameProperties();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jMenuItemExit) {
			jFrame.dispose();
		}
	}
	
	private void setAllMenuItems() {
		//adding sub menus to the File menu
		jMenuFile.add(jMenuItemNew);
		jMenuFile.add(jMenuItemOpen);
		jMenuFile.add(jMenuItemSave);
		jMenuFile.add(jMenuItemSaveas);
		jMenuFile.add(jMenuItemExit);
		
		//adding sub menus to the Edit menu
		jMenuEdit.add(jMenuItemCut);
		jMenuEdit.add(jMenuItemCopy);
		jMenuEdit.add(jMenuItemPaste);
		
		//adding sub menus to the About menu
		jMenuAbout.add(jMenuItemAboutUs);
		
		//adding main menus to the menubar
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		jMenuBar.add(jMenuAbout);
		
		jMenuItemNew.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemOpen.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemSave.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemSaveas.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemExit.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemCut.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemCopy.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemPaste.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		jMenuItemAboutUs.setBorder(new EmptyBorder(new Insets(5, 20, 5, 20)));
		
		//setting menu bar to the frame
		jFrame.setJMenuBar(jMenuBar);
	}
	
	private void setMenuItemsListeners() {
		//exit sub menu
		jMenuItemExit.addActionListener(this);
	}
	
	private void setComponentsProperties() {
		jTextAreaMain = new JTextArea();
	    JScrollPane scroll = new JScrollPane (jTextAreaMain, 
	    	       JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    
	    jFrame.add(BorderLayout.CENTER,scroll);
	}
	
	private void setFrameProperties() {
		jFrame.setSize(500,500);
		jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jFrame.setUndecorated(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);	
	}
	
	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (Exception e) {
	    	
	    }
		new My_NotePad();
	}
}
