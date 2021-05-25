package announce;

import java.awt.*;
import javax.swing.*;


public class AdderOfAnn extends JFrame{	
	
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
		JTextField insCompName = new JTextField(50);
		fields.add(insCompName);
		
		
		JLabel position = new JLabel("     Position         ");
		fields.add(position);
		JTextField insPos = new JTextField(50);
		fields.add(insPos);
		
		JLabel date = new JLabel("Date of publication"
				+ "                                             "
				+ "                                             "
				+"                                              "
				+ "                                            ");
		//TODO cancel when date selector will be installed
		fields.add(date);
		
		
		
		
		JLabel descrField = new JLabel(
				"            text of announcement              ");
		fields.add(descrField);
		JTextArea insAnnouncement = new JTextArea(10,60);
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
	
		addPage.add("Center", fields);
		addPage.add("South",addButtPane);
		
		
		//TODO Center the frame when appears
		JFrame adder = new JFrame("add announcement");
		
		adder.setContentPane(addPage);
		adder.setSize(700,400);
		adder.setVisible(true);
		adder.setResizable(false);
	
	}
}
