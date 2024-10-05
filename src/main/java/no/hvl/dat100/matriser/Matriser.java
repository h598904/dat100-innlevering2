package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) { 
	        for (int tall : rad) { 
	            System.out.print(tall + " "); 
	        }
	        System.out.println(); 
	    }
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String resultat = ""; 
	    
	    for (int[] rad : matrise) { 
	        for (int tall : rad) { 
	            resultat += tall + " ";
	        }
	        resultat += "\n"; 
	    }
	    
	    return resultat; 
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		    int[][] nyMatrise = new int[matrise.length][matrise[0].length]; 
		    
		    for (int i = 0; i < matrise.length; i++) { 
		        for (int j = 0; j < matrise[i].length; j++) { 
		            nyMatrise[i][j] = matrise[i][j] * tall; 
		        }
		    }
		    
		    return nyMatrise;
		}	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length) {
	        return false;
	    }
	    
	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            if (a[i][j] != b[i][j]) {
	                return false;
	            }
	        }
	    }
	    
	    return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int n = matrise.length;
	    int[][] nyMatrise = new int[n][n];

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            nyMatrise[j][i] = matrise[i][j];
	        }
	    }
	    
	    return nyMatrise;
	    }

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		if (a[0].length != b.length) {
	        throw new IllegalArgumentException("Antall kolonner i første matrise må være lik antall rader i andre matrise.");
	    }

	    int[][] resultat = new int[a.length][b[0].length];

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < b[0].length; j++) {
	            for (int k = 0; k < a[0].length; k++) {
	                resultat[i][j] += a[i][k] * b[k][j];
	            }
	        }
	    }
	    
	    return resultat;
	
	}
}
