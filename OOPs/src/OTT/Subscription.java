package OTT;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Subscription {
	private final static double MONTHLY =100;
	private final static double ANNUAL =1000;
	private User us;
	private String plan;
	private LocalDate expiry;
	
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public Subscription( String plan) {
//		super();
//		this.plan = plan;
//	}


	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public void subscribe(User us, String plan) throws PaymentException {
		System.out.println(us.getBalance());
		System.out.println(MONTHLY);
		System.out.println(ANNUAL);
		if(plan.equalsIgnoreCase("Monthly") && us.getBalance()>=MONTHLY) {
			us.setBalance(us.getBalance()-MONTHLY);
			us.setS(this);
			plan="Monthly";
			expiry = LocalDate.now().plus(1,ChronoUnit.MONTHS);
		}
		else if(plan.equalsIgnoreCase("annual") && us.getBalance()>=ANNUAL) {
			us.setBalance(us.getBalance()-ANNUAL );
			us.setS(this);
			plan="Annual";
			expiry=LocalDate.now().plus(1,ChronoUnit.YEARS);
		}
		else
			throw new PaymentException("Low balnce, cannot subscribe");
		
	}

}
