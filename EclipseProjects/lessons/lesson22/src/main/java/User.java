




public class User{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public void voice() {
		System.out.println("User says smth");
		
	}
	public String toString() {
		return "User name = ".concat(name).concat("; User age = ").concat(Integer.toString(age));
	}
	
}
