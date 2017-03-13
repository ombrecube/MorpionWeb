public interface Morpion extends java.rmi.Remote{
	
	public void jouer()
	throws java.rmi.RemoteException; 
	
	public boolean Choix()
			throws java.rmi.RemoteException;
	
}
