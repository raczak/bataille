public class Bataille 
{
	public static void main(String[] args) 
	{
		System.out.print("Bienvenue dans mon jeu de carte !\n \n");

		Joueur J1 = new Joueur();
		Joueur J2 = new Joueur();
		
		InitializeDeck deck = new InitializeDeck(J1, J2);

		while(J1.haslost() && J2.haslost())
		{	
			Carte carteJ1 = J1.TireCarte();
			Carte carteJ2 = J2.TireCarte();
			System.out.print(carteJ1);
			System.out.print(" VS ");
			System.out.print(carteJ2+"\n");
			int versus = carteJ1.comparateur(carteJ2);
			Party party = new Party();
			party.manche(J1, J2, versus);
			/*if(versus == 0)
			{
				J1.setPoint(1);
				System.out.print("   Joueur 1 l'emporte ! \n");
			}
			else if(versus == 1)
			{
				J2.setPoint(1);
				System.out.print("   Joueur 2 l'emporte !\n");
			}
			else if(versus == 2)
			{
				System.out.print("   Egalité entre les joueurs ! \n"); 
				
			} */
			
			
		}
		System.out.print("\n");
		if(J1.getPoint()>J2.getPoint())
		{
			System.out.print("Le joueur 1 à gagné la bataille  avec "+J1.getPoint()+" point(s)");

		}
		else
		{
			System.out.print("Le joueur 2 à gagné la bataille  avec "+J2.getPoint()+" point(s)");
		} 

	}
}
