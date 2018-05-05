/**
 * Clase Estatica que recibe dos Strings como parametro
 * Las convierte a enteros y los resta
 */
package ies.badia.calculator.main;

/**
 * @author Francisco José Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Subtraction {
	
	/**
	 * 
	 * @param op1
	 * Primer operador
	 * @param op2
	 * Segundo operador
	 * @return 
	 * La resta de @param op1 y @param op2
	 */
	public static int result(String op1,String op2) {
		
		int o1=0;
		int o2=0;
		
		try {
			o1=Integer.parseInt(op1);
			o2=Integer.parseInt(op2);
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		return o1-o2;
		
	}

}
