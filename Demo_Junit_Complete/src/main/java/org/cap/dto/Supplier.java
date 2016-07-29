package org.cap.dto;

public class Supplier {
	
	private String supplierName;
	private Address address;
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Supplier [supplierName=" + supplierName + ", address=" + address + "]";
	}
	
	
	

}
