package com.example.abc_landing_page_cms.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Heading {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String heading;

	 //http://localhost:8080/index.html → Landing Page

		// http://localhost:8080/cms.html → CMS Page
	

}
