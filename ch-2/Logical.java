// Java code to illustrate
// logical AND operator

/*
* hdfs
*hfdsfsfs
* dfhsdhfsd
*/


import java.io.*;

class Logical {
	public static void main(String[] args)
	{
		// initializing variables
		int a = 30, b = 20, c = 20, d;

		// Displaying a, b, c
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);
		System.out.println("Var3 = " + c);

		// using logical AND to verify
		// two constraints
		if ((a < b) || (b == c)) {
			d = a + b + c;
			System.out.println("The sum is: " + d);
		}
		else
			System.out.println("False conditions");
	}
}
