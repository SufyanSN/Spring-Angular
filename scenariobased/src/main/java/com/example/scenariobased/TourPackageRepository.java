package com.example.scenariobased;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage, String>{
	
	public TourPackage findBySourceAndDestination(String source, String destination);
}
