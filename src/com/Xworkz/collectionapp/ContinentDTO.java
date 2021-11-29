package com.Xworkz.collectionapp;

public class ContinentDTO {
	

		private String name;
		private int countries;
		private int population;

		public String getName(){
		return name;
		}

		public void setName(String name){
		this.name=name;
		}

		public int getCountries(){
		return countries;
		}

		public void setCountries(int countries){
		this.countries=countries;
		}

		public int getPopulation(){
		return population;
		}

		public void setPopulation(int population){
		this.population= population;
		}

		@Override
		public String toString(){
			return "StateDTO - [name = "+this.name+" , countries = "+this.countries+" , population = "+this.population+"]";
		}

		}

