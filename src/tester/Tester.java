package tester;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;

import starcraft.UserProfile;
import starcraft.UserProfileReader;
import logger.Logger;

public class Tester {
	public static void main(String args[])
	{
		Logger log = new Logger();
		
		
		UserProfileReader upr = new UserProfileReader("http://us.battle.net/api/sc2/profile/3254904/1/blindwalker/ladders");
		JsonRepresentation jr = upr.getUserProfileJSON();
		JSONObject jo = null;
		try {
			jo = jr.getJsonObject();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			log.log(jo.toString(5));
			System.out.println(jo.toString(5));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
