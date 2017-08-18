import java.util.*;

public class WeatherReport
{

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		int temper = cin.nextInt();
		double c = 0;
		
		if(temper < 32)
		{
			c = 5.0*(temper - 32.0)/9.0;
			System.out.println(c + " degrees Centigrade");
			System.out.println("It's Cold Outside");
		}
		if (temper > 90)
		{
			c = 5.0*(temper - 32.0)/9.0;
			System.out.println(c + " degrees Centigrade");
			System.out.println("It's Hot Outside");
		}
		else
		{
			c = 5.0*(temper - 32.0)/9.0;
			System.out.println(c + " degrees Centigrade");
		}
		cin.close();
	}

}
