package javaExamples;

public class Array {

	public static void main(String[] args) {

     int[] twoMultipls = new int[20];
     
     
     for(int i=0,j=1;i<twoMultipls.length;)
     {
    	 if(j%2==0)
    	 {
    		 twoMultipls[i]= j;
    		 i++;
    		 j++;
    	 }
    	 else
    	 {
    		 j++;
    	 }
     }
     
     for(int i=0; i<twoMultipls.length; i++){
     System.out.println(twoMultipls[i]);
     }
     
     
     int[][] twoDime = new int[4][4];
     
     for(int i=0,j=0; i<4 && j<4 ; i++,j++)
     {
    	 if(i<4)
    	 {
    		 twoDime[i][j]= j;
    	 }
    	 else
    	 {
    		 twoDime[i][j]=0;
    	 }
    		 
    	 }
     
     for(int k=0,l=0; k<twoDime.length;k++,l++)
     {
    	 System.out.println(twoDime[k][l]);
     }
    	 
     
	}}
     

	


