
import java.util.Scanner;

public class HexDecBin {
	
	Scanner i = new Scanner(System.in);
	String name = "";
	String hex = "";
	int num;
	
	public HexDecBin () {
		System.out.println("Welcome to my Hexadecimal, Decimal, or Binary Conversion program.");
		System.out.println("What is your name?");
		name = i.nextLine();
		System.out.println("Very nice to meet you, " + name + " let's begin: \n");
	}
	
	void setHexNumber () {
		System.out.println("Enter the hex number: ");
		hex = i.nextLine();
		num = Integer.parseInt(hex, 16);
		System.out.println("You have entered hex: " + hex);
		System.out.println("Decimal value is: " + num + "(remember 0- " + num + " has " + (num+1) + " values)");
	}
	
	void convert () {
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is: " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is x with y bits left over.");
		System.out.println("Number of whole bytes (8 bits) is x with y bits remaining.");
	}
	
}