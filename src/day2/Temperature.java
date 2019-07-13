package day2;

public class Temperature {
	
	public  double ConvertToFarenheit(double celsius){
		  
		 return ( ((celsius*9)/5)+32 );
	  }
	
	 public  double ConvertToCelsius(double farenheit) {
		  
		  return ( (farenheit-32)*5/9);
	  }
}
