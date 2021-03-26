package OTT;

public class Series extends Media {
	private int seasons;
	private int episodes;
	public Series(int seasons, int episodes) {
		super();
		this.seasons = seasons;
		this.episodes = episodes;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	
	
	@Override
	public void play(User u) throws SubscriptionException, AgeRestriction {
		// TODO Auto-generated method stub
		super.play(u);
		System.out.println("playing from episode 1 season 1");
	}
	public void play(User u,int episodes ,int seasons) throws SubscriptionException, AgeRestriction {
		// TODO Auto-generated method stub
		super.play(u);
		if(seasons <=this.seasons || episodes <=this.episodes)
			System.out.println("playing "+episodes+"of season"+seasons);
		else
			System.out.println("cannot play as requested");
			
	}
	
	

	
	
	
	

}
