class IccTeamUtil{

public static void main(String a[]){
IccTeam iccTeam = new IccTeam();
iccTeam.captain="M S Dhoni";
iccTeam.team="India";
iccTeam.winningyear=2007;

System.out.println(iccTeam.captain +" "+iccTeam.team +" "+ iccTeam.winningyear);
iccTeam.match(); 

IccTeam iccTeam1 = new IccTeam();
iccTeam1.captain="Lasith Malinga";
iccTeam1.team="Srilanka";
iccTeam1.winningyear=2014;

System.out.println(iccTeam1.captain +" "+iccTeam1.team +" "+ iccTeam1.winningyear);
iccTeam1.match(); 
}
}