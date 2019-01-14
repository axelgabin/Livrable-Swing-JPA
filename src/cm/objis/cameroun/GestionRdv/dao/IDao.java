package cm.objis.cameroun.GestionRdv.dao;

import java.util.List;

import cm.objis.cameroun.GestionRdv.domaine.Patient;

// interfaace IDao.
public interface IDao {
       public int savePatientDao(Patient patient); // methode savePatientDao de type int qui va retourner une confirmation de type int.
       public List<Patient> getAllPatientDao(); // on va stocker la liste des patients dans une collection de type  (List).
}
