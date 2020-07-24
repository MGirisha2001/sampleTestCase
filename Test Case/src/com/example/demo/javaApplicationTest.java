package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class javaApplicationTest {
	int actual;
	@Test
	void add() {
		int expected=12;
		javaApplication cal=new javaApplication();
		 actual=cal.add(5,7);
		
		assertEquals(expected,actual);
	}

	@Test
	void sub() {
		int expected=9;
		javaApplication cal=new javaApplication();
		actual=cal.sub(15,6);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void mul() {
		int expected=20;
		javaApplication cal=new javaApplication();
		actual=cal.mul(2,10);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void div() {
		int expected=3;
		javaApplication cal=new javaApplication();
		actual=cal.div(15,5);
		
		assertEquals(expected,actual);
	}
}
