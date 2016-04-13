package Game.src.game;

public class Player {
	
	public int hp = 10;
	public int def = 0;
	public int atk = 2;
	public int exp = 0;
	public int defInc = 1;
	
	public void reduceHealthPlayer(int attackValue){
		if (attackValue <= def){
			System.out.println("The Raccoon is no longer effective!");
		}
		else{
			this.hp = this.hp - attackValue + this.def;
		}
	}
	
	public int getAttackValuePlayer(){
	    return this.atk;
	}
	
	public void increaseDefensePlayer(int defValue){
		this.def = this.def + defValue;
	}
	
	public int getDefValuePlayer(){
		return this.defInc;
	}
	
	public void increaseExpPlayer(int expValue){
		this.exp = this.exp + expValue;
	}
	
	public int getExpValuePlayer(){
		return this.exp;
	}
}
