/**
 * Clase Estatica que recibe dos Strings como parametro
 * Las convierte a enteros y nos da su producto
 * 
 */
package ies.badia.calculator.main;

/**
 * @author Francisco José Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Product {
	
	/**
	 * 
	 * @param op1
	 * Primer operador
	 * @param op2
	 * Segundo operador
	 * @return 
	 * El Producto de @param op1 y @param op2
	 */
	public static int result(String op1,String op2) {
		int o1=Integer.parseInt(op1);
		int o2=Integer.parseInt(op2);
		int result=0;
		
		for(int i=0;i<o2;i++) {
			result+=o1;
			
		}
		
		return result;
		
	}

}
