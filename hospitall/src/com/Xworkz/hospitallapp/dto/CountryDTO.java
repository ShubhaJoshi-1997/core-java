package com.Xworkz.hospitallapp.dto;


public class CountryDTO{

	private int countryId;
	private String countryName;
	private StateDTO stateDTO;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryname() {
		return countryName;
	}

	public void setCountryname(String countryName) {
		this.countryName = countryName;
	}
	
	public void setStateDTO(StateDTO stateDTO) {
		this.stateDTO = stateDTO;
	}
	
	public StateDTO getStateDTO() {
		return stateDTO;
	}

	@Override
	public String toString() {
		return "{\ncountryId=" + countryId + ",\n countryName=" + countryName + ",\n stateDTO=" + stateDTO + "}";
	}

}
