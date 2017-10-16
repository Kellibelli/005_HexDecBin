import java.util.Scanner;

public class BinPower {
	//Fixed Scanner bug for float inputs
	
	Scanner input = new Scanner(System.in);
	
	
	/*
	 * String is cap'd, reason: It is a Class
	 * int is not cap'd, reason: It is a "primitive" type, means it's not a Class
	 * Integer -- full name, with cap is a Class!
	 * double, lower case is also a "primitive" -- means NO Class for it
	 * 
	 */
	
	
	public BinPower() {
	
	}

	public void setBinary() {
		
		// 2**2 does not work, differs from Python
		
		double exp;
		double base;
		int ans = 0;
		double answer;
		String name = "";

		
		
		//ans = 2**2
		//ans = 2^2;
		//System.out.println("Answer is: " + ans);
		//does not work - yet, no error msg
		
		//don't need 
		//Math myMath = new Math();
		//because it is "static" -- means just use it!
		
		
		System.out.println("Hello most amazing Java student! What is your name?");
		name = input.nextLine();
		System.out.println("Nice to meet you " + name );
		
		System.out.println(name + " what base number do you want?");
		base = input.nextDouble();
		System.out.println(name + " you have entered: " + base );
		
		System.out.println(name + " what binary exponent do you want?");
		exp = input.nextDouble();
		System.out.println(name + " you have entered: " + exp );
		
		// (int) "Type Casting" -- pow requires double, which makes no sense in binary
		// so type cast to the correct answer
		answer = Math.pow(base, exp );
		System.out.println("Answer is: " + answer);
		
		
		
		
	}
	
}
