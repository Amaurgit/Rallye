package fr.eni.rallye.test;

import java.awt.Window.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Speciale {

	private Date jour_Heure;
	private double distance;
	private String nom;
	private Type_Epreuve type;
	private List<Resultat> resultats = new ArrayList<>(50);

	public Speciale(String nom, Date jour_Heure, double distance, Type_Epreuve type) {
		super();
		this.jour_Heure = jour_Heure;
		this.distance = distance;
		this.nom = nom;
		this.type = type;
	}

	public void AjouterResultat(Resultat resultat) {
		resultats.add(resultat);

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
		Resultat[] resultatsTab = new Resultat[resultats.size()];

		for (int i = 0; i < resultats.size(); i++) {
			resultatsTab[i] = resultats.get(i);
		}
		return resultatsTab;
	}

}
