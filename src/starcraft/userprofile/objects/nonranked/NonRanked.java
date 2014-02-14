package starcraft.userprofile.objects.nonranked;


public class NonRanked {
	private String matchMakingQueue;
	private int gamesPlayed;

	public NonRanked(String matchMakingQueue, int gamesPlayed) {
		this.matchMakingQueue = matchMakingQueue;
		this.gamesPlayed = gamesPlayed;
	}
	
	public String toString()
	{
		String s = "\t NonRanked: \n";
		
		s=s.concat("\t\t MatchMakingQUeue: " + this.matchMakingQueue + "\n");
		s=s.concat("\t\t gamesPlayed  " + this.gamesPlayed + "\n");

		return s;
	}
}
