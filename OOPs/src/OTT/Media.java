package OTT;

public class Media {
	protected String title;
	private String Genere;
	private boolean free;
	private User u;
	
	public Media() {
		// TODO Auto-generated constructor stub
	}

	public Media(String title, String genere, boolean free) {
		super();
		this.title = title;
		Genere = genere;
		this.free = free;
	}
	
	public void play(User u) throws SubscriptionException, AgeRestriction {
		if(!free && u.getS()==null) 
			throw new SubscriptionException("You need subscription to watch this");
		else if(Genere.equalsIgnoreCase("errotic") && u.getAge() <18 || Genere.equalsIgnoreCase("horror") && u.getAge()>60)
			throw new SubscriptionException("you can't watch "+title);
	}
	
	
	
	
	

}
