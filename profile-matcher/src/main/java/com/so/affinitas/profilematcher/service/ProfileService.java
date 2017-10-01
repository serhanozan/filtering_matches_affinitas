package com.so.affinitas.profilematcher.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.so.affinitas.profilematcher.entity.City;
import com.so.affinitas.profilematcher.entity.Profile;
import com.so.affinitas.profilematcher.filter.DistanceFilter;
import com.so.affinitas.profilematcher.filter.ProfileFilter;
import com.so.affinitas.profilematcher.repository.ProfileRepository;
import com.so.affinitas.profilematcher.util.Haversine;

import static com.so.affinitas.profilematcher.specs.ProfileSpecifications.*;

@Service
public class ProfileService {

	@Autowired
	ProfileRepository repository;
	
	public List<Profile> getAll(){
		return repository.findAll();
	}
	
	public List<Profile> getFiltered(ProfileFilter filter){

		Specifications<Profile> profileSpecs = Specifications.where(profileByPhoto(filter.getHasPhoto()))
				.and(profileByInContact(filter.getInContact()))
				.and(profileByFavourite(filter.getIsFavourite()))
				.and(profileByCompatibilityScore(filter.getMinCompatibilityScore(), filter.getMaxCompatibilityScore()))
				.and(profileByAge(filter.getMinAge(),filter.getMaxAge()))
				.and(profileByHeight(filter.getMinHeight(), filter.getMaxHeight()));
		
		List<Profile> filteredProfiles = repository.findAll(profileSpecs);
		
		if(filteredProfiles == null || filteredProfiles.size() == 0) {
			return filteredProfiles;
		}
		
		double minDistance = 0; // same city
		double maxDistance = 40076.4; // equator :)
		if(filter.getDistanceLevel().equals(DistanceFilter.MINIMUM)) {
			// closer than 30 km
			maxDistance = 30;
		}else if(filter.getDistanceLevel().equals(DistanceFilter.MODERATE)) {
			// between 30 km and 300 km
			minDistance = 30;
			maxDistance = 300;
		}else if(filter.getDistanceLevel().equals(DistanceFilter.MAXIMUM)) {
			// far away more than 300 km
			minDistance = 300;
		}
		
		// Source location chosen manually
		City sourceCity = filteredProfiles.get(0).getCity();
		List<Profile> filteredProfilesByDistance = new ArrayList<>();
		double calculatedDistance;
		for (Profile profile : filteredProfiles) {
			calculatedDistance = Haversine.haversine(sourceCity, profile.getCity());
			if(calculatedDistance >= minDistance && calculatedDistance < maxDistance) {
				filteredProfilesByDistance.add(profile);
			}
		}
				
		return filteredProfilesByDistance;
	}
}
