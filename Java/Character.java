import Items.*;
import java.util.*;

public abstract class Character implements Recoverable {

	private String alias;

	private Inventory myitems;

	private int HP;

	private int MP;

	protected int XP;

	protected int strenght;

	protected int dexterity;

	protected int constitution;

	protected int speed;

	public Character(String alias) {
		this.alias = alias;
		myitems = new Inventory();
		HP = 100;
		MP = 50;
		XP = 1;
		strenght = 5;
		speed = 5;
		dexterity = 5;
		constitution = 5;
	}

	public String getName() {
		return this.alias;
	}

	protected Inventory MyItems(){
		return myitems;
	}

	protected abstract int getDefensePoints();

	protected abstract int getAttackPoints();

	public void attack(Character enemie) {
	//Chance de Miss!
		int aux;
		Random rand = new Random();
		aux = rand.nextInt();
		double q = 0.1/XP;
		q = 1/q;
		q = aux%q;
		if (q == 1){
			System.out.println("Miss!!");
			System.out.println();
			return;			
			}
		aux = rand.nextInt(11)-5;
		aux = getAttackPoints() - enemie.getDefensePoints() + aux;
		if(aux<0)
			aux = 1;
		q = 0.02*XP/2;
		q = 1/q;
		q = rand.nextInt()%q;
		if(q==1)
			aux=aux*2;
		enemie.HP-=aux;	
		System.out.println(getName()+ " atacou "+ enemie.getName() + " causando um dano de " + aux);
		System.out.println();
	}

	public void addXP(int XP) {
		this.XP = this.XP + XP;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public void recoverHP() {
		for(int i = 0; i < MyItems().getSize(); i++){
			//verifica se está ocupado
			if(MyItems().Items().get(i).getSecond() == true){
				Item aux = MyItems().Items().get(i).getFirst();
				//verifica se trata-se de uma poção
				if(aux.getDefensePts() == 0 && aux.getAttackPts() == 0){
					//verifica se é uma poção de vida
					if( aux.isHealth() ){
						System.out.println("Hp passado: " + this.getHP());
						aux.use(this);
						System.out.println("Novo Hp: " + this.getHP());
						MyItems().Items().remove(i);
						i = MyItems().getSize();
					}
				}
			}
		}
	}

	public void recoverMP() {
		for(int i = 0; i < MyItems().getSize(); i++){
			//verifica se está ocupado
			if(MyItems().Items().get(i).getSecond() == true){
				Item aux = MyItems().Items().get(i).getFirst();
				//verifica se trata-se de uma poção
				if(aux.getDefensePts() == 0 && aux.getAttackPts() == 0){
					//verifica se é uma poção de mana
					if( !aux.isHealth() ){
						System.out.println("Mp passado: " + this.getMP());
						aux.use(this);
						System.out.println("Novo Mp: " + this.getMP());
						MyItems().Items().remove(i);
						i = MyItems().getSize();
					}
				}
			}
		}
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getHP() {
		return this.HP;
	}

	public void setMP(int MP) {
		this.MP = MP;
	}

	public int getMP() {
		return this.MP;
	}

	public void fillInventoryArmor(Item i){
		myitems.insertArmor(i);
	}

	public void fillInventoryWeapon(Item i){
		myitems.insertWeapon(i);
	}

	public void fillInventory(Item i){
		myitems.insertItem(i);
	}
}
