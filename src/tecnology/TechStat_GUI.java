package tecnology;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TechStat_GUI extends JPanel{
	public TechStat_GUI(){
		
		BorderLayout bl4 = new BorderLayout();
		setLayout(bl4);
		
		//panel with "Announcement" and Button "Add"
		JPanel TechLabel = new JPanel();
		BorderLayout bl3_1 = new BorderLayout();
		TechLabel.setLayout(bl3_1);
			
		JLabel techStat = new JLabel ("Technology statistics");
		TechLabel.add("West", techStat);
		
		TechStatEngine techStEng = new TechStatEngine();
		JButton addTech = new JButton("+add_Tech");
		addTech.addActionListener(techStEng);
		TechLabel.add("East", addTech);
		
		//Lower module with representation
		JPanel techShow = new JPanel();
		BorderLayout bl3_1_2 = new BorderLayout();
		techShow.setLayout(bl3_1_2);
		
		JPanel techSelector = new JPanel();
		FlowLayout fl2 = new FlowLayout();
		techSelector.setLayout(fl2);
		//techSelector.setBorder(listSeparator);
				
		JLabel totQ = new JLabel ("total%");
		techSelector.add(totQ);
				
			JComboBox<String> totPerCent = new JComboBox<>();
				totPerCent.addItem("show all");
				totPerCent.addItem("≥90%");
				totPerCent.addItem("≥70%");
				totPerCent.addItem("≥50%");
				totPerCent.addItem("≥30%");
				totPerCent.addItem("≥10%");
			//totPerCent.addItemListener(TechStatEng);
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
			//recquiredPerCent.addItemListener(TechStatEng);
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
			//niceToH_perCent.addItemListener(TechStatEng);
			techSelector.add(niceToH_perCent);
				
				
				
				
		JPanel techTable = new JPanel();
		BorderLayout bl3_1_3 = new BorderLayout();
		techTable.setLayout(bl3_1_3);
		
		
		Object [][] tech_rating = {
				{"Spring", false, 125, 90, 100, 0},
				{"Git", true, 100, 80, 10, 90}
		};
		String[] columnNames = {"Technology", "learned", 
				"total", "total %", "% recquired ", 
				"% nice to have"};
		JTable tTable = new JTable(tech_rating, columnNames);
		tTable.setAutoCreateRowSorter(true);
		JScrollPane scr = new JScrollPane(tTable);
		techTable.add(scr);
			
		techShow.add("North", techSelector);
		techShow.add("Center",techTable);
			
		add("North",TechLabel);
		add("Center", techShow);
			
	}

}
