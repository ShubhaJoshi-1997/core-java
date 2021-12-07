package com.Xworkz.projectapp.ipl;

public class IplInvoked {
	public static void main(String[] args) {
		String iplTeamName="ChennaiSuperKings";
		iplTeamName=iplTeamName.replace(" "," ");
		System.out.println(iplTeamName);
		
		IplDAO dao=new IplDAO();
		
		dao.save("ChennaiSuperKings");
		dao.save("Royal Challengers Bangalore");
		dao.save("Kolkata Knight Riders");
		dao.save("Mumbai Indians");
		dao.save("Punjab Kings");
		
		boolean found=dao.find("ChennaiSuperKings");
		System.out.println(found);
		
		found=dao.findByCaseInSensitive("ChennaiSuperKings");
		System.out.println(found);
		
		found=dao.findByCaseInSensitiveAndTrimmed("ChennaiSuperKings");
		System.out.println(found);
	}

}
