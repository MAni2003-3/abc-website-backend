package com.example.abc_landing_page_cms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abc_landing_page_cms.dto.Heading;

@Repository
public interface HeadingRepository extends JpaRepository<Heading, Long> {
    Optional<Heading> findTopByOrderByIdDesc(); 
}
