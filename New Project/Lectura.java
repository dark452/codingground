/*
 * Lectura.java
 *
 * Created on 3 de septiembre de 2006, 05:46 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package problema_clases;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Lectura {
    /**
	 *
	 * @return String
	 * @throws IOException
	 */
	
	public static String getString() throws IOException{
		// Se captura el token leido como un String
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		String s = br.readLine();
		// El token capturado se retorna
		return s;
	}

	/**
	 * 
	 * y lo retorna 
	 * @return int
	 * @throws IOException
	 */
	
	public static int getInt() throws IOException{
		// Se captura el token leido como un String
		String s= getString();
		// El token capturado se pasa a Integer y se retorna
		return Integer.parseInt(s);
	}

	/**
	 * Metodo que lee de teclado un valor y retorna
	 * un numero de tipo double
	 * @return double
	 * @throws IOException
	 */
	public static double getDouble() throws IOException{
		// se lee como string
		String data = getString();
		try	{
			// luego se transforma al tipo double
			return Double.parseDouble(data);
		} catch (Exception e) {
			// si ocurre una excepcion  Devuelve 0
			return 0;
		}
	}

	/**
	 * Metodo que lee de teclado un valor y retorna un numero de tipo double
	 * @return
	 * @throws IOException
	 */
	public static double getFloat() throws IOException{
		// se lee como string
		String data = getString();
		try	{
			// luego se transforma
			// al tipo double
			return Float.parseFloat(data);
		} catch (Exception e) {
			// si ocurre una excepcion  Devuelve 0
			return 0;
		}
	}

	/**
	 *
	 * y retorna verdadero si es que logra parsear
	 * @param s
	 * @return boolean
	 */
	
	public static boolean isInt(String s){
		try	{
			
			int i = Integer.parseInt(s);
			// Retorna verdadero si puede pasarse a Integer
			return true;
		} catch (NumberFormatException n) {
			// En caso contrario retorna falso
			return false;
		}
	}

	/**
	 * 
	 * y retorna verdadero si es que logra parsear
	 * @param s
	 * @return boolean
	 */
	public static boolean isDouble(String s) {
		try {
			double i = Double.parseDouble(s);
			// Retorna verdadero si puede pasarse a Integer
			return true;
		} catch (NumberFormatException n) {
			// En caso contrario retorna falso
			return false;
		}
	}
	
	/**
	 * 
	 * y retorna verdadero si es que logra parsear
	 * @param s
	 * @return boolean
	 */
	public static boolean isFloat(String s) {
		try {
			double i = Float.parseFloat(s);
			// Retorna verdadero si puede pasarse a Integer
			return true;
		} catch (NumberFormatException n) {
			// En caso contrario retorna falso
			return false;
		}
	}
    
  
    
}