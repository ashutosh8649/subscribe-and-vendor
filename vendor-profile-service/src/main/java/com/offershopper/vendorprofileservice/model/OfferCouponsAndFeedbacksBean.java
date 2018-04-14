package com.offershopper.vendorprofileservice.model;

import java.time.LocalDateTime;
import java.util.List;

public class OfferCouponsAndFeedbacksBean {

  private String offerId;
  private String offerTitle;
  private LocalDateTime offerValidity;
  private LocalDateTime dateOfAnnouncement;
  private String offerDescription;
  private Float originalPrice;
  private Float discount;
  private Integer offerRating;
  private String offerCategory;
  private String offerTerms;
  
  private List<CouponAndFeedbackModified> couponsAndFeedbackList;

  public OfferCouponsAndFeedbacksBean() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  public OfferCouponsAndFeedbacksBean(String offerId, String offerTitle, LocalDateTime offerValidity,
      LocalDateTime dateOfAnnouncement, String offerDescription, Float originalPrice, Float discount,
      Integer offerRating, String offerCategory, String offerTerms,
      List<CouponAndFeedbackModified> couponsAndFeedbackList) {
    super();
    this.offerId = offerId;
    this.offerTitle = offerTitle;
    this.offerValidity = offerValidity;
    this.dateOfAnnouncement = dateOfAnnouncement;
    this.offerDescription = offerDescription;
    this.originalPrice = originalPrice;
    this.discount = discount;
    this.offerRating = offerRating;
    this.offerCategory = offerCategory;
    this.offerTerms = offerTerms;
    this.couponsAndFeedbackList = couponsAndFeedbackList;
  }

  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }
  public String getOfferTitle() {
    return offerTitle;
  }
  public void setOfferTitle(String offerTitle) {
    this.offerTitle = offerTitle;
  }
  public LocalDateTime getOfferValidity() {
    return offerValidity;
  }
  public void setOfferValidity(LocalDateTime offerValidity) {
    this.offerValidity = offerValidity;
  }
  public LocalDateTime getDateOfAnnouncement() {
    return dateOfAnnouncement;
  }
  public void setDateOfAnnouncement(LocalDateTime dateOfAnnouncement) {
    this.dateOfAnnouncement = dateOfAnnouncement;
  }
  public String getOfferDescription() {
    return offerDescription;
  }
  public void setOfferDescription(String offerDescription) {
    this.offerDescription = offerDescription;
  }
  public Float getOriginalPrice() {
    return originalPrice;
  }
  public void setOriginalPrice(Float originalPrice) {
    this.originalPrice = originalPrice;
  }
  public Float getDiscount() {
    return discount;
  }
  public void setDiscount(Float discount) {
    this.discount = discount;
  }
  public Integer getOfferRating() {
    return offerRating;
  }
  public void setOfferRating(Integer offerRating) {
    this.offerRating = offerRating;
  }
  public String getOfferCategory() {
    return offerCategory;
  }
  public void setOfferCategory(String offerCategory) {
    this.offerCategory = offerCategory;
  }
  public String getOfferTerms() {
    return offerTerms;
  }
  public void setOfferTerms(String offerTerms) {
    this.offerTerms = offerTerms;
  }
  

  
}
