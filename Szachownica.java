
import java.util.Scanner;

public class Szachownica {
	
	private static int LiczbaGwiazdek = 0;

	public static void main(String[] args) {
		
		
		int SzerokoscKafelka;
		int WysokoscKafelka;
		int LiczbaKafelkowPoziom;
		int LiczbaKafelkowPion;
		char ZnakBialy;
		char ZnakCzarny;
		
		Scanner odczyt = new Scanner(System.in);
		
		SzerokoscKafelka = odczyt.nextInt();
		WysokoscKafelka = odczyt.nextInt();
		LiczbaKafelkowPoziom = odczyt.nextInt();
		LiczbaKafelkowPion = odczyt.nextInt();
		ZnakBialy = odczyt.next().charAt(0);
		ZnakCzarny = odczyt.next().charAt(0);
		
		
		
	
		
		szachy(SzerokoscKafelka,WysokoscKafelka,LiczbaKafelkowPoziom,LiczbaKafelkowPion,ZnakBialy,ZnakCzarny);

	}
	

	public static int szachy(int SzerokoscKafelka, int WysokoscKafelka,
			int LiczbaKafelkowPoziom, int LiczbaKafelkowPion, char ZnakBialy, char ZnakCzarny) 
	{
		
		if(SzerokoscKafelka < 1 || SzerokoscKafelka > 15 || WysokoscKafelka < 1 || WysokoscKafelka > 15 
				|| LiczbaKafelkowPoziom > 15 || LiczbaKafelkowPoziom < 1 || LiczbaKafelkowPion > 15 || LiczbaKafelkowPion < 0)
		{
			System.exit(1);
		}
		
		LiczbaGwiazdek = SzerokoscKafelka; // My way of help
		
		
		for(int n = 0; LiczbaKafelkowPion>n; n++)
		{
			if(n%2 == 0)	
			{
				for(int i = 0; i<WysokoscKafelka; i++)
				{
					for(int j = 0; j<LiczbaKafelkowPoziom; j++)
					{
							if(j%2 == 0) 
							{
							for(int k = 0; k < LiczbaGwiazdek; k++)
							{
								System.out.print(ZnakBialy);
							}
							}
							else 
							{
							for(int m = 0; m < LiczbaGwiazdek; m++)
							{
								System.out.print(ZnakCzarny);
							}
							}
					}
					
				System.out.println();
				}
			
			}

			else {
				for(int i = 0; i<WysokoscKafelka; i++)
				{
					for(int j = 0; j<LiczbaKafelkowPoziom; j++)
					{
							if(j%2==0)
							{
							for(int k = 0; k < LiczbaGwiazdek; k++)
							{
								System.out.print(ZnakCzarny);
							}
							}
							else 
							{
							for(int m = 0; m < LiczbaGwiazdek; m++)
							{
								System.out.print(ZnakBialy);
							}
							}
					}
				System.out.println();
				}
			}
		
		}
		return 0;
	}
}
