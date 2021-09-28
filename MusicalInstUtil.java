class MusicalInstUtil{


public static void main(String a[]){
MusicalInstrument music = new MusicalInstrument("guitar",7000.50,"20 Hz","western");
System.out.println(music.name+" "+music.price +" "+music.frequency +" "+music.type);
music.play(music.name);

MusicalInstrument music1 = new MusicalInstrument("violin", 3000.50,"10 Hz", "western");
System.out.println(music1.name+" "+music1.price +" "+music1.frequency +" "+music1.type);
music1.play(music.name);
}
}