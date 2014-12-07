package Items;
import java.util.ArrayList;

public class Inventory {

	public class Pair<T,U> {

		private T first;

		private U second;

		public Pair(T first, U second) {
			this.first = first;
			this.second = second;
		}

		public void setFirst(T first) {
			this.first = first;
		}

		public void setSecond(U second) {
			this.second = second;
		}

		public T getFirst() {
			return this.first;
		}

		public U getSecond() {
			return this.second;
		}

	}

	private int spaces;

	private double gold;

	private ArrayList< Pair<Item ,Boolean> > items;

	private int nWeapons;
	private int nArmors;

	public Inventory() {
		this.spaces = 0;
		this.gold = 0;
		items = new ArrayList<Pair<Item,Boolean>>();
	}

	public ArrayList< Pair<Item ,Boolean> > Items(){
		return items;
	}

	public int getSize(){
		return items.size();
	}

	public double getTotalGold() {
		return this.gold;
	}

	public int getAvailableSpace() {
		return this.spaces;
	}

	public void spendGold(double gold) {
		this.gold -=gold;
	}

	public void earnGold(double gold) {
		this.gold += gold;
	}

	public void setSpaces(int spaces) {
		this.spaces = spaces;	
	}

	public void insertWeapon(Item i){
		Pair<Item, Boolean> p;
		if (nWeapons <2){
			p = new Pair<Item, Boolean>(i, true);
		}
		else{ p = new Pair<Item, Boolean>(i, false);}
		items.add(p);
		nWeapons++;
	}

	public void insertArmor(Item i){
		Pair<Item, Boolean> p;
		if (nArmors <1){
			p = new Pair<Item, Boolean>(i, true);
		}
		else {p = new Pair<Item, Boolean>(i, false);}
		items.add(p);
		nArmors++;
	}

	public void insertItem(Item i){
		Pair<Item, Boolean> p;
		p = new Pair<Item, Boolean>(i, true);
		items.add(p);
	}

	public Item searchItem(String s){
		Item aux;
		int i = 0;
		do{
			aux = items.get(i).getFirst();
			i++;
		
		}while(aux.getName() != s);
		return aux;	
	}

	public Item searchItem(int j){
		Item aux;
		boolean aux2;
		int i = 0;
		if(items.size() == 0)
			return null;
		while(i < items.size()){
			aux = items.get(i).getFirst();
			aux2 = items.get(i).getSecond();	
			if(i == j){
				if(aux2 == true){
					//System.out.println("Item "+ aux.getName() +" dado como equipado");
					return aux;
				}
				if(aux2 == false){ 
					//System.out.println("Item "+ aux.getName() +" dado como NAO equipado");
					return null;
				}
			}
			if(aux == null)
				return null;
			i++;
		}
		return null;
	}

	public void removeItem(String s){
		Item aux;
		int i = 0;
		do{
			aux = items.get(i).getFirst();
			i++;
		
		}while(aux.getName() != s);
		i--;				//Corrige o indice
		items.remove(i);	
	}

	public void removeItem(int j){
		if(j>items.size())
			return;
		Item aux;
		int i = 0;
		do{
			aux = items.get(i).getFirst();
			i++;
		
		}while(i < j);
		i--;				//Corrige o indice
		items.remove(i);
	}

}
