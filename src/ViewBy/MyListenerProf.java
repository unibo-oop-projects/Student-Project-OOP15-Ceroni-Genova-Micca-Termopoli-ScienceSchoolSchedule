package ViewBy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

/**
 * The class implements ActionListener and override the actionPerformed method
 * that calls the frame ViewByProf
 * 
 * @author Galya Genova
 *
 */
public class MyListenerProf implements ActionListener {

	private final static String EMPTYSTR = " ";

	@Override
	public void actionPerformed(ActionEvent e) {

		@SuppressWarnings("unchecked")
		JComboBox<String> combo = (JComboBox<String>) e.getSource();
		if (!combo.getSelectedItem().equals(EMPTYSTR)) {
			new ViewByProf(combo.getSelectedItem().toString());
		}
	}

}
