package Items;

public class ManaPotion extends Potion{


	public ManaPotion(String name, double price, int restorepts){
		super(name, price, restorepts);
	}
		
	public void use(Recoverable recoverable) {
		recoverable.setMP(recoverable.getMP() + this.restorepts);
	}

	public void setHP(int HP) {
		System.out.println("Item não possui HP!");
	}

	public int getHP() {
		return 0;
	}

	public void setMP(int MP) {
		System.out.println("Item não possui MP!");
	}

	public int getMP() {
		return 0;
	}		
	
	public boolean isHealth(){
		return false;
	}
}