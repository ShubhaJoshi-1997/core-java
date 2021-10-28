package com.Xworkz.hospitallapp.dto;


public class StateDTO{

	private int stateDTO;
	private String stateName;
	private DistrictDTO districtDTO;

	
	public int getStateId() {
		return stateDTO;
	}

	public void setStateId(int stateId) {
		this.stateDTO = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public DistrictDTO getDistrictDTO() {
		return districtDTO;
	}
	
	public void setDistrictDTO(DistrictDTO districtDTO) {
		this.districtDTO = districtDTO;
	}


	@Override
	public String toString() {
		return "{\n stateDTO=" + stateDTO + ",\n stateName=" + stateName + ",\n districtDTO=" + districtDTO + "}";
	}

}