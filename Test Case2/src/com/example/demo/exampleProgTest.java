package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exampleProgTest {

	@Test
	void test() {
		String expected="Java Programming";
		exampleProg obj=new exampleProg();
		String actual=obj.data();
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		String expected="Girisha";
		exampleProg obj=new exampleProg();
		String actual=obj.copy();
		assertEquals(expected,actual);
	}
	
	@Test
	void test3() {
		String expected="Jyothi";
		exampleProg obj=new exampleProg();
		String actual=obj.comp();
		assertEquals(expected,actual);
	}
	
	
}
