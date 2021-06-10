package announce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class AnnouncementEngine implements ActionListener{
	
	

	public void actionPerformed(ActionEvent e) {
		
		//Date today = new Date();
		
		JButton AnnButton = (JButton) e.getSource();
		String AnnButtonLabel = AnnButton.getText();
		
		if (AnnButtonLabel == "CV Gen") {
			
		} else if (AnnButtonLabel == "Settings"){
			//TODO check action listener of header settings
			JOptionPane.showConfirmDialog(null, 
					"Something Happened", "Just a test", 
					JOptionPane.PLAIN_MESSAGE);
		}else if (AnnButtonLabel =="LinkedIn") {
			
		}else if (AnnButtonLabel =="Email") {
			
		}else if(AnnButtonLabel =="+ add") {
			//AdderOfAnnEngine addAnnEng = new AdderOfAnnEngine();
			AdderOfAnn addAnnWindow = new AdderOfAnn();
			//addAnnEng.setAdderOfAnn(addAnnWindow);
			
		}
		
		
		
		
		
		
	}

}
