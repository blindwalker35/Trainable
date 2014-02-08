package starcraft;


import java.io.IOException;

import org.restlet.representation.Representation;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.ClientResource;



public class UserProfile {
	private String userProfileURL;
	
	private void retrieveLadderInfo()
	{
		ClientResource cr;
		cr = new ClientResource("http://us.battle.net/sc2/en/profile/3254904/1/blindwalker/");
		Representation r = cr.get();
		try {
			JsonRepresentation jr = new JsonRepresentation(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean validProfileURL()
	{
		return false;
	}
}
