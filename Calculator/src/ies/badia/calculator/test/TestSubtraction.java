/**
 * Test Junit4 comprueba que el modulo resta dos operadores tipo string devolviendo un entero
 * 
 */
package ies.badia.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

import ies.badia.calculator.main.Subtraction;;

/**
 * @author Francisco Jose Camacho Maya
 * 
 */

public class TestSubtraction {
	

@Parameter(0)
public int result;

@Parameter(1)
public int expected;

	/**
	 * Test method for {@link ies.badia.calculator.main.Subtraction#result(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void restapositiva() {
		String op1="7";
		String op2="3";
		
		result=Subtraction.result(op1, op2);
		expected=4;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void restanegativa() {
		String op1="3";
		String op2="7";
		
		result=Subtraction.result(op1, op2);
		expected=-4;
		assertEquals(expected, result);
		
	}

}
