package Items;

public abstract class Item implements Recoverable {

		private String name;

		private double price;

		protected int HP;

		public Item(String name, double price) {
			this.name = name;
			this.price = price;
			this.HP = 100;
		}

		public Item clone() {
			return (Item)this.clone();
		}

		public String getName() {
			return this.name;
		}

		public double getPrice() {
			return this.price;
		}

		public abstract void use(Recoverable recoverable);
		public abstract boolean isHealth();

		public abstract int getDefensePts();

		public abstract int getAttackPts();

		public void setHP(int HP) {
			if(getHP() + HP <= 100)
				this.HP = getHP() + HP;
		}

		public int getHP() {
			return this.HP;
		}

		public void setMP() {
			System.out.println("Item não possui MP!");
		}

		public int getMP() {
			return 0;
		}
}


