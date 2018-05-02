/**
 * Test Junit4 comprueba que el modulo divide dos operadores tipo string devolviendo un entero
 */
package ies.badia.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

import ies.badia.calculator.main.Residus;

/**
 * @author Francisco Jose Camacho Maya
 * 
 */

public class TestResidus {
	

@Parameter(0)
public int result;

@Parameter(1)
public int expected;

	/**
	 * Test method for {@link ies.badia.calculator.main.Residus#result(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testResult() {
		String op1="5";
		String op2="3";
		
		result=Residus.result(op1, op2);
		expected=2;
		assertEquals(expected, result);
		
	}
	

}
