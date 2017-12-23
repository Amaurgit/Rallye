package fr.eni.rallye.test;

import java.util.Date;

public class Resultat {
	private Date temps;
	private Equipage equipage;
	private Speciale speciale;

	public Resultat(Equipage equipage, Speciale speciale, Date temps) {
		this.temps = temps;
	}

	public Date getTemps() {
		return temps;
	}

	public Equipage getEquipage() {
		return equipage;
	}

	public Speciale getSpeciale() {
		return speciale;
	}

	public String infosResultat() {
		return "Resultat [temps=" + temps + ", equipage=" + equipage + ", speciale=" + speciale + "]";
	}

}
