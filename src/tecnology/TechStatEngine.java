package tecnology;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TechStatEngine implements ActionListener, ItemListener{

	
	public void actionPerformed(ActionEvent e) {
		
		JButton addTechButton = (JButton) e.getSource();
		String addTechButtonLabel = addTechButton.getText();
		
		if(addTechButtonLabel == "+add_Tech") {
			AdderOfTechnology addTechWindow = new AdderOfTechnology();
			
		}else if(addTechButtonLabel == "") {
			
		}
		
	}

	
	public void itemStateChanged(ItemEvent e) {
		Object stFilter1 = e.getItem();
		JComboBox filterLabel = (JComboBox)stFilter1;
		String filter_command = (String)filterLabel.getSelectedItem();
		if (filter_command == "");
		
		
		
	}
	
	

}
