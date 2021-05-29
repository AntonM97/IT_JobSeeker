package announce;

import java.awt.*;
import javax.swing.*;


public class AdderOfAnn extends JFrame {
	private String company_name;
	private String pos;
	private String dateOfAdding;
	private String text;
	
 	public AdderOfAnn(){
		
		//TODO поставить поле для ввода даты публикации
		JPanel addPage = new JPanel();//creates panel
		BorderLayout bl5 = new BorderLayout();
		addPage.setLayout(bl5);
	
		JPanel fields = new JPanel();
		FlowLayout fln = new FlowLayout();
		fields.setLayout(fln);
		
		
		JLabel com_name = new JLabel("Company name");
		fields.add(com_name);
		
		//Listener
		AdderOfAnnEngine addAnnEng = new AdderOfAnnEngine();
		
		var insCompName = new JTextField(50);
		//insCompName.addActionListener(addAnnEng);
		fields.add(insCompName);
		
		
		JLabel position = new JLabel("     Position         ");
		fields.add(position);
		JTextField insPos = new JTextField(50);
		fields.add(insPos);
		
		JLabel date = new JLabel("Date of publication"
				+ "                     ");
		fields.add(date);
		
		
		
		JComboBox<String> daySelector = new JComboBox<>();
			daySelector.addItem("1");
			daySelector.addItem("2");
			daySelector.addItem("3");
			daySelector.addItem("4");
			daySelector.addItem("5");
			daySelector.addItem("6");
			daySelector.addItem("7");
			daySelector.addItem("8");
			daySelector.addItem("9");
			daySelector.addItem("10");
			daySelector.addItem("11");
			daySelector.addItem("12");
			daySelector.addItem("13");
			daySelector.addItem("14");
			daySelector.addItem("15");
			daySelector.addItem("16");
			daySelector.addItem("17");
			daySelector.addItem("18");
			daySelector.addItem("19");
			daySelector.addItem("20");
			daySelector.addItem("21");
			daySelector.addItem("22");
			daySelector.addItem("23");
			daySelector.addItem("24");
			daySelector.addItem("25");
			daySelector.addItem("26");
			daySelector.addItem("27");
			daySelector.addItem("28");
			daySelector.addItem("29");
			daySelector.addItem("30");
			daySelector.addItem("31");
		fields.add(daySelector);
		//daySelector.addItemListener(addAnnEng);
		
		
		JComboBox<String> monthSelector = new JComboBox<>();
			monthSelector.addItem("jen");
			monthSelector.addItem("feb");
			monthSelector.addItem("mar");
			monthSelector.addItem("apr");
			monthSelector.addItem("may");
			monthSelector.addItem("jun");
			monthSelector.addItem("jul");
			monthSelector.addItem("aug");
			monthSelector.addItem("sep");
			monthSelector.addItem("oct");
			monthSelector.addItem("nov");
			monthSelector.addItem("dec");
		fields.add(monthSelector);
		//monthSelector.addItemListener(addAnnEng);
		
		
		JComboBox<String> yearSelector = new JComboBox<>();
			yearSelector.addItem("2021");
			yearSelector.addItem("2022");
		fields.add(yearSelector);
		//yearSelector.addItemListener(addAnnEng);
			
		
		JLabel descrField = new JLabel(
				"                                  "
				+ "        text of announcement        "
				+ "                                  ");
		fields.add(descrField);
		JTextArea insAnnouncement = new JTextArea(15,60);
		insAnnouncement.setLineWrap(true);
		//insAnnouncement.setWrapStyleWord(true);
		var scrollPane = new JScrollPane(insAnnouncement);
		fields.add(scrollPane);
		
		
		JLabel recquired = new JLabel("    Recquired       ");
		fields.add(recquired);
		JTextField recq = new JTextField(50);
		fields.add(recq);
		JLabel niceToH = new JLabel("   Nice to have    ");
		fields.add(niceToH);
		JTextField nToH = new JTextField(50);
		fields.add(nToH);
		
		
		
		
		JPanel addButtPane = new JPanel();
		FlowLayout addB = new FlowLayout();
		addButtPane.setLayout(addB);

		JButton Add = new JButton("   Add   ");
		addButtPane.add(Add);
		Add.addActionListener(addAnnEng);
	
		addPage.add("Center", fields);
		addPage.add("South",addButtPane);
		
		
		JFrame adder = new JFrame("add announcement");
		
		
		
		adder.setContentPane(addPage);
		adder.setSize(700,480);
		adder.setVisible(true);
		adder.setResizable(false);
		
		
		this.company_name = insCompName.getText();
		this.pos = insPos.getText();
		this.dateOfAdding = (String) (daySelector.getSelectedItem()+" "
				+monthSelector.getSelectedItem()+ " "+yearSelector);
		this.text = insAnnouncement.getText();
	
	}

 	public String getCompany_name() {
 		return company_name;
 	}
 	public String getPos() {
 		return pos;
 	}
 	public String getDateOfAdding() {
 		return dateOfAdding;
 	}
 	public String getTextOfAnnouncement() {
 		return text;
 	}
 	
 	
 	
}
