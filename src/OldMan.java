
public class OldMan extends Warrior {

	public OldMan(String name, int hp, int atk, int intell) {
		super(name, hp, atk, intell);
		// TODO Auto-generated constructor stub
	}
	
	public OldMan() {
		//default empty constructor
	}
	
	public int gamble(int input) {
		double RNG1 = Math.round((Math.random() * 100) / 100);
		int intRNG1 = (int) RNG1;
		if(input == 20) {
			return super.getAtk()*1000;
		}
		else {
			return 0;
		}
	}


	
	
}
