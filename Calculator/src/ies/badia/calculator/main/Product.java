/**
 * Clase Estatica que recibe dos Strings como parametro
 * Las convierte a enteros y nos da su producto
 * 
 */
package ies.badia.calculator.main;

/**
 * @author Francisco Jos� Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Product {
	
	
	public static int result(String op1,String op2) {
		int o1=Integer.parseInt(op1);
		int o2=Integer.parseInt(op2);
		
		return o1*o2;
		
	}

}
