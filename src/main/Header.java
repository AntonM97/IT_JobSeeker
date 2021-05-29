package main;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Header extends JPanel{
	public Header(){
		HeaderEngine headEng = new HeaderEngine();
		
		
		
		FlowLayout bl = new FlowLayout ();
		setLayout(bl);//Instantiation of Layout
		
		JButton linkLinkedIn = new JButton ("LinkedIn");//TODO set icons instead of words and put small size;
		linkLinkedIn.addActionListener(headEng);
		add("North", linkLinkedIn);
		
		JButton checkMail = new JButton("Email");//TODO set icons instead of words and put small size;
		checkMail.addActionListener(headEng);
		add("North", checkMail);
		
		JButton settings = new JButton ("Settings"); //TODO set icons instead of words and put small size;
		settings.addActionListener(headEng);
		add("North", settings);
	}
}
