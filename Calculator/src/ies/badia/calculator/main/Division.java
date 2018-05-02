/**
 * Clase Estatica que recibe dos Strings como parametro
 * Las convierte a enteros y nos da su division
 * 
 */
package ies.badia.calculator.main;

/**
 * @author Francisco José Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Division {
	
	
	public static int result(String op1,String op2) {
		int o1=Integer.parseInt(op1);
		int o2=Integer.parseInt(op2);
		int result=0;
		
		if (o2==0) throw new IllegalArgumentException("DivisionEntreZero");
		
		
		while (o1 >= o2){
		     o1 = o2 - o2;
		     result++;
		  }
		
		return result;
		
	}

}
