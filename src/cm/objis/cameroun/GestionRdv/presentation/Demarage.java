package cm.objis.cameroun.GestionRdv.presentation;

import java.util.List;

import cm.objis.cameroun.GestionRdv.dao.Dao;
import cm.objis.cameroun.GestionRdv.dao.IDao;
import cm.objis.cameroun.GestionRdv.domaine.Patient;
import cm.objis.cameroun.GestionRdv.service.IService;
import cm.objis.cameroun.GestionRdv.service.Service;

public class Demarage {
    
	public Demarage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println("Bienvenue dans mon application de gestion des rendez-vous : medrdv!!!");	
		// creation d'un patient.
		
		Patient patient1 = new Patient("2018","AXELINHO","Gabinho",20,180,75);
		
     // appel de la couche Service.
     IService service = new Service();
     
     // enregistrement du patient en base de donnee.
     service.savePatientService(patient1);
     
    // System.out.println("Patient enregistré avec succes!!!");
     
     // recuperation de la liste des patients en bd
     List<Patient> listPatient = service.getAllPatientService();
     
     // affichage de la liste des eleves
     
       for (Patient patient : listPatient) {
    	   System.out.println(patient);  
       }
       
       

	}
     }
