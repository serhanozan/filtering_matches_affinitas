package com.so.affinitas.profilematcher.specs;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.so.affinitas.profilematcher.entity.Profile;
import com.so.affinitas.profilematcher.repository.ProfileRepository;

import static org.junit.Assert.*;
import static com.so.affinitas.profilematcher.specs.ProfileSpecifications.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileSpecificationsTests {

	@Autowired
	private ProfileRepository profileRepository;	
	
	@Test
	public void favouriteProfileCountShouldBeSix() {
		List<Profile> filteredProfiles = profileRepository.findAll(profileByFavourite(true));
		assertEquals(6, filteredProfiles.size());
	}
	
	@Test
	public void notInContactCountShouldBeThirteen() {
		List<Profile> filteredProfiles = profileRepository.findAll(profileByInContact(false));
		assertEquals(13, filteredProfiles.size());
	}
	
	@Test
	public void notHavingMainPhotoCountShouldBeThree() {
		List<Profile> filteredProfiles = profileRepository.findAll(profileByPhoto(false));
		assertEquals(3, filteredProfiles.size());
	}
	
	@Test
	public void compatibilityScoreSixtyToEightyCountShouldBeThree() {
		List<Profile> filteredProfiles = profileRepository.findAll(profileByCompatibilityScore(new BigDecimal(.6), new BigDecimal(.8)));
		assertEquals(3, filteredProfiles.size());
	}
	
	@Test
	public void ageFromThirtyToFourtyCountShouldBeThirteen() {
		List<Profile> filteredProfiles = profileRepository.findAll(profileByAge(30,40));
		assertEquals(13, filteredProfiles.size());
	}
	
	@Test
	public void heightOneSixtyToOneNinetyCountShouldBeTwelve() {
		List<Profile> filteredProfiles = profileRepository.findAll(profileByHeight(160,190));
		assertEquals(12, filteredProfiles.size());
	}
}
