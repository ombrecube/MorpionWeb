import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MorpionServer {

   public MorpionServer() {
	   try {
		   System.setProperty("java.security.policy","file:/C:/Users/Julien/Desktop/DUETI/Semestre 2/8INF345/RMI/MorpionWeb/src/java_policy.policy");
		   if (System.getSecurityManager() == null) {
			   System.setSecurityManager(new SecurityManager());
		   }
		   Registry rg = LocateRegistry.createRegistry(1099);
		   System.out.println("Serveur en cours de lancement");  
    	 Morpion c = new MorpionImpl();
    	 String url = "rmi://localhost/Morpion";
    	 rg.rebind(url,c);
    	 System.out.println("Serveur opérationnel");
     
     } catch (Exception e) {
       System.out.println("Erreur: " + e);
     }
   }

   public static void main(String args[]) {
     new MorpionServer();
   }
}

