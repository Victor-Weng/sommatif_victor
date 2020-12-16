package sommatif_victor;
/*
* Author : Victor
* Date : Dec 16, 2020
* Nom du Programme : Erreurs
* Description : Un methode qui permet de saluer un ami en utilisant 
* son nom. Pourtant, il y a beacoupe des erreurs qu'on devrait
* corriger.
*/
public class sommatif_victor
	{
		public static void main(String[] args) //Il devrait etre static pour ne besoin pas de cree une objet du class
		{
				String nom="John"; // On identifie le string 'nom'
				// On envoie la variable 'nom' au methode pour qu'il puisse nous retourner une message
				System.out.println(saluerAmi(nom)); 
				// On affiche la resultat. On doit envoyer le nom "John" comme variable
				// pour que le methode peut le recevoir. Donc, j'avais cree le string 'nom' pour
				// qu'il peuvent etre identifier comme "John".	
				
		
		}
		
		static String saluerAmi(String a) //Il devrait etre static pour ne besoin pas de cree une objet du class
			{
					String message="Bonjour mon ami " + a;
					return message; 
					// On deplace le static String pour qu'il ne soit
					// pas dans le plublic void car 'void' ne retourne pas des variables
					
			}


	}
