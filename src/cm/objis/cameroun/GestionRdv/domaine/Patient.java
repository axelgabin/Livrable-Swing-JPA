package cm.objis.cameroun.GestionRdv.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Classe qui contient les informations du patient.
 * 
 * @author Axel Amadala
 * @version 3.0
 */
// declaration de la classe patient.
@Entity
public class Patient {

	// les propriétés.
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private int age;
	private int taille;
	private double poids;

	// les constructeurs.
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(String matricule, String nom, String prenom, int age, int taille, double poids) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", taille=" + taille + ", poids=" + poids + "]";
	}

	
	
}