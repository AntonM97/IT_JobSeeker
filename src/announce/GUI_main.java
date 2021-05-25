package announce;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import tecnology.TechStatEngine;

public class GUI_main {

	
	public static void main(String[] args) {
		
		
/*		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab(announcementPage,  icon,  component);
*/
		
		
		
		//COMPANYS module
		JPanel mainCompanysPane = new JPanel();
		
		
		
		
		
		//ANNOUNCEMENT PANEL
		//create panels
		JPanel mainPane = new JPanel();
		JPanel list = new JPanel();
		JPanel sidePanel = new JPanel();
		JPanel annPane = new JPanel();
		
		JPanel filtersPane = new JPanel();
		JPanel tablePane = new JPanel();
		
		//set layout manager for this panels
		BorderLayout mainbl = new BorderLayout();
		mainPane.setLayout(mainbl);
		BorderLayout bl1_1 = new BorderLayout();
		list.setLayout(bl1_1);
		BorderLayout bl1_1_1 = new BorderLayout();
		annPane.setLayout(bl1_1_1);
		FlowLayout bl1_2 = new FlowLayout();
		sidePanel.setLayout(bl1_2);
		
		BorderLayout bl1_1_2 =new BorderLayout();
		tablePane.setLayout(bl1_1_2);
		FlowLayout bl1_1_3 =new FlowLayout();
		filtersPane.setLayout(bl1_1_3);
		
		
		
		//Piece with announce module
		AnnouncementEngine annEng = new AnnouncementEngine();
		
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
		
		
		
		
		var hereWillBeTable = new JTextArea(8,60);
		//var srcollAnn = new ScrollPane();
		//add(scrollAnn, BorderLayout.CENTER);
		tablePane.add("Center",hereWillBeTable);
		
		
		
		Border listSeparator = BorderFactory.createEtchedBorder();
		filtersPane.setBorder(listSeparator);
		
		tablePane.add("North",filtersPane);
		
		list.setBorder(listSeparator);
		list.add("North",annPane);
		list.add("Center",tablePane);
		
		
		
		
		
		
		
		
		
		//sidepanel's elements
		JButton cvGenerator = new JButton ("CV Gen");
		cvGenerator.addActionListener(annEng);
		sidePanel.setBorder(listSeparator);
		sidePanel.add("North",cvGenerator);//TODO put into internal window (resizable)
		
		
		
		mainPane.add("Center", list);
		mainPane.add("East", sidePanel);
		
		
		
		
		
		//TECHnology STATistics Module
		TechStatEngine TechStatEng = new TechStatEngine();
		
		//main of this section
		JPanel TechStatPanel = new JPanel();
		BorderLayout bl4 = new BorderLayout();
		TechStatPanel.setLayout(bl4);
		
		//panel with "Announcement" and Button "Add"
		JPanel TechLabel = new JPanel();
		BorderLayout bl3_1 = new BorderLayout();
		TechLabel.setLayout(bl3_1);
			
			JLabel techStat = new JLabel ("Technology statistics");
			TechLabel.add("West", techStat);
			
			JButton addTech = new JButton("+add_Tech");
			addTech.addActionListener(TechStatEng);
			TechLabel.add("East", addTech);
		
		//Lower module with representation
		JPanel techShow = new JPanel();
		BorderLayout bl3_1_2 = new BorderLayout();
		techShow.setLayout(bl3_1_2);
		
			JPanel techSelector = new JPanel();
			FlowLayout fl2 = new FlowLayout();
			techSelector.setLayout(fl2);
			techSelector.setBorder(listSeparator);
				
				JLabel totQ = new JLabel ("total%");
				techSelector.add(totQ);
				
				JComboBox<String> totPerCent = new JComboBox<>();
					totPerCent.addItem("show all");
					totPerCent.addItem("≥90%");
					totPerCent.addItem("≥70%");
					totPerCent.addItem("≥50%");
					totPerCent.addItem("≥30%");
					totPerCent.addItem("≥10%");
				totPerCent.addItemListener(TechStatEng);
				techSelector.add(totPerCent);
				
				JLabel recqPerCentLabel = new JLabel("Recquired%");
				techSelector.add(recqPerCentLabel);
				
				JComboBox<String> recquiredPerCent = new JComboBox<>();
					recquiredPerCent.addItem("show all");
					recquiredPerCent.addItem("≥90%");
					recquiredPerCent.addItem("≥70%");
					recquiredPerCent.addItem("≥50%");
					recquiredPerCent.addItem("≥30%");
					recquiredPerCent.addItem("≥10%");
				recquiredPerCent.addItemListener(TechStatEng);
				techSelector.add(recquiredPerCent);
			
				JLabel niceToH_perCentLabel = new JLabel("NiceToHave%");
				techSelector.add(niceToH_perCentLabel);
				
				JComboBox<String> niceToH_perCent = new JComboBox<>();
					niceToH_perCent.addItem("show all");
					niceToH_perCent.addItem("≥90%");
					niceToH_perCent.addItem("≥70%");
					niceToH_perCent.addItem("≥50%");
					niceToH_perCent.addItem("≥30%");
					niceToH_perCent.addItem("≥10%");
				niceToH_perCent.addItemListener(TechStatEng);
				techSelector.add(niceToH_perCent);
				
				
				
				
			JPanel techTable = new JPanel();
			BorderLayout bl3_1_3 = new BorderLayout();
			techTable.setLayout(bl3_1_3);
		
		
		
		
		techShow.add("North", techSelector);
		techShow.add("Center",techTable);
		
		TechStatPanel.add("North",TechLabel);
		TechStatPanel.add("Center", techShow);
		
		
		
		
		
		
		
		
		
		// TOP HEADER PANEL
		HeaderEngine headEng = new HeaderEngine();
		
		JPanel topPanel = new JPanel();
		
		FlowLayout bl = new FlowLayout ();
		topPanel.setLayout(bl);//Instantiation of Layout
		
		JButton linkLinkedIn = new JButton ("LinkedIn");//TODO set icons instead of words and put small size;
		linkLinkedIn.addActionListener(headEng);
		topPanel.add("North", linkLinkedIn);
		
		JButton checkMail = new JButton("Email");//TODO set icons instead of words and put small size;
		checkMail.addActionListener(headEng);
		topPanel.add("North", checkMail);
		
		JButton settings = new JButton ("Settings"); //TODO set icons instead of words and put small size;
		settings.addActionListener(headEng);
		topPanel.add("North", settings);
		
		
		
		JTabbedPane tabbedPanel = new JTabbedPane();
		tabbedPanel.addTab("Announcement", mainPane);
		tabbedPanel.addTab("Technologies", TechStatPanel);
		tabbedPanel.addTab("Companys", mainCompanysPane);
		
		
		JPanel MainestPanel = new JPanel();
		BorderLayout BLMain = new BorderLayout();
		MainestPanel.setLayout(BLMain);
		MainestPanel.add("Center",tabbedPanel);
		MainestPanel.add("North",topPanel);
		
		
		//Create the frame and add the panel to it
		JFrame frame = new JFrame("IT_JobSeeker");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		//Add the panel to top level container
		frame.setContentPane(MainestPanel);
		
		
		
		//Set size and make the window visible
		frame.setSize(1000, 600);
		frame.setVisible(true);
	}

}
