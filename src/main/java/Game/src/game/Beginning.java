package Game.src.game;

import java.util.Scanner;

public class Beginning {
	
	//Version 1.3

    public static void main(String[] args)
    {	
	Scanner input = new Scanner(System.in);
	String name;
	
	System.out.println("Welcome to the battle arena!");
    System.out.println("What is your name?");
    name = input.nextLine();
    System.out.println("Oh, so your name is " + name + "?");
    System.out.println("Yes yes.. Well, " + name + ", this is the arena where legends are born!");
    System.out.println("Countless warriors have entered, few have left.");
    System.out.println("What's this now?!");
    System.out.println("A wild raccoon has appeared!");
    
    Battle1.raccoonStart1();
	
	System.out.println("Phew! That was a close one.");
	System.out.println("Welp that's it, you won the battle arena! Congratulations!");
    input.close();
    System.exit(0);
    }
}
