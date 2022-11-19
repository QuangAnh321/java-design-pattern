package section8.challenge;

public class CricketCaptain {

	private String name;
	
	private CricketCaptain() {
		
	}
	
	private static class CricketCaptainHelper {
		private static final CricketCaptain uniqueCaptain = new CricketCaptain();
	}
	
	public static CricketCaptain getInstance() {
		return CricketCaptainHelper.uniqueCaptain;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
}
