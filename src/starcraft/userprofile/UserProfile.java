package starcraft.userprofile;

import java.io.IOException;
import java.util.List;

import org.restlet.representation.Representation;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.ClientResource;

import starcraft.userprofile.season.Season;

public class UserProfile {
	private List<Season> currentSeason;
	private List<Season> previousSeason;
	private List<Season> showcasePlacement;
	public UserProfile()
	{
		
	}
	
	public UserProfile(List<Season> current, List<Season> previous)
	{
		this.currentSeason= current;
		this.previousSeason = previous;
	}
	
	public String toString()
	{
		String s = "Profile: \n";
		s=s.concat("Current Season: \n" + currentSeason.toString());
		s=s.concat("Previous Season: \n" + previousSeason.toString());
		return s;
	}
}
