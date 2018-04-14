package com.offershopper.vendorprofileservice.model;

public class VendorDetailsBean {
   
  public String id;
  public String firstName;
  public String lastName;
  public String password;
  public String mobileNo;
  
  public String email;
  public String dob;
  public AddressBean address;
  public String gender;
  public int spinCount;
  public int creditPoint;
  public AddressBean shopAddress;
  public String vendorMobileNo;
  public String timestamp;
  
  //default constructor
public VendorDetailsBean() {
  super();  
}
//parameterized constructor
public VendorDetailsBean( String firstName, String lastName, String password, String mobileNo, String email,
    String dob, AddressBean address, String gender, int spinCount, int creditPoint, AddressBean shopAddress,
    String vendorMobileNo, String timestamp) {
  super();

  this.firstName = firstName;
  this.lastName = lastName;
  this.password = password;
  this.mobileNo = mobileNo;
  this.email = email;
  this.dob = dob;
  this.address = address;
  this.gender = gender;
  this.spinCount = spinCount;
  this.creditPoint = creditPoint;
  this.shopAddress = shopAddress;
  this.vendorMobileNo = vendorMobileNo;
  this.timestamp = timestamp;
}
//getters and setters
public String getId() {
  return id;
}
public void setId(String id) {
  this.id = id;
}
public String getFirstName() {
  return firstName;
}
public void setFirstName(String firstName) {
  this.firstName = firstName;
}
public String getLastName() {
  return lastName;
}
public void setLastName(String lastName) {
  this.lastName = lastName;
}
public String getPassword() {
  return password;
}
public String getMobileNo() {
  return mobileNo;
}
public void setMobileNo(String mobileNo) {
  this.mobileNo = mobileNo;
}
public String getEmail() {
  return email;
}
public void setEmail(String email) {
  this.email = email;
}
public String getDob() {
  return dob;
}
public void setDob(String dob) {
  this.dob = dob;
}
public AddressBean getAddress() {
  return address;
}
public void setAddress(AddressBean address) {
  this.address = address;
}
public String getGender() {
  return gender;
}
public void setGender(String gender) {
  this.gender = gender;
}
public int getSpinCount() {
  return spinCount;
}
public void setSpinCount(int spinCount) {
  this.spinCount = spinCount;
}
public int getCreditPoint() {
  return creditPoint;
}
public void setCreditPoint(int creditPoint) {
  this.creditPoint = creditPoint;
}
public AddressBean getShopAddress() {
  return shopAddress;
}
public void setShopAddress(AddressBean shopAddress) {
  this.shopAddress = shopAddress;
}
public String getVendorMobileNo() {
  return vendorMobileNo;
}
public void setVendorMobileNo(String vendorMobileNo) {
  this.vendorMobileNo = vendorMobileNo;
}
public String getTimestamp() {
  return timestamp;
}
public void setTimestamp(String timestamp) {
  this.timestamp = timestamp;
}
public void setPassword(String password) {
  this.password = password;
}
  
  

  


}
