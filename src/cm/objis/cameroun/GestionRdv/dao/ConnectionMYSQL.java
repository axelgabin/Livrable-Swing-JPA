package cm.objis.cameroun.GestionRdv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {
	
	// Information d'acc�s � la base de donn�es
	public static String url = "jdbc:mysql://localhost/gestionrdv";
	public static String login = "root";//nom d'utilisateur de la base des donn�es
	public static String passwd = "converse2526";//mot de passe
	public static Connection connection;
	
	/**
	 * Methode connection
	 * Elle ne prend rien en parametre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				
			}catch (SQLException e) {
				
				System.out.println("Probleme de connection"); // affiche une errreur si probleme de connexion avec la bd
				
			}
			
		}
		
		return connection;
		
	}

}
