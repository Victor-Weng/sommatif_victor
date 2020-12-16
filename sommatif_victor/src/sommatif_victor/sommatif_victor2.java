package sommatif_victor;
/*
* Author : Victor
* Date : Dec 16, 2020
* Nom du Programme : Moyenne des nombres impairs
* Description : Le programme genere au hasard 20 nombres entiers. Puis, on appele une methode qui
* vas afficher la moyenne des nombres impairs
*/
public class sommatif_victor2
	{

		public static void main(String[] args)
			{
				int []myTab=new int[20]; // On cree une tableau de 20 espaces
				for (int i = 0; i < 20; i++)  // On loop 20 fois
				{
					myTab[i]=(int)(Math.random()*(1000)); // Genere une nombre au hasard jusqu'a 1000 
				}
				System.out.println("Le moyenne des nombres impaires est " + moyenneImpair(myTab)); // On affiche la moyenne

			}
		static int moyenneImpair(int []Tab) // Methode qui trouve la moyennne des nombres impairs
		{
				int somme = 0; // Variable qui servira pour la somme des nombres impairs
				int count = 0; // Variable qui compte combien des nombres impairs sont present dans le tableau
				int moyenne = 0; // Variable qui servira comme la moyenne des nombres impairs
				for (int i = 0; i < Tab.length; i++)
				{
					if(Tab[i]%2!=0)
					{
						
						somme=somme+Tab[i]; // On ajoute la nombre impair au somme
						count++; // On ajoute 1 au count
					}
				
					if(count!=0) 
						/* Dans la cas peu probable dont il n'y a aucune nombre impair, on doit verifier pour eviter
						*l'erreur suivant : "in thread "main" java.lang.ArithmeticException: / by zero"
						*/
					moyenne = somme/count; // La moyenne = la somme des impairs divisee par la count
					
					
				}
				if(count!=0) // Si il y a des nombres impairs
				{
				return moyenne; // On retourne la moyenne
				}
				else // Else, on retourne 0;
				{
					int nul=0;
					return nul;
				}
				
		}

	}
