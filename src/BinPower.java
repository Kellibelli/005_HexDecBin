import java.util.Scanner;

public class BinPower {
	
	Scanner input = new Scanner(System.in);
	String name = "";
	double base;
	double exp;
	int ans;

	public BinPower() {
		
	}
	
	public void setBinary() {
		
		System.out.println("Hello Java Student! What is your name? ");
		name = input.nextLine();
		System.out.println("Thanks for using my program " + name + ".");
		
		System.out.println("What base do you want " + name + "?");
		base = input.nextDouble();
		System.out.println(name + " you have entered " + base + " as your base." );
		
		
		System.out.println("Which exponent do you want " + name + "?");
		exp = input.nextDouble();
		System.out.println(name + " you have entered " + exp + " as your exponent." );
		
		ans = (int) Math.pow(base, exp);

		System.out.println("Answer is: " + ans);	
	}	
}