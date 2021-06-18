package VentanaColor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	private JPanel panel;
	private JButton botonRojo;
	private JButton botonAmarillo;
	private JButton botonAzul;
	
	public Ventana() {
		setBounds(50, 50, 500, 500);
		setTitle("Ventana de colores");
		
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		agregarPanel();
		agregarBotones();
		
	}
	
	
	ActionListener al = new ActionListener(){  
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==botonRojo){
				panel.setBackground(Color.red);
			} else if(e.getSource()==botonAmarillo){
				panel.setBackground(Color.yellow);
			} else if(e.getSource()==botonAzul){
				panel.setBackground(Color.blue);
			}
			
		}  
		}; 
	
	
	private void agregarBotones() {
		// TODO Auto-generated method stub
		botonRojo = new JButton("Rojo");
		panel.add(botonRojo);
		botonAmarillo = new JButton("Amarillo");
		panel.add(botonAmarillo);
		botonAzul = new JButton("Azul");
		panel.add(botonAzul);
		botonRojo.setBounds(150, 100, 150, 40);
		botonRojo.setBackground(Color.red);
		botonAmarillo.setBounds(150, 200, 150, 40);
		botonAmarillo.setBackground(Color.yellow);
		botonAzul.setBounds(150, 300, 150, 40);
		botonAzul.setBackground(Color.blue);
		botonRojo.addActionListener(al);
		botonAmarillo.addActionListener(al);
		botonAzul.addActionListener(al);
		
		/*botonRojo.addActionListener(new ActionListener() {  
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.red);
			}  
     }); */
		
		/*botonAmarillo.addActionListener(new ActionListener() {  
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.yellow);
			}  
     }); */
		
		/*botonAzul.addActionListener(new ActionListener() {  
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.blue);
			}  
     }); */
				
		
	}

	private void agregarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
	}

	public JButton getBotonRojo() {
		return botonRojo;
	}

	
	public JButton getBotonAmarillo() {
		return botonAmarillo;
	}

	
	public JButton getBotonAzul() {
		return botonAzul;
	}	
	

}