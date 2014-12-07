import java.lang.*;

public class Battlefield extends Thread{

	private Team t1;

	private Team t2;

	public Battlefield(Team t1, Team t2) {
		super(t1.getName() + " versus " +  t2.getName());
		this.t1 = t1;
		this.t2 = t2;
	}

	public void run() {
		System.out.println("The battle " + this.getName()+" begins!!");
		try{
			//System.out.println("Entrou na batalha!");
			//System.out.println(this.getName());
			t1.resolveBattle(t2);
			t2.resolveBattle(t1);
			System.out.println();
		}//catch (InterruptedException e){}
		finally{
			System.out.println("The Battle " + this.getName()+" Is Over!");
			System.out.println();
		}
	}

}
