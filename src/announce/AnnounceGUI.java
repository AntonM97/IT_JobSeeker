package announce;

import java.awt.*;
import javax.swing.*;

public class AnnounceGUI {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			var frame = new AnnounceGUIexample();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class AnnounceGUIexample extends JFrame{
		
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 400;
	
	
	//Makes window with changeable size
	public boolean  isResizable() {
		return true;
	}
	public void setResizable(boolean resiza‹le) {
		
	}
	
	String windowTitle = "IT_JobSeeker";
	public String getTitle() {
		return windowTitle;
	}
	public String  setTitle () {
		return windowTitle;
	} 
	
	
	public AnnounceGUIexample () {
		setSize (DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}