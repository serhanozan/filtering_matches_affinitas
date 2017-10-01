package com.so.affinitas.profilematcher.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id	
	private String name;
	
	@Column(precision = 9, scale = 6)
	private BigDecimal lat;
	
	@Column(precision = 9, scale = 6)
	private BigDecimal lon;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal latitude) {
		this.lat = latitude;
	}

	public BigDecimal getLon() {
		return lon;
	}

	public void setLon(BigDecimal longitude) {
		this.lon = longitude;
	}
	
	public City() {}

	public City(String name, BigDecimal latitude, BigDecimal longitude) {
		this.name = name;
		this.lat = latitude;
		this.lon = longitude;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lat == null) ? 0 : lat.hashCode());
		result = prime * result + ((lon == null) ? 0 : lon.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		City other = (City) obj;
		if (lat == null) {
			if (other.lat != null)
				return false;
		} else if (!lat.equals(other.lat))
			return false;
		if (lon == null) {
			if (other.lon != null)
				return false;
		} else if (!lon.equals(other.lon))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [ name=" + name + ", lat=" + lat + ", lon=" + lon + "]";
	}
	
}