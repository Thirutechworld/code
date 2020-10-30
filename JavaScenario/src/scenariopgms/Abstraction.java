package scenariopgms;

//import javax.swing.AbstractAction;

public   abstract class  Abstraction {
	
	private String name;
	private String address;
	private int age;
	
	
	public Abstraction(String name,String address,int age) {
		this.name = name;
		this.address=address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Abstraction obj = new Abstraction("thiru","street",23);
		
		
	}

}
