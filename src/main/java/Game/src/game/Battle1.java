package Game.src.game;

import java.util.Scanner;

public class Battle1 {
   
	public static void raccoonStart1(){
	Opponent raccoon1 = new Opponent();
	Player play1 = new Player();
	
	while(raccoon1.getHp() >= 1){		
    	Scanner input1 = new Scanner(System.in);
    	int select;
    	
    	System.out.println("What will you do?");
    	System.out.println("1. Attack");
    	System.out.println("2. Defend");
    	System.out.println("3. Run Away!"); 
    	
    	if(input1.hasNextInt()){
   	     select = input1.nextInt();
	   	}
	   	else {
	   	     select = 999;
	   	}

	    	if(select == 1){
	    		System.out.println("You strike at the raccoon!");
	    		System.out.println("You deal " + play1.getAtk() + " damage!");
	    		raccoon1.reduceHealthOpponent(play1.getAttackValuePlayer());
			    	if(raccoon1.getHp() <= 0){
			    		System.out.println("You have slain the raccoon!");
			    		System.out.println("You gain 5 exp!");
			    		play1.increaseExpPlayer(5);
			            input1.close();
			    	}
			    	else{
			    		System.out.println("Raccoon has " + raccoon1.getHp() + " health remaining!");
			    		System.out.println("The raccoon claws back!");
			    		System.out.println("It dealt " + raccoon1.getAtk() + " damage!");
			    		play1.reduceHealthPlayer(raccoon1.getAttackValueOpponent());
			    		System.out.println("You have " + play1.getHp() + " health remaining!");
			    	}
	    	}
	    	else if(select == 2){
	    		System.out.println("You raise your arms in defense!");
	    		System.out.println("Defense raised by 1!");
	    		play1.increaseDefensePlayer(play1.getDefValuePlayer());
	    		System.out.println("The raccoon claws at you!");
	    		System.out.println("It dealt " + raccoon1.getAtk() + " damage!");
	    		play1.reduceHealthPlayer(raccoon1.getAttackValueOpponent());
	    		System.out.println("You have " + play1.getHp() + " health remaining!");
	    	}
	    	else if(select == 3){
	    		System.out.println("The raccoon chases you down!");
	    	}
		}
	}
}
