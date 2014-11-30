import java.util.ArrayList;
import java.util.Collections;


public class InitializeDeck 
{
	private ArrayList<Carte> deck;

	public InitializeDeck(Joueur J1,Joueur J2)
	{
		this.deck = new ArrayList<Carte>();	
		this.createDeck();
		this.randomDeck();
		this.distributeCard(J1, J2);
	}
	
	private void createDeck()
	{
		String [] formes = new String []{"trefle", "pique", "coeur", "carreau"};
		for(int i=1; i<=13; i++)
		{
			for(int j=0; j<4 ; j++)
			{
				this.deck.add(new Carte(i, formes[j]));
			}
		}
	}
	
	private void randomDeck()
	{
		Collections.shuffle(this.deck);
	}
	
	private void distributeCard(Joueur J1, Joueur J2)
	{   
	    for(int i = 0; i<deck.size(); i++)
	    {
	    	if(i%2==0)
	    	{
	    		J1.add(deck.get(i));
	    	}
	    	else
	    	{
	    		J2.add(deck.get(i));
	    	}
	    }
	}
}
