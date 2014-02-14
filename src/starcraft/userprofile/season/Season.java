package starcraft.userprofile.season;

import java.util.List;

import starcraft.userprofile.objects.character.Character;
import starcraft.userprofile.objects.ladder.Ladder;
import starcraft.userprofile.objects.nonranked.NonRanked;

public class Season {
	private List<Ladder> ladder;
	private List<Character> characters;
	private List<NonRanked> nonRanked;
	
	public Season()
	{
		
	}
	
	public String toString()
	{
		String s = "Season: \n";
		
		s=s.concat(ladder.toString());
		s=s.concat(characters.toString());
		s=s.concat(nonRanked.toString());
		return s;
	}
}
