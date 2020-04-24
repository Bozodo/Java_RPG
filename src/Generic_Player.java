
public class Generic_Player {
	
	private String name;
	private int hp;
	private int atk;
	private int intell;
	
	

	
	public Generic_Player(String name, int hp, int atk, int intell) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.intell = intell;
	}
	
	public Generic_Player(String name) {
		this.name = name;
	}
	
	public Generic_Player() {
		
	}
	
	public String toString() 
    { 
        return name + " " + hp + " " + atk + " " + intell; 
    } 
	
	public void checkStats() {
		System.out.println("Player Stats: ");
		System.out.println();
		System.out.println("Name: " + getName());
		System.out.println("HP: " + getHp());
		System.out.println("Attack: " + getAtk());
		System.out.println("Intelligence: " + getIntell());
		System.out.println();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getIntell() {
		return intell;
	}
	public void setIntell(int intell) {
		this.intell = intell;
	}
	
	public int base_mana() {
		return intell * 20;
	}
	
	public int physical_attack(){
		return atk;
	}
	
	public int magic_attack() {
		return intell;
	}
	
	public int gamble() {
		double RNG1 = Math.round((Math.random() * 100) / 100);
		double RNG2 = Math.round((Math.random() * 100) / 100);
		int intRNG1 = (int) RNG1;
		int intRNG2 = (int) RNG2;
		if(intRNG1 == intRNG2) {
			return atk*1000;
		}
		else {
			return 0;
		}
	}
	

}
