

public class RunHere {

	/*
	 * Grading Req's!
	 * 
	 * 1. All JOP's, remove / comment out Scanner, syso 2. Runnable jar -- stand
	 * alone outside of Eclipse 3. Ask for name, repeat name with friendly "Hello
	 * ... 4. Ask "What base are we starting with, Hex, Dec, or Bin?" 5. Ask
	 * "what base are we converting to, Hex, Dec, or Bin?" 6. Enter the starting
	 * number 7. Do the conversion, display the result 8. Ask if they want to go
	 * again; if yes start over, if no friendly exit
	 */

	public static void main(String[] args) {
		
		
			
			
		// Added hex to bin functionality (just for git practice)
		BinPower binpower = new BinPower();
		binpower.setBinary();

		HexDecBin baseConverter = new HexDecBin();

		
		baseConverter.setDecNumber();
		baseConverter.convert();
		baseConverter.setHexNumber();
		baseConverter.convert();
		baseConverter.setBinNumber();
		baseConverter.convert();
		}
	

}
