package Aspecto;

public aspect Observer {
	
	pointcut colorChangeRed(): call(* setBackGroundRed(..));
	
	after() : colorChangeRed() {
		System.out.println("**** SE HA CAMBIADO EL COLOR DE LA VENTANA A ROJO ****");
	} 
	
	
	pointcut colorChangeYellow(): call(* setBackGroundYellow(..));
	
	after() : colorChangeYellow() {
		System.out.println("**** SE HA CAMBIADO EL COLOR DE LA VENTANA A AMARILLO **** ");
	}
	
	pointcut colorChangeBlue(): call(* setBackGroundBlue(..));
	
	after() : colorChangeBlue() {
		System.out.println("**** SE HA CAMBIADO EL COLOR DE LA VENTANA A AZUL ****");
	}

	
}
