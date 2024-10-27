package com.ceckOnce.Profile.Service;

import java.security.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceckOnce.Profile.Model.ProfileModel;
import com.ceckOnce.Profile.Repository.ProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profilerepository;
	public void saveContact(ProfileModel contact) {
		profilerepository.save(contact);
    }
	
	// Optional: Method to retrieve all contact submissions
//    public List<ProfileModel> getAllContacts() {
//        return profilerepository.findAll();
//    }
    
 // Optional: Method to retrieve a specific contact submission by ID
//    public ProfileModel getContactById(Long id) {
//        return profilerepository.findById(id).orElse(null);
//    }
	// Handle user registration
    public void saveRegister(ProfileModel registercontact) {
    	profilerepository.save(registercontact);
    }
}
