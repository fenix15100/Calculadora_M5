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
	
	/**
	 * 
	 * @param op1
	 * Primer operador
	 * @param op2
	 * Segundo operador
	 * @return 
	 * La Division entera de @param op1 y @param op2
	 */
	public static int result(String op1,String op2) throws Exception {
		
		int o1=0;
		int o2=0;
		int result=0;
		try {
			o1=Integer.parseInt(op1);
			o2=Integer.parseInt(op2);
			int tmp=o1;
			
			if (o2==0) throw new Exception("DivisionEntreZero");
			
			while (tmp >= o2){
			     tmp-=o2;
			     result++;
			  }
			
			
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		return result;
		
		
		
		
		
	}

}
