import java.util.Scanner;

public class MorpionClient {

	public static void afficheGrille(String[] grille)
	{
		System.out.println("[" + grille[0] + "|" + grille[1] + "|" + grille[2] + "]");
		System.out.println("[" + grille[3] + "|" + grille[4] + "|" + grille[5] + "]");
		System.out.println("[" + grille[6] + "|" + grille[7] + "|" + grille[8] + "]");
	}
	
	public static void victoire(String[] grille, String joueurActif)
	{
		afficheGrille(grille);
		System.out.println("Le joueur " + joueurActif + " a gagné la partie !");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] grille = 
			{
				" ", " ", " ",
				" ", " ", " ",
				" ", " ", " "
			};
		String joueur = "O";
		String ordi = "X";
		String joueurActif = joueur;
		Scanner scan = new Scanner(System.in);
		String input;
		boolean victoire = false;
		
		
		while(true)
		{
		
			afficheGrille(grille);
			
			int c;
			while(true) {
				System.out.print("Entrez le numéro de la case (1 à 9) :");
				input = scan.nextLine();			
				
				try {
					c = Integer.parseInt(input);
					if(c >= 1 && c <= 9 && grille[c-1] != joueur && grille[c-1] != ordi)
						break;
				}
				catch(Exception e)
				{
					
				};
			}
			
			grille[c-1] = joueurActif;
			
			for(int i=0; i < 3; i++)
			{
				if(grille[i*3] == joueurActif && grille[i*3+1] == joueurActif && grille[i*3+2] == joueurActif )
					victoire = true;
				
			}
			if(victoire)
			{
				victoire(grille, joueurActif);
				break;
			}
			
			for(int i=0; i < 3; i++)
			{
				if(grille[i] == joueurActif && grille[i+3] == joueurActif && grille[i+6] == joueurActif )
					victoire = true;
				
			}
			if(victoire)
			{
				victoire(grille, joueurActif);
				break;
			}
			
			if(grille[0] == joueurActif && grille[4] == joueurActif && grille[8] == joueurActif)
			{
				victoire(grille, joueurActif);
				break;
			}
			if(grille[2] == joueurActif && grille[4] == joueurActif && grille[6] == joueurActif)
			{
				victoire(grille, joueurActif);
				break;
			}
			
			
			if(joueurActif == joueur)
				joueurActif = ordi;
			else
				joueurActif = joueur;
			
		
		}
		scan.close();

	}

}
