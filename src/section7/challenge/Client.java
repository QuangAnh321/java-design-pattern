package section7.challenge;

public class Client {

	public static void main(String[] args) {
		AbstractMovieStudio hollywood = MovieStudioProducer.getMovieStudio("HOLLYWOOD");
		AbstractMovieStudio bollywood = MovieStudioProducer.getMovieStudio("BOLLYWOOD");
		
		hollywood.getMovieDescriptionByGenre("ACTION");
		hollywood.getMovieDescriptionByGenre("COMEDY");
		
		System.out.println("");
		
		bollywood.getMovieDescriptionByGenre("ACTION");
		bollywood.getMovieDescriptionByGenre("COMEDY");
	}
}
