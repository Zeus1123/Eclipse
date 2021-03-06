import javax.swing.*;
import acm.program.*;
/*
 * Esta Clase, es la clase principal, es la que abre el juego
 * y todos los c�digos
 */

public class Main extends GraphicsProgram{
	public static JFrame frame;
	public static Game game;
	

	public static void main(String[] args) {
		//Defino el tama�o de la ventana principal y la centro para q al abrir
		//el juego aparezca siempre centrada
		
		frame = new JFrame("Prueba");
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		
		//Defino la ventana del juego, q esta inculida en la ventana principal
		game = new Game(frame);
		game.setSize(frame.getSize());
		frame.add(game);

		//Hago que el juego se vea
		frame.setVisible(true);
	
	}
}
