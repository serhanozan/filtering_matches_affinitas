package com.so.affinitas.profilematcher.filter;

import java.math.BigDecimal;

public class ProfileFilter {

	private Boolean hasPhoto;
	private Boolean inContact;
	private Boolean isFavourite;
	private BigDecimal minCompatibilityScore;
	private BigDecimal maxCompatibilityScore;
	private Integer minAge;
	private Integer maxAge;
	private Integer minHeight;
	private Integer maxHeight;
	private DistanceFilter distanceLevel;
	
	/**
	 * @return the hasPhoto
	 */
	public Boolean getHasPhoto() {
		return hasPhoto;
	}
	/**
	 * @param hasPhoto the hasPhoto to set
	 */
	public void setHasPhoto(Boolean hasPhoto) {
		this.hasPhoto = hasPhoto;
	}
	/**
	 * @return the inContact
	 */
	public Boolean getInContact() {
		return inContact;
	}
	/**
	 * @param inContact the inContact to set
	 */
	public void setInContact(Boolean inContact) {
		this.inContact = inContact;
	}
	/**
	 * @return the isFavourite
	 */
	public Boolean getIsFavourite() {
		return isFavourite;
	}
	/**
	 * @param isFavourite the isFavourite to set
	 */
	public void setIsFavourite(Boolean isFavourite) {
		this.isFavourite = isFavourite;
	}
	/**
	 * @return the minCompatibilityScore
	 */
	public BigDecimal getMinCompatibilityScore() {
		return minCompatibilityScore;
	}
	/**
	 * @param minCompatibilityScore the minCompatibilityScore to set
	 */
	public void setMinCompatibilityScore(BigDecimal minCompatibilityScore) {
		this.minCompatibilityScore = minCompatibilityScore;
	}
	/**
	 * @return the maxCompatibilityScore
	 */
	public BigDecimal getMaxCompatibilityScore() {
		return maxCompatibilityScore;
	}
	/**
	 * @param maxCompatibilityScore the maxCompatibilityScore to set
	 */
	public void setMaxCompatibilityScore(BigDecimal maxCompatibilityScore) {
		this.maxCompatibilityScore = maxCompatibilityScore;
	}
	/**
	 * @return the minAge
	 */
	public Integer getMinAge() {
		return minAge;
	}
	/**
	 * @param minAge the minAge to set
	 */
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	/**
	 * @return the maxAge
	 */
	public Integer getMaxAge() {
		return maxAge;
	}
	/**
	 * @param maxAge the maxAge to set
	 */
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
	/**
	 * @return the minHeight
	 */
	public Integer getMinHeight() {
		return minHeight;
	}
	/**
	 * @param minHeight the minHeight to set
	 */
	public void setMinHeight(Integer minHeight) {
		this.minHeight = minHeight;
	}
	/**
	 * @return the maxHeight
	 */
	public Integer getMaxHeight() {
		return maxHeight;
	}
	/**
	 * @param maxHeight the maxHeight to set
	 */
	public void setMaxHeight(Integer maxHeight) {
		this.maxHeight = maxHeight;
	}
	/**
	 * @return the distanceLevel
	 */
	public DistanceFilter getDistanceLevel() {
		return distanceLevel;
	}
	/**
	 * @param distanceLevel the distanceLevel to set
	 */
	public void setDistanceLevel(DistanceFilter distanceLevel) {
		this.distanceLevel = distanceLevel;
	}
}
