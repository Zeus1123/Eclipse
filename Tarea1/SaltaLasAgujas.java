/*
 * Autor: Guillermo Blasco
 * 
 * En esta Clase, Karel se va a encontrar con una serie de "Agujas" y su misi�n
 * es: Subir la aguja, "saltarla", y bajar por el otro lado de la aguja, terminando
 * saltando todas las agujas, y parandose en la esquina inferior derecha.
 */
public class SaltaLasAgujas extends KarelMejorada{

	public void run() {
		//Siempre que Karel est� mirando al Este
		while(facingEast()) {
			//1. Avanza hasta encontrar una aguja y la sube
			subeAguja();

			//2. Baja por el otro lado de la aguja
			bajaAguja();
		}

		//3. Karel avanza hasta la posici�n final
		termina();

	}

	/**
	 * �ste metodo supone que karel est� mirando hacia el Este
	 * y tiene un muro delante
	 */
	private void subeAguja() {
		// 1. Siempre que Karel est� mirando al Este, y no haya ningun muro delante
		// Karel Avanza hasta encontrarse con un muro
		while(frontIsClear() && facingEast()) {
			move();
		}

		//2. Karel gira a la izquierda para quedarse mirando al Norte
		turnLeft();

		//3. Karel avanza hasta llegar a lo alto de la Aguja.
		while(facingNorth() && rightIsBlocked() && frontIsClear()) {

			move();

		}

		//4. Karel gira a la derecha para quedar mirando al Este
		if(facingNorth() && rightIsClear()) {
			turnRight();
		}

		//5. Karel Salta la Aguja
		if(frontIsClear() && facingEast()) {
			move();
		}
	}

	/**
	 * �ste M�todo supone que Karel ha saltado la aguja y
	 * est� mirando hacia el Sur
	 */
	private void bajaAguja() {
		//1. Karel gira a la derecha para mirar hacia el Suelo
		if(facingEast()) {
			turnRight();
		}

		//2. Karel avanza hasta llegar al Suelo
		while(facingSouth() && frontIsClear()) {
			move();
		}

		//3. Karel gira a la izquierda para mirar hacia el Este
		if(facingSouth() && frontIsBlocked()) {
			turnLeft();
		}
	}

	/**
	 * Este m�todo supone que Karel se encuentra en la esquina superior derecha.
	 * Karel da la vuelta, avanza hasta el suelo, y se queda mirando hacia el Este
	 */
	private void termina() {
		//1. Karel Da la vuleta para mirar hacia el suelo
		turnAround();

		//2. Karel Avanza hasta llegar al suelo
		while(frontIsClear()) {
			move();
		}

		//3. Karel gira a la izquierda para terminar mirando al este
		turnLeft();
	}
}
