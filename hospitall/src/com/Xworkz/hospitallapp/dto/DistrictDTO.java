package com.Xworkz.hospitallapp.dto;

public class DistrictDTO {
	private int districtId;
	private String districtName;
	private StateDTO state;
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public StateDTO getState() {
		return state;
	}
	public void setState(StateDTO state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "DistrictDTO [districtId=" + districtId + ", districtName=" + districtName + ", state=" + state + "]";
	}
	

}
