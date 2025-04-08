package com.example.abc_landing_page_cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abc_landing_page_cms.dto.Heading;
import com.example.abc_landing_page_cms.repository.HeadingRepository;

@Service
public class HeadingService {
	 @Autowired
	    private HeadingRepository repo;

	    public String getLatestHeading() {
	        return repo.findTopByOrderByIdDesc()
	                   .map(Heading::getHeading)
	                   .orElse("Default Heading");
	    }

	    public void saveHeading(String text) {
	        Heading heading = new Heading();
	        heading.setHeading(text);
	        repo.save(heading);
	    }

}
