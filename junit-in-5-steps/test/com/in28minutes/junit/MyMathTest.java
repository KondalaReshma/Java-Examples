package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	 public void sum_with3numbers() {
		
		MyMath  myMath = new MyMath();
		System.out.println(myMath.sum(new int[] {1,2,3}));
		
		//absence of failure is success
	}

}
