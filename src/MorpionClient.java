import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class MorpionClient {

	public static void main(String[] args) {
		
		//A changer avec le fichier absolu de votre projet
		//Changer MorpionServer aussi
		System.setProperty("java.security.policy","file:/C:/Users/Corentin/Documents/MorpionWeb/src/java_policy.policy");
		   
		if (System.getSecurityManager() == null) {
			   System.setSecurityManager(new SecurityManager());
		}
		try{
			Registry rg = LocateRegistry.getRegistry(1099);
			String url = "rmi://localhost/Morpion";
			Morpion morpion =(Morpion) rg.lookup(url);
			int choix = 0;
			Scanner scan = new Scanner(System.in);
			do{
				morpion.jouer();
				boolean play = false;
				do{
					play = morpion.Choix();
				}while(play == false);
				do{
					System.out.print("Voulez vous rejouer ?:(1=Oui/2=Non):\n");
					String input = scan.nextLine();
					try {
						choix = Integer.parseInt(input);
					}catch(Exception e){
						System.out.println("Scan exception :"+ e.getMessage());
					}
				}while(choix != 1 && choix != 2);
			}while(choix!=2);
			scan.close();
			
		}catch(Exception e){
			System.out.println("Morpion exception :"+ e.getMessage());
		}


	}
}
