package fr.eni.rallye.test;

import java.awt.Window.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Speciale {

	private Date jour_Heure;
	private double distance;
	private String nom;

	private Type_Epreuve type;

	public Speciale(String nom, Date jour_Heure, double distance, Type_Epreuve type) {
		super();
		this.jour_Heure = jour_Heure;
		this.distance = distance;
		this.nom = nom;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public String infosSpeciale() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYY hh:mm");
		return "	Speciale [Nom=" + nom + ", jour_Heure= " + sdf.format(jour_Heure) + ", distance=" + distance
				+ ", nom=" + nom + ", type=" + type + "]" + System.lineSeparator();
	}

	public Resultat[] getClassement() {
		return null;
	}

}
