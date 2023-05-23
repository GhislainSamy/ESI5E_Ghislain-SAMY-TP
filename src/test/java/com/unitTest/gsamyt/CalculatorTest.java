package com.unitTest.gsamyt;

import junit.framework.Assert;
import org.junit.Test;

import com.unitTest.gsamy.Calculator;

public class CalculatorTest {

	@Test
	public void addition() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}
}
