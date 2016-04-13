package Game.src.game;

public class Opponent {	
	public int hp = 5;
	public int def = 0;
	public int atk = 2;
	
	public void reduceHealth(int attackValue){
	    this.hp = this.hp - attackValue;
	}
	
	public int getAttackValue(){
	    return this.atk - this.def;
	}
}