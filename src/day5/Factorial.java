package day5;
public class Factorial {
	int fact =1;
	public int calculateFactorial(int number) {
		for (int i = 1;i<=number;i++) {
			fact = fact * i;
		}
	   return fact;
	}
}
