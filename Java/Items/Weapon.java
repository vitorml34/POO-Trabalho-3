package Items;

public class Weapon extends Item {

	protected int attackpts;

	protected double range;

	public Weapon(String name, double price, int attackpts, double range) {
		super(name, price);
		this.range = range;
		if(attackpts >= 1 || attackpts <= 9)
			this.attackpts = attackpts;
		else this.attackpts = 1;
	}

	public Weapon clone(){
		return (Weapon)this.clone();
	}

	public int getDefensePts() {
		return 0;
	}

	public int getAttackPts(){
		return this.attackpts;
	}

	public double getRange(){
		return this.range;
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
		System.out.println("Weapon não possui MP!");
	}

	public int getMP() {
		return 0;
	}
}
