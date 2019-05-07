package matrix;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		
	 int n = 3;
	 int m = 4;
	 
	 Scanner sc = new Scanner(System.in);
		
     int matriz[][] = new int[n][m]; 
     
     for (int i = 0; i< n; i++)
     {
    	 for(int j = 0; j<m; j++)
    	 {
    		 
    		 matriz[i][j] = sc.nextInt();
    	 }
     }
     
     
     for (int i = 0; i< n; i++)
     {
    	 for(int j = 0; j<m; j++)
    	 {
    		 
    		 System.out.println( matriz[i][j]);
    	 }
     }
   
		
     
     sc.close();
	}

}
