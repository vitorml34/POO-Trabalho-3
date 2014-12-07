import Items.*;
import java.lang.Boolean.*;
import java.util.*;

public class Main{


	public static void main (String []args){

	Item w1 = new Weapon("Bastard Sword", 1000.00, 10, 100);
	Item w2 = new Weapon("Zweihander", 1500.00, 15, 15000);
	Item w3 = new Weapon("Waraxe", 800.00, 8, 120);
	Item w4 = new Weapon("Hunter Bow", 400.00, 50, 50);
	Item w5 = new Weapon("Elven Bow", 800.00, 50, 900);
	Item w6 = new Weapon("Sting", 1000.00, 10, 100);
	Item w7 = new Weapon("Staff of Ages", 1500.00, 15, 15000);
	Item w8 = new Weapon("Ebony Staff", 800.00, 8, 120);
	Item w9 = new Weapon("Staff of Chaos", 400.00, 50, 50);
		
	Item a1 = new Armor("Elven Armor", 1000.00, 50, 80);
	Item a2 = new Armor("Dwarven Armor", 1000.00, 80, 100);
	Item a3 = new Armor("Ebony Armor", 1500.00, 80, 150);
	Item a4 = new Armor("Dragon Armor", 2400.00, 60, 200);
	Item a5 = new Armor("Shadow Armor", 2400.00, 45, 135);
	Item a6 = new Armor("Ultimate Armor", 2500.00, 65, 220);
	Item a7 = new Armor("Megaman Armor", 3000.00, 100, 300); 		
	Item a8 = new Armor("Altair Armor", 2200.00, 40, 175);
	Item a9 = new Armor("Normal Clothes", 100.00, 10, 10);

	Character c1 = new Thief("Legolas", 300);
	Character c2 = new Knight("Aragorn", 150);
	Character c3 = new Wizard("Gandalf", 400);
	Character c4 = new Knight("Theoden", 20);
	Character c5 = new Thief("Bilbo", 50);
	Character c6 = new Wizard("Radagast", 20);
	Character c7 = new Thief("Arya Stark", 120);
	Character c8 = new Knight("Ned Stark", 120);
	Character c9 = new Wizard("Harry Potter", 250);
	Character c10 = new Knight("Jon Snow", 85);
	Character c11 = new Thief("Frodo", 5);
	Character c12 = new Wizard("Saruman", 399);
	Character c13 = new Thief("Tyrion Lannister", 200);
	Character c14 = new Knight("Sor Duncan", 100);
	Character c15 = new Wizard("Hermione", 150);
	Character c16 = new Knight("Theon Greyjoy", 1);
	Character c17 = new Thief("Robin Hood", 200);
	Character c18 = new Wizard("Bran", 50);		

	Team t1 = new Team("A" , Color.blue);
	Team t2 = new Team("B" , Color.red);
	Team t3 = new Team("C" , Color.green);
	Team t4 = new Team("D" , Color.yellow);
	Team t5 = new Team("E" , Color.white);
	Team t6 = new Team("F" , Color.black);

	Item p1 = new HealthPotion("Apple Juice", 240.00, 40);
	Item p2 = new ManaPotion("Holy Water", 300.00, 20);

	t1.addChar(c1);
	t1.addChar(c2);
	t1.addChar(c3);
	t2.addChar(c4);
	t2.addChar(c5);
	t2.addChar(c6);
	t3.addChar(c7);
	t3.addChar(c8);
	t3.addChar(c9);
	t4.addChar(c10);
	t4.addChar(c11);
	t4.addChar(c12);
	t5.addChar(c13);
	t5.addChar(c14);
	t5.addChar(c15);
	t6.addChar(c16);
	t6.addChar(c17);
	t6.addChar(c18);


	c1.fillInventoryWeapon(w4); c1.fillInventoryArmor(a1); c1.fillInventory(p1);
	c2.fillInventoryWeapon(w1); c2.fillInventoryArmor(a2); c2.fillInventory(p2);
	c3.fillInventoryWeapon(w7); c3.fillInventoryArmor(a3); c3.fillInventory(p1);
	c4.fillInventoryWeapon(w2);	c4.fillInventoryArmor(a4); c4.fillInventory(p2);	
	c5.fillInventoryWeapon(w5); c5.fillInventoryArmor(a5); c5.fillInventory(p1);
	c6.fillInventoryWeapon(w8); c6.fillInventoryArmor(a6); c6.fillInventory(p2);
	c7.fillInventoryWeapon(w5); c7.fillInventoryArmor(a7); c7.fillInventory(p1);
	c8.fillInventoryWeapon(w2); c8.fillInventoryArmor(a8); c8.fillInventory(p2);
	c9.fillInventoryWeapon(w8); c9.fillInventoryArmor(a9); c9.fillInventory(p1);
	c10.fillInventoryWeapon(w3); c10.fillInventoryArmor(a1); c10.fillInventory(p2);
	c11.fillInventoryWeapon(w6); c11.fillInventoryArmor(a2); c11.fillInventory(p1);
	c12.fillInventoryWeapon(w9); c12.fillInventoryArmor(a3); c12.fillInventory(p2);
	c13.fillInventoryWeapon(w6); c13.fillInventoryArmor(a4); c13.fillInventory(p1);
	c14.fillInventoryWeapon(w3); c14.fillInventoryArmor(a5); c14.fillInventory(p2);
	c15.fillInventoryWeapon(w9); c15.fillInventoryArmor(a6); c15.fillInventory(p1);
	c16.fillInventoryWeapon(w1); c16.fillInventoryArmor(a7); c16.fillInventory(p2);
	c17.fillInventoryWeapon(w4); c17.fillInventoryArmor(a8); c17.fillInventory(p1);
	c18.fillInventoryWeapon(w7); c18.fillInventoryArmor(a9); c18.fillInventory(p2);


	
	ArrayList<Battlefield> b = new ArrayList<Battlefield>(6);
	Battlefield b1 = new Battlefield(t1,t2); b.add(b1);
	Battlefield b2 = new Battlefield(t2,t3); b.add(b2);
	Battlefield b3 = new Battlefield(t3,t4); b.add(b3);
	Battlefield b4 = new Battlefield(t4,t5); b.add(b4);
	Battlefield b5 = new Battlefield(t5,t6); b.add(b5);
	Battlefield b6 = new Battlefield(t1,t6); b.add(b6);



	Scanner ler = new Scanner(System.in);
	

	System.out.println("Time A: Legolas, Aragorn, Gandalf;");
	System.out.println("Time B: Theoden, Bilbo, Radagast;");
	System.out.println("Time C: Arya Stark, Ned Stark, Harry Potter;");
	System.out.println("Time D: Jon Snow, Frodo, Saruman;");
	System.out.println("Time E: Tyrion Lannister, Sor Duncan, Hermione;");
	System.out.println("Time F: Theon Greyjoy, Robin Hood, Bran.");
	System.out.println();
	System.out.printf("Informe um número de batalhas simultâneas (máximo de 6):");
	int n = ler.nextInt();


	for(int i=0; i<n; i++){
		b.get(i).start();
	}

	try {
        b6.join();
        b5.join();
        b4.join();
        b3.join();
        b2.join();
        b1.join();
    }
    catch (InterruptedException e) {
        e.printStackTrace();
    }
	
	System.out.println(t1.getResults());
	System.out.println("");
	System.out.println(t2.getResults());
	System.out.println("");
	System.out.println(t3.getResults());
	System.out.println("");
	System.out.println(t4.getResults());
	System.out.println("");
	System.out.println(t5.getResults());
	System.out.println("");
	System.out.println(t6.getResults());
	System.out.println("");

	}
}