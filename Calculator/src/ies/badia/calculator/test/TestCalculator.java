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
	 *  
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
	public void testOperateAddition2() {
		Calculator c=new Calculator("4+4.66");
		c.operate();
		result=c.getResult();
		expected=2;
		assertNotEquals(expected, result);
		
	}
	
	@Test
	public void testOperateDivision() {
		Calculator c=new Calculator("4/2");
		c.operate();
		result=c.getResult();
		expected=2;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testOperateDivision2() {
		Calculator c=new Calculator("4/0");
		c.operate();
		result=c.getResult();
		assertNotEquals(new Exception(), result);
		
	}
	
	@Test
	public void testOperateDivision3() {
		Calculator c=new Calculator("4/4.66");
		c.operate();
		result=c.getResult();
		assertNotEquals(new Exception(), result);
		
	}
	
	@Test
	public void testOperateProduct() {
		Calculator c=new Calculator("4*2");
		c.operate();
		result=c.getResult();
		expected=8;
		assertEquals(expected, result);
		
	}
	
	
	@Test
	public void testOperateResidus() {
		Calculator c=new Calculator("4%2");
		c.operate();
		result=c.getResult();
		expected=0;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testOperateResidus2() {
		Calculator c=new Calculator("4%0");
		c.operate();
		result=c.getResult();
		
		assertNotEquals(new IllegalArgumentException(), result);
		
	}
	@Test
	public void testOperateResidus3() {
		Calculator c=new Calculator("4%1.5");
		c.operate();
		result=c.getResult();
		
		assertNotEquals(new NumberFormatException(), result);
		
	}
	
	
	@Test
	public void testOperateSubtraction() {
		Calculator c=new Calculator("4-2");
		c.operate();
		result=c.getResult();
		expected=2;
		assertEquals(expected, result);
		
	}
	
	
	@Test
	public void testOperateSubtraction2() {
		Calculator c=new Calculator("4-1.5");
		c.operate();
		result=c.getResult();
		
		assertNotEquals(new NumberFormatException(), result);
		
	}
	
	
	@Test
	public void testevaluateexpresion() {
		Calculator c=new Calculator("4?1.5");
		c.operate();
		result=c.getResult();
		assertNotEquals(new Exception(), result);
		
	}
	
	


}
