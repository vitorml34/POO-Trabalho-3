import java.util.ArrayList;
import Items.*;

public class Team {

	private String name;

	private Color color;

	private int win;

	private int lose;

	private int draw;

	private ArrayList<Character> characters;

	public Team(String name, Color color) {
			this.name = name;
			this.color = color;
			win = 0;
			lose = 0;
			draw = 0;
			characters = new ArrayList<Character>(10);
	}

	public String getName() {
		return this.name;
	}

	public String getResults() {
			String wins = " VITORIAS: ";
			String w = Integer.toString(win);
			String loses = "||DERROTAS: ";
			String l = Integer.toString(lose);
			String draws = "||EMPATES: ";
			String d = Integer.toString(draw);
			String results = new String("RESULTADO->");
			return results+wins+w+loses+l+draws+d;
	}

	public String toString() {
		String info;
		info = "Nome do time: " + this.name + " Cor: " + this.color;
		return info;
	}

	public void resolveBattle(Team opponent) {
		int nTeamA = Size();
		int nTeamB = opponent.Size();
		int rounds = (int) ( nTeamA + nTeamB + 1)/2;
		int i = 0, j = 0, k = 0, m = 0;
		//System.out.println("Tamanho A: " +nTeamA +" Tamanho B: " + nTeamB);
		//System.out.println("Entrando do while");
		while(i<rounds || j<rounds){
			if(i<nTeamA){
				Get(i).attack(opponent.Get(k));
				i++;
				if(k < nTeamB-1)
					k++;
			}
			if(j<nTeamB){
				opponent.Get(j).attack(Get(m));
				j++;
				if(m<nTeamA-1)
					m++;
			}
		}
		//System.out.println("Saiu do while");
		double pTeamA = getPoints();
		double pTeamB = opponent.getPoints();
		if(pTeamA>pTeamB){
			win++;
			System.out.println(this.getName() + " venceu! =)");
			System.out.println("");
			return;
		}
		if(pTeamA<pTeamB){
			lose++;
			System.out.println(this.getName() + " perdeu! =(");
			System.out.println("");	
			return;
		}
		draw++;
		System.out.println(this.getName() + " empatou!! =|");
		System.out.println("");
		return;
	}

	public void addChar(Character character) {
			characters.add(character);
	}

	public void removeChar(int i) {
			characters.remove(i);
	}

	public void removeChar(Character character) {
			for (int i = 0; i < characters.size(); i++){
			if(characters.get(i) == character)
				characters.remove(i);
			}	
	}

	public Character searchChar(String s) {
			for (int i = 0; i < characters.size(); i++){
				if(characters.get(i).getName() == s)
					return characters.get(i);
			}
			return null;

	}

	public double getPoints() {
		double sum = 0;
		int i;
		for(i = 0; i < characters.size(); i++){
			sum+=characters.get(i).getHP();
		}
		sum/=i;
		return sum;
	}

	//Lembrar de adicionar ao diagrama de classes
	public Character Get(int i){
		return characters.get(i);
	}

	public int Size(){
		return characters.size();
	}


}
