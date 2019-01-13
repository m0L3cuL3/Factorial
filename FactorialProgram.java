

// Description...

/*	Factorial without using multiplication */



import java.util.Scanner;

class FactorialProgram
{

	public static void main(String args[])
	{
		
		Scanner reader = new Scanner(System.in); // Userinput shit...
		System.out.println("[INPUT NUMBER]: ");
		int n = reader.nextInt();
		System.out.println("");
		
		if(n < 0)
		{
			System.out.println( "[ERROR]: userinput is less than 0." ); 	// Prints error if userinput is less than 0...
		}
		
		if(n == 0)
		{
			n = 1;
			System.out.println( "[FACTORIAL]: " + n );		// Prints the Factorial of n equals to 0...
		}
		else
		{

			int x = 1;	
			int y = n;	
			int z = 0;	
			
			if (y == 1)
			{
				System.out.println( "[FACTORIAL]: "  +  n ); // Prints if y is equal to 1...
			}
			else
			{
				while(y != 1) // Loops y not equal to 1...
				{
					y = y - 1;
					x = y; 
					
					
					while(y != 1) // While y is not equal to zero, it checks if x is either equal to 0 and vice versa...
					{
						if(x != 0)
						{
							z = z + n;
							x = x - 1;
						}
						else
						{
							y = y - 1;
							x = y - 1; 
							n = z;
						}
					}
				
				}
				System.out.println("[FACTORIAL]: " + n);
				System.out.println("");
				System.out.println("[Coded by _______]");
				System.out.println("[07/17/2018]");
			}
				
		}
		
	}
	

}
