package com.Cevap;

public class Runner {

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5 say�s� asal m�d�r?
		// % mod 
		int durum =0;
		int sayi=5;
		
		for (int j = 3; j <= 1000; j++) {
		sayi=j;
		for (int i = 2; i < sayi; i++) {
			
			if(sayi%i==0)durum=1;
		}
		
		if(durum==0)System.out.println(sayi+" Say�s� Asal Say�d�r.");
		else
			durum=0;
			
		}
		
		
		
		
		
	}

}
