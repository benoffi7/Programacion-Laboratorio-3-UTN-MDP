import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventoPulsadoDos implements ActionListener
{
	JTextField miCajaDeTexto;
	
	public EventoPulsadoDos(JTextField CajaDeTexto) 
	{
		miCajaDeTexto = CajaDeTexto;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "¡Hola, " +miCajaDeTexto.getText() + "!");
		
		/*
		 * ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, or PLAIN_MESSAGE
		 */
		
		JOptionPane.showMessageDialog(null, "Mensaje","titulo",JOptionPane.ERROR_MESSAGE);
		
		String resultado = JOptionPane.showInputDialog(null,  "Ingrese nombre", "Gonzalo");
		
		System.out.println(resultado);

		int rta = JOptionPane.showConfirmDialog(null, "Aprobara esta materia?", "Titulo", JOptionPane.INFORMATION_MESSAGE);
		
		if (rta == JOptionPane.OK_OPTION)
		{
			System.out.println("Si!");
		}
		else if (rta == JOptionPane.NO_OPTION)
		{
			System.out.println("No :(");
		}
	}
}
