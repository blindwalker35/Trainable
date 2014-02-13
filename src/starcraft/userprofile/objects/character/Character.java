package starcraft.userprofile.objects.character;

public class Character {
	private int id;
	private int realm;
	private String displayName;
	private String clanName;
	private String clanTag;
	private String profilePath;

	public Character(int id, int realm, String displayName, String clanName,
			String clanTag, String profilePath) {
		this.id = id;
		this.realm = realm;
		this.displayName = displayName;
		this.clanName = clanName;
		this.clanTag = clanTag;
		this.profilePath = profilePath;
	}
	
	public String toString()
	{
		String s = "\t Character: \n";
		
		s=s.concat("\t\t id: " + this.id + "\n");
		s=s.concat("\t\t realm  " + this.realm + "\n");
		s=s.concat("\t\t displayName " + this.displayName + "\n");
		s=s.concat("\t\t clanName " + this.clanName + "\n");
		s=s.concat("\t\t clanTag " + this.clanTag + "\n");
		s=s.concat("\t\t profilePath " + this.profilePath + "\n");
		return s;
	}
}
