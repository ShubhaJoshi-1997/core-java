class Planets{

public String name;
public String orbit;
public String diameter;
public String days;

public Planets(String planet,String orbitOfPlanet,String dia,String day){

System.out.println("Planets ofSolar System");
name = planet;
orbit = orbitOfPlanet;
diameter = dia;
days = day;

System.out.println(name +" "+ orbit +" "+ diameter +" "+ days);
}
}