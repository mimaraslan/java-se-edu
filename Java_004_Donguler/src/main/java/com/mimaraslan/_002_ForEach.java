package com.mimaraslan;

public class _002_ForEach {

    public static void main(String[] args) {

    	
    		
	        String ogrenci1 = "Mert";
	        String ogrenci2 = "Ali";
	        String ogrenci3 = "Ebru";
	        String ogrenci4 = "Elçin";
	
	                              // 0       1       2       3
	        String[] ogrenciler = {"Mert", "Ali", "Ebru", "Elçin"};
	
	        for ( String ogrenci  :  ogrenciler ) {
	            System.out.println(ogrenci);
	        }
	
	        System.out.println("------------------------");
	
	
	        int[] numaralar = {15, 250, 120, 85};
	
	        for ( int numara  :  numaralar ) {
	            System.out.println(numara + numara*20/100);
	        }
	
	
	       
	    // "Fatih" "Sultan Mehmet" 1453
	    for (String arg  :  args ) {
            System.out.println(arg);
        }

    }




}
