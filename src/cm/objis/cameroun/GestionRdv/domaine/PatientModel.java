package cm.objis.cameroun.GestionRdv.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class PatientModel extends AbstractTableModel {

	private final String[] entetes = {"Matricule", "Nom","Prenom","Age","Taille","Poids"};

    private List<Patient> patient;
    
    public PatientModel() {
    	
    	
    }
    
    public PatientModel(List<Patient> patient) {  
        this.patient = patient; 
    }


    public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}



	@Override
    public int getRowCount() {
        return patient.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // Matricule
                return patient.get(rowIndex).getMatricule();

            case 1:
                // Nom
                return patient.get(rowIndex).getNom();
            case 2:
                // Prenom
                return patient.get(rowIndex).getPrenom();
            case 3:
                // Age
                return patient.get(rowIndex).getAge();
            case 4:
                // taille
                return patient.get(rowIndex).getTaille();
            case 5:
                // Poids
                return patient.get(rowIndex).getPoids();
            default:
                throw new IllegalArgumentException();

        }
       
        
    }



}
