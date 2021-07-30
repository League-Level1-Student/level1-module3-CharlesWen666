package _05_netflix;

public class mainRunner {
	public static void main(String[] args) {
		Movie a = new Movie("Twilight",1);
		Movie b = new Movie("GG Bond",3);
		Movie c = new Movie("HARRY Potter",5);
		Movie d = new Movie("Top Gun",2);
		Movie e = new Movie("Dream",1);
		System.out.println(b.getTicketPrice());
		System.out.println(a.getTicketPrice());
		NetflixQueue n = new NetflixQueue();
		n.addMovie(a);
		n.addMovie(b);
		n.addMovie(c);
		n.addMovie(d);
		n.addMovie(e);
		n.printMovies();
		n.sortMoviesByRating();
		System.out.println("The best movie is " + n.getMovie(0));
		System.out.println("The second best movie is "+n.getMovie(1));
	}
}
