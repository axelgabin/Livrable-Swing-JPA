	************************************
*****  	Description de l'application:   	*****
	************************************

1) L'application MedRdv sert à la gestion des rendez-vous d'un medecin lui permetant d'avoir un meilleur suivi de ses differents patients et aussi elle permet aux patients de pouvoir s'enregister afin de reserver des rendez-vous avec un mmedecin.
2) Dans ce livrable nous avons utilisé le framewwork HIBERNATE et l'interface de programmation JPA(Java persistence API); cela nous permis à partir d'une interface cree à l'aide de Java swing de faire des insertion en base de donnée apres avoir configuré le fichier persistence.xml et la classe DAO. 

	************************************
*****  	     Pré-requis avant execution		*****
	************************************
Installer un jdk ou au moins un jre sur son ordinateur.
Pour l'installation merci de suivre les étapes suivantes:

	-Rendez-vous sur la partie Java du site d’Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite ’software downloads’, cliquez sur le lien ’Java SE’ (pour Java Standard Edition)
	-Cliquez sur l’icône ’Java’ pour télécharger le JDK
	-Accepter la licence
	-De préférence choisir la version la plus récente (dernière sur la liste)
		-si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
		-si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
		-la version 32 bit fonctionne sur un Système Windows 32 bit ou 64 bit.
	-Cliquez sur le bouton ’Enregistrer le fichier’. Le téléchargement commence
	-Double cliquez sur le fichier téléchargé. L’assistant d’installation du JDK se lance
	-Cliquez sur le bouton ’Next’ des fenêtre qui vont s'afficher
	-Au moment d’installer un environnement d’exécution indépendant du JDK, l’assistant vous consulte. Acceptez les options par défaut et cliquez sur Next
	-Ainsi même si vous supprimez par la suite le répertoire d’installation du JDK (qui contient aussi une JRE), vous pourrez tout de même exécuter des programmes Java sur votre ordinateur
	-Vous arrivez à l’écran de fin d’installation, qui vous précise que l’installation s’est bien déroulée 
	-Cliquez sur Close: L’installation du JDK est terminée. 
        - Installer l'IDE Eclipse Java EE
        - Importer les librairies(JPA) du dossier lib du livrable.
        -Importer le dossier META-INF qui contient le fichier Persistence.xml et le fichier log4j.xml.
         

	************************************
*****  		Version du jdk utilié		  	*****
	************************************
java version "1.8.0_144"
Java(TM) SE Runtime Environment (build 1.8.0_144-b01)
Java HotSpot(TM) Client VM (build 25.144-b01, mixed mode)



	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'LivrableJPA\doc'.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:
	
1) 	A l'aide de votre interpretteur de commande (cmd.exe),
	placer vous dans le dossier où vous avez téléchargé
	le fichier compressé "MedRdv.jar"
	('cd [chemin]/[dossier cible]').

2)	Entrer la commande 'java -jar MedRdv.jar'.