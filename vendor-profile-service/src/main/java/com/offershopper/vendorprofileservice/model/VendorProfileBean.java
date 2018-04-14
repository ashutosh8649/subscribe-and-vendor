package com.offershopper.vendorprofileservice.model;

import java.util.List;

public class VendorProfileBean {

  public String id;
  public String firstName;
  public String lastName;
  public String email;
  public AddressBean shopAddress;
  public String vendorMobileNo;
  List<OfferCouponsAndFeedbacksBean> offersAndFeedbackBean;
  
  
  public VendorProfileBean() {
    super();
    // TODO Auto-generated constructor stub
  }
  


  public VendorProfileBean(String id, String firstName, String lastName, String email, AddressBean shopAddress,
      String vendorMobileNo, List<OfferCouponsAndFeedbacksBean> offersAndFeedbackBean) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.shopAddress = shopAddress;
    this.vendorMobileNo = vendorMobileNo;
    this.offersAndFeedbackBean = offersAndFeedbackBean;
  }



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
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  public List<OfferCouponsAndFeedbacksBean> getOffersAndFeedbackBean() {
    return offersAndFeedbackBean;
  }
  public void setOffersAndFeedbackBean(List<OfferCouponsAndFeedbacksBean> offersAndFeedbackBean) {
    this.offersAndFeedbackBean = offersAndFeedbackBean;
  }
  

  
}
