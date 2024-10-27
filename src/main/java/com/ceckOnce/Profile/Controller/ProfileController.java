package com.ceckOnce.Profile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ceckOnce.Profile.Model.ProfileModel;
import com.ceckOnce.Profile.Service.ProfileService;

@Controller()
public class ProfileController {
	@Autowired()
	
	private ProfileService profileservice;
	@GetMapping("/home")
	public String demo() {
		return "home";
	}
	
	@GetMapping("/about")
    public String about() {
        return "about";
    }
	
	@GetMapping("/experience")
    public String experience() {
        return "experience";
    }
	
	@GetMapping("/contact")
    public String contact() {
        return "contact";
    }
	
	@PostMapping("/contact")
    public String submitContact(@RequestParam String name, @RequestParam String email, @RequestParam String message) {
        ProfileModel contact = new ProfileModel();
        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        // Save the contact details using the service
        profileservice.saveContact(contact);

        return "redirect:/contact";
    }
	@GetMapping("/register")
    public String register() {
        return "registration";
    }
	
	@PostMapping("/register")
    public String registerUser(@RequestParam String email) {
        // Delegate the registration logic to the service
		ProfileModel registercontact = new ProfileModel();
		registercontact.setEmail(email);
		
		profileservice.saveRegister(registercontact);
		
		return "redirect:/home";
    }
}
