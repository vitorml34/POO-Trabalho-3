package Items;

public abstract class Potion extends Item {

	protected int restorepts;

	public Potion(String name, double price, int restorepts){
		super(name, price);
		this.restorepts = restorepts;
	}

	public Potion clone(){
		return (Potion)this.clone();
	}


	public int getRestorePoints(){
		return restorepts;
	}


	public int getAttackPts() {return 0;}
	
	public int getDefensePts(){ return 0;};
	
	public abstract void use(Recoverable recoverable);
	
	public abstract boolean isHealth();
}