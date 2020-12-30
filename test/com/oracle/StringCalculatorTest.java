/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Harshita Ashwani
 */
public class StringCalculatorTest {
    
    public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("com.oracle.Calculator.StringCalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
        @Test
	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}
        @Test
	public void testTwoNumber(){
		assertEquals(3, StringCalculator.add("1,2"));
	}
        @Test
    public void testThreeNumber(){ //three numbers
    	assertEquals(6, StringCalculator.add("1,2,3"));
    }
}
