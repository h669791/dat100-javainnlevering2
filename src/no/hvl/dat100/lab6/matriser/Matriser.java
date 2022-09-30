package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		

		for (int[] i : matrise) {
			for (int j : i) {

				System.out.println(j);

			}
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		
		String tekst = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++)

				tekst += matrise[i][j] + " ";
			tekst += "\n";
		}

		return tekst;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		

		int[][] skaler = new int[matrise.length][matrise[1].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				skaler[j][i] = matrise[j][i] * tall;

			}
		}
		return skaler;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		

		if (a.length != b.length) {
			return false;

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		

		int[][] speile = new int[matrise.length - 1][matrise[1].length];

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {

				int speilet = matrise[i][j];
				matrise[i][j] = matrise[j][i];
				matrise[j][i] = speilet;

			}
		}
		return speile;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		
		if(a.length == 0) return new int[0][0];
		   if(a[0].length != b.length) return null;

		   int n = a[0].length;
		   int m = a.length;
		   int p = b[0].length;
		   int resultat[][] = new int[m][p];

		   for(int i = 0; i < m; i++){
		      for(int j = 0; j < p; j++){
		         for(int k = 0; k < n; k++){
		            resultat[i][j] += a[i][k] * b[k][j];
		         }
		      }
		   }
		   return resultat;
	}
}
		
