package com.so.affinitas.profilematcher.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.so.affinitas.profilematcher.entity.Profile;
import com.so.affinitas.profilematcher.filter.ProfileFilter;
import com.so.affinitas.profilematcher.service.ProfileService;

@RestController
public class ProfileResource {

	@Autowired
	ProfileService service;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/profile/all")
	public List<Profile> retrieveAllProfiles() {
		return service.getAll();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/profile/filtered")
	public List<Profile> retrieveProfilesFiltered(@RequestBody ProfileFilter filter) {
		return service.getFiltered(filter);
	}
}
