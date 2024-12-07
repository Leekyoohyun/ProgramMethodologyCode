package final_2021_2.final_3;

import java.awt.event.*;
import javax.swing.*;

public class MoreButton extends JButton implements ActionListener {
	
	private GugudanFrame frame;
	
	public MoreButton(GugudanFrame f) {
		super("More");
		frame = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.question();
	}

}
