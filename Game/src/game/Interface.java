package game;

import java.util.Scanner;

public class Interface {

    public static void main(String[] args)
    {

	String name;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Welcome to the battle arena!");
    System.out.println("What is your name?");
    name = input.nextLine();
    System.out.println("Oh, so your name is " + name + "?");
    System.out.println("Yes yes.. Well, " + name + ", this is the arena where legends are born!");
    System.out.println("Countless warriors have entered, few have left.");
    System.out.println("What's this now?!");
    System.out.println("A wild raccoon has appeared!");
    ;
    
    Boolean raccoon = true;
    
    while(raccoon = true){
    	
    	Scanner input1 = new Scanner(System.in);
    	int select;
    	Opponent raccoon1 = new Opponent();
    	Player play1 = new Player();
    	
    	System.out.println("What will you do?");
    	System.out.println("1. Attack");
    	System.out.println("2. Defend");
    	System.out.println("3. Run Away!");
    	select = input1.nextInt();
    	
    	if(select == 1){
    		System.out.println("You strike at the raccoon!");
    		System.out.println("You deal " + play1.atk + " damage!");
    		Math.subtract(raccoon1.hp, play1.atk);
    		System.out.println("Raccoon has " + raccoon1.hp + " remaining!");
    		System.out.println("The raccoon claws back!");
    		System.out.println("It dealt " + raccoon1.atk + " damage!");
    		Math.subtract(play1.hp, raccoon1.atk);
    		System.out.println("You have " + play1.hp + " remaining!");
    	}
    	if(select == 2){
    		System.out.println("You raise your arms in defense!");
    		System.out.println("Defense raised by 1!");
    		Math.add(play1.def, 1);
    		System.out.println("The raccoon claws at you!");
    		System.out.println("It dealt " + raccoon1.atk + " damage!");
    		Math.subtract(play1.hp, raccoon1.atk);
    		System.out.println("You have " + play1.hp + " remaining!");
    	}
    	if(select == 3){
    		System.out.println("The raccoon chases you down!");
    	}
    	if(raccoon1.hp <= 0){
    		System.out.println("You have slain the raccoon!");
    		System.out.println("You gain 5 exp!");
    		Math.add(play1.exp, 5);
        	raccoon = false;
            input1.close();
    	}
    }
	System.out.println("Phew! That was a close one.");
	System.out.println("Welp that's it, you won the battle arena! Congratulations!");
    input.close();
    } 
}
