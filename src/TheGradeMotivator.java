public class TheGradeMotivator {
	static int grade;
	public int addGrades() {
		grade = 91;
		return grade;
	}
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("Get better");
		else
			System.out.println("Well, what can I say?");
	}
	public void grade() {
		System.out.println("you are going to do great!");
	}
	
	public static void main(String[] args) {
		
		TheGradeMotivator tm = new TheGradeMotivator();
		tm.addGrades();
		tm.feedback(grade);
		tm.grade();
	}
}