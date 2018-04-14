package com.offershopper.vendorprofileservice.model;

public class CouponAndFeedbackModified {

  private String couponId;
  private String feedback;
  public CouponAndFeedbackModified() {
    super();
    // TODO Auto-generated constructor stub
  }
  public CouponAndFeedbackModified(String couponId, String feedback) {
    super();
    this.couponId = couponId;
    this.feedback = feedback;
  }
  public String getCouponId() {
    return couponId;
  }
  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }
  public String getFeedback() {
    return feedback;
  }
  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }
  
  
  
}
