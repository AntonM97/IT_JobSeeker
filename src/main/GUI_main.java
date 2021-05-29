package main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import announce.Announces_GUI;
import company.Companys_GUI;
import tecnology.TechStatistics_GUI;


public class GUI_main {

	public GUI_main() {
						
		//TECHnology STATistics Module
		Announces_GUI AnnouncementPane = new Announces_GUI();
		TechStatistics_GUI TechStatPanel = new TechStatistics_GUI();
		Companys_GUI CompanysPane = new Companys_GUI();
		Header topPanel = new Header();
			
		JTabbedPane tabbedPanel = new JTabbedPane();
		tabbedPanel.addTab("Announcement", AnnouncementPane);
		tabbedPanel.addTab("Technologies", TechStatPanel);
		tabbedPanel.addTab("Companys", CompanysPane);
				
				
		JPanel MainestPanel = new JPanel();
		BorderLayout BLMain = new BorderLayout();
		MainestPanel.setLayout(BLMain);
		MainestPanel.add("Center",tabbedPanel);
		MainestPanel.add("North",topPanel);
				
				
		//Create the frame and add the panel to it
		JFrame frame = new JFrame("IT_JobSeeker");
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.setContentPane(MainestPanel);	
				
		//Set size and make the window visible
		frame.setSize(1000, 600);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		GUI_main gui = new GUI_main();
		
		
		
		
	}

}
