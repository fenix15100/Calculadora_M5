/**
 * Test Junit4 comprueba que el modulo suma dos operadores tipo string devolviendo un entero
 * 
 */
package ies.badia.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

import ies.badia.calculator.main.Addition;

/**
 * @author Francisco Jose Camacho Maya
 * 
 */

public class TestAddition {
	

@Parameter(0)
public int result;

@Parameter(1)
public int expected;

	/**
	 * Test method for {@link ies.badia.calculator.main.Addition#result(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testResult() {
		String op1="5";
		String op2="6";
		
		result=Addition.result(op1, op2);
		expected=11;
		assertEquals(expected, result);
		
	}

}
