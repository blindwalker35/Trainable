package starcraft.userprofile.objects.ladder;

public class Ladder {
	private String ladderName;
	private int ladderID;
	private String division;
	private int rank;
	private String league;
	private String matchMakingQueue;
	private int wins;
	private int losses;
	private boolean showcase;

	public Ladder(String ladderName, int ladderID, String division, int rank,
			String league, String matchMakingQueue, int wins,
			int losses, boolean showcase) {
		this.ladderName = ladderName;
		this.ladderID = ladderID;
		this.division = division;
		this.rank = rank;
		this.league = league;
		this.matchMakingQueue = matchMakingQueue;
		this.wins = wins;
		this.losses = losses;
		this.showcase = true;
	}
	
	public String toString()
	{
		String s = "\t Ladder: \n";
		
		s=s.concat("\t\t ladderName: " + this.ladderName + "\n");
		s=s.concat("\t\t ladderID  " + this.ladderID + "\n");
		s=s.concat("\t\t division " + this.division + "\n");
		s=s.concat("\t\t rank " + this.rank + "\n");
		s=s.concat("\t\t league " + this.league + "\n");
		s=s.concat("\t\t matchMakingQueue " + this.matchMakingQueue + "\n");
		s=s.concat("\t\t wins: " + this.wins + "\n");
		s=s.concat("\t\t losses  " + this.losses + "\n");
		return s;
	}
}
