package day2;

public class Temperature {
	
	public  double CelsiusToFarenheit(double celsius){
		  
		 return ( ((celsius*9)/5)+32 );
	  }
	
	 public  double FarenheitToCelsius(double farenheit) {
		  
		  return ( (farenheit-32)*5/9);
	  }
}
