
public class Visitor {
	
	private String visName;
	private String password;
	private String secretKey;
	
	public Visitor( ) {
		
	}
	
	public Visitor(String name, String passw, String key ) {
		visName = name;
		password = passw;
		secretKey = key;
	}
	
	public void login(String name, String passw){
		System.out.println("Logged In with Name and Password");
	}
	
	public void login(String name ) {
		System.out.println("Logged In with Name");
	}
}
