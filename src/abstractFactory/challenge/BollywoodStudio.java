package abstractFactory.challenge;

public class BollywoodStudio extends AbstractMovieStudio {

	@Override
	void getMovieDescriptionByGenre(String genre) {
		switch (genre) {
			case "ACTION":
				Movie actionMovie = new ActionMovie();
				System.out.println("Bang Bang is a Bollywood Action Movie. It is: "+ actionMovie.getMovieDescription());
				break;
			case "COMEDY":
				Movie comedyMovie = new ComedyMovie();
				System.out.println("3 idiots is a Bollywood Comedy Movie. It is: "+ comedyMovie.getMovieDescription());
				break;
			default:
				System.err.println("Genre: "+genre+" is invalid");
		}
	}

}
