/**
 * Clase Estatica que recibe dos Strings como parametro
 * Las convierte a enteros y nos da su resto
 * 
 */
package ies.badia.calculator.main;

/**
 * @author Francisco José Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Residus {
	
	
	public static int result(String op1,String op2) {
		int o1=Integer.parseInt(op1);
		int o2=Integer.parseInt(op2);
		int tmp=o1;
		
		if (o2==0) throw new IllegalArgumentException("ResultadoUndefined");
		
		while (tmp >= o2){
		     tmp-=o2;
		  }
		
		return tmp;
		
	}

}
