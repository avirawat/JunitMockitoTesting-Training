package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.service.CartDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class SpyTest {
	
	@Spy // thos create a original object
	
	CartDetails details;
	
	@Mock
	CartDetails cartDetailsMock;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	//	details=new CartDetails();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGreet() {
		String name="Priya";
		assertEquals("welcome "+name,details.greet(name),"not same");
	}
	
	@Test
	void testMockGreet() {
		String name="Priya";
		when(cartDetailsMock.greet(name)).thenReturn("welcome "+name);
		// testing method
		assertEquals("welcome "+name,cartDetailsMock.greet(name),"not same");
	}

}
