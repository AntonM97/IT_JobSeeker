package announce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class AnnFilterEngine implements ActionListener, ItemListener{
	/*
	GUI_main parent;
	
	//Add Date Vatiable
	//Add int variable
	
	
	AnnFilterEngine(GUI_main parent){
		this.parent=parent;
	}
	*/
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		Object eventSource = e.getSource();
		
		JTextField positionSearch = null;
		if (eventSource instanceof JTextField) {
			positionSearch = (JTextField) eventSource;
			
		}else if (eventSource instanceof JComboBox){
			
		}	
		
			
	}



	
	public void itemStateChanged(ItemEvent e) {
		
		JComboBox eventSource = (JComboBox)e.getSource();
		String filter1 = (String)eventSource.getSelectedItem();
		JOptionPane.showConfirmDialog(null, 
				"Something Happened" +filter1, "Just a test", 
				JOptionPane.PLAIN_MESSAGE);
		
		
		JComboBox eventSource2 = (JComboBox)e.getSource();
		String filter2 = (String)eventSource2.getSelectedItem();
		JOptionPane.showConfirmDialog(null, 
				"Something Happened" +filter2, "Just a test", 
				JOptionPane.PLAIN_MESSAGE);
		
		
		if (eventSource instanceof JComboBox) {
			
		}
		
		
	}
}
