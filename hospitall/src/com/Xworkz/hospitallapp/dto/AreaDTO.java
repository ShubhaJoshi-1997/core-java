package com.Xworkz.hospitallapp.dto;

public class AreaDTO {

	private int areaId;
	private String areaName;
	private StreetDTO streetDTO;

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	public StreetDTO getStreetDTO() {
		return streetDTO;
	}
	
	public void setStreetDTO(StreetDTO streetDTO) {
		this.streetDTO = streetDTO;
	}

	@Override
	public String toString() {
		return "{\n areaId=" + areaId + ",\n areaName=" + areaName + ",\n streetDTO=" + streetDTO + "}";
	}

}
