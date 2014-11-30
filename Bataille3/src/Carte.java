
public class Carte 
{
	private String formes;
	private int valeur;
	
	public Carte (int valeur, String formes)
	{
		 setFormes(formes);
		 setValeur(valeur);
	}

	public String getFormes() {
		return formes;
	}

	public void setFormes(String formes) {
		this.formes = formes;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	public int comparateur (Carte carte)
	{
		if(carte.getValeur()>this.valeur)
		{
			return 1;
		}
		else if(carte.getValeur()<this.valeur)
		{
			return 0;
		}
		else
		{
			return 2;
		}
	}
	
	public String toString()
	{
		return this.valeur+" de "+this.formes;
	}
}
