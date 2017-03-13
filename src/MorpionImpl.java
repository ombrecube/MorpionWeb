import java.rmi.RemoteException;
import java.util.Scanner;

public class MorpionImpl extends java.rmi.server.UnicastRemoteObject 
implements Morpion {
	private static final long serialVersionUID = 2674880711467464646L;
	//Initialise les variables globales
	String[] grilleGlobal;
	Scanner scan = new Scanner(System.in);
	String joueur = "O";
	String ordi = "X";
	MorpionIA IA = new MorpionIA();
	int nbCases = 0;
	
	public MorpionImpl() throws java.rmi.RemoteException { 
		super();
	}

	@Override
	public void jouer() throws RemoteException {
		System.out.println("Nouvelle partie de morpion :)");
		String[] grille = 
			{
				" ", " ", " ",
				" ", " ", " ",
				" ", " ", " "
			};
		nbCases = 0;
		grilleGlobal = grille;
	}

	@Override
	public boolean Choix() throws RemoteException {
		//On demande a l'utilisateur de choisir une case vide
		afficheGrille(grilleGlobal);
		while(true) {
			System.out.print("Entrez le numéro de la case (1 à 9) :");
			String input = scan.nextLine();			
			try {
				int c = Integer.parseInt(input);
				if(c >= 1 && c <= 9 && grilleGlobal[c-1] != joueur && grilleGlobal[c-1] != ordi){
					grilleGlobal[c-1] = joueur;
					break;
				}
			}
			catch(Exception e){
				System.out.print("Exception choix " + e.getMessage());
			};
		}
		//Incremente le nombre de case utilisé
		nbCases++;
		if(TestVictoire(grilleGlobal,joueur)){
			victoire(grilleGlobal,joueur);
			return true;
		}else{
			if(nbCases==9){
				System.out.println("Partie terminée, aucun vainqueur !");
				return true;
			}
			System.out.println("Au tour de l'ordinateur !");
			grilleGlobal =IA.ChoixIA(grilleGlobal);
			//Incremente le nombre de case utilisé
			nbCases++;
			if(TestVictoire(grilleGlobal,ordi)){
				victoire(grilleGlobal,ordi);
				return true;
			}else{
				return false;
			}
		}
	}
	
	public static void afficheGrille(String[] grille)
	{
		System.out.println("[" + grille[0] + "|" + grille[1] + "|" + grille[2] + "]");
		System.out.println("[" + grille[3] + "|" + grille[4] + "|" + grille[5] + "]");
		System.out.println("[" + grille[6] + "|" + grille[7] + "|" + grille[8] + "]");
	}
	
	public void  victoire(String[] grille, String joueurActif)
	{
		if(joueurActif == "X")
			System.out.println("L'ordinateur a gagné la partie !");
		else
			System.out.println("Bravo ! Vous avez gagné la partie !");
	}
	
	public static boolean TestVictoire(String[] grille, String joueurActif){
		for(int i=0; i < 3; i++){
			if(grille[i*3] == joueurActif && grille[i*3+1] == joueurActif && grille[i*3+2] == joueurActif )
				return true;
		}
		for(int i=0; i < 3; i++){
			if(grille[i] == joueurActif && grille[i+3] == joueurActif && grille[i+6] == joueurActif )
				return true;
		}
		if(grille[0] == joueurActif && grille[4] == joueurActif && grille[8] == joueurActif){
			return true;
		}
		if(grille[2] == joueurActif && grille[4] == joueurActif && grille[6] == joueurActif){
			return true;
		}
		return false;
	}

}
