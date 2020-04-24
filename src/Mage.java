
public class Mage extends Generic_Player{

	public Mage(String name, int hp, int atk, int intell) {
		super(name, hp, atk, intell);
		
		// TODO Auto-generated constructor stub
	}
	public Mage() {
		//default empty constructor
	}
	
	
	
	//Overrides physical_attack()
	public int physical_attack() {
		return super.physical_attack()/2;
	}
	
	//Overrides magic_attack()
	public int magic_attack() {
		return super.magic_attack()*2;
	}
	
	public int FIREBALL() {
		System.out.println("****BOOM****");
		return super.getIntell()*100;
		
	}
	
	public int gamble(int input) {
		double RNG1 = Math.round((Math.random() * 100) / 100);
		int intRNG1 = (int) RNG1;
		if(input == intRNG1) {
			return super.getIntell()*1000;
		}
		else {
			return 0;
		}
	}

}
