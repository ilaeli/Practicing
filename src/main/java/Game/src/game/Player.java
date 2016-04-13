package Game.src.game;

public class Player {
	
	public int hp = 10;
	public int def = 0;
	public int atk = 2;
	public int exp = 0;
	public int defInc = 1;
	
	public void reduceHealth(int attackValue){
	    this.hp = this.hp - attackValue;
	}
	
	public int getAttackValue(){
	    return this.atk - this.def;
	}
	
	public void increaseDefense(int defValue){
		this.def = this.def + defValue;
	}
	
	public int getDefValue(){
		return this.defInc;
	}
}
