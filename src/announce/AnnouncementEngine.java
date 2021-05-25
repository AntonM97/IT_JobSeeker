package announce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class AnnouncementEngine implements ActionListener{
	
	

	public void actionPerformed(ActionEvent e) {
		
		Date today = new Date();
		
		
		
		
		JButton AnnButton = (JButton) e.getSource();
		
		String AnnButtonLabel = AnnButton.getText();
		
		if (AnnButtonLabel == "CV Gen") {
			JOptionPane.showConfirmDialog(null, 
					"Unfortunately this functionality is reserved for future features", "Warning", 
					JOptionPane.PLAIN_MESSAGE);
		} else if (AnnButtonLabel == "Settings"){
			JOptionPane.showConfirmDialog(null, 
					"Something Happened", "Just a test", 
					JOptionPane.PLAIN_MESSAGE);
		}else if (AnnButtonLabel =="LinkedIn") {
			
		}else if (AnnButtonLabel =="Email") {
			
		}else if(AnnButtonLabel =="+ add") {
			AdderOfAnn addAnnWindow = new AdderOfAnn();
		}
		
		
		
		
		
		
	}

}
