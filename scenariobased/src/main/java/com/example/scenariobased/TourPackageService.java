package com.example.scenariobased;

import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class TourPackageService {
	private TourPackageRepository tourPackageRepository;

	public TourPackageService(TourPackageRepository tourPackageRepository) {
		this.tourPackageRepository = tourPackageRepository;
	}
	
	
	public List<TourPackage> listAllPackages(){
		return tourPackageRepository.findAll();
	}
	
	public void addPackage(TourPackage tourPackage) {
		tourPackageRepository.save(tourPackage);
	}
	
	public TourPackage findPackage(String src, String dest) {
		TourPackage pkg = tourPackageRepository.findBySourceAndDestination(src, dest);
		System.out.println(pkg);
		
		int number_of_days;
		double a,b,c,basic_fare,discount=0,package_cost;
		
		Scanner scanner = new Scanner(System.in);
		number_of_days = scanner.nextInt();
		basic_fare = pkg.getBasic_fare();
		
		 if (number_of_days<=5){
             discount = 0;
         } else if (number_of_days>5 && number_of_days<=8) {
             discount = 0.03;
         } else if (number_of_days>8 && number_of_days<=10) {
             discount = 0.05;
         } else if (number_of_days>10) {
             discount = 0.07;
         }

         a=(basic_fare*number_of_days);
         b=a*discount;
         c= b*(12/100);
         package_cost = a-b+c;
         
         System.out.println("Package cost = " + package_cost);
		
		return pkg;
	}
}
