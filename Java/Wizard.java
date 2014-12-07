import Items.*;

public class Wizard extends Character {

	protected int wisdom;

	public Wizard(String alias, int wisdom) {
		super(alias);
		this.wisdom = wisdom;
	}

	protected int getAttackPoints() {
		int items_att_pts = 0;
		int i = 0;
		Item aux = MyItems().searchItem(i);
		while(i<MyItems().getSize()){			
			if(aux != null){
				items_att_pts+=aux.getAttackPts();
				//System.out.println("O item "+aux.getName()+" contribuiu com "+aux.getAttackPts()+" No ataque do personagem "+ getName());
			}
			i++;
			aux=MyItems().searchItem(i);
		}
		double d = ((strenght*0.6+dexterity*0.4) + items_att_pts)*XP/6;
		d+= (wisdom/2);//Diferencial da classe
		return (int)d;
	}

	protected int getDefensePoints() {
		int items_def_pts = 0;
		int i = 0;
		Item aux = MyItems().searchItem(i);
		while(i<MyItems().getSize()){			
			if(aux != null){
				items_def_pts+=aux.getDefensePts();
				//System.out.println("O item "+aux.getName()+" contribuiu com "+aux.getDefensePts()+" Na defesa do personagem " + getName());
			}
			i++;
			aux=MyItems().searchItem(i);
		}
		double d = ((constitution*0.6 + dexterity*0.1 + speed*0.3) + items_def_pts)*XP/6;d+= (wisdom/2);
		return (int)d;
	}

	public void addWisdom(int wisdom) {
		this.wisdom+=wisdom;
	}

}
