

public class Person {
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
		this("ano", -1);
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public void print() {
		System.out.println("Name: "+ name + "\tAge: " + age);
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+ name + "\tAge: " + age;
	}



@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Person) {
		Person  p = (Person) obj;
		if(p.name.equals(this.name) && p.age == this.age) {
			return true;
		}
	}
	return false;
}


@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("person is no more");
}

public static void main(String[] args) {
	Person p1= new Person("Polo",21);
//	p1.print();
	
	Person p2= new Person("Polo",21);
//	p2.print();
	
//	System.out.println(p1.hashCode());
//	System.out.println(p1);  //hexvalue of hashcode
//	
	//p1 =null;
	//System.out.println(p1.equals(p2));  //comparing hashcode
	for(int i=0;i<5;i++) {
		p1=new Person();
	}
	System.gc();
	
	
}

}
