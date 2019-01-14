package cm.objis.cameroun.GestionRdv.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cm.objis.cameroun.GestionRdv.domaine.Patient;
import cm.objis.cameroun.GestionRdv.service.Service;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnregistrerPatient extends JFrame {

	private JPanel contentPane;
	private JTextField matriculeTextField;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField ageTextField;
	private JTextField tailleTextField;
	private JTextField poidsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnregistrerPatient frame = new EnregistrerPatient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EnregistrerPatient() {
		setTitle("Enregistrer un patient");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricule = new JLabel("Matricule : ");
		lblMatricule.setBounds(10, 11, 62, 14);
		contentPane.add(lblMatricule);
		
		matriculeTextField = new JTextField();
		matriculeTextField.setBounds(72, 8, 255, 20);
		contentPane.add(matriculeTextField);
		matriculeTextField.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setBounds(10, 36, 46, 14);
		contentPane.add(lblNom);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(72, 33, 255, 20);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom : ");
		lblPrenom.setBounds(10, 58, 62, 14);
		contentPane.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(72, 64, 255, 20);
		contentPane.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age : ");
		lblAge.setBounds(10, 97, 46, 14);
		contentPane.add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(72, 94, 255, 20);
		contentPane.add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel lblTaille = new JLabel("Taille : ");
		lblTaille.setBounds(10, 124, 46, 14);
		contentPane.add(lblTaille);
		
		tailleTextField = new JTextField();
		tailleTextField.setBounds(72, 125, 255, 20);
		contentPane.add(tailleTextField);
		tailleTextField.setColumns(10);
		
		JLabel lblPoids = new JLabel("Poids : ");
		lblPoids.setBounds(10, 160, 46, 14);
		contentPane.add(lblPoids);
		
		poidsTextField = new JTextField();
		poidsTextField.setBounds(72, 157, 255, 20);
		contentPane.add(poidsTextField);
		poidsTextField.setColumns(10);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
// recuperation des valeurs saisies dans le formulaire
				
				// declaration des variables.
				String nom,prenom ,matricule;
				int age,taille;
				double poids;
				//affectation des valeurs saisies dans le formuaire.
				
				matricule = matriculeTextField.getText();
				nom = nomTextField.getText();
				prenom = prenomTextField.getText();
				age  = Integer.parseInt(ageTextField.getText());
				taille = Integer.parseInt(tailleTextField.getText());
				poids = Double.parseDouble(poidsTextField.getText());
				
				// creation d'un objet patient
				
				Patient patient = new Patient();
				patient.setMatricule(matricule);
				patient.setNom(prenom);
				patient.setPrenom(prenom);
				patient.setAge(age);
				patient.setTaille(taille);
				
				// Appel de la methode de la couche service 
				Service service = new Service();
				
				// d'enregistrement etat
				int etat;
				etat = service.savePatientService(patient);
				
				if(etat == 1) {
					
					//vidage des zones texte apres enregistrement.
					matriculeTextField.setText("");
					nomTextField.setText("");
					prenomTextField.setText("");
					ageTextField.setText("");
					tailleTextField.setText("");
					poidsTextField.setText("");
					
				    // affichage du dialogue box succes
					
					JOptionPane.showMessageDialog(null, "Le Patient " +patient.getNom() +""+ "a ete enregistré avec SUCCES dans la Base de donnée!!!");
				}else {
					JOptionPane.showMessageDialog(null, "Une ERREUR s'est produit pendant l'enregistrement");
				}
				
				
						
			
			}
		});
		btnEnregistrer.setBounds(220, 202, 107, 33);
		contentPane.add(btnEnregistrer);
	}
}
