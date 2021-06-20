package VentanaColor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventanaColor extends JFrame {
	private JPanel panel;
	private JLabel titulo ;
	private Color colorVentana;
	public ventanaColor(Color colorVentana) {
		setBounds(25, 25, 250, 250);
		setTitle("Ventana de color" +colorVentana.toString());
		this.colorVentana = colorVentana;
		
		iniciarComponentes();
		
		
	}
	public void iniciarComponentes() {
		agregarPanel();
		this.titulo = new JLabel("Color");
		this.titulo.setForeground(colorVentana);
		this.titulo.setFont(new Font("Calibri", Font.BOLD, 50));
		panel.add(titulo);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setVerticalAlignment(JLabel.CENTER);
		
		
	
	}
	private void agregarPanel() {
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		this.add(panel);
	}


}
