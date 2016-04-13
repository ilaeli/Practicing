package Game.src.game;

public class Player {
	
	private int hp = 10;
	private int def = 0;
	private int atk = 2;
	private int exp = 0;
	private int defInc = 1;
	
	public void reduceHealthPlayer(int attackValue){
		if (attackValue <= def){
			System.out.println("The Raccoon is no longer effective!");
		}
		else{
			this.setHp(this.getHp() - attackValue + this.def);
		}
	}
	
	public int getAttackValuePlayer(){
	    return this.getAtk();
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

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
