package section8.challenge;

public class TestCaptain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CricketCaptain theOnlyCaptain = CricketCaptain.getInstance();
		
		CricketCaptain anotherCaptain = CricketCaptain.getInstance();
		
		if (theOnlyCaptain == anotherCaptain) {
			System.out.println("Two captain are the same");
		}
	}

}
