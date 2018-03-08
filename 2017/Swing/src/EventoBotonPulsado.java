import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventoBotonPulsado implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		boton.setText("¡Gracias!");
	}
}