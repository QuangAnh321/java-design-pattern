package abstractFactory.challenge;

public class HollywoodStudio extends AbstractMovieStudio {

	@Override
	void getMovieDescriptionByGenre(String genre) {
		switch (genre) {
			case "ACTION":
				Movie actionMovie = new ActionMovie();
				System.out.println("Mission Impossible is n Hollywood Action Movie. It is: "+ actionMovie.getMovieDescription());
				break;
			case "COMEDY":
				Movie comedyMovie = new ComedyMovie();
				System.out.println("Deadpool is a Hollywood Comedy Movie. It is: "+ comedyMovie.getMovieDescription());
				break;
			default:
				System.err.println("Genre: "+genre+" is invalid");
		}
	}
}
