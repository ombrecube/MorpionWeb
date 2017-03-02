public interface Morpion extends java.rmi.Remote{
	
	public void jouer()
	throws java.rmi.RemoteException; 
	
	public String Choix(int Joueur,int numero)
			throws java.rmi.RemoteException;
	
}
