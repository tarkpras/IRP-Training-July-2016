package org.cap.product.test;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class TestTheory {

	@DataPoints
	public static int[] getAllDatas(){
		return new int[]{1,2,0,-1,-12,100};
	}
	
	@Theory
	public void testMyTheory(int a,int b){
	
		//System.out.println(a+ ","+b);
		Assume.assumeTrue(a>0&&b>0);
		
		assertTrue((a+b)>0);
		
	}
	
	

}
