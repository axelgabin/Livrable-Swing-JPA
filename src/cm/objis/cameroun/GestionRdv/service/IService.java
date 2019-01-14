package cm.objis.cameroun.GestionRdv.service;

import java.util.List;

import cm.objis.cameroun.GestionRdv.domaine.Patient;

// interface IService.

public interface IService {

	public int savePatientService(Patient patient); // methode savePatientService

	public List<Patient> getAllPatientService();

}
