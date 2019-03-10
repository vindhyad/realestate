package com.cg.frs.dto;

public class FlatRegistrationDTO {
private int ownerId;
private String ownerName;
private String mobile;
private int flatRegNo;
private int flatType;
private int flatarea;
private int rentAmount;
private int depositAmount;
public int getOwnerId() {
	return ownerId;
}
public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}
public String getOwnerName() {
	return ownerName;
}

public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getFlatRegNo() {
	return flatRegNo;
}
public void setFlatRegNo(int flatRegNo) {
	this.flatRegNo = flatRegNo;
}
public int getFlatType() {
	return flatType;
}
public void setFlatType(int flatType) {
	this.flatType = flatType;
}
public int getFlatarea() {
	return flatarea;
}
public void setFlatarea(int flatarea) {
	this.flatarea = flatarea;
}
public int getRentAmount() {
	return rentAmount;
}
public void setRentAmount(int rentAmount) {
	this.rentAmount = rentAmount;
}
public int getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount(int depositAmount) {
	this.depositAmount = depositAmount;
}
}
