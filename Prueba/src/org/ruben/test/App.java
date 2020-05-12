package org.ruben.test;

interface Lambda {
	abstract public void demo();
}

public class App {

	public static void main(String[] args) {
		
		Lambda lambda = ()->System.out.println("Statement from demo method");

		lambda.demo();
	}

}
