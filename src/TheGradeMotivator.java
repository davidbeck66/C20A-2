public class TheGradeMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public void grade() {
		System.out.println("you are going to do great!");
	}
	public static void main(String[] args) {
		TheGradeMotivator tm = new TheGradeMotivator();
		tm.feedback(60);
		tm.grade();
	}
}