package cm.objis.cameroun.GestionRdv.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import cm.objis.cameroun.GestionRdv.domaine.Patient;

public class Dao implements IDao {

	public Dao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int savePatientDao(Patient patient) {
		
		try {
			
			// 1 : Obtention d'un EntityManager
			
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
			
			// 2 : Ouverture transaction 
			EntityTransaction tx =  em.getTransaction();   
			tx.begin();
			
			// 3 : Persistence objet creation: insertion de l'objet en BD
			em.persist(patient);
			
			
			// 4 : Fermeture transaction 
			 tx.commit();
			 
			 
			 } catch (Exception e) {
			e.printStackTrace();
			
			
			return 0;
		} 
		
	
		return 1;
		
	}

	@Override
	public List<Patient> getAllPatientDao() {
		

        //création d'une collection de patients
		List<Patient> maListPatient= new ArrayList<Patient>();
	
		
		try {
			
			// 1 : Obtention d'un EntityManager
			
				EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
						
				// 2 : Ouverture transaction 
				EntityTransaction tx =  em.getTransaction();
						tx.begin();
						
				// 3 : Obtention de la liste des patients via EntityManager
				
						
				maListPatient = em.createQuery("from Patient", Patient.class).getResultList();
				
		//		maListPatient = em.createQuery("from Patient e where e.classe = :AXEL", Patient.class) //permet de trouver des info specifique
					//	.setParameter("AXEL", "AXEL")
					//	.getResultList();		
						
				// 4 : Fermeture transaction 
				 tx.commit();
				 
				 // Etape 5 : gestion des exceptions et libération 'automatique' des ressources
				 
				 } catch (Exception e) {
			e.printStackTrace();
			
		} 
	
		
		return maListPatient;
		
	}

}