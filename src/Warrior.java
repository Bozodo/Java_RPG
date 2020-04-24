
public class Warrior extends Generic_Player{

	public Warrior(String name, int hp, int atk, int intell) {
		super(name, hp, atk, intell);
		// TODO Auto-generated constructor stub
	}
	
	public Warrior() {
		//default empty constructor
	}
	public int gamble(int input) {
		double RNG1 = Math.round((Math.random() * 100) / 100);
		int intRNG1 = (int) RNG1;
		if(input == intRNG1) {
			return super.getAtk()*1000;
		}
		else {
			return 0;
		}
	}



	
	

}
