package cm.objis.cameroun.GestionRdv.presentation;

import java.awt.EventQueue;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import cm.objis.cameroun.GestionRdv.presentation.MedRdv;

import cm.objis.cameroun.GestionRdv.presentation.ListeDesPatients;

import cm.objis.cameroun.GestionRdv.presentation.EnregistrerPatient;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedRdv {

	private JFrame frmMedrdv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedRdv window = new MedRdv();
					window.frmMedrdv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MedRdv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMedrdv = new JFrame();
		frmMedrdv.setFont(new Font("Arial Black", Font.BOLD, 11));
		frmMedrdv.setForeground(Color.WHITE);
		frmMedrdv.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\GABIN\\Pictures\\images pour site internet\\IMG_1448.PNG"));
		frmMedrdv.setTitle("MedRdv");
		frmMedrdv.setBounds(100, 100, 450, 300);
		frmMedrdv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMedrdv.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmMedrdv.setJMenuBar(menuBar);
		
		JMenu mnEnregistrerpatietn = new JMenu("Accueil");
		menuBar.add(mnEnregistrerpatietn);
		
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mnEnregistrerpatietn.add(mntmOuvrir);
		
		// implementation du bouton fermer
		JMenuItem mntmFermer = new JMenuItem("Fermer");
		mntmFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Fermer) 
			{
				System.exit(0);
			}
		}
		);
		mnEnregistrerpatietn.add(mntmFermer);
		
		JMenu mnService = new JMenu("Patient");
		menuBar.add(mnService);
		
		JMenuItem mntmEnregistrerPatient = new JMenuItem("EnregistrerPatient");
		mntmEnregistrerPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EnregistrerPatient frame = new EnregistrerPatient();
				frame.setVisible(true);
			}
		});
		mnService.add(mntmEnregistrerPatient);
		
		JMenuItem mntmListedespatients = new JMenuItem("ListeDesPatients");
		mntmListedespatients.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
				
				ListeDesPatients frame = new ListeDesPatients();
				frame.setVisible(true);
			}
		});
		mnService.add(mntmListedespatients);
		
		JMenu mnNewMenu = new JMenu("Service");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCardiologie = new JMenuItem("Cardiologie");
		mnNewMenu.add(mntmCardiologie);
		
		JMenuItem mntmPediatrie = new JMenuItem("Pediatrie");
		mnNewMenu.add(mntmPediatrie);
		
		JMenuItem mntmOphtamologie = new JMenuItem("Ophtamologie");
		mnNewMenu.add(mntmOphtamologie);
		
		JMenuItem mntmDentiste = new JMenuItem("Dentiste");
		mnNewMenu.add(mntmDentiste);
		
		JMenu mnRendezvous = new JMenu("Rendez-vous");
		menuBar.add(mnRendezvous);
		
		JMenuItem mntmPrendrerdv = new JMenuItem("PrendreRdv");
		mnRendezvous.add(mntmPrendrerdv);
		
		JMenuItem mntmListerdv = new JMenuItem("ListeRdv");
		mnRendezvous.add(mntmListerdv);
		
		JMenu mnAPropos = new JMenu("A propos");
		menuBar.add(mnAPropos);
		
		JMenuItem mntmAide = new JMenuItem("Aide");
		mnAPropos.add(mntmAide);
		
		JMenuItem mntmMiseJour = new JMenuItem("Mise \u00E0 jour");
		mnAPropos.add(mntmMiseJour);
		
		JMenuItem mntmVersion = new JMenuItem("Contact");
		mnAPropos.add(mntmVersion);
		
		JMenuItem mntmVersion_1 = new JMenuItem("Version");
		mnAPropos.add(mntmVersion_1);
	}
	
	
}
