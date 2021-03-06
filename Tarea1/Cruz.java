/*
 * Autor: Guillermo Blasco
 * 
 * En esta Clase Karel va ha dibujar un �ngulo Recto, siendo
 * el Beeper Inicial, el V�rtice de dicho �ngulo
 */
public class Cruz extends KarelMejorada{
	
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
		
		//2. Dibuja el lado de la cruz qeu va desde el beeper original
		//hasta la pared de la derecha
		dibujaSegundoLado();
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
	}
	
	/**
	 * Este M�todo lleva a Karel a su posici�n Inicial
	 */
	private void vuelveAlInicio() {
		//1. Karel gira a la derecha para mirar hacia el Sur
		turnRight();
		
		//2. Karel avanza hasta llegar al suelo
		while(frontIsClear()) {
			move();
		}
		
		//3. Karel gira a la derecha para mirar hacia el Oete
		turnRight();
		
		//4. Karel avanza hasta llegar al muro de la izquierda
		while(frontIsClear()) {
			move();
		}
		
		//5. Karel se da la vuelta, para colocarse en su posici�n inicial
		turnAround();
	}
	
}
