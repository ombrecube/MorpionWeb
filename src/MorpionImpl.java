import java.rmi.RemoteException;

public class MorpionImpl extends java.rmi.server.UnicastRemoteObject 
implements Morpion {

	public MorpionImpl() throws java.rmi.RemoteException { 
		super();
	}
	
	

	@Override
	public void jouer() throws java.rmi.RemoteException {
		
		
	}



	@Override
	public String Choix(int Joueur, int numero) throws RemoteException {
		String s = "74";
		return s;
	}



	
	

}
