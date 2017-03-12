import java.util.Scanner;

public class MorpionClient {

	public static void afficheGrille(String[] grille)
	{
		System.out.println("[" + grille[0] + "|" + grille[1] + "|" + grille[2] + "]");
		System.out.println("[" + grille[3] + "|" + grille[4] + "|" + grille[5] + "]");
		System.out.println("[" + grille[6] + "|" + grille[7] + "|" + grille[8] + "]");
	}
	
	public static boolean victoire(String[] grille, String joueurActif)
	{
		afficheGrille(grille);
		if(joueurActif == "X")
			System.out.println("L'ordinateur a gagné la partie !");
		else
			System.out.println("Bravo ! Vous avez gagné la partie !");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Voulez-vous rejouer ? (1=Oui / 2=Non)");
		String replay = scan.nextLine();
		int r;
		r = Integer.parseInt(replay);
		if(r == 1)
			return true;
		else
		{
			System.out.println("A bientôt !");
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean play = true;

		Scanner scan = new Scanner(System.in);
		while(play == true)
		{
		
			System.out.println("Nouvelle partie de morpion :)");
		
			String[] grille = 
				{
					" ", " ", " ",
					" ", " ", " ",
					" ", " ", " "
				};
			String joueur = "O";
			String ordi = "X";
			String joueurActif = joueur;
			String input;
			boolean victoire = false;
			
			MorpionIA IA = new MorpionIA();
			int nbCases = 0;
			
			
			while(true)
			{
			
				afficheGrille(grille);
				
				int c;
				
				if (joueurActif==ordi){
					if(nbCases == 9) {
						System.out.println("Partie terminée, aucun vainqueur !");
						break;
				}
					else
					{
						System.out.println("Au tour de l'ordinateur :");
						grille = IA.ChoixIA(grille);
					}
					
				}else{
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
				}
				
				
				for(int i=0; i < 3; i++)
				{
					if(grille[i*3] == joueurActif && grille[i*3+1] == joueurActif && grille[i*3+2] == joueurActif )
						victoire = true;
					
				}
				if(victoire)
				{
					play = victoire(grille, joueurActif);
					break;
				}
				
				for(int i=0; i < 3; i++)
				{
					if(grille[i] == joueurActif && grille[i+3] == joueurActif && grille[i+6] == joueurActif )
						victoire = true;
					
				}
				if(victoire)
				{
					play = victoire(grille, joueurActif);
					break;
				}
				
				if(grille[0] == joueurActif && grille[4] == joueurActif && grille[8] == joueurActif)
				{
					play = victoire(grille, joueurActif);
					break;
				}
				if(grille[2] == joueurActif && grille[4] == joueurActif && grille[6] == joueurActif)
				{
					play = victoire(grille, joueurActif);
					break;
				}
				
				
				if(joueurActif == joueur)
					joueurActif = ordi;
				else
					joueurActif = joueur;
				
				nbCases++;
				
				
			
			}			
			
		}
		scan.close();

	}

}
