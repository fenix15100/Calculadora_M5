/**
 * Test Junit4 comprueba que el modulo multiplica dos operadores tipo string devolviendo un entero
 * 
 */
package ies.badia.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

import ies.badia.calculator.main.Product;

/**
 * @author Izar Mula Soria
 * 
 */

public class TestProduct {
	

@Parameter(0)
public int result;

@Parameter(1)
public int expected;

	/**
	 * Test method for {@link ies.badia.calculator.main.Product#result(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testResult() {
		String op1="8";
		String op2="8";
		
		result=Product.result(op1, op2);
		expected=64;
		assertEquals(expected, result);
		
	}
	
	

}
