import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentanaGrilla extends JFrame {
	

	public MiVentanaGrilla() {
		super("Titulo de ventana");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		//cp.setLayout(new FlowLayout());
		
		GridLayout gl = new GridLayout(4, 3);
		gl.setHgap(5);
		gl.setVgap(5);
		cp.setLayout(gl);
		for (int i = 1; i <= 9; i++) {
			cp.add(new JButton(String.valueOf(i)));
		}
		
		cp.add(new JButton("*"));
		cp.add(new JButton("0"));
		cp.add(new JButton("#"));
		
		setVisible(true);
		
	
	}
}