package collections;

import java.util.HashSet;
import java.util.Set;

public class Hash {
     
	String name;
	int rupees;
	int age;
	public Hash(String name, int rupees,int age) {
		
		this.name = name;
		this.rupees= rupees;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hash hs = new Hash("thiru",23,30);
		Hash hs1 = new Hash("thiru",23,30);
		Hash hs2 = new Hash("kural",25,27);
        
		Set empl = new HashSet();
		
		empl.add(hs);     // not allow duplicate elements
		empl.add(hs1);
		empl.add(hs2);
		
		System.out.println(empl);
		
		
//		Set s = new HashSet();
//		s.add(100);
//		s.add(1003);
//		System.out.println(s);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rupees;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hash other = (Hash) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rupees != other.rupees)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hash [name=" + name + ", rupees=" + rupees + ", age=" + age + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + rupees;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Hash other = (Hash) obj;
//		
//		if (rupees != other.rupees)
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "Hash [name=" + name + ", rupees=" + rupees + "]";
//	}

	

	

}
