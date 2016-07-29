package org.cap.product.test;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class TestRunnersDemo {

	public static void main(String[] args) {
		JUnitCore unitCore=new JUnitCore();
		unitCore.addListener(new TextListener(System.out));
		unitCore.run(ProductSuiteTestCase.class);

	}

}
