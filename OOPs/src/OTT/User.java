package OTT;

public class User {
	private String name;
	private int age;
	private double balance;
	private Subscription s;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public Subscription getS() {
		return s;
	}



	public void setS(Subscription s) {
		this.s = s;
	}



	public void profile() {
		System.out.println("Name:"+name);
		System.out.println("Agee:"+age);
		if(s==null)
			System.out.println("not subscriber");
		
		
	}
	
	public void mySubscription() {
		
		System.out.println("Name:"+name);
		System.out.println("Plan "+s.getPlan());
		System.out.println("Expiry "+s.getExpiry());
	
			}

}
