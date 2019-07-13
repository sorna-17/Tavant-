package day4;

public class SumOfNumbers {
	
   
   public int sumofOddNumbers(int start,int end) {
	   int sum = 0;
	   for(int i = start;i<=end;i++) {
		   if(i%2==1) {
			   sum = sum+i;
		   }
	   }
	   return sum;
   }
public int sumofEvenNumbers(int start, int end) {
	// TODO Auto-generated method stub
	int sum = 0;
	   for(int i = start;i<=end;i++) {
		   if(i%2==0) {
			   sum = sum+i;
		   }
	   }
	   return sum;
	
}
}
