package org.example.model;

import java.util.*;


public class Company {

	private String Nazov;


	private String Rok_zalozenia;


	private String Ustredie;


	private Brat Celkovy_penazny_brat;


	private Zisk Cisty_zisk;


	private String Stranka;


	private List<Znacky> znackies = new ArrayList<>();

	public String getNazov() {
		return Nazov;
	}

	public void setNazov(String nazov) {
		this.Nazov = nazov;
	}

	public String getRok_zalozenia() {
		return Rok_zalozenia;
	}

	public void setRok_zalozenia(String rok_zalozenia) {
		this.Rok_zalozenia = rok_zalozenia;
	}

	public String getUstredie() {
		return Ustredie;
	}

	public void setUstredie(String ustredie) {
		this.Ustredie = ustredie;
	}

	public String getCelkovy_penazny_brat() {
		return Celkovy_penazny_brat.getHodnota();
	}

	public int getCelkovy_penazny_brat_rok() {
		return Celkovy_penazny_brat.getRok();
	}

	public void setCelkovy_penazny_brat(String celkovy_penazny_brat) {this.Celkovy_penazny_brat.setHodnota(celkovy_penazny_brat);}

	public void setCelkovy_penazny_brat_rok(int celkovy_penazny_brat_rok) {this.Celkovy_penazny_brat.setRok(celkovy_penazny_brat_rok);}

	public String getCisty_zisk() {
		return Cisty_zisk.getHodnota();
	}

	public int getCisty_zisk_rok() {
		return Cisty_zisk.getRok();
	}

	public void setCisty_zisk(String cisty_zisk) {
		this.Cisty_zisk.setHodnota(cisty_zisk);
	}

	public void setCisty_zisk_rok(int cisty_zisk_rok) {
		this.Cisty_zisk.setRok(cisty_zisk_rok);
	}

	public String getStranka() {
		return Stranka;
	}

	public void setStranka(String stranka) {
		this.Stranka = stranka;
	}

	public List<Znacky> getZnackies() {
		return znackies;
	}

	public void vypis() {
		System.out.println(Nazov + " (" + Rok_zalozenia + ") Celkovy_penazny_brat"
				+ Celkovy_penazny_brat + ", Cisty_zisk: " + Cisty_zisk + ")");
		if (Stranka != null) {
			System.out.println("  Web: " + Stranka);
		}
		
		if (!znackies.isEmpty()) {
			System.out.print(" Znacky: ");
			for (Znacky znacky: znackies) {
				System.out.print(znacky.toString());
			}
			System.out.println();
		}
	}
}
