package cm.objis.cameroun.GestionRdv.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import cm.objis.cameroun.GestionRdv.domaine.Patient;
import cm.objis.cameroun.GestionRdv.domaine.PatientModel;
import cm.objis.cameroun.GestionRdv.service.IService;
import cm.objis.cameroun.GestionRdv.service.Service;

import javax.swing.JTable;

public class ListeDesPatients extends JFrame {

	private JPanel contentPane;
	private JTable tablePatient;
	private PatientModel patientModel;

	

	/**
	 * Create the frame.
	 */
	public ListeDesPatients() {
		setTitle("LISTE DES PATIENTS");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		tablePatient = new JTable();
		
        IService service = new Service();
        
        List<Patient> patient = service.getAllPatientService();
        
	    patientModel = new PatientModel(service.getAllPatientService());
		contentPane.setLayout(null);
		
		tablePatient = new JTable(patientModel);
		
		
		JScrollPane scrollPane = new JScrollPane(tablePatient);
		scrollPane.setBounds(-9, 10, 452, 402);
		contentPane.add(scrollPane);
	}
}
