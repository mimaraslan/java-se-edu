package com.mimaraslan;

public class _003_While_DoWhile {
	
	public static void main(String[] args) {
		
		
		System.out.println("-----------FOR-------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
	
		System.out.println("-----------WHILE-------------");
		int i = 0;
		while (i < 3) {
			System.out.println(i);
			i++;
		}
		
		
        System.out.println("-----------DO WHILE-------------");
		int a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a < 3);
		
		
		/*
     System.out.println("-----------WHILE SONSUZ DONGU-------------");
		
		int j = 0;
		while (true) {
			System.out.println(j);
			j++;
		}
		
		
		for ( ; ; ) {
		  System.out.println("Sonsuz döngü");
		}
		*/
		
		
		
		
	}

}
