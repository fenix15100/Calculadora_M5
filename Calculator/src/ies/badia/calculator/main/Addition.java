/**
 * Clase Estatica que recibe dos Strings como parametro
 * Las convierte a enteros y los suma
 * 
 */
package ies.badia.calculator.main;

/**
 * @author Francisco Jos� Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Addition {
	
	
	public static int result(String op1,String op2) {
		
		int o1=0;
		int o2=0;
		
		try {
		o1=Integer.parseInt(op1);
		o2=Integer.parseInt(op2);
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		return o1+o2;
		
	}

}
