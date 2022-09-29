package com.example.scenariobased;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage, String>{
	
	// Write your own function here
	// public TourPackage findBySourceAndDestination(String src, String dest);
}
