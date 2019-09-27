package application;
// context
public class Game {
	
	int myTeam = 0; 
	int otherTeam = 0;
	
	Reporter report;
	
	void setReporter(Reporter r) {
		report = r;
	}
	
	void nextReport() {
		
		if(myTeam > otherTeam) {
			setReporter(new Winning());
			}
		else if (myTeam < otherTeam) {
			setReporter(new Loosing());
		}
		else {setReporter(new Draw());}
	}
	
	void display() {
		report.displayStatus();
	}
}
