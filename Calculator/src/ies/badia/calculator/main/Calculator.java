/**
 * Clase utilizada para interpretar una expresion matematica
 * Recibe por parametro la expresion y se encarga de desglosarla
 * en 2 operadores y su operador y es capaz de calcular el resultado
 * 
 */
package ies.badia.calculator.main;


/**
 * @author Francisco José Camacho Maya
 * @author Izar Mula soria
 *
 */
public class Calculator {

	/**
	 * Propiedad que contendra el operando 1 de la calculadora
	 */
	private String op1;
	
	
	/**
	 * Propiedad que contendra el operador de la calculadora
	 */
	private String operador;
	
	/**
	 * Propiedad que contendra el operando 2 de la calculadora
	 */
	private String op2;
	
	/**
	 * Propiedad que contendra la expresion aritmetica que se quiere calcular
	 */
	private String expresion;
	
	/**
	 * Propiedad que contendra el resultado del calculo aritmetico
	 */
	private int result;
	
	
	/**
	 * @param expresion
	 * La expresion tiene que cumplir la sintaxis siguiente:
	 * num1[+,*,-,/,%]num2
	 */
	public Calculator(String expresion){
		
		this.expresion=expresion;
			
	}


	/**Evalua la expresion aritmetica pasada al constructor, 
	 * si esta es valida la desglosa y setea las variables de la clase.
	 *
	 * @throws Exception
	 * Cuando la Expresion no es valida
	 */
	public int evaluateExpression() throws Exception {
		
		
		if(expresion.contains("+")) {
			String[] cadena=expresion.split("\\+");
			op1=cadena[0];
			op2=cadena[1];
			operador="+";
			return 0;
			
		}else if(expresion.contains("-")){
			String[] cadena=expresion.split("\\-");
			op1=cadena[0];
			op2=cadena[1];
			operador="-";
			return 0;
			
		}else if(expresion.contains("*")) {
			String[] cadena=expresion.split("\\*");
			op1=cadena[0];
			op2=cadena[1];
			operador="*";
			return 0;
		}else if(expresion.contains("/")) {
			String[] cadena=expresion.split("\\/");
			op1=cadena[0];
			op2=cadena[1];
			operador="/";
			return 0;
			
			
		}else if(expresion.contains("%")) {
			
			String[] cadena=expresion.split("\\%");
			op1=cadena[0];
			op2=cadena[1];
			operador="%";
			return 0;
			
			
		}else {
			throw new Exception("SintaxError");
			
		}
	}
	
	
	/**
	 * 
	 * Opera la expresion, pasandosela al modulo aritmetico correcto,
	 * Guarda el resultado en la propiedad this.result
	 */
	public void operate() {
		
		try {
			evaluateExpression();
			
			switch (this.operador) {
				case "+":
					result=Addition.result(op1, op2);
					break;
				case "-":
					result=Subtraction.result(op1, op2);
					break;
				case "*":
					result=Product.result(op1, op2);
					break;
				case "/":
					result=Division.result(op1, op2);
					break;
				case "%":
					result=Residus.result(op1, op2);
					break;
		
			}
			
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}



	public int getResult() {
		return result;
	}

	
		
}


