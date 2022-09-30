package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		

		for (int i : tabell) {

			System.out.print(i);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {



		String r = "[";
		for (int i = 0; i < tabell.length - 1; i++) {
			r += tabell[i] + ",";
		}
		if (tabell.length > 0) {
			r += tabell[tabell.length-1];
		}
		r += "]";
		
		System.out.println(r);
		return r;

	}

	// c)
	public static int summer(int[] tabell) {
	
		//utvidet for-løkke

		int sum = 0;

		for (int a : tabell) 
			sum += a;
		
		
		//while-løkke
		int b = tabell.length-1;
		while (b >= 0) {
		sum += tabell[b];
		b--;
		}
		
		// for-løkke
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

		
		
	

	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean fins = false;
		int i = 0;

		while (!fins && i < tabell.length) {
			if (tabell[i] == tall) {
				fins = true;
			}
		else
			i++;
		
		}
		return fins;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		
		if (tabell == null) {

			return -1;
		}
		int i = 0;

		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return i;

			} else {
				i = i + 1;
			}
		}

		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] rTab = new int[tabell.length];
		int j = tabell.length - 1;
		for (int i = 0; i < rTab.length; i++) {

			rTab[i] = tabell[j];
			j--;

		}

		return rTab;
	}

	/*
	 * 
	 * int [] nyeTall = new int[tabell.length]; for ( int tallNr = 0;
	 * tallNr<tabell.length; tallNr++) { int minPos = 0; for(int posNr = 1;
	 * posNr<tabell.length; posNr++) { if(tabell[posNr] < tabell[minPos]) minPos =
	 * posNr; } nyeTall[tallNr] = tabell[minPos];
	 * 
	 * tabell[minPos] = Integer.MAX_VALUE; } tabell = nyeTall;
	 */

	// g)
	public static boolean erSortert(int[] tabell) {

		
		int i = 1;
		boolean sortert = true;

		while (sortert && i < tabell.length) {
			if (tabell[i - 1] > tabell[i]) {
				sortert = false;
			}
			i++;

		}

		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length + j] = tabell2[j];
		}
		return nyTab;
	}
}
