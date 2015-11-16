import acm.program.*;
public class EjerciciosBasicos extends ConsoleProgram{
	
/*	
 * A1) Cuando las ardillas se re�nen para una fiesta, les gusta tener bellotas.
 *	Una fiesta de ardillas tiene �xito cuando el n�mero de bellotas es de entre 40 y 60,
 *	ambos inclusive. A menos que sea el fin de semana, en cuyo caso no hay liminte de bellotas.
 *	
 *	Crea una funci�n llamada fiesta Ardillas qeu reciba como par� metro el n�mero de
 *	bellotas y si es fin de semaa o no, y que devuelva true si la fiesta con los valores
 *	dados tieen �xito, o false en caso contrario.
*/	
	
	public boolean fiestaArdilla(int bellotas, boolean festivo) {
		if(festivo) {
			return true;
		}
		
		if(bellotas >= 40 && bellotas <=60){
			return true;
		}
		return false;
	}
	
/*
 * A2) Est�s conduciendo demasiado r�pido, y un polic�a te detiene. Escribir el c�digo
 * para calcular el resultado, codificado como un valor int:
 * 0 = sin multa,
 * 1 = multa peque�a,
 * 2 = multa grande.
 * 
 * Si la velocidad es de 60 o menos, el resultado es 0
 * Si la velocidad es de entre 61 y 80 inclusive, el resultado es 1
 * Si la velocidad es 81 o m�s, el resultado es 2
 * 
 * a menos que sea tu cumplea�os: en ese d�a, tu velocidad puede ser 5 puntos
 * superior en todos los casos.
 * 
 * Crea una funci�n llamada multa que reciba como par� metro la velociad del coche
 * y si es tu cumplea�os o no, y que devuelva el valor correspondiente.
 */
	
	public int multa(int velocidad, boolean cumplea�os) {
		if(velocidad <= 60 && !cumplea�os) {
		return 0;
		}
		
		if(velocidad<= 65 && cumplea�os) {
			return 0;
		}
		
		if(velocidad >= 61 && velocidad <= 80 && !cumplea�os) {
			return 1;
		}
		
		if(velocidad >= 66 && velocidad <= 85 && cumplea�os) {
			return 1;
		}
		
		
		return 2;
	}
	
	public void run() {
		println(multa(60, false));
		println(multa(65, true));
		println(multa(85, true));
	}
}
