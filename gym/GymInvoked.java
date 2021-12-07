package com.Xworkz.projectapp.gym;

public class GymInvoked {
	public static void main(String[] args) {
		String gymName="Golds Gym";
		gymName=gymName.replace(" "," ");
		System.out.println(gymName);
		
		GymDAO dao=new GymDAO();
		
		dao.save("Bodyline Gym");
		dao.save("Quadz Fitness");
		dao.save("Golds Gym");
		dao.save("Fitness Race");
		dao.save("Quadz Fitness");
		
		boolean found=dao.find("Golds Gym");
		System.out.println(found);
		
		found=dao.findByCaseInSensitive("Golds Gym");
		System.out.println(found);
		
		found=dao.findByCaseInSensitiveAndTrimmed("Golds Gym");
		System.out.println(found);
	}

}
