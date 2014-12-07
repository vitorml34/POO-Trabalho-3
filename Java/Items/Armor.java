package Items;

public class Armor extends Item {

	//Atributos
	protected int defensepts;

	protected double weight;

	//Métodos
	public Armor(String name, double price, int defensepts, double weight) {
		super(name, price);

		if (weight >= 1 || weight <= 20)
			this.weight = weight;
		else this.weight = 1;
		
		if (defensepts >= 1 || defensepts <= 20)
			this.defensepts = defensepts;
		else this.defensepts = 1;
	}

	public Armor clone() {
		return (Armor)this.clone();
	}

	public int getDefensePts() {
		return this.defensepts;
	}

	public int getAttackPts() {
		return 0;
	}

	public double getWeight() {
		return this.weight;
	}

	public void use(Recoverable recoverable){

	}

	public boolean isHealth(){
		return false;
	}

	public void setHP(int HP) {
		if(getHP() + HP <= 100)
			this.HP = getHP() + HP;
	}

	public int getHP() {
		return this.HP;
	}

	public void setMP(int MP) {
		System.out.println("Item não possui MP!");
	}

	public int getMP() {
		return 0;
	}

}
