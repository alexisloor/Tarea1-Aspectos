package VentanaColor;
import java.awt.Color;

import org.aspectj.lang.JoinPoint;
public aspect Observer {
	public pointcut colorCambio(Color nuevoColor):
		call (* setBackgroundPanel(Color)) && args(nuevoColor);
	
	/*void around(Color nuevoColors) : colorCambio(nuevoColors){
		System.out.println(nuevoColors.toString());
		
	}*/
	
	 after(Color Color): colorCambio(Color) {
		System.out.println(Color.toString());
			
	}
	 
	
	
	

}
