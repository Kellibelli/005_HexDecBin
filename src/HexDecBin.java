import java.util.Scanner;

import javax.swing.JOptionPane;

public class HexDecBin {
	
	/*
	 * 
	 * FIX FAULTS! COMPLETE MISSING CODE!
	 */
	//Scanner for float is now working
	Scanner kbd = new Scanner(System.in);
	Boolean runAgain = true;
	String goAgain = "";
	String answer = "";
	String name = "";
	String hex = "";
	String dec = "";
	String bin = "";
	String msg = "";
	int num;
	int numberBits = 10;
	int bite = 8; // spelled wrong to avoid a keyword conflict
	int nibble = 4;
	int byteAnswer = 0, byteRemainder = 0;
	
	
	
	public HexDecBin() {
		msg= "Welcome to my Hexadecimal, Decimal, or Binary conversion program!";
		JOptionPane.showMessageDialog(null, msg);
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Very nice to meet you " + name);
		msg = "What do you want to start with, Hex, Dec, or Bin?";
		goAgain = JOptionPane.showInputDialog(msg);
		if (msg == ("Hex")) {
			
		}
		//Left off here
	} // end of HexDecBin
	
public void setHexNumber() {
		
		String hex = JOptionPane.showInputDialog(null, "Enter the hex number");
		//hex = kbd.nextLine();
		// mouse over parseInt to read pop-up guide
		num = Integer.parseInt(hex, 16);
		JOptionPane.showMessageDialog(null, "You have entered hex " + hex);
		//System.out.println("You have entered hex " + hex );
		JOptionPane.showMessageDialog(null, "Decimal value is: " + num + "(remember 0-" + num + " has " + (num+1) + " values)");
		//System.out.println();
	} //end of getHexNumber
	
	
	
	public void setDecNumber() {
		String dec = JOptionPane.showInputDialog(null, "Enter the Dec number");
		//System.out.println("\nEnter the Dec number");
		//dec = kbd.nextLine();
		
		num = Integer.parseInt(dec);
		//System.out.println("You have entered dec " + dec);
		JOptionPane.showMessageDialog(null, "You have entered dec " + dec);
		
		
	}
	
	public void setBinNumber() {
		String bin = JOptionPane.showInputDialog(null, "Enter the Bin number");
		//System.out.println("\nEnter the Bin number");
		//bin = kbd.nextLine();
	}
	
	void convert() {
		
		String binary = Integer.toBinaryString(num);
		
		JOptionPane.showMessageDialog(null, "Binary value is: " + binary);
		//System.out.println("Binary value is: " + binary);
		JOptionPane.showMessageDialog(null, "Number of bits is " + binary.length());
		//System.out.println("Number of bits is " + binary.length());
		JOptionPane.showMessageDialog(null, "Number of whole nibbles (4 bits) is "+ byteAnswer + " with " + numberBits + " bits left over");
		//System.out.println("Number of whole nibbles (4 bits) is"+ byteAnswer + "with" + numberBits + "bits left over");
		JOptionPane.showMessageDialog(null, "Number of whole bytes (8 bits) is " + byteRemainder + " with "+ numberBits +" bits remaining");
		//System.out.println("Number of whole bytes (8 bits) is" + byteRemainder + "with"+ numberBits +"bits remaining");
		byteAnswer = numberBits / bite;
		byteRemainder = numberBits % bite;
		
		System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteRemainder);
	}	
	
}

	
	
	
	
	
	
	
	
	
	
	

