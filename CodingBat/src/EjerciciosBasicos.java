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

	//	public void run() {
	//		println(multa(60, false));
	//		println(multa(65, true));
	//		println(multa(85, true));
	//	}

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

	//	public void run() {
	//		println(multa(60, false));
	//		println(multa(66, false));
	//		println(multa(86, true));
	//	}

	/**
	 * 	Otro modo de hacerlo
	 *
	 *	public int multa1(int velocidad, boolean cumplea�os) {
	 *		if(cumplea�os) {
	 *			velocidad = velocidad - 5;
	 *		}
	 *		if(velocidad <= 60) {
	 *		return 0;
	 *		}
	 *		
	 *		if(velocidad > 60 && velocidad <= 80) {
	 *			return 1;
	 *		}
	 *		
	 *		else {
	 *			return 2;
	 *		}
	 *	}
	 */

	/*
	 * A3) Diremos que un n�mero es muy vanidoso si se trata de un m�ltiplo de 11 o si
	 * es uno m�s de un m�ltiplo de 11. Devuelve true si el n�mero no negativo dado es
	 * muy vanidoso. (Utiliza el operador "mod" %)
	 */
	public boolean muyVanidoso(int numero) {
		if(numero % 11 == 0 || numero % 11 == 1) {
			return true;
		}

		return false;
	}

	//	public void run() {
	//		println(muyVanidoso(22));
	//		println(muyVanidoso(23));
	//		println(muyVanidoso(24));
	//	}

	/*
	 * A4) Suenea tu m�vil. Crea una funci�n que devuelva true si debe responder.
	 * Normalmente s� contestas, salvo por la ma�ana, que s�lo respondes si es tu madre.
	 * En todos los casos, si est�s dormido, no contesta.
	 */
	public boolean contesta(boolean matinal, boolean madre, boolean dormido) {
		if(dormido) {
			return false;
		}
		else if(matinal && madre) {
			return true;
		}
		if (!matinal) {
			return true;
		}
		return false;
	}


//	public void run() {
//		println(contesta(false, false, false));
//		println(contesta(false, false, true));
//		println(contesta(true, false, false));
//	}
	
	/*
	 * A5) Dados tres enteros, a b c, crea una funci�n que devuelva true si uno de ellos es
	 * 10 menos que uno de los otros.
	 */
	public boolean menorPor10(int a, int b, int c) {
		if(a == b+10 || a == c+10 || b == c+10) {
			return true;
		}
		
		if(b == a+10 || b == c+10) {
			return true;
		}
		
		if(c == a+10 || c == b+10) {
			return true;
		}
		
		return false;
	}
	
//	public void run() {
//		println(menorPor10(1, 7, 11));
//		println(menorPor10(1, 7, 10));
//		println(menorPor10(11, 1, 7));
//	}
	
	/*
	 * A6) Dados dos enteros, cada uno en el rango 10 ... 99. Crea una funci�n que
	 * devuelva true si hay un d�gito que aparece en los dos n�meros, como el 2 en el 12 y
	 * 23 (Nota: la Divisi�n, por ejemplo, n/10, da el d�gito de la inzquiereda, minetras que
	 * el % "mod" n%10 da el d�gito de la derecha).
	 */
	public boolean digitoIgual(int n1, int n2) {
		if(n1/10 == n2/10 || n1/10 == n2 % 10) {
			return true;
		}
		
		if(n1 % 10 == n2/10 || n1 % 10 == n2 % 10) {
			return true;
		}
		return false;
	}
	
//	public void run() {
//		println(digitoIgual(12, 23));
//		println(digitoIgual(12, 43));
//		println(digitoIgual(12, 44));
//	}
	
	/*
	 * A7) Crea una funci�n que devuelva verdadero si un n�mero no negativo dado es un
	 * m�ltiplo de 3 � 5, pero no de ambos. Utiliza el operador "mod" %.
	 */
	public boolean multiploMultiple(int numero) {
		if(numero % 3 == 0 && numero % 5 == 0) {
			return false;
		}
		
		if(numero % 3 == 0 || numero % 5 == 0) {
			return true;
		}
		
		return false;
	}
	
//	public void run() {
//		println(multiploMultiple(3));
//		println(multiploMultiple(10));
//		println(multiploMultiple(15));
//	}
	
	/*
	 * A8) Crea una funci�n que devuelva true si el n�mero dado no tegativo es 1 � 2
	 * menos que un m�ltiplo de 20. As�, por ejemplo, 38 y 39 de retorno es cierto, pero
	 * 40 vuelve falso. Utiliza el operador "mod" %.
	 */
	public boolean menos20(int numero) {
		if(numero % 20 == 19 || numero % 20 == 18) {
			return true;
		}
		
		return false;
	}
	
//	public void run() {
//		println(menos20(18));
//		println(menos20(19));
//		println(menos20(20));
//	}
	
	/*
	 * A9) Tienes un billete de loter�a de color rojo con tres ints a, b y c, cada uno de los
	 * cuales es 0, 1 � 2. Si  son todos el valor 2, el resultado es 10. De lo contrario, si son
	 * todos iguales, el resultado es 5, de lo contrario, siempre que tanto B y C son
	 * diferentes de A, el resultado es 1, de lo contrario el resultado es 0.
	 */
	public int loteria(int a, int b, int c) {
		if(a == 2 && b == 2 && c== 2) {
			return 10;
		}
		
		if(a == b && c== b) {
			return 5;
		}
		
		if(b != a && c != a) {
			return 1;
		}
		
		return 0;
	}
	
	public void run() {
		println(loteria(2, 2, 2));
		println(loteria(2, 2, 1));
		println(loteria(0, 0, 0));
	}
	
	/*
	 * A10) Crea una funci�n que devuelva la suma de dos tiradas de dados de 6 lados,
	 * cada uno en el rango de 1 .. 6. Tienes que tener en cuenta que si el valor booleano
	 * incrementar un dado al siguiente valor.
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
