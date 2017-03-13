import java.rmi.Naming;

public class MorpionServer {

   public MorpionServer() {
     try {
    	 System.out.println("Serveur en cours de lancement");
       Morpion c = new MorpionImpl();
       Naming.rebind("Morpion", c);
       System.out.println("Serveur opérationnel");
     
     } catch (Exception e) {
       System.out.println("Erreur: " + e);
     }
   }

   public static void main(String args[]) {
     new MorpionServer();
   }
}

