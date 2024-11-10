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

    public void saveRegister(ProfileModel registercontact) {
    	profilerepository.save(registercontact);
    }
}
