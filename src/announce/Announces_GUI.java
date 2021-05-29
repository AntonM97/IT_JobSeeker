package announce;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * This class collects all announcement that already are in DB and shows
 * it to user
 */


public class Announces_GUI extends JPanel{
	public Announces_GUI(){
		//Piece with announce module
		
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
		
		
		
		
		
		
		
		
		
		//SIDEPANEL's elements "CV GEN"
		JPanel sidePanel = new JPanel();
		
		FlowLayout bl1_2 = new FlowLayout();
		sidePanel.setLayout(bl1_2);
		
		JButton cvGenerator = new JButton ("CV Gen");
		cvGenerator.addActionListener(annEng);
		sidePanel.setBorder(listSeparator);
		sidePanel.add("North",cvGenerator);//TODO put into internal window (resizable)
		
		
		
		add("Center", list);
		add("East", sidePanel);
		
	}
}
