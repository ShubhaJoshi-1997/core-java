class  Movie{

public String language;
public String movieName;
public int investment;
public Actor actors;


public Movie (){
	System.out.println(this.getClass().getSimpleName() +"Objects are created");
}

public void setLanguage(String language){
	this.language = language;
}

public void setMovieName(String movieName){
	this.movieName = movieName;
}
public void setInvestment(int investment){
	this.investment = investment;
}
public void setActors(Actor actors){
	this.actors = actors;
}
@Override
public String toString(){
	return "Movie - [Language = "+this.language+" , MovieName= "+this.movieName+" , Investment= "+this.investment+" Actor ="+this.actors+"]";
}
}