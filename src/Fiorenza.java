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
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1 - Titolo es. moltiplicazione array");
	}
	static double[] Array1 = new double[6];
	static double[] Array2 = new double[Array1.length / 2];
	static void MoltiplicazioneArray()
	{
		RiempiArray(Array1);
		System.out.println("Ecco l'array da moltiplicare:");
		StampaArray(Array1);
		for(int i = 1,j = 0;j < Array2.length;i+=2,j++)
		{
			int numeroInt = (int)((Array1[i-1] * Array1[i])*100);
			Array2[j] = ((double)numeroInt/100);
			numeroInt = 0;
		}
		System.out.println("Ecco l'array moltiplicato:");
		StampaArray(Array2);
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
	static void StampaArray(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("|"+array[i]);
		}
		System.out.print("|\n");
	}
}
