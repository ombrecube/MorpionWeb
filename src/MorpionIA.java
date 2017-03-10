
public class MorpionIA {
	String[] MorpionTableau;
	int NiveauDifficulté;
	int NumeroTour = 0;
	//Variable du choix
	int choix;
	
	public MorpionIA(){
	}
	
	public String[] ChoixIA(String Tab[]){
		MorpionTableau = Tab;
		
		//Premier tour du joueur
		if (NumeroTour == 0){
			NumeroTour++;
			if (Tab[0]=="O"){
					MorpionTableau[4]="X";
					return MorpionTableau;
			}else if (Tab[1]== "O"){
				choix = alea(0,3);
				if(choix == 0)
					//Sur le coins adjacent
					MorpionTableau[0]="X";
				if(choix == 1)
					//Sur le coin adjacent
					MorpionTableau[2]="X";
				if(choix == 2)
					//A l opposé
					MorpionTableau[7]="X";
				return MorpionTableau;
			}else if (Tab[2]== "O"){
					MorpionTableau[4]="X";
					return MorpionTableau;
			}else if (Tab[3]== "O"){
				choix = alea(0,3);
				if(choix == 0)
					//Sur le coins adjacent
					MorpionTableau[0]="X";
				if(choix == 1)
					//Sur le coin adjacent
					MorpionTableau[6]="X";
				if(choix == 2)
					//A l opposé
					MorpionTableau[5]="X";
				return MorpionTableau;
			}else if (Tab[4]== "O"){
				//Sur un des coins
				choix = alea(0,4);
				if(choix == 0)
					MorpionTableau[0]="X";
				if(choix == 1)
					MorpionTableau[2]="X";
				if(choix == 2)
					MorpionTableau[6]="X";
				if(choix == 3)
					MorpionTableau[8]="X";
				return MorpionTableau;
			}else if (Tab[5]== "O"){
				choix = alea(0,3);
				if(choix == 0)
					//Sur le coins adjacent
					MorpionTableau[2]="X";
				if(choix == 1)
					//Sur le coin adjacent
					MorpionTableau[8]="X";
				if(choix == 2)
					//A l opposé
					MorpionTableau[3]="X";
				return MorpionTableau;
			}else if (Tab[6]== "O"){
					//Au centre
					MorpionTableau[4]="X";
					return MorpionTableau;
			}else if (Tab[7]== "O"){
				choix = alea(0,3);
				if(choix == 0)
					//Sur le coins adjacent
					MorpionTableau[6]="X";
				if(choix == 1)
					//Sur le coin adjacent
					MorpionTableau[8]="X";
				if(choix == 2)
					//A l opposé
					MorpionTableau[1]="X";
				return MorpionTableau;
			}else if (Tab[8]== "O"){
					//Au centre
					MorpionTableau[4]="X";
					return MorpionTableau;
			}
		//Deuxieme tour du joueur
		}else if (NumeroTour == 1){
			NumeroTour++;
			//O| |     | |O 
			// |X|     |X| 
			// | |O   O| | 
			if(Tab[0]=="O"&&Tab[8]=="O"||Tab[2]=="O"&&Tab[6]=="O"){
				choix = alea(0,4);
				if(choix == 0)
					MorpionTableau[1]="X";
				if(choix == 1)
					MorpionTableau[3]="X";
				if(choix == 2)
					MorpionTableau[5]="X";
				if(choix == 3)
					MorpionTableau[7]="X";
				return MorpionTableau;	
			//O| |O
			// |X| 
			// | | 
			}else if(Tab[0]=="O"&&Tab[2]=="O"){
					MorpionTableau[1]="X";
				return MorpionTableau;
			//O| | 
			// |X| 
			//O| | 	
			}else if(Tab[0]=="O"&&Tab[6]=="O"){
				MorpionTableau[3]="X";
			return MorpionTableau;
			// | | 
			// |X| 
			//O| |O	
			}else if(Tab[6]=="O"&&Tab[8]=="O"){
				MorpionTableau[3]="X";
			return MorpionTableau;
			// | |O 
			// |X| 
			// | |O 	
			}else if(Tab[2]=="O"&&Tab[8]=="O"){
				MorpionTableau[3]="X";
			return MorpionTableau;
			//O|O| 
			// |X| 
			// | | 	
			}else if(Tab[0]=="O"&&Tab[1]=="O"&&Tab[4]=="X"){
				MorpionTableau[2]="X";
			return MorpionTableau;
			//O| | 
			//O|X| 
			// | | 	
			}else if(Tab[0]=="O"&&Tab[3]=="O"&&Tab[4]=="X"){
				MorpionTableau[6]="X";
			return MorpionTableau;
			// |O|O 
			// |X| 
			// | | 	
			}else if(Tab[2]=="O"&&Tab[5]=="O"&&Tab[4]=="X"){
				MorpionTableau[8]="X";
			return MorpionTableau;
			// | |O 
			// |X|O
			// | | 	
			}else if(Tab[0]=="O"&&Tab[1]=="O"&&Tab[4]=="X"){
				MorpionTableau[2]="X";
			return MorpionTableau;
			// | | 
			// |X|O
			// | |O	
			}else if(Tab[0]=="O"&&Tab[1]=="O"&&Tab[4]=="X"){
				MorpionTableau[2]="X";
			return MorpionTableau;
			// | | 
			// |X| 
			// |O|O	
			}else if(Tab[7]=="O"&&Tab[8]=="O"&&Tab[4]=="X"){
				MorpionTableau[6]="X";
			return MorpionTableau;
			//O| | 
			// |X| 
			// |O|	
			}else if(Tab[0]=="O"&&Tab[7]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[3]="X";
				if(choix == 1)
					MorpionTableau[5]="X";
				if(choix == 2)
					MorpionTableau[6]="X";
				return MorpionTableau;
			//O| | 
			// |X|O 
			// | |	
			}else if(Tab[0]=="O"&&Tab[5]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[1]="X";
				if(choix == 1)
					MorpionTableau[2]="X";
				if(choix == 2)
					MorpionTableau[7]="X";
				return MorpionTableau;
			// | |O 
			// |X| 
			// |O|	
			}else if(Tab[2]=="O"&&Tab[7]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[3]="X";
				if(choix == 1)
					MorpionTableau[5]="X";
				if(choix == 2)
					MorpionTableau[8]="X";
				return MorpionTableau;
			// | |O 
			//O|X|
			// | |	
			}else if(Tab[2]=="O"&&Tab[3]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[0]="X";
				if(choix == 1)
					MorpionTableau[1]="X";
				if(choix == 2)
					MorpionTableau[7]="X";
				return MorpionTableau;
			// |O| 
			// |X|  
			//O| |	
			}else if(Tab[1]=="O"&&Tab[6]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[0]="X";
				if(choix == 1)
					MorpionTableau[3]="X";
				if(choix == 2)
					MorpionTableau[5]="X";
				return MorpionTableau;
			// | | 
			// |X|O 
			//O| |	
			}else if(Tab[5]=="O"&&Tab[6]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[7]="X";
				if(choix == 1)
					MorpionTableau[8]="X";
				if(choix == 2)
					MorpionTableau[3]="X";
				return MorpionTableau;
			// | | 
			//O|X| 
			// | |O	
			}else if(Tab[3]=="O"&&Tab[8]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[6]="X";
				if(choix == 1)
					MorpionTableau[7]="X";
				if(choix == 2)
					MorpionTableau[1]="X";
				return MorpionTableau;
			// |O| 
			// |X| 
			// | |O	
			}else if(Tab[1]=="O"&&Tab[8]=="O"&&Tab[4]=="X"){
				choix = alea(0,3);
				if(choix == 0)
					MorpionTableau[2]="X";
				if(choix == 1)
					MorpionTableau[5]="X";
				if(choix == 2)
					MorpionTableau[3]="X";
				return MorpionTableau;
			//Test de la case 4
			}else if(
					//Quand Tab[2] = "X"
					Tab[1]=="O"&&Tab[5]=="O"&&Tab[2]=="X" ||
				    Tab[1]=="O"&&Tab[7]=="O"&&Tab[2]=="X" ||
				    Tab[1]=="O"&&Tab[8]=="O"&&Tab[2]=="X" ||
				    Tab[5]=="O"&&Tab[6]=="O"&&Tab[2]=="X" ||
				    Tab[5]=="O"&&Tab[0]=="O"&&Tab[2]=="X" ||
				    //Quand Tab[0] = "X"
				    Tab[1]=="O"&&Tab[3]=="O"&&Tab[0]=="X" ||
				    Tab[1]=="O"&&Tab[7]=="O"&&Tab[0]=="X" ||
				    Tab[1]=="O"&&Tab[6]=="O"&&Tab[0]=="X" ||
		    		Tab[3]=="O"&&Tab[2]=="O"&&Tab[0]=="X" ||
				    Tab[3]=="O"&&Tab[5]=="O"&&Tab[0]=="X" ||
				  //Quand Tab[6] = "X"
				    Tab[3]=="O"&&Tab[8]=="O"&&Tab[6]=="X" ||
				    Tab[3]=="O"&&Tab[5]=="O"&&Tab[6]=="X" ||
				    Tab[3]=="O"&&Tab[7]=="O"&&Tab[6]=="X" ||
				    Tab[7]=="O"&&Tab[0]=="O"&&Tab[6]=="X" ||
				    Tab[7]=="O"&&Tab[1]=="O"&&Tab[6]=="X" ||
				  //Quand Tab[8] = "X"
				    Tab[5]=="O"&&Tab[3]=="O"&&Tab[8]=="X" ||
				    Tab[5]=="O"&&Tab[7]=="O"&&Tab[8]=="X" ||
				    Tab[5]=="O"&&Tab[6]=="O"&&Tab[8]=="X" ||
				    Tab[7]=="O"&&Tab[1]=="O"&&Tab[8]=="X" ||
				    Tab[7]=="O"&&Tab[2]=="O"&&Tab[8]=="X" ||
				    //
				    Tab[3]=="O"&&Tab[5]=="O"&&Tab[1]=="X" ||
				    //
				    Tab[1]=="O"&&Tab[7]=="O"&&Tab[3]=="X" ||
				    //
				    Tab[7]=="O"&&Tab[1]=="O"&&Tab[5]=="X" ||
				    //
				    Tab[3]=="O"&&Tab[5]=="O"&&Tab[7]=="X" 
					){
				MorpionTableau[4]="X";
				return MorpionTableau;
			//Test de la case 0
			}else if(Tab[1]=="O"&&Tab[2]=="O"&&Tab[0]!="X"||
					 Tab[3]=="O"&&Tab[6]=="O"&&Tab[0]!="X"){
				MorpionTableau[0]="X";
				return MorpionTableau;
			//Test de la case 1
			}else if(Tab[0]=="O"&&Tab[2]=="O"&&Tab[1]!="X"||
					 Tab[4]=="O"&&Tab[7]=="O"&&Tab[1]!="X"){
				MorpionTableau[1]="X";
				return MorpionTableau;
			//Test de la case 2
			}else if(Tab[0]=="O"&&Tab[1]=="O"&&Tab[2]!="X"||
					 Tab[5]=="O"&&Tab[8]=="O"&&Tab[2]!="X"){
				MorpionTableau[3]="X";
				return MorpionTableau;
			//Test de la case 3
			}else if(Tab[0]=="O"&&Tab[6]=="O"&&Tab[3]!="X"||
					 Tab[4]=="O"&&Tab[5]=="O"&&Tab[3]!="X"){
				MorpionTableau[3]="X";
				return MorpionTableau;
			//Test de la case 6
			}else if(Tab[0]=="O"&&Tab[3]=="O"&&Tab[6]!="X"||
					 Tab[7]=="O"&&Tab[8]=="O"&&Tab[6]!="X"){
				MorpionTableau[3]="X";
				return MorpionTableau;
			//Test de la case 5
			}else if(Tab[2]=="O"&&Tab[8]=="O"&&Tab[5]!="X"||
					 Tab[4]=="O"&&Tab[3]=="O"&&Tab[5]!="X"){
				MorpionTableau[5]="X";
				return MorpionTableau;
			//Test de la case 7
			}else if(Tab[6]=="O"&&Tab[8]=="O"&&Tab[7]!="X"||
					 Tab[4]=="O"&&Tab[1]=="O"&&Tab[7]!="X"){
				MorpionTableau[7]="X";
				return MorpionTableau;
			//Test de la case 8
			}else if(Tab[6]=="O"&&Tab[7]=="O"&&Tab[8]!="X"||
					 Tab[2]=="O"&&Tab[5]=="O"&&Tab[8]!="X"){
				MorpionTableau[7]="X";
				return MorpionTableau;
			}
			
					
		}else if (NumeroTour >= 2){
			
			//Verifie si l'un des deux peux gagner horizontalement
			for (int i=0;i<9;i=i+3){
				if(Tab[i]=="X"&&Tab[i+1]=="X"&&Tab[i+2]!="X"&&Tab[i+2]!="O" || Tab[i]=="O"&&Tab[i+1]=="O"&&Tab[i+2]!="O"&&Tab[i+2]!="X"){
					MorpionTableau[i+2]="X";
					return MorpionTableau;
				}
				if(Tab[i]=="X"&&Tab[i+2]=="X"&&Tab[i+1]!="X"&&Tab[i+1]!="O" || Tab[i]=="O"&&Tab[i+2]=="O"&&Tab[i+1]!="O"&&Tab[i+1]!="X"){
					MorpionTableau[i+1]="X";
					return MorpionTableau;
				}
				if(Tab[i+2]=="X"&&Tab[i+1]=="X"&&Tab[i]!="X"&&Tab[i]!="O" || Tab[i+2]=="O"&&Tab[i+1]=="O"&&Tab[i]!="X"&&Tab[i]!="O"){
					MorpionTableau[i]="X";
					return MorpionTableau;
				}
			}
			//Verifie si l'un des deux peux gagner verticalement
			for (int i=0;i<3;i=i+1){
				if(Tab[i]=="X"&&Tab[i+3]=="X"&&Tab[i+6]!="X"&&Tab[i+6]!="O" || Tab[i]=="O"&&Tab[i+3]=="O"&&Tab[i+6]!="O"&&Tab[i+6]!="X"){
					MorpionTableau[i+6]="X";
					return MorpionTableau;
				}
				if(Tab[i+6]=="X"&&Tab[i+3]=="X"&&Tab[i]!="X"&&Tab[i]!="O" || Tab[i+6]=="O"&&Tab[i+3]=="O"&&Tab[i]!="O"&&Tab[i]!="X"){
					MorpionTableau[i]="X";
					return MorpionTableau;
				}
				if(Tab[i+6]=="X"&&Tab[i]=="X"&&Tab[i+3]!="X"&&Tab[i+3]!="O" || Tab[i+6]=="O"&&Tab[i]=="O"&&Tab[i+3]!="O"&&Tab[i+3]!="X"){
					MorpionTableau[i+3]="X";
					return MorpionTableau;
				}
				
			}
			//Verifie les diagonales
			if(Tab[0]=="X"&&Tab[4]=="X"&&Tab[8]!="X"&&Tab[8]!="O" || Tab[0]=="O"&&Tab[4]=="O"&&Tab[8]!="O"&&Tab[8]!="X"){
				MorpionTableau[8]="X";
				return MorpionTableau;
			}
			if(Tab[0]=="X"&&Tab[8]=="X"&&Tab[4]!="X"&&Tab[4]!="O" || Tab[0]=="O"&&Tab[8]=="O"&&Tab[4]!="O"&&Tab[4]!="X"){
				MorpionTableau[8]="X";
				return MorpionTableau;
			}
			if(Tab[8]=="X"&&Tab[4]=="X"&&Tab[0]!="X"&&Tab[0]!="O" || Tab[8]=="O"&&Tab[4]=="O"&&Tab[0]!="O"&&Tab[0]!="X"){
				MorpionTableau[8]="X";
				return MorpionTableau;
			}
			
			if(Tab[2]=="X"&&Tab[4]=="X"&&Tab[6]!="X"&&Tab[6]!="O" || Tab[2]=="O"&&Tab[4]=="O"&&Tab[6]!="O"&&Tab[6]!="X"){
				MorpionTableau[8]="X";
				return MorpionTableau;
			}
			if(Tab[2]=="X"&&Tab[6]=="X"&&Tab[4]!="X"&&Tab[4]!="O" || Tab[2]=="O"&&Tab[6]=="O"&&Tab[4]!="O"&&Tab[4]!="X"){
				MorpionTableau[8]="X";
				return MorpionTableau;
			}
			if(Tab[6]=="X"&&Tab[4]=="X"&&Tab[2]!="X"&&Tab[2]!="O" || Tab[6]=="O"&&Tab[4]=="O"&&Tab[2]!="O"&&Tab[2]!="X"){
				MorpionTableau[8]="X";
				return MorpionTableau;
			}
			
			
		}
		//Autrement choisie au hasard
		int ok=0;
		do{
			int i = alea(0,9);
			if(Tab[i]!="X"&&Tab[i]!="O"){
				MorpionTableau[i] = "X";
				return MorpionTableau;
			}
		}while(ok!=1);
		System.out.print("Cas pas en pris en compte :/"+ NumeroTour);
		return MorpionTableau;
	}
	
	public int alea ( int Min, int Max){
		return (int) (Min + (Math.random() * (Max - Min)));
	}
	
}
