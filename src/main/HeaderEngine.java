package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class HeaderEngine implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		JButton supremeButton = (JButton) e.getSource();
		
		String supremeButtonLabel = supremeButton.getText();
		
		JOptionPane.showConfirmDialog(null, 
				"Something Happened " +supremeButtonLabel, "Just a test", 
				JOptionPane.PLAIN_MESSAGE);
		
	}
}
