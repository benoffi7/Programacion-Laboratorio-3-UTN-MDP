import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MiVentana extends JFrame {
	public MiVentana() {
		super("Titulo de ventana");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JLabel etiqueta = new JLabel("Nombre: ");
		JTextField texto = new JTextField(20);
		JButton boton = new JButton("Saludar");
		cp.add(etiqueta);
		cp.add(texto);
		cp.add(boton);
		
		boton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("¡Hola!");
			}
		});
		
		boton.addActionListener(new EventoBotonPulsado());
		
		boton.addActionListener(new EventoPulsadoDos(texto));
		
		texto.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("removeUpdate");
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				
				System.out.println("insertUpdate");
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) 
			{
				System.out.println("changedUpdate");
				
			}
		});
	}
}