package test;

import java.util.Scanner;


public class quiz {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String sceneFight="";
	String sceneHide="";
	String sceneRun="";
	String weapon="";
	 boolean playing=false;
	 do {
	System.out.println("Welcome to the tutorial island, I am Isla and I am your guide, you were selected between many people to prove yourself and prove the value of humanity.");
	System.out.println();
	System.out.println("The tutorial has 100 phases that are divided in three(3) difficuties, EASY, NORMAL AND HARD, monsters and situations will appear to prove you. Prove your value finishing the tutorial, rewards and skills are going to give you while you are proving your value.");
	boolean begin = false;
	do {
	System.out.println("Please choose the difficulty of the tutorial: ");
	String difficulty = in.nextLine();
	if(difficulty.equalsIgnoreCase("easy")) {
		System.out.println("You choose the easy mode, prove that you have value! you will be teleported to the white room to your first phase of the easy mode.");
		begin = true;
		
	} else if (difficulty.equalsIgnoreCase("normal")) {
		System.out.println("Sorry, it is not possible for while, try the easy one!");
		begin = false;
	}else if (difficulty.equalsIgnoreCase("hard")) {
		System.out.println("Sorry, it is not possible for while, try the easy one!");
		begin = false;
	}else {
		System.out.println("EASY, NORMAL or HARD.");
		begin = false;
	}
	}while(!begin);
	
	System.out.println();
	System.out.println("Welcome, player! You are in the white room, the place where you can heal and rest between the phases. You have 30 days to conclude each phase. Now you can see three(3) weapons, SWORD, BOW and STAFF. After the phase 10, you can change your weapon or buy more on the store in the white Room. ");	

	boolean army=false;
	do {
		System.out.println("Please choose your weapon: ");
	weapon = in.nextLine();
		if (weapon.equalsIgnoreCase("sword")) {
			System.out.println("You choose 'sword' as your weapon, in the phase 10 you can choose your class, during the phases you can acquire skills that will help you prove your value!");
			army=true;
		} else if (weapon.equalsIgnoreCase("bow")) {
			System.out.println("You choose 'bow' as your weapon, in the phase 10 you can choose your class, during the phases you can acquire skills that will help you prove your value!");
			army=true;
		}else if (weapon.equalsIgnoreCase("staff")) {
			System.out.println("You choose 'staff' as your weapon, in the phase 10 you can choose your class, during the phases you can acquire skills that will help you prove your value!");
			army=true;
		} else {
			System.out.println("Please SWORD, BOW OR STAFF.");
			army=false;
		}
			
	}while(!army);
	System.out.println("Now you are prepared to start the tutorial!");
	boolean choice = false;
	do {
		System.out.println("Do you want to start the phase 1?(YES/NO) ");
		String choose = in.nextLine();
		if (choose.equalsIgnoreCase("yes")) {
			System.out.println();
			System.out.println("Welcome to the phase 1 of the easy mode, your mission is to run until the other side of the lake and get the gold chest.");
			System.out.println();
			System.out.println("You begin walk to the other side of the lake, when realize that are 2 goblins running after you.");
			boolean one = false;
			do {
			System.out.println("Do you want to RUN, HIDE or FIGHT? ");
			String choiceOne=in.nextLine();
			System.out.println();
			if (choiceOne.equalsIgnoreCase("run")) {
				System.out.println(runScene(sceneRun, in));
				one = true;
			}else if (choiceOne.equalsIgnoreCase("hide")) {
				System.out.println(hideScene(sceneHide, in));
				one = true;
			}else if (choiceOne.equalsIgnoreCase("fight")) {
				System.out.println(fightScene(sceneFight,in));
				one = true;
			}else {
				System.out.println("Please RUN, HIDE or FIGHT.");
				one = false;
			}
			}while(!one);
			choice=true;
		}else if (choose.equalsIgnoreCase("no")) {
			System.out.println("You have 24 hours to start the tutorial!");
			choice=true;
		} else {
			System.out.println("please YES or NO!");
			choice=false;
		}
		boolean again=false;
		do {
			System.out.println("Do you want to try again?(YES/NO) ");
		String choiceAgain = in.nextLine();
		if (choiceAgain.equalsIgnoreCase("yes")) {
			again=true;
			playing=false;
		}else if (choiceAgain.equalsIgnoreCase("no")) {
			again=true;
			playing=true;
		}else {
			System.out.println("YES or NO.");
			again = false;
			playing =true;
		}
		}while(!again);
	}while(!choice);
	 }while(!playing);
	
	
}
public static String runScene(String scene, Scanner in) {
	boolean tries = false;
	String choiceTwo ="";
	System.out.println("You start running towards the lake and create some distance from the goblins, but when you look back, you end up stumbling through the foliage and realize that the goblins are catching up to you. ");
	do {
		System.out.println("Do you want to HIDE or FIGHT? ");
		choiceTwo = in.nextLine();
		System.out.println();
		//HIDE CHOICE
		if (choiceTwo.equalsIgnoreCase("hide")) {
			System.out.println("You hide behind a tree but realize your footprints were discovered by goblins and they find you.");
			boolean tries1=false;
			do {
			System.out.println("Do you want to RUN or FIGHT? ");
			String choiceThree = in.nextLine();
			if(choiceThree.equalsIgnoreCase("run")) {
				System.out.println("You try to run but it is too late.");
				boolean tries2=false;
				do {
					System.out.println("Do you want to FIGHT or TRY SOMETHING? ");
					String choiceFour= in.nextLine();
					System.out.println();
					if(choiceFour.equalsIgnoreCase("fight")) {
						System.out.println("You wield your weapon with courage and when the goblins jump to attack you you strike a sword blow leaving one of the goblins with a critical wound, but realize that the other one attacks you at the same time and is slightly wounded and retreats, looking at the around you see a rock the size of your fist.");
						boolean tries3=false;
						//STONE CHOICE
						do {
						System.out.println("Do you want to TAKE it or IGNORE it?");
						String choiceStone = in.nextLine();
						System.out.println();
						if(choiceStone.equalsIgnoreCase("take")) {
							System.out.println("When you pick up the stone you throw it as a distraction in the direction of the healthy goblin, and when he dodges you land a critical hit and kill him, and soon after you finish the other goblin having a great victory in your first fight. As a reward you unlock a skill with the weapon and level up by reaching level 1. Then you take some air and rest a little before continuing the phase 1.");
							tries3=true;
						}else if(choiceStone.equalsIgnoreCase("ignore")) {
							System.out.println("You ignore the stone and advance for an attack, when launching an attack the healthy goblin dodges and the wounded goblin throws his dagger distracting you, and when you realize it's already too late, the healthy goblin strikes you making you drop your weapon and then finishes him off by killing him. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
							tries3=true;
						}else {
							System.out.println("Please TAKE or IGNORE.");
							tries3=false;
						}
						}while(!tries3);
						tries2=true;
					//TRY SOMETHING
					}else if(choiceFour.equalsIgnoreCase("try something")) {
						System.out.println("You despair and try to do something, but with a great fear, your legs weaken and you end up dropping your weapon and when you try to pick it up, you take a hit and are finished. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
						tries2=true;
					}else{
						System.out.println("Please FIGHT or TRY SOMETHING.");
						tries2=false;
					}
				}while(!tries2);
				tries1=true;
			}else if (choiceThree.equalsIgnoreCase("fight")) {
				System.out.println("You wield your weapon with courage and when the goblins jump to attack you you strike a sword blow leaving one of the goblins with a critical wound, but realize that the other one attacks you at the same time and is slightly wounded and retreats, looking at the around you see a rock the size of your fist.");
				boolean tries3=false;
				do {
				System.out.println("Do you want to TAKE it or IGNORE it?");
				String choiceStone = in.nextLine();
				System.out.println();
				if(choiceStone.equalsIgnoreCase("take")) {
					System.out.println("When you pick up the stone you throw it as a distraction in the direction of the healthy goblin, and when he dodges you land a critical hit and kill him, and soon after you finish the other goblin having a great victory in your first fight. As a reward you unlock a skill with the weapon and level up by reaching level 1. Then you take some air and rest a little before continuing the phase 1.");
					tries3=true;
				}else if(choiceStone.equalsIgnoreCase("ignore")) {
					System.out.println("You ignore the stone and advance for an attack, when launching an attack the healthy goblin dodges and the wounded goblin throws his dagger distracting you, and when you realize it's already too late, the healthy goblin strikes you making you drop your weapon and then finishes him off by killing him. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
					tries3=true;
				}else {
					System.out.println("Please TAKE or IGNORE.");
					tries3=false;
				}
				}while(!tries3);
				tries1=true;
			}else {
				System.out.println("Please RUN or FIGHT.");
				tries1=false;
			}
			}while(!tries1);
			tries=true;
		}else if (choiceTwo.equalsIgnoreCase("fight")) {
			System.out.println("You wield your weapon with courage and when the goblins jump to attack you you strike a sword blow leaving one of the goblins with a critical wound, but realize that the other one attacks you at the same time and is slightly wounded and retreats, looking at the around you see a rock the size of your fist.");
			boolean tries3=false;
			do {
			System.out.println("Do you want to TAKE it or IGNORE it?");
			String choiceStone = in.nextLine();
			System.out.println();
			if(choiceStone.equalsIgnoreCase("take")) {
				System.out.println("When you pick up the stone you throw it as a distraction in the direction of the healthy goblin, and when he dodges you land a critical hit and kill him, and soon after you finish the other goblin having a great victory in your first fight. As a reward you unlock a skill with the weapon and level up by reaching level 1. Then you take some air and rest a little before continuing the phase 1.");
				tries3=true;
			}else if(choiceStone.equalsIgnoreCase("ignore")) {
				System.out.println("You ignore the stone and advance for an attack, when launching an attack the healthy goblin dodges and the wounded goblin throws his dagger distracting you, and when you realize it's already too late, the healthy goblin strikes you making you drop your weapon and then finishes him off by killing him. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
				tries3=true;
			}else {
				System.out.println("Please TAKE or IGNORE.");
				tries3=false;
			}
			}while(!tries3);
			tries=true;
		}else {
			System.out.println("Please HIDE or FIGHT.");
			tries=false;
		}
	}while(!tries);
	return choiceTwo;
	
}
public static String hideScene(String scene, Scanner in) {
	System.out.println("You hide behind a tree but realize your footprints were discovered by goblins and they find you.");
	boolean tries1=false;
	do {
	System.out.println("Do you want to RUN or FIGHT? ");
	String choiceThree = in.nextLine();
	if(choiceThree.equalsIgnoreCase("run")) {
		System.out.println("You try to run but it is too late.");
		boolean tries2=false;
		do {
			System.out.println("Do you want to FIGHT or TRY SOMETHING? ");
			String choiceFour= in.nextLine();
			System.out.println();
			if(choiceFour.equalsIgnoreCase("fight")) {
				System.out.println("You wield your weapon with courage and when the goblins jump to attack you you strike a sword blow leaving one of the goblins with a critical wound, but realize that the other one attacks you at the same time and is slightly wounded and retreats, looking at the around you see a rock the size of your fist.");
				boolean tries3=false;
				//STONE CHOICE
				do {
				System.out.println("Do you want to TAKE it or IGNORE it?");
				String choiceStone = in.nextLine();
				System.out.println();
				if(choiceStone.equalsIgnoreCase("take")) {
					System.out.println("When you pick up the stone you throw it as a distraction in the direction of the healthy goblin, and when he dodges you land a critical hit and kill him, and soon after you finish the other goblin having a great victory in your first fight. As a reward you unlock a skill with the weapon and level up by reaching level 1. Then you take some air and rest a little before continuing the phase 1.");
					tries3=true;
				}else if(choiceStone.equalsIgnoreCase("ignore")) {
					System.out.println("You ignore the stone and advance for an attack, when launching an attack the healthy goblin dodges and the wounded goblin throws his dagger distracting you, and when you realize it's already too late, the healthy goblin strikes you making you drop your weapon and then finishes him off by killing him. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
					tries3=true;
				}else {
					System.out.println("Please TAKE or IGNORE.");
					tries3=false;
				}
				}while(!tries3);
				tries2=true;
			//TRY SOMETHING
			}else if(choiceFour.equalsIgnoreCase("try something")) {
				System.out.println("You despair and try to do something, but with a great fear, your legs weaken and you end up dropping your weapon and when you try to pick it up, you take a hit and are finished. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
				tries2=true;
			}else{
				System.out.println("Please FIGHT or TRY SOMETHING.");
				tries2=false;
			}
		}while(!tries2);
		tries1=true;
	}else if (choiceThree.equalsIgnoreCase("fight")) {
		System.out.println("You wield your weapon with courage and when the goblins jump to attack you you strike a sword blow leaving one of the goblins with a critical wound, but realize that the other one attacks you at the same time and is slightly wounded and retreats, looking at the around you see a rock the size of your fist.");
		boolean tries3=false;
		do {
		System.out.println("Do you want to TAKE it or IGNORE it?");
		String choiceStone = in.nextLine();
		System.out.println();
		if(choiceStone.equalsIgnoreCase("take")) {
			System.out.println("When you pick up the stone you throw it as a distraction in the direction of the healthy goblin, and when he dodges you land a critical hit and kill him, and soon after you finish the other goblin having a great victory in your first fight. As a reward you unlock a skill with the weapon and level up by reaching level 1. Then you take some air and rest a little before continuing the phase 1.");
			tries3=true;
		}else if(choiceStone.equalsIgnoreCase("ignore")) {
			System.out.println("You ignore the stone and advance for an attack, when launching an attack the healthy goblin dodges and the wounded goblin throws his dagger distracting you, and when you realize it's already too late, the healthy goblin strikes you making you drop your weapon and then finishes him off by killing him. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
			tries3=true;
		}else {
			System.out.println("Please TAKE or IGNORE.");
			tries3=false;
		}
		}while(!tries3);
		tries1=true;
	}else {
		System.out.println("Please RUN or FIGHT.");
		tries1=false;
	}
	}while(!tries1);
	return scene;
	
}
public static String fightScene(String scene, Scanner in) {
	System.out.println("You wield your weapon with courage and when the goblins jump to attack you you strike a sword blow leaving one of the goblins with a critical wound, but realize that the other one attacks you at the same time and is slightly wounded and retreats, looking at the around you see a rock the size of your fist.");
	boolean tries3=false;
	do {
	System.out.println("Do you want to TAKE it or IGNORE it?");
	String choiceStone = in.nextLine();
	System.out.println();
	if(choiceStone.equalsIgnoreCase("take")) {
		System.out.println("When you pick up the stone you throw it as a distraction in the direction of the healthy goblin, and when he dodges you land a critical hit and kill him, and soon after you finish the other goblin having a great victory in your first fight. As a reward you unlock a skill with the weapon and level up by reaching level 1. Then you take some air and rest a little before continuing the phase 1.");
		tries3=true;
	}else if(choiceStone.equalsIgnoreCase("ignore")) {
		System.out.println("You ignore the stone and advance for an attack, when launching an attack the healthy goblin dodges and the wounded goblin throws his dagger distracting you, and when you realize it's already too late, the healthy goblin strikes you making you drop your weapon and then finishes him off by killing him. When you open your eyes you realize that you returned to where you were in the land but that land was no longer the same because there were monsters in the surroundings!");
		tries3=true;
	}else {
		System.out.println("Please TAKE or IGNORE.");
		tries3=false;
	}
	}while(!tries3);
	return scene;
	
}
}
