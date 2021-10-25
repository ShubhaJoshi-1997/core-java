class Actor{

public int numberOfActors;
public String mainActor;

@Override
public String toString(){
	return "Actor -[numberOfActors = "+this.numberOfActors+", mainActor = "+this.mainActor+"]";
}
}