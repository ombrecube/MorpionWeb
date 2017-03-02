import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MorpionServer {

   public MorpionServer() {
     try {
    	 
    	 
       Morpion c = new MorpionImpl();
       Registry rg= LocateRegistry.createRegistry(1111);
       rg.bind("monRMI", c);
     
     } catch (Exception e) {
       System.out.println("Trouble: " + e);
     }
   }

   public static void main(String args[]) {
     new MorpionServer();
   }
}

