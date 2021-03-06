/*
 * Autor: Guillermo Blasco
 * 
 * En esta Clase Karel dibuja una cruz, siendo
 * el beeper inicial el centro de dicha cruz
 */
public class CruzCompleta extends KarelMejorada{
	
	public void run() {
		
		//1. Karel avanza buscando el beeper.
		while(noBeepersPresent()) {
		encuentraBeeper();
		}
		
		//2. Karel dibuja la cruz.
		dibujaCruz();
		
		//3. Karel vuelve a su posici�n inicial.
		vuelveAlInicio();
	}
	
	/**
	 * Este M�todo hace que Karel avance por el mapa hasta llegar al beeper
	 */
	private void encuentraBeeper() {
		
		//1. Mientras Karel est� mirando hacia el Este, no haya ning�n muro en
		//su camino, y no haya beeper en su posici�n, avanza.
		while(frontIsClear() && facingEast() && noBeepersPresent()) {
			move();
			
			//2. Al lleagr al Muro, Karel gira a la izquierda para mirar al Norte
			if(frontIsBlocked() && facingEast()) {
			turnLeft();
			}
			
			//3. A continuaci�n, Karel avanza 1 posici�n y gira a la izquierda
			//para terminar mirando hacia el Oeste
			if(frontIsClear() && facingNorth()) {
				move();
				turnLeft();
			}
		}
		
		//4. Mientras Karel est� mirando hacia el Oeste, no haya ning�n muro en
		//su camino, y no haya beeper en su posici�n, avanza.
		while(frontIsClear() && facingWest() && noBeepersPresent()) {
			move();
			
			//5. Al lleagr al Muro, Karel gira a la derecha para mirar al Norte
			if(frontIsBlocked() && facingWest()) {
				turnRight();
			}
			
			//6. Por �litmo, Karel avanza 1 posici�n y gira a la derecha
			//para terminar mirando hacia el Este
			if(frontIsClear() && facingNorth()) {
				move();
				turnRight();
			}
		}
	}
	
	/**
	 * Este M�todo Dibuja la Cruz
	 */
	private void dibujaCruz() {
		
		//1. Dibuja el lado de la cruz que va desde el beeper original
		//hasta el suelo
		dibujaPrimerLado();
		
		//2. Dibuja el lado de la cruz que va desde el beeper original
		//hasta la pared de la derecha
		dibujaSegundoLado();
		
		//3. Dibuja el lado de la cruz que va desde el beeper original
		//hasta el techo
		dibujaTercerLado();
		
		//4. Dibuja el lado de la cruz que va desde el beeper original
		//hasta la pared de la izquierda
		dibujaCuartoLado();
	}
	
	/**
	 * Este M�todo dibuja el Primer Lado de la Cruz
	 */
	private void dibujaPrimerLado() {
		
		//1. Karel Gira a la izquierda para mirar hacia el suelo
		turnLeft();
		
		//2. Karel Avanza poniendo beepers hasta llegar al suelo
		while(frontIsClear()) {
			move();
			putBeeper();
		}
		
		//3. karel da la Vuelta
		turnAround();
		
		//4. Karel Vuelve por donde vino, hasta llegar al primer beeper.
		while(frontIsClear() && beepersPresent()) {
			move();
		}
	}
	
	/**
	 * Este M�todo dibuja el Segundo Lado de la Cruz
	 */
	private void dibujaSegundoLado() {
		
		//1. Estando Karel encima del Beeper Original, da la vuelta y
		//avanza una posici�n, situandose encima del beeper original
		if(noBeepersPresent()) {
			turnAround();
			move();
		}
		
		//2. Karel gira a la izquierda para mirar hacia el Este
		turnLeft();
		
		//3. Karel Avanza poniendo beepers hasta llega al muro de la derecha
		while(frontIsClear()) {
			move();
			putBeeper();
		}
		
		//4. Karel da la vuelta
		turnAround();
		
		//5. Karel vuelve por el lado que acaba de dibujar
		//hasta llegar al beeper Original
		while(frontIsClear() && beepersPresent()) {
			move();
		}
	}
	
	/**
	 * Este M�todo dibuja el Tercer Lado de la Cruz
	 */
	private void dibujaTercerLado() {
		
		//1. Karel da la vuelta
		turnAround();
		
		//2. Karel avanza hasta situarse encima del Beeper inicial
		if(noBeepersPresent()) {
			move();
		}
		
		//3. Karel toma prestado el Beeper Inicial.
		if(beepersPresent()){
			pickBeeper();
		}
		
		//4. Karel gira a la izquierda para mirar hacia el Norte
		turnLeft();
		
		//5. Karel avanza poniendo beepers hasta llegar a la pared superior
		while(frontIsClear()) {
			move();
			putBeeper();
		}
		
		//6. Karel da la vuelta para mirar hacia el Sur
		turnAround();
		
		//7. Karel Vuelve por el lado que acaba de dibujar, hasta llegar
		//a la posici�n del beeper inicial
		while(beepersPresent()) {
			move();
		}
		
		//8. Devuleve el beeper inicial, que Karel hab�a tomado prestado
		putBeeper();
	}
	
	/**
	 * �ste M�todo dibuja el cuarto lado de la Cruz
	 */
	private void dibujaCuartoLado() {
		
		//1. Karel gira a la derecha para mirar hacia el Oeste
		turnRight();
		
		//2. Karel avanza poniendo beepers hasta llegar a la pared de la izquierda
		while(frontIsClear()) {
			move();
			putBeeper();
		}
		
	}
	
	/**
	 * Este M�todo lleva a Karel a su posici�n Inicial
	 */
	private void vuelveAlInicio() {
		
		//1. Karel gira a la izquierda para mirar hacia el Sur
		turnLeft();
		
		//2. Karel avanza hasta llegar al suelo
		while(frontIsClear()) {
			move();
		}
		
		//3. Karel gira a la izquierda para situarse en su posicion inicial
		turnLeft();
	}
}
