import java.io.IOException;
import java.util.Scanner;

public class Rownoleglobok 
{
	
	
	public static void main(String[] args) throws IOException
	
	{
		Rownoleglobok r = new Rownoleglobok();
		
		int Wysokosc = 0;
		int Szerokosc;
		int Kick;
		
		Scanner odczyt = new Scanner(System.in);
		
		 Wysokosc = odczyt.nextInt();
		 Szerokosc = odczyt.nextInt();
		 Kick = odczyt.nextInt();
		
	
		stars(Wysokosc,Szerokosc,Kick);
	
	
	}

	public static int stars(int wysokosc, int szerokosc, int kick) throws IOException
	{
		
		if(wysokosc < 0 || wysokosc > 100 || szerokosc < 0 || szerokosc > 100 || kick > 100 || kick <0)
		{
			System.exit(1);
		}

		if(kick > 0)
		{
			for(int i = 0; i < wysokosc; i++) 
			{
					for(int j = 0; j < szerokosc; j++)
					{
						System.out.print("*");
					}
					
						//Thread.sleep(100);
						System.out.println();
				
					for(int k =0; k <= i; k++)
					{
							for(int n = 1; n <= kick; n++)
							{
							System.out.print(" ");
							}
					} 
			}
			System.in.read();
		}
			
		
		else if(kick < 0) 
		
		{
			kick = -kick;
			int odstep = wysokosc*kick-kick;
				
		
				for(int i = 0; i < wysokosc; i++) 
				{
				
					for(int k = 0; odstep > k; k++)
					{
					System.out.print(" ");
					}	
					
					for(int j =0; j < szerokosc; j++)
					{
					
					}

					for(int n = 0; n < szerokosc; n++)
					{
						
						System.out.print("*");
					}
					
						System.out.println();
						odstep = odstep - kick;	
				} 
		
		System.in.read();
		
		}
		
		return 0;
	}	
	
}

