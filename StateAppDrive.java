package application;

public class StateAppDrive {

	public static void main(String[] args) {
		
		Reporter state = new Draw();
		Game todaysGame = new Game();
		
		todaysGame.setReporter(state);
		
		todaysGame.myTeam = 2;
		todaysGame.nextReport();
		todaysGame.display();
		
		todaysGame.otherTeam = 3;
		todaysGame.nextReport();
		todaysGame.display();
		
		todaysGame.myTeam = 3;
		todaysGame.nextReport();
		todaysGame.display();
	}

}
