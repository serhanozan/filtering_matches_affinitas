package com.so.affinitas.profilematcher;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.so.affinitas.profilematcher.entity.Profile;
import com.so.affinitas.profilematcher.repository.ProfileRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc 
public class ProfileMatcherApplicationTests {


	@Autowired
	private ProfileRepository profileRepository;	
	
	@Test
	public void allResourceShouldReturnTwentyFiveEntries() {
		List<Profile> profiles = profileRepository.findAll();
		assertEquals(25, profiles.size());
	}
	
}
