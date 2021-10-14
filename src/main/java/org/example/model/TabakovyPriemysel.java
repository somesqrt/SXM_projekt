package org.example.model;

import java.util.*;


public class TabakovyPriemysel {

	private String region;

	private final List<Company> companies = new ArrayList<>();

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	/**
	 * @param region
	 *            nazov predmetu
	 */
	public TabakovyPriemysel(String region) {
		this.region = region;
	}


	public void vypis() {
		System.out.println("Region: " + getRegion());
		System.out.println("Company: ");
		for (Company student : companies) {
			student.vypis();
		}
	}
}