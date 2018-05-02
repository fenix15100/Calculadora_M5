/**
 * Clase utilizada para interpretar una expresion matematica
 * Recibe por parametro la expresion y se encarga de desglosarla
 * en 2 operadores y su operador
 * 
 */
package ies.badia.calculator.main;


/**
 * @author Francisco Jos� Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Calculator {

	private String op1;
	private String operador;
	private String op2;
	
	
	/**
	 * 
	 * @param expresion
	 * @throws Exception 
	 */
	public Calculator(String expresion) throws Exception {
		if(expresion.contains("+")) {
			String[] cadena=expresion.split("\\+");
			op1=cadena[0];
			op2=cadena[1];
			operador="+";
			
		}else if(expresion.contains("-")){
			String[] cadena=expresion.split("\\-");
			op1=cadena[0];
			op2=cadena[1];
			operador="-";
			
		}else if(expresion.contains("*")) {
			String[] cadena=expresion.split("\\*");
			op1=cadena[0];
			op2=cadena[1];
			operador="*";
		}else if(expresion.contains("/")) {
			String[] cadena=expresion.split("\\/");
			op1=cadena[0];
			op2=cadena[1];
			operador="/";
			
		}else {
			throw new Exception("SintaxError");
		}
		
		
	}


	public String getOp1() {
		return op1;
	}


	public void setOp1(String op1) {
		this.op1 = op1;
	}


	public String getOperador() {
		return operador;
	}


	public void setOperador(String operador) {
		this.operador = operador;
	}


	public String getOp2() {
		return op2;
	}


	public void setOp2(String op2) {
		this.op2 = op2;
	}
		
		
		
		
		
}


