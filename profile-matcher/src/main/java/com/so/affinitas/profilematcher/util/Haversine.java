package com.so.affinitas.profilematcher.util;

import com.so.affinitas.profilematcher.entity.City;

public class Haversine {
	public static final double R = 6372.8; // In kilometers

	public static double haversine(City src, City dest) {
		double dLat = Math.toRadians(dest.getLat().doubleValue() - src.getLat().doubleValue());
		double dLon = Math.toRadians(dest.getLat().doubleValue() - src.getLat().doubleValue());
		double lat1 = Math.toRadians(src.getLat().doubleValue());
		double lat2 = Math.toRadians(dest.getLat().doubleValue());

		double a = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLon / 2), 2) * Math.cos(lat1) * Math.cos(lat2);
		double c = 2 * Math.asin(Math.sqrt(a));
		return R * c;
	}
}