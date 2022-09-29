package com.example.scenariobased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/packages")
public class TourPackageController {
	
	@Autowired
	TourPackageService tourPackageService;
	
	@GetMapping("")
	public List<TourPackage> getAllPackages(){
		return tourPackageService.listAllPackages();
	}
	
	@PostMapping("")
	public void addPackage_(@RequestBody TourPackage tp) {
		tourPackageService.addPackage(tp);
	}
	
	@GetMapping("/from/{src}/to/{dest}")
	public TourPackage getPackage(@PathVariable("src") String src, @PathVariable("dest") String dest) {
	return tourPackageService.findPackage(src, dest);
	}
}
