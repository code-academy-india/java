
public class ObjectClassCasting {

	public static void main(String[] args) {
		
		Object obj = new Employee();
		
		Employee e1 =  (Employee) obj;
		
		// uncomment line 12, run and check
		// danger
		// Manager m1 = (Manager) obj;
	}
}
