package ViewBy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyListenerDays implements ActionListener{
	
	private final static String EMPTYSTR= " ";
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JComboBox<String> combo = (JComboBox<String>) e.getSource();
		if(!combo.getSelectedItem().toString().equals(EMPTYSTR)){
			new ViewByDay(combo.getSelectedItem().toString());
		}
	}
}