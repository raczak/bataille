
public class Party 
{
	public String manche(Joueur J1, Joueur J2, int versus)
	{
		if(versus == 0)
		{
			J1.setPoint(1);
			return "   Joueur 1 l'emporte ! \n";
		}
		else if(versus == 1)
		{
			J2.setPoint(1);
			return "   Joueur 2 l'emporte !\n";
		}
		else if(versus == 2)
		{
			return "   Egalité entre les joueurs ! \n"; 
		}
		return null; 
	}
}
