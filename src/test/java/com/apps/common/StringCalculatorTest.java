/**
 * Class for handling test : string addition
 * @author parth
 *
 */

package com.apps.common;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator app;
	
	@Before
	public void init() {
		app = new StringCalculator();
	}
	
	@After
	public void destroy() {
		app = null;
	}
	
	@Test
	public void AddTest0() {
		int res = app.Add("");
		assertEquals(0, res);
	}
	
	@Test
	public void AddTest1() {
		int res = app.Add("1");
		assertEquals(1, res);
	}
	
	@Test
	public void AddTestN() {
		int res = app.Add("1,2,3");
		assertEquals(6, res);
	}
}
