package org.simsol.formletter.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.simsol.formletter.Brand;

public class MainWindow extends JFrame  implements ActionListener{

	private Container pane;
	
	/** Single trigger buttons */	
	private JMenuItem newProfile, openProfile, saveProfile, quit, about, bugs;
	//private AbstractAction addLetter, newGroup, newCheck, newRadio;
	
	public MainWindow() {
		super(Brand.getFullName());
		pane = this.getContentPane();
		this.setJMenuBar(makeMenu());
		

		
		
	}
	
	private JMenuBar makeMenu() {
		
		JMenuBar menu = new JMenuBar();
		
		//file menu
		JMenu file = new JMenu("File");
		newProfile =  new JMenuItem("New Profile");
		newProfile.addActionListener(this);
		openProfile = new JMenuItem("Open Profile");
		openProfile.addActionListener(this);
		saveProfile = new JMenuItem("Save Profile");
		saveProfile.addActionListener(this);
		quit = new JMenuItem("Quit");
		quit.addActionListener(this);
		
		
		file.add(newProfile);
		file.addSeparator();
		file.add(openProfile);
		file.add(saveProfile);
		file.addSeparator();
		file.add(quit);
		menu.add(file);
		
		
		//edit menu
		JMenu edit = new JMenu("Edit");
		JMenuItem  = new JMenuItem("Add Letter");
		
		
		return menu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// the actions that only have one trigger
		
		
		
	}
	
}
