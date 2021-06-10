package announce;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import cv_generator.CV_generator;

/**
 * This class collects all announcement that already are in DB and shows
 * it to user
 */


public class Announces_GUI extends JPanel{
	public Announces_GUI(){
		
		AnnouncementEngine annEng = new AnnouncementEngine();
		
		BorderLayout mainbl = new BorderLayout();
		setLayout(mainbl);
		
		
		JPanel list = new JPanel();
		JPanel annPane = new JPanel();	
		JPanel filtersPane = new JPanel();
		JPanel tablePane = new JPanel();
		
		BorderLayout bl1_1 = new BorderLayout();
		list.setLayout(bl1_1);
		BorderLayout bl1_1_1 = new BorderLayout();
		annPane.setLayout(bl1_1_1);
		BorderLayout bl1_1_2 =new BorderLayout();
		tablePane.setLayout(bl1_1_2);
		FlowLayout bl1_1_3 =new FlowLayout();
		filtersPane.setLayout(bl1_1_3);
		
		JLabel Announcements = new JLabel("Announcements");
		Announcements.setSize(60,45);
		annPane.add("West", Announcements);
		
		JButton AddAnnouncement = new JButton ("+ add");
		AddAnnouncement.addActionListener(annEng);
		annPane.add("East", AddAnnouncement);
		
		AnnFilterEngine annFilterEng = new AnnFilterEngine();
		JLabel period = new JLabel("Period");
		filtersPane.add(period);
				
		JComboBox<String> periodSelector = new JComboBox<>();
			periodSelector.addItem("7 days");
			periodSelector.addItem("2 weeks");
			periodSelector.addItem("3 weeks");
			periodSelector.addItem("1 month");
			periodSelector.addItem("2 months");
			periodSelector.addItem("3 months");
			periodSelector.addItem("all time");
		filtersPane.add(periodSelector);
		periodSelector.addItemListener(annFilterEng);
		
		JLabel compatib = new JLabel("Compatibility");
		filtersPane.add(compatib);
		
		JComboBox<String> compatibSelector = new JComboBox<>();
			compatibSelector.addItem("show all");
			compatibSelector.addItem("≥ 90%");
			compatibSelector.addItem("≥ 80%");
			compatibSelector.addItem("≥ 75%");
			compatibSelector.addItem("≥ 60%");
			compatibSelector.addItem("≥ 40%");
			compatibSelector.addItem("≥ 20%");
			compatibSelector.addItem("≥ 10%");
		filtersPane.add(compatibSelector);
		compatibSelector.addItemListener(annFilterEng);
		
		JLabel search = new JLabel("Search by position");
		filtersPane.add(search);
		
		JTextField searchByPos = new JTextField(20); 
		filtersPane.add(searchByPos);
		searchByPos.addActionListener(annFilterEng);
		
		
		Object[][] announcementsArray = {};
		String[] annColumnNames = {"Company", "Position", "Date of Publication", "Compatibility %"};
		JTable annTable = new JTable(announcementsArray, annColumnNames);
		annTable.setAutoCreateRowSorter(true);		
		
		
		var scrollAnn = new JScrollPane(annTable);
		//add(scrollAnn, BorderLayout.CENTER);
		tablePane.add("Center", scrollAnn);
		
		
		Border listSeparator = BorderFactory.createEtchedBorder();
		filtersPane.setBorder(listSeparator);
		
		tablePane.add("North",filtersPane);
		
		list.setBorder(listSeparator);
		list.add("North",annPane);
		list.add("Center",tablePane);
		
		
		//SIDEPANEL's elements "CV GEN"
		CV_generator sidePanel = new CV_generator();
		
		add("Center", list);
		add("East", sidePanel);
	}
}
