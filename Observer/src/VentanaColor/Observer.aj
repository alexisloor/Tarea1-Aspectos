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
		 System.out.println(">>> Color de fondo: (" + colorString(Color.getRed() , Color.getGreen()  ,Color.getBlue()) + ") <<<");
		 
	}
	
	 after(Color Color): colorCambio(Color) {
			ventanaColor v1 = new ventanaColor(Color);
			v1.setVisible(true);
				
		}
	 public static String colorString(int red, int green , int blue ) {
		 if(red==255 && green==0) {
			 return "Rojo";
		 }else if (blue == 255) {
			 return "Azul";
		 }else {
			 return "amarillo";
		 }
		 
	 }
	
	
	

}
