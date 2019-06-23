package Project4;

//Meghan Weber

public class Driver {

	public static void main(String[] args) {

		Pitcher Mike1 = new Pitcher();
		Batter Bob1 = new Batter();
		Bob1.getName();
		Mike1.getName();
		Bob1.hit();
		Mike1.pitch();

		int strike = 0;
		int ball = 0;
		System.out.println(Mike1.getName() + " is pitching to " + Bob1.getName() );
		while(true) {
			if (Bob1.hit() == true & Mike1.pitch() == true) {
				System.out.print(Bob1.getName() + " got a hit!");
				break;
			} else if (Bob1.hit() == false & Mike1.pitch() == true) {
				System.out.println("         " + Bob1.getName() + " swung and missed");
				strike++;
				System.out.println("         " +"The count is " + ball + " balls " + strike + " strikes");
				if(strike == 3) {
					System.out.println(Bob1.getName() + " struck out.");
					break;
				}
			} else if (Mike1.pitch() == false) {
				System.out.println("         " +Mike1.getName() + " threw a ball");
				ball++;
				System.out.println("         " +"The count is " + ball + " balls " + strike + " strikes");
				if(ball == 4) {
					System.out.println(Bob1.getName() + " walked.");
					break;
				}
			}

		}
	}
}
