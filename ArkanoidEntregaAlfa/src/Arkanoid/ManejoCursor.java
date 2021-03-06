package Arkanoid;

/*
 * Autor: Guillermo Blasco
 * 
 * Esta clase se encarga de todo lo referido
 * al manejo del rat�n
 * 
 */

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.program.*;
import acm.graphics.*;

public class ManejoCursor extends GraphicsProgram{
	private static int ANCHO_PANTALLA=520;
	private static int ALTO_PANTALLA=680;
	private static int ANCHO_CURSOR= 60;
	
	
	
GRect cursor;
	
	public void init() {
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
		cursor = new GRect(ANCHO_CURSOR, 10);
		cursor.setFilled(true);
		cursor.setFillColor(Color.BLUE);
		add(cursor, 0, ALTO_PANTALLA - 100);
		
		//digo que voy a utilizar el rat�n
				addMouseListeners();
	}
	

	
	
	
	//mueve el cursor siguiendo la posici�n del rat�n
		public void mouseMoved (MouseEvent evento){
			if( (evento.getX()+ANCHO_CURSOR) <= ANCHO_PANTALLA){
				cursor.setLocation(evento.getX(),ALTO_PANTALLA-100);
			}
		}
	
	
	
	
}
