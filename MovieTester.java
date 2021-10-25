class MovieTester{
public static void main(String a[]){

Movie movie = new Movie();
movie.setLanguage("Kannada");
movie.setMovieName("Googly");
movie.setInvestment(250000);

Actor actor = new Actor();
actor.numberOfActors =42;
actor.mainActor ="Yash";

movie.setActors(actor);
System.out.println(movie);
}
}