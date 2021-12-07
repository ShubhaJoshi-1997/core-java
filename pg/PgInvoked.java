package com.Xworkz.projectapp.pg;

public class PgInvoked {
	public static void main(String[] args) {
		String pgName="Khushi Pg";
		pgName=pgName.replace(" "," ");
		System.out.println(pgName);
		
		PgDAO dao=new PgDAO();
		dao.save("Khushi pg");
		dao.save("Sri Lakshmi pg");
		dao.save("Shreenidhi pg");
		dao.save("Rakshita pg");
		dao.save("Veena Bhasakar pg");
		
		boolean found=dao.find("Khushi pg");
		System.out.println(found);
		
		found=dao.findByCaseInSensitive("Khushi pg");
		System.out.println(found);
		
		found=dao.findByCaseInSensitiveAndTrimmed("Khushi pg");
		System.out.println(found);
	}

}
