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
	static double[] Array1es1 = new double[6];//dichiarazione array con numeri da moltiplicare
	static double[] Array2es1 = new double[Array1es1.length / 2];//dichiarazione array moltiplicato
	static void MoltiplicazioneArray()
	{
		RiempiArray(Array1es1);
		System.out.println("Ecco l'array da moltiplicare:");
		StampaArrayD(Array1es1);
		for(int i = 1,j = 0;j < Array2es1.length;i+=2,j++)//i si occupa di saltare di 2 a 2 le posizioni, e j di segnarsi la posizione in cui mettere il numero moltiplicato
		{
			int numeroInt = (int)((Array1es1[i-1] * Array1es1[i])*100);//moltiplica la posizione prima di i con i e moltiplica per cento
			Array2es1[j] = ((double)numeroInt/100);//inserisce il numero moltiplicato dividendo per 100
			numeroInt = 0;//resetta la variabile del numero moltiplicato
		}
		System.out.println("Ecco l'array moltiplicato:");
		StampaArrayD(Array2es1);
	}
	static String[] Array1es2 = new String[5];//dichiara array di stringhe
	static String[] Array2es2 = new String[5];//dichiara array di stringhe
	static void DueSequenze()
	{
		boolean doppio = false;//variabile boolean per sapere se ce almeno un numero in comune tra i due array
		System.out.println("Primo array:");
		InserisciParole(Array1es2);
		System.out.println("Secondo array:");
		InserisciParole(Array2es2);
		for(int i = 0; i < Array1es2.length;i++)//for da 0 alla lunghezza dell'array
		{
			for(int j = 0; j < Array1es2.length;j++)//for da 0 alla lunghezza dell'array
			{
				if(Array1es2[i].equals(Array2es2[j]))//se la posione i nel primo array è uguale alla j del secondo
				{
					if(doppio == false)//se questo if è stato gia percorso una volta doppio non è uguale a false e quindi non rientra nell'if
					{
						System.out.println("OK");
						doppio = true;//doppio diventa true
					}
					System.out.println("|"+Array2es2[j]+"|"+(i+1)+"|"+(j+1)+"|");//stampa la stringa in comune tra i due array e le posizioni delle stringhe in comune
				}
			}
		}
		if(doppio == false)//se doppio non è mai passato per l'if di prima e quindi non ci sono stringhe in comune entra nell'if e stampa NO
		{
			System.out.println("NO");
		}
		
	}
	static double[] RiempiArray(double[] array)//genera un numero intero con 1 numero dopo la virgola e li mette nell'array
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
	static void InserisciParole(String[] array)//chiede parole da mettere nell'array inserito
	{
		System.out.println("Inserisci delle parole:");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = in.nextLine();
		}
	}
	static void StampaArrayD(double[] array)//stampa un array di double
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("|"+array[i]);
		}
		System.out.print("|\n");
	}
	static void StampaArrayS(String[] array)//stampa un array di stringhe
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("|"+array[i]);
		}
		System.out.print("|\n");
	}
}
