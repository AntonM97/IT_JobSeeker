package announce;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;


public class AdderOfAnn extends JFrame{
		
	private static String url = "jdbc:postgresql:postgres";
	private static String username = "postgres";
	private static String password = "34698";
	static Connection conn;
	static Statement stat;
	static ResultSet rs;
	private static int maxId;
	
 	public AdderOfAnn(){
		
		JPanel addPage = new JPanel();
		BorderLayout bl5 = new BorderLayout();
		addPage.setLayout(bl5);
		JPanel fields = new JPanel();
		FlowLayout fln = new FlowLayout();
		fields.setLayout(fln);
		
		
		JLabel com_name = new JLabel("Company name");
		fields.add(com_name);
		var insCompName = new JTextField(50);
		fields.add(insCompName);
		
		
		JLabel position = new JLabel("     Position         ");
		fields.add(position);
		JTextField insPos = new JTextField(50);
		fields.add(insPos);
		
		JLabel date = new JLabel("Date of publication"
				+ "                     ");
		fields.add(date);
		

		JComboBox<String> daySelector = new JComboBox<>();
			daySelector.addItem("01");
			daySelector.addItem("02");
			daySelector.addItem("03");
			daySelector.addItem("04");
			daySelector.addItem("05");
			daySelector.addItem("06");
			daySelector.addItem("07");
			daySelector.addItem("08");
			daySelector.addItem("09");
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
		
		
		JComboBox<String> yearSelector = new JComboBox<>();
			yearSelector.addItem("2021");
			yearSelector.addItem("2022");
		fields.add(yearSelector);
		
		
		JLabel descrField = new JLabel(
				"                                  "
				+ "        text of announcement        "
				+ "                                  ");
		fields.add(descrField);
		JTextArea insAnnouncement = new JTextArea(15,60);
		insAnnouncement.setLineWrap(true);
		insAnnouncement.setWrapStyleWord(true);
		var scrollPane = new JScrollPane(insAnnouncement);
		fields.add(scrollPane);
		
		
		JPanel reqPanel = new JPanel();
		reqPanel.setLayout(fln);
		JLabel required = new JLabel("    Recquired       ");
		reqPanel.add(required);
		JTextField req = new JTextField(30);
		//ArrayList techArr = new ArrayList<>();
		req.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (req.getText() == "") {
					
				}else if (req.getText() != "") {
					
					//TODO Finish
					class  Tech extends JLabel{
						Tech() {
							JLabel lb = new JLabel(req.getText());
						}
					}
					
					var tItem = new Tech();
					reqPanel.add(tItem);
					System.out.println(req.getText());
					reqPanel.repaint();
					fields.repaint();
					
					req.setText("");
				}
				addPage.repaint();
			}});
		
		
		reqPanel.add(req);
		//reqPanel.add(techArr);
		fields.add(reqPanel);
		
		
		JPanel nthPanel = new JPanel();
		nthPanel.setLayout(fln);
		JLabel niceToH = new JLabel("   Nice to have    ");
		nthPanel.add(niceToH);
		JTextField nToH = new JTextField(30);
		
		nToH.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (nToH.getText() == "") {
					
				}else if (nToH.getText() != "") {
					System.out.println(nToH.getText());
					nToH.setText("");
				}
				
			}});

		nthPanel.add(nToH);
		fields.add(nthPanel);
		
		//var scrollPane2 = new JScrollPane(fields);
		
		
		
		
		JPanel addButtPane = new JPanel();
		FlowLayout addB = new FlowLayout();
		addButtPane.setLayout(addB);

		JButton Add = new JButton("   Add   ");
		addButtPane.add(Add);
		Add.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setID();
				int id = maxId;
				
				String company = "'"+insCompName.getText()+"'";
				
				String position = insPos.getText();
				
				String Date = "'"+yearSelector.getSelectedItem() +"-"
						+ monthConvertation((String)monthSelector.getSelectedItem())+"-"
						+ daySelector.getSelectedItem()+"'";
				
				String Text = insAnnouncement.getText();
				
				System.out.println("OK!" + ""+id+", " + company+", " + position+", " 
									+ Date+"\n" + Text);
				/*try {
					Connection conn= DriverManager.getConnection(url, username, password);
		 			Statement stat = conn.createStatement();
		 			//TODO finish the statement
		 			String command = "INSERT INTO ";
		 			stat.executeUpdate(command);
					
				}catch(SQLException e1) {
					
				}finally {
					
				}*/
			}});
	
		
		
		addPage.add("Center", fields);
		addPage.add("South",addButtPane);
		
		
		JFrame adder = new JFrame("add announcement");
		adder.setContentPane(addPage);
		adder.setSize(700,500);
		adder.setVisible(true);
		adder.setResizable(false);
	
	}
 	
 	public String monthConvertation(String m) {

 		if(m == "jen" ) {
 			m = "01";
 		}else if (m=="feb") {
 			m = "02";
 		}else if (m=="mar") {
 			m="03";
 		}else if (m=="apr") {
 			m="04";
 		}else if (m=="may") {
 			m="05";
 		}else if (m=="jun") {
 			m="06";
 		}else if (m=="jul") {
 			m="07";
 		}else if (m=="aug") {
 			m="08";
 		}else if (m=="sep") {
 			m="09";
 		}else if (m=="oct") {
 			m="10";
 		}else if (m=="nov") {
 			m="11";
 		}else if (m=="dec") {
 			m="12";
 		}
		return m;
 	}
 	
 	public static void setID() {
 		try {
			conn= DriverManager.getConnection(url, username, password);
			
			stat = conn.createStatement();
			String command = "SELECT MAX(id) FROM announcement;";
			rs = stat.executeQuery(command);
			while(rs.next()) {
				
				int lastId = rs.getInt(1);
				
				if(lastId == 0){
					maxId = -2000000000;
				}else {
					maxId=lastId+1;
				}
				
			}
		}catch(SQLException e) {
			JOptionPane.showConfirmDialog(null, 
					"An Error of DataBase connection ", "occured!",
					JOptionPane.PLAIN_MESSAGE);
		}finally {
			try {
				rs.close();
				stat.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
 	}

}
