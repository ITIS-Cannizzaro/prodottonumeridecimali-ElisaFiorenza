import java.util.Scanner;

public class Fiorenza
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					MoltiplicazioneArray();
					break;
				case 2:
					DueSequenze();
					break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1 - Titolo es. moltiplicazione array");
		System.out.println("2 - Es n. 2 - Titolo es. Due Sequenze");
	}
	static double[] Array1es1 = new double[6];
	static double[] Array2es1 = new double[Array1es1.length / 2];
	static void MoltiplicazioneArray()
	{
		RiempiArray(Array1es1);
		System.out.println("Ecco l'array da moltiplicare:");
		StampaArrayD(Array1es1);
		for(int i = 1,j = 0;j < Array2es1.length;i+=2,j++)
		{
			int numeroInt = (int)((Array1es1[i-1] * Array1es1[i])*100);
			Array2es1[j] = ((double)numeroInt/100);
			numeroInt = 0;
		}
		System.out.println("Ecco l'array moltiplicato:");
		StampaArrayD(Array2es1);
	}
	static String[] Array1es2 = new String[5];
	static String[] Array2es2 = new String[5];
	static void DueSequenze()
	{
		boolean doppio = false;
		System.out.println("Primo array:");
		InserisciParole(Array1es2);
		System.out.println("Secondo array:");
		InserisciParole(Array2es2);
		for(int i = 0; i < Array1es2.length;i++)
		{
			for(int j = 0; j < Array1es2.length;j++)
			{
				if(Array1es2[i].equals(Array2es2[j]))
				{
					if(doppio == false)
					{
						System.out.println("OK");
						doppio = true;
					}
					System.out.println("|"+Array2es2[j]+"|"+(i+1)+"|"+(j+1)+"|");
				}
			}
		}
		if(doppio == false)
		{
			System.out.println("NO");
		}
		
	}
	static double[] RiempiArray(double[] array)
	{
		int numeroInt = 0;
		for(int i = 0; i < array.length; i++)
		{
			numeroInt = (int)(Math.random()*100);
			array[i] = ((double)numeroInt/10);
			numeroInt = 0;
		}
		return array;
	}
	static void InserisciParole(String[] array)
	{
		System.out.println("Inserisci delle parole:");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = in.nextLine();
		}
	}
	static void StampaArrayD(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("|"+array[i]);
		}
		System.out.print("|\n");
	}
	static void StampaArrayS(String[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("|"+array[i]);
		}
		System.out.print("|\n");
	}
}
