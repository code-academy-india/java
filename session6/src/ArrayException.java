/**
 * Run arrays samples in this order for better understanding
 *  
 * ArrayDeclareAndInit.java
 * AccessArrayElements.java
 * ArrayException.java
 * ArrayResize.java
 * ArrayCopyDemo.java
 * MultiDimArray.java

*/

public class ArrayException {

	public static void main(String[] args) {
		String[] countries = {
				"India",
				"United States",
				"Singapore",
				"Malaysia"
			};
		
		System.out.println(" Countries Length: "
				 + countries.length);
		
		
		System.out.println(countries[4]);
		System.out.println(countries[ countries.length ]);

	}

}
