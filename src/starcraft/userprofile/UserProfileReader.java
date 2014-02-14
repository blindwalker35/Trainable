package starcraft.userprofile;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import com.google.gson.Gson;

public class UserProfileReader {
	private String userProfileURL;
	private JsonRepresentation jsonRepresentation;

	public UserProfileReader() {

	}

	public static UserProfile retrieveLadderInfo(String userProfileURL) {
		ClientResource cr;
		cr = new ClientResource(userProfileURL);
		Representation r = cr.get();
		JsonRepresentation jr = null;
		try {
			jr = new JsonRepresentation(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JSONObject profile = null;
		try {
			profile = jr.getJsonObject();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson g = new Gson();
		UserProfile up = g.fromJson(profile.toString(), UserProfile.class);
		
		if(up == null)
		{
			System.out.println("oh noooooo");
		}else
		{
			System.out.println(up);
			System.out.println(up.toString());
		}
		
		
		return up;
	}
}
