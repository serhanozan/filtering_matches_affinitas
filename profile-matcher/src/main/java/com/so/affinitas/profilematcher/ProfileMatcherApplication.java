package com.so.affinitas.profilematcher;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.so.affinitas.profilematcher.entity.City;
import com.so.affinitas.profilematcher.entity.Profile;
import com.so.affinitas.profilematcher.repository.CityRepository;
import com.so.affinitas.profilematcher.repository.ProfileRepository;

@SpringBootApplication
public class ProfileMatcherApplication {
	
	@Autowired
	private CityRepository cityRepository;	
	
	@Autowired
	private ProfileRepository profileRepository;	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProfileMatcherApplication.class, args); 
	}
	
	@PostConstruct
	public void initDB() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode array = mapper.readTree(getClass().getClassLoader().getResource("matches.json")).get("matches");
		List<Profile> profiles = mapper.convertValue(array, new TypeReference<List<Profile>>() {});
		HashSet<City> citySet = new HashSet<>();
		for (Profile profile : profiles) {
			citySet.add(profile.getCity());
		}
		cityRepository.saveAll(citySet);
		profileRepository.saveAll(profiles);
		
	}
}
