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

public class ArrayCopyDemo {

	public static void main(String[] args) {
		String[] asianCountries = {
				"India",
				"Singapore",
				"Malaysia"
			};
		
		String[] allCountries = new String[10];

		System.arraycopy(asianCountries, 0, 
				allCountries, 0, 3);

		for(String country : allCountries)
			System.out.println(country);
		
		
		
	}

}
