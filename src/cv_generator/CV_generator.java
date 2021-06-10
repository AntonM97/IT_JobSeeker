package cv_generator;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CV_generator extends JPanel{
	public CV_generator() {
	
		FlowLayout bl1_2 = new FlowLayout();
		setLayout(bl1_2);
	
		Border listSeparator = BorderFactory.createEtchedBorder();
		this.setBorder(listSeparator);
		
		CV_GenEngine cvGenButtonListener = new CV_GenEngine();
		
		JButton cvGenerator = new JButton ("CV Gen");
		cvGenerator.addActionListener(cvGenButtonListener);
		
		add("North",cvGenerator);
	
	}
	

}
