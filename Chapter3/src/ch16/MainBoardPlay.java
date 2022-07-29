package ch16;

public class MainBoardPlay {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}
/* 문제점: upgrade 기능을 구현하는 데 어려움이 있었다. 나는 upgradeLevel이라는 메소드가 
 * plyaerLevel 클래스가 아닌 player 클래스에 있다는 것을 생각하지 못했다.
 */
}
