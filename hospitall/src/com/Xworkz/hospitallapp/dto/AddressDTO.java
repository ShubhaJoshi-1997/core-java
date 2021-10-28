package com.Xworkz.hospitallapp.dto;

public class AddressDTO {

		private int addressId;
		private CountryDTO countryDTO;
		
		public int getAddressId() {
			return addressId;
		}
		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}
		
		public void setCountryDTO(CountryDTO countryDTO) {
			this.countryDTO = countryDTO;
		}
		
		public CountryDTO getCountryDTO() {
			return countryDTO;
		}
		
		@Override
		public String toString() {
			return "AddressDTO-{\naddressId=" + addressId + ",\n " + countryDTO + "}";
		}
			
}