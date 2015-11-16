import acm.program.*;
public class EjerciciosBasicos extends ConsoleProgram{
	
	public boolean fiestaArdilla(int bellotas, boolean festivo) {
		if(festivo) {
			return true;
		}
		
		if(bellotas >= 40 && bellotas <=60){
			return true;
		}
		return false;
	}
	
	public void run() {
		println(fiestaArdilla(40, false));
		println(fiestaArdilla(60, false));
		println(fiestaArdilla(60, true));
	}
}
