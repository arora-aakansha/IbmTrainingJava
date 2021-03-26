package OTT;

public class Movies extends Media {
		private float duration;
		
		public Movies() {
			// TODO Auto-generated constructor stub
			super();
		}

		public Movies(String title, String genere, boolean free) {
			super(title, genere, free);
			// TODO Auto-generated constructor stub
		}
		
		public void play(User u) throws SubscriptionException, AgeRestriction{
			super.play(u);
			System.out.println("now playing.."+title);
			
		}
		
}
