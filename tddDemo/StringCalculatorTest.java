package com.yash.tdddemo3.util;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

//import com.yash.tdddemoe1.util.StringCalculator;

public class StringCalculatorTest {
		
		StringCalculator c=new StringCalculator();
		
		@Test
		public void test_AddMethod_GivenValues_ShowReturn_Addition()
		{
			
			int expected=2;
			int actual=c.add(1,1);
			
		  assertEquals(expected,actual);
		}
		@Test
		public void test_SquareMethod_GivenSingleValue_ShoudReturn_Square()
		{
			assertEquals(c.square(4),16);
		}
		
		
		

	}
