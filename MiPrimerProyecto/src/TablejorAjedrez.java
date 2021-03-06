import acm.program.*;
import acm.graphics.*;

/*
 * La clase TableroAjedrez dibuja un tablero de ajedrez en un GraphicsProgram
 * 
 * Definimos tres constantes al inicio de la clase, que nos permiten modificar f�cimlente varios par�metros
 * N_FILAS almacenar� el n�mero de filas
 * N_COLUMNAS almacenar� el n�mero de columnas
 * TAMANIO_CASILLA almacenar� el tama�o en pixels de caa casilla del tablero (nunca utilizar "�" o "tildes")
 * 
 * Usaremos dos bucles "for" anidados para pintar una a una las columas del tablero
 * 
 * Recuerda utilizar el debugger para ver el valor de cada variable en cada pasada de los bucles y
 * entender mejor qu� est� haciendo el programa.
 */

public class TablejorAjedrez extends acm.program.GraphicsProgram{
	//static sirve para declarar constantes, siempre se utiliza private, y luego poner el tipo de cte
	//que hay (numeros, palabras...); para los N� Enteros se usa el int
	//private static (tipo) (nombre de la constante) = (valor de la constante)
	private static int N_FILAS = 8; //Las constantes siempre se ponen en MAY�SCULAS
	private static int N_COLUMNAS = 8;
	private static int TAMANIO_CASILLA = 30;

	public void run() {
		//Creo un bucle for para crear las columnas
		for(int j=0; j< N_COLUMNAS; j++) {
			//Creo otro bucle for, para crear las filas
			for(int i=0; i< N_FILAS; i++) {
				//defino la casilla
				GRect casilla = new GRect(TAMANIO_CASILLA, TAMANIO_CASILLA);
				if( (i+j)%2 == 1) {
					casilla.setFilled(true);
				}
				casilla.setLocation(i*TAMANIO_CASILLA, j*TAMANIO_CASILLA);
				//A�ade la Casilla
				add(casilla);
				pause(10);
			}
		}
	}

}
