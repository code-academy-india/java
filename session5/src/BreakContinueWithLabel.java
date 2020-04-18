
/**
 * 
 * @author Vasantha
 * sum of first 10 nos using while loop
 * First complete WhileLoop.java, ForLoop.java, DoWhile.java and BreakAndContinue.java
 * Later you can work this demo
 * 
 */

public class BreakContinueWithLabel {

	public static void main(String[] args) {

		outerLoop:
		while(true) {
			System.out.println(" processing outer loop");
			
			innerLoop:
			while(true) {
				System.out.println(" processing inner loop");
				break outerLoop;
				
			} //end of inner loop
			
		}//end of outer loop
		System.out.println("PROCESSING COMPLETED ");
	}
}
