package Game.src.game;

public class Opponent {	
	
	private int hp = 5;
	private int atk = 2;
	
	public void reduceHealthOpponent(int attackValue){
	    this.setHp(this.getHp() - attackValue);
	}
	
	public int getAttackValueOpponent(){
	    return this.getAtk();
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
}