package com.wipro.Collections.Map.Question5;


import java.util.TreeMap;



public class Main {

	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		TreeMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}

}