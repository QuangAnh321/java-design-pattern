package abstractFactory.challenge;

public class MovieStudioProducer {

	public static AbstractMovieStudio getMovieStudio(String choice) {
		switch (choice) {
		case "HOLLYWOOD":
			return new HollywoodStudio();
		case "BOLLYWOOD":
			return new BollywoodStudio();
		default:
			System.err.println("Choice: "+choice+" is invalid");
			return null;
		}
	}
}
