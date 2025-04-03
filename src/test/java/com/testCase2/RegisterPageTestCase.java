package com.testCase2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTestCase {

	@Test
	void testvalid() {
		Assert.assertEquals(2, 2);
	}
	@Test
	void testTitle() {
		Assert.assertEquals(4, 4);
	}
	

	@Test
	void testinvalid() {
		Assert.assertEquals(4, 4);
	}
}
