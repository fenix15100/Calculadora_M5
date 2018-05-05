/**
 * Test Junit4 comprueba que el modulo Operate de Calculator funciona correctamente
 * 
 */
package ies.badia.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

import ies.badia.calculator.main.Calculator;

/**
 * @author Francisco Jose Camacho Maya
 * 
 */

public class TestCalculator {
	

@Parameter(0)
public int result;

@Parameter(1)
public int expected;

	/**
	 * Test method for {@link ies.badia.calculator.main.Calculator#operate()}.
	 */
	@Test
	public void testOperateAddition() {
		Calculator c=new Calculator("64+4");
		c.operate();
		result=c.getResult();
		expected=68;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testOperateDivision() {
		Calculator c=new Calculator("4/2");
		c.operate();
		result=c.getResult();
		expected=2;
		assertEquals(expected, result);
		
	}

}
