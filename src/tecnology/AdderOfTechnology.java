package tecnology;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AdderOfTechnology extends JFrame{
	
	public AdderOfTechnology() {

	JPanel techAddPane = new JPanel();
	FlowLayout fl8 = new FlowLayout();
	techAddPane.setLayout(fl8);
	
	JLabel techNameLabel = new JLabel("Name of technology");
	techAddPane.add(techNameLabel);
	JTextField techInputName = new JTextField(30);
	techAddPane.add(techInputName);
	
	
	JPanel radioButtonsPane = new JPanel();
	radioButtonsPane.setLayout(fl8);
	ButtonGroup group = new ButtonGroup();
	JRadioButton learnedRButt = new JRadioButton("learned");
	JRadioButton notLearnedRButt = new JRadioButton("not Learned");
	group.add(notLearnedRButt);
	group.add(learnedRButt);
	radioButtonsPane.add(notLearnedRButt);
	radioButtonsPane.add(learnedRButt);
	
	
	JPanel saveButtPanel = new JPanel();
	saveButtPanel.setLayout(fl8);
	JButton saveButton = new JButton("SAVE");
	saveButtPanel.add(saveButton);
	
	
	JPanel mainAddTechPane = new JPanel();
	GridLayout table = new GridLayout(3,1);
	mainAddTechPane.setLayout(table);
	mainAddTechPane.add(techAddPane);
	mainAddTechPane.add(radioButtonsPane);
	mainAddTechPane.add(saveButtPanel);
	
	
	JFrame techAdder = new JFrame("add technology");
	techAdder.setContentPane(mainAddTechPane);
	techAdder.setSize(400, 200);
	techAdder.setVisible(true);
	techAdder.setResizable(false);
	
	}

}
