package day3;

public class MarkValidator {
	
	
	public String markGrade(int mark) {
		if(mark>=90) {
			String Grade = "A";
			return Grade;
		}
		else if(mark>=75) {
			String Grade = "B";
			return Grade;
		}
		else if(mark>=60) {
			String Grade = "C";
			return Grade;
		}
		else {
			String Grade = "D";
			return Grade;
		}
	}
	

	public boolean isPass(int mark) {
		// TODO Auto-generated method stub
		if(mark>=40) {
			markGrade(mark);
			return true;
		}
		return false;
	}
}
