/**
 * 
 */
package cm.objis.cameroun.GestionRdv.service; // package service

import java.util.List;

import cm.objis.cameroun.GestionRdv.dao.Dao;
import cm.objis.cameroun.GestionRdv.dao.IDao;
import cm.objis.cameroun.GestionRdv.domaine.Patient;

public class Service implements IService {
    
	private IDao dao;
	public Service() {
		dao = new Dao();
	}

	@Override
	public int savePatientService(Patient patient) {
		// TODO Auto-generated method stub
		return dao.savePatientDao(patient);
	}

	@Override
	public List<Patient> getAllPatientService() {
		// TODO Auto-generated method stub
		return dao.getAllPatientDao();
	}

	
		
	}

