package starcraft;

import java.io.IOException;

import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

public class UserProfileReader {
	private String userProfileURL;
	private JsonRepresentation jsonRepresentation;
	
	public UserProfileReader(String URL)
	{
		this.userProfileURL = URL;
		this.jsonRepresentation = retrieveLadderInfo();
	}
	
	private JsonRepresentation retrieveLadderInfo()
	{
		ClientResource cr;
		cr = new ClientResource(this.userProfileURL);
		Representation r = cr.get();
		JsonRepresentation jr = null;
		try {
			jr = new JsonRepresentation(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jr;
	}
	
	public JsonRepresentation getUserProfileJSON()
	{
		return this.jsonRepresentation;
	}
}
