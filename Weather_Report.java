import java.util.Scanner;

public class Weather_Project
{

	//Tell the temperature when number is input into the terminal
	
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //Detects input and output
		
		System.out.println("Welcome please enter Temperature in Fahrenheit"); 
		
		int temper = cin.nextInt(); //variable that indicates the temperature
		
		double c = 0; //variable for degrees Centigrade conversion
	
		c = 5.0*(temper - 32.0)/9.0; //equation for Centigrade conversion
		
		System.out.println(c + " degrees Centigrade");
		
		if (temper < 32)//give temperature if less than 32
		{
			System.out.println("It's Cold Outside");
		}
		
		if (temper > 90)//give temperature if greater than 90
		{
			System.out.println("It's Hot Outside");
		}
	
		else //give temperature if between 90 and 32
		{
		}
		System.out.println("Have a Nice Day");
		
		cin.close();
	}

}
