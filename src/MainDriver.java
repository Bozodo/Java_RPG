import java.util.Scanner;
public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Generic_Player player = new Generic_Player();
		Warrior warrior = new Warrior();
		Mage mage = new Mage();
		OldMan old = new OldMan();
		boolean playerExists = false;
		boolean warriorExists = false;
		boolean mageExists = false;
		boolean oldExists = false;
	  	  int input = 0;
	  	  int playerHP = player.getHp();
	  	  long randomNumber = Math.round((Math.random() * 100) / 100);
	  	  long enemyAttack = randomNumber;
	  	  boolean run = true;
	  	  
	  	  while(true) {
	  		System.out.println("Select one of the following options:");
			System.out.println("1. Add a player character");
			System.out.println("2. Check Stats");
			System.out.println("3. ADVENTURE");
			System.out.println("4. Exit");
			String option = sc.next();
			if(option.equals("1")) {
				System.out.println("You have selected Add a player character");
				System.out.println("Select a character to create!");
				System.out.println("1. Generic Character");
				System.out.println("2. Warrior");
				System.out.println("3. Mage");
				System.out.println("4. Old Man");
				switch(sc.nextInt()) {
				case 1:
					//Generic_Player player = new Generic_Player();
					System.out.println("You chose the Generic Person class");
					createGeneric(player);
					playerExists = true;
					break;
				case 2:
					System.out.println("You chose the Warrior class");
					createGeneric(player);
					warriorExists = true;
					break;
				case 3:
					System.out.println("You chose the Mage class");
					createGeneric(player);
					mageExists = true;
					break;
				case 4:
					System.out.println("You chose the Old Man class");
					createGeneric(player);
					oldExists = true;
					break;
			}
			}
			if(option.equals("2")) {
				if(playerExists == true || mageExists == true || warriorExists == true || oldExists == true) {
					checkStats(player);
				}
				else {
					System.out.println("There is no player created right now!");
				}
			}
			if(option.equals("3")) {
				System.out.println("You have selected ADVENTURE");
				System.out.println("*************************************************");
				System.out.println("You ENCOUNTERED A TEST ENEMY");
				if(playerExists == true) {
					genericAdventure(player);
				}
				if(mageExists == true) {
					mageAdventure(player);
				}
				if(warriorExists == true) {
					warriorAdventure(player);
				}
				if(oldExists == true) {
					oldAdventure(player);
				}
				
			}
			if(option.equals("4")) {
				System.out.println("You have selected Exit");
				System.out.println("Are you sure you want to exit(y/n)?");
				String exitInput = sc.next();
				if(exitInput.equals("n")) {
				}
				else if(exitInput.equals("y")) {
					System.out.println("GG");
					break;
				}
			}
	  	  }
	  	  
	  	  
		

	}
	
	public static void checkStats(Generic_Player player) {
		System.out.println("Player Stats: ");
		System.out.println();
		System.out.println("Name: " + player.getName());
		System.out.println("HP: " + player.getHp());
		System.out.println("Attack: " + player.getAtk());
		System.out.println("Intelligence: " + player.getIntell());
		System.out.println();
	}
	
	public static int encounterHP () {
		long random = Math.round((Math.random() * 100) / 100);
		int randomNumber = (int) random;
		 if(randomNumber > 0 && randomNumber < 25) {
			 //caseA
			 int hp = 100;
			 return hp;
		 }
		 else if(randomNumber > 26 &&  randomNumber < 50) {
			 //caseB
			 int hp = 1000;
			 return hp;
		 }
		 else if(randomNumber > 51 && randomNumber < 75) {
			 //caseC
			 int hp = 5000;
			 return hp;
		 }
		 else if(randomNumber > 76 && randomNumber < 100) {
			 //caseC
			 int hp = 50000;
			 return hp;
		 }
		 else {
			 return 100;
		 }
	 }
	
	public static int encounterAtk () {
		long random = Math.round((Math.random() * 100) / 100);
		int randomNumber = (int) random;
		 if(randomNumber > 0 && randomNumber < 25) {
			 //caseA
			 int atk = 100;
			 return atk;
		 }
		 else if(randomNumber > 26 &&  randomNumber < 50) {
			 //caseB
			 int atk = 1000;
			 return atk;
		 }
		 else if(randomNumber > 51 && randomNumber < 75) {
			 //caseC
			 int atk = 5000;
			 return atk;
		 }
		 else if(randomNumber > 76 && randomNumber < 100) {
			 //caseC
			 int atk = 50000;
			 return atk;
		 }
		 else {
			 return 100;
		 }
	 }
	
	public static void createGeneric(Generic_Player player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		player.setName(sc.nextLine());
		System.out.println("Enter HP");
		player.setHp(sc.nextInt());
		System.out.println("Enter Attack");
		player.setAtk(sc.nextInt());
		System.out.println("Enter Intelligence");
		player.setIntell(sc.nextInt());
		System.out.println("Character created!");
		System.out.println();
	}
	
	public static void createWarrior(Warrior player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		player.setName(sc.nextLine());
		System.out.println("Enter HP");
		player.setHp(sc.nextInt());
		System.out.println("Enter Attack");
		player.setAtk(sc.nextInt());
		System.out.println("Enter Intelligence");
		player.setIntell(sc.nextInt());
		System.out.println("Character created!");
		System.out.println();
	}
	
	public static void createMage(Mage player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		player.setName(sc.nextLine());
		System.out.println("Enter HP");
		player.setHp(sc.nextInt());
		System.out.println("Enter Attack");
		player.setAtk(sc.nextInt());
		System.out.println("Enter Intelligence");
		player.setIntell(sc.nextInt());
		System.out.println("Character created!");
		System.out.println();
	}
	
	public static void createOldMan(OldMan player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		player.setName(sc.nextLine());
		System.out.println("Enter HP");
		player.setHp(sc.nextInt());
		System.out.println("Enter Attack");
		player.setAtk(sc.nextInt());
		System.out.println("Enter Intelligence");
		player.setIntell(sc.nextInt());
		System.out.println("Character created!");
		System.out.println();
	}
	
	public static void genericAdventure(Generic_Player player) {
		int startingHp = player.getHp();
		int enemyHp = encounterHP();
		int enemyAtk = encounterAtk();
		Scanner sc = new Scanner(System.in);
		 while (startingHp>0)
		  {
			 System.out.println("Your HP: " + startingHp);
			 System.out.println("Enemy HP: " + enemyHp);
			 System.out.println("Choose an ACTION");
	          System.out.println("1. Magic");
	          System.out.println("2. Attack");
			  System.out.println("3. Stats");
			  System.out.println("4. Gamble");
			  
			  int input = sc.nextInt();

	        	
	          switch(input) {
	            case 1:   
	              System.out.println("You attack the enemy with a magic bolt"); 
	              //player.magic_attack()(); //The enemy is damaged by magic
	              System.out.println("The enemy took: " + player.magic_attack() + " Damage");
	              enemyHp -= player.magic_attack();
	              
	              break;
	            case 2:
	            	 System.out.println("You attack the enemy using your normal strength");
	                // player.physical_attack()(); //The enemy is damaged by magic
	                 System.out.println("The enemy took: " + player.physical_attack() + " Damage");
	            	//The enemy is damaged by a physical attack
	                 enemyHp -= player.physical_attack();
	            	 break;
	            case 3:
	            	checkStats(player);
	            	 break;
	            case 4:
	            	System.out.println("You take a GAMBLE FOR DAMAGE");
	            	enemyHp -= player.gamble();
	            	break;
	            default:
	              System.out.println("Invalid choice! Try Again!");
	          }
	          if (enemyHp > 0)
	          {
	        	  System.out.println("You took " + enemyAtk + " Damage");
	        	  startingHp -= enemyAtk;
	        	  
	          }
	          else if (enemyHp < 0)
	          {
	        	System.out.println("You win");
	        	System.out.println("*********************************");
	        	break;
	          }
	          
	          if(startingHp<=0) {
	        	  System.out.println("You lose");
	        	  System.out.println("*********************************");
	        	  break;
	          }
		  }
		}

	public static void mageAdventure(Generic_Player player) {
		Mage tempMage = new Mage(player.getName(),player.getHp(),player.getAtk(),player.getIntell());
		int startingHp = tempMage.getHp();
		int enemyHp = encounterHP();
		int enemyAtk = encounterAtk();
		Scanner sc = new Scanner(System.in);
		 while (startingHp>0)
		  {
			 System.out.println("Your HP: " + startingHp);
			 System.out.println("Enemy HP: " + enemyHp);
			 System.out.println("Choose an ACTION");
	          System.out.println("1. Magic");
	          System.out.println("2. Attack");
			  System.out.println("3. Stats");
			  System.out.println("4. Gamble");
			  System.out.println("5. FIREBALL");
			  
			  int input = sc.nextInt();

	        	
	          switch(input) {
	            case 1:   
	              System.out.println("You attack the enemy with a magic bolt"); 
	              //player.magic_attack()(); //The enemy is damaged by magic
	              System.out.println("The enemy took: " + tempMage.magic_attack() + " Damage");
	              enemyHp -= tempMage.magic_attack();
	              
	              break;
	            case 2:
	            	 System.out.println("You attack the enemy using your measly strength");
	                // player.physical_attack()(); //The enemy is damaged by magic
	                 System.out.println("The enemy took: " + tempMage.physical_attack() + " Damage");
	            	//The enemy is damaged by a physical attack
	                 enemyHp -= tempMage.physical_attack();
	            	 break;
	            case 3:
	            	 checkStats(tempMage);
	            	 break;
	            case 4:
	            	System.out.println("You take a GAMBLE FOR DAMAGE");
	            	enemyHp -= tempMage.gamble();
	            	break;
	            case 5:
	            	System.out.println("You use your crazy magic and launch a fireball dealing " + tempMage.FIREBALL() + " damage!");
	            	enemyHp -= tempMage.FIREBALL();
	            	break;
	            default:
	              System.out.println("Invalid choice! Try Again!");
	          }
	          if (enemyHp > 0)
	          {
	        	  System.out.println("You took " + enemyAtk + " Damage");
	        	  startingHp -= enemyAtk;
	        	  
	          }
	          else if (enemyHp < 0)
	          {
	        	System.out.println("You win");
	        	System.out.println("*********************************");
	        	break;
	          }
	          
	          if(startingHp<=0) {
	        	  System.out.println("You lose");
	        	  System.out.println("*********************************");
	        	  break;
	          }
		  }
		}

	public static void warriorAdventure(Generic_Player player) {
		Warrior tempWarrior = new Warrior(player.getName(),player.getHp(),player.getAtk(),player.getIntell());
		int startingHp = player.getHp();
		int enemyHp = encounterHP();
		int enemyAtk = encounterAtk();
		Scanner sc = new Scanner(System.in);
		 while (startingHp>0)
		  {
			 System.out.println("Your HP: " + startingHp);
			 System.out.println("Enemy HP: " + enemyHp);
			 System.out.println("Choose an ACTION");
	          System.out.println("1. Magic");
	          System.out.println("2. Attack");
			  System.out.println("3. Stats");
			  System.out.println("4. Gamble");
			  
			  int input = sc.nextInt();

	        	
	          switch(input) {
	            case 1:   
	              System.out.println("You attack the enemy with a magic bolt"); 
	              //player.magic_attack()(); //The enemy is damaged by magic
	              System.out.println("The enemy took: " + tempWarrior.magic_attack() + " Damage");
	              enemyHp -= tempWarrior.magic_attack();
	              
	              break;
	            case 2:
	            	 System.out.println("You attack the enemy using your brute strength");
	                // player.physical_attack()(); //The enemy is damaged by magic
	                 System.out.println("The enemy took: " + tempWarrior.physical_attack() + " Damage");
	            	//The enemy is damaged by a physical attack
	                 enemyHp -= tempWarrior.physical_attack();
	            	 break;
	            case 3:
	            	 checkStats(tempWarrior);
	            	 break;
	            case 4:
	            	System.out.println("You take a GAMBLE FOR DAMAGE");
	            	enemyHp -= tempWarrior.gamble();
	            	break;
	            default:
	              System.out.println("Invalid choice! Try Again!");
	          }
	          if (enemyHp > 0)
	          {
	        	  System.out.println("You took " + enemyAtk + " Damage");
	        	  startingHp -= enemyAtk;
	        	  
	          }
	          else if (enemyHp < 0)
	          {
	        	System.out.println("You win");
	        	System.out.println("*********************************");
	        	break;
	          }
	          
	          if(startingHp<=0) {
	        	  System.out.println("You lose");
	        	  System.out.println("*********************************");
	        	  break;
	          }
		  }
		}

	public static void oldAdventure(Generic_Player player) {
		OldMan tempOld = new OldMan(player.getName(),player.getHp(),player.getAtk(),player.getIntell());
		int startingHp = player.getHp();
		int enemyHp = encounterHP();
		int enemyAtk = encounterAtk();
		Scanner sc = new Scanner(System.in);
		 while (startingHp>0)
		  {
			 System.out.println("Your HP: " + startingHp);
			 System.out.println("Enemy HP: " + enemyHp);
			 System.out.println("Choose an ACTION");
	          System.out.println("1. Magic");
	          System.out.println("2. Attack");
			  System.out.println("3. Stats");
			  System.out.println("4. Gamble");
			  
			  int input = sc.nextInt();

	        	
	          switch(input) {
	            case 1:   
	              System.out.println("You attack the enemy with a magic bolt"); 
	              //player.magic_attack()(); //The enemy is damaged by magic
	              System.out.println("The enemy took: " + tempOld.magic_attack() + " Damage");
	              enemyHp -= tempOld.magic_attack();
	              
	              break;
	            case 2:
	            	 System.out.println("You attack the enemy using your brute strength");
	                // player.physical_attack()(); //The enemy is damaged by magic
	                 System.out.println("The enemy took: " + tempOld.physical_attack() + " Damage");
	            	//The enemy is damaged by a physical attack
	                 enemyHp -= tempOld.physical_attack();
	            	 break;
	            case 3:
	            	 checkStats(tempOld);
	            	 break;
	            case 4:
	            	System.out.println("You SKILLFULLY take a GAMBLE FOR DAMAGE");
	            	enemyHp -= tempOld.gamble();
	            	break;
	            default:
	              System.out.println("Invalid choice! Try Again!");
	          }
	          if (enemyHp > 0)
	          {
	        	  System.out.println("You took " + enemyAtk + " Damage");
	        	  startingHp -= enemyAtk;
	        	  
	          }
	          else if (enemyHp < 0)
	          {
	        	System.out.println("You win");
	        	System.out.println("*********************************");
	        	break;
	          }
	          
	          if(startingHp<=0) {
	        	  System.out.println("You lose");
	        	  System.out.println("*********************************");
	        	  break;
	          }
		  }
		}


}


