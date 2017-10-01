package com.so.affinitas.profilematcher.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Profile {

	@Id
	@GeneratedValue
	private Integer id;
	
	@JsonProperty("display_name")
	private String displayName;
	
	private Integer age;
	
	@JsonProperty("job_title")
	private String jobTitle;
	
	@JsonProperty("height_in_cm")
	private Integer heightInCm;
	
	@ManyToOne
	private City city;
	
	@JsonProperty("main_photo")
	private String mainPhoto;
	
	@JsonProperty("compatibility_score")
	private BigDecimal compatibilityScore;
	
	@JsonProperty("contacts_exchanged")
	private Integer contactsExchanged;
	
	private Boolean favourite;
	
	private String religion;
	
	protected Profile() {}

	public Profile(Integer id, String displayName, Integer age, String jobTitle, Integer heightInCm, City city,
			String mainPhoto, BigDecimal compatibilityScore, Integer contactsExchanged, Boolean favourite,
			String religion) {
		this.id = id;
		this.displayName = displayName;
		this.age = age;
		this.jobTitle = jobTitle;
		this.heightInCm = heightInCm;
		this.city = city;
		this.mainPhoto = mainPhoto;
		this.compatibilityScore = compatibilityScore;
		this.contactsExchanged = contactsExchanged;
		this.favourite = favourite;
		this.religion = religion;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the heightInCm
	 */
	public Integer getHeightInCm() {
		return heightInCm;
	}

	/**
	 * @param heightInCm the heightInCm to set
	 */
	public void setHeightInCm(Integer heightInCm) {
		this.heightInCm = heightInCm;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the mainPhoto
	 */
	public String getMainPhoto() {
		return mainPhoto;
	}

	/**
	 * @param mainPhoto the mainPhoto to set
	 */
	public void setMainPhoto(String mainPhoto) {
		this.mainPhoto = mainPhoto;
	}

	/**
	 * @return the compatibilityScore
	 */
	public BigDecimal getCompatibilityScore() {
		return compatibilityScore;
	}

	/**
	 * @param compatibilityScore the compatibilityScore to set
	 */
	public void setCompatibilityScore(BigDecimal compatibilityScore) {
		this.compatibilityScore = compatibilityScore;
	}

	/**
	 * @return the contactsExchanged
	 */
	public Integer getContactsExchanged() {
		return contactsExchanged;
	}

	/**
	 * @param contactsExchanged the contactsExchanged to set
	 */
	public void setContactsExchanged(Integer contactsExchanged) {
		this.contactsExchanged = contactsExchanged;
	}

	/**
	 * @return the favourite
	 */
	public Boolean getFavourite() {
		return favourite;
	}

	/**
	 * @param favourite the favourite to set
	 */
	public void setFavourite(Boolean favourite) {
		this.favourite = favourite;
	}

	/**
	 * @return the religion
	 */
	public String getReligion() {
		return religion;
	}

	/**
	 * @param religion the religion to set
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((compatibilityScore == null) ? 0 : compatibilityScore.hashCode());
		result = prime * result + ((contactsExchanged == null) ? 0 : contactsExchanged.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((favourite == null) ? 0 : favourite.hashCode());
		result = prime * result + ((heightInCm == null) ? 0 : heightInCm.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + ((mainPhoto == null) ? 0 : mainPhoto.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profile other = (Profile) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (compatibilityScore == null) {
			if (other.compatibilityScore != null)
				return false;
		} else if (!compatibilityScore.equals(other.compatibilityScore))
			return false;
		if (contactsExchanged == null) {
			if (other.contactsExchanged != null)
				return false;
		} else if (!contactsExchanged.equals(other.contactsExchanged))
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (favourite == null) {
			if (other.favourite != null)
				return false;
		} else if (!favourite.equals(other.favourite))
			return false;
		if (heightInCm == null) {
			if (other.heightInCm != null)
				return false;
		} else if (!heightInCm.equals(other.heightInCm))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (mainPhoto == null) {
			if (other.mainPhoto != null)
				return false;
		} else if (!mainPhoto.equals(other.mainPhoto))
			return false;
		if (religion == null) {
			if (other.religion != null)
				return false;
		} else if (!religion.equals(other.religion))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [id=" + id + ", displayName=" + displayName + ", age=" + age + ", jobTitle=" + jobTitle
				+ ", heightInCm=" + heightInCm + ", city=" + city + ", mainPhoto=" + mainPhoto + ", compatibilityScore="
				+ compatibilityScore + ", contactsExchanged=" + contactsExchanged + ", favourite=" + favourite
				+ ", religion=" + religion + "]";
	}

}
