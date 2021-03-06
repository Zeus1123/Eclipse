
public class EspiralKarel extends KarelMejorada{
	
	public void run() {
		
		while(frontIsClear()) {
		//Avanzar al Este y poner beepers alternados
		avanzaEste();
		
		//Avanzar al Norte y poner beepers alternados
		avanzaNorte();
		
		//Avanzar al Oeste y poner beepers alternados
		avanzaOeste();
		
		//Avanzar al Sur y poner beepers alternados
		avanzaSur();
	}
	}
	
	private void avanzaEste() {
		
		if(beepersPresent()) {
			move();
			turnLeft();
			move();
			turnRight();
		}
		
		while(facingEast() && frontIsClear() && noBeepersPresent()) {
			putBeeper();
			move();
		}
		turnLeft();
	}
	
	private void avanzaNorte() {
		
		if(beepersPresent()) {
			turnLeft();
			move();
			turnRight();		}
		while(facingNorth() && frontIsClear() && noBeepersPresent()) {
			putBeeper();
			move();
		}
		turnLeft();
	}
	
	private void avanzaOeste() {
		while(facingWest() && frontIsClear() && noBeepersPresent()) {
			putBeeper();
			move();
		}
		turnLeft();
	}
	
	private void avanzaSur() {
		while(facingSouth() && frontIsClear() && noBeepersPresent()) {
			putBeeper();
			move();
		}
		turnLeft();
	}

}
