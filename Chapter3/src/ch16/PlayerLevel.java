package ch16;

public abstract class PlayerLevel {
	
	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();
	void go(int count) {
		run();
		for(int i=0; i < count; i++ ) {
			jump();
		}  
		turn();
	}
}
