package ch16;

public class Player {
	
	PlayerLevel level = null;

	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public void upgradeLevel(PlayerLevel player) {
		this.level = player;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
