import javax.swing.*;
import java.awt.*;

public class Prubeba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame ventana = new JFrame("Formulario");
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel formulario = new JPanel(new GridLayout(0, 2, 8, 8));
			formulario.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

			JTextField campoNombre = new JTextField(20);
			JTextField campoCorreo = new JTextField(20);
			JButton botonEnviar = new JButton("Enviar");

			formulario.add(new JLabel("Nombre:"));
			formulario.add(campoNombre);
			formulario.add(new JLabel("Correo electrónico:"));
			formulario.add(campoCorreo);
			formulario.add(new JLabel());
			formulario.add(botonEnviar);

			botonEnviar.addActionListener(evento ->
				JOptionPane.showMessageDialog(ventana, "Formulario enviado.")
			);

			ventana.setContentPane(formulario);
			ventana.pack();
			ventana.setLocationRelativeTo(null);
			ventana.setVisible(true);
		});
	}
}
