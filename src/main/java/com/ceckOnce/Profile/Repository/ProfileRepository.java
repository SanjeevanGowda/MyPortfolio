package com.ceckOnce.Profile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceckOnce.Profile.Model.ProfileModel;

@Repository()
public interface ProfileRepository extends JpaRepository<ProfileModel,Long> {
	
}
