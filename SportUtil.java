class SportUtil{

public static void main(String a[]){
Sport sport = new Sport();
sport.name = "throwball";
sport.numberOfPlayers=9;
sport.typeOfGame="outdoor";

System.out.println(sport.name +" "+sport.numberOfPlayers+" "+sport.typeOfGame);

sport.entertainment();

Sport sport1 = new Sport();
sport1.name = "volleyball";
sport1.numberOfPlayers=6;
sport1.typeOfGame="outdoor";

System.out.println(sport1.name +" "+sport1.numberOfPlayers+" "+sport1.typeOfGame);

sport1.entertainment ();

}
}