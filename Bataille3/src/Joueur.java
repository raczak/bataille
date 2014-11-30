import java.util.ArrayList;
import java.util.Collections;


public class Joueur 
{
	private ArrayList<Carte> carte;
	private int Point;
	private boolean WinLose = true;
	
	public Joueur()
	{
		//Collections.shuffle(carte);
		this.carte = new ArrayList<Carte>();
	}

	public ArrayList<Carte> getCarte() {
		return carte;
	}

	public void setCarte(ArrayList<Carte> carte) {
		this.carte = carte;
	}

	public int getPoint() {
		return Point;
	}

	public void add(Carte carte)
	{
		this.carte.add(carte);
	}
	
	public void setPoint(int point) {
		
		Point = this.Point + 1;
	}
	
	public void setWinLose(boolean winlose) {
		
		this.WinLose = winlose;
	}
	
	public Carte TireCarte()
	{
		Carte c = this.carte.get(carte.size()-1);
		this.carte.remove(carte.size()-1);
		return c;
	}
	
	public void AjouteCarte()
	{
		
	}
	
	public Boolean haslost()
	{
			return !this.carte.isEmpty();	
	}
	
	
}
