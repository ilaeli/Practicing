package Game.src.game;

public class Opponent {	
	public int hp = 5;
	public int def = 0;
	public int atk = 2;
	
	public void reduceHealthOpponent(int attackValue){
	    this.hp = this.hp - attackValue;
	}
	
	public int getAttackValueOpponent(){
	    return this.atk;
	}	
}