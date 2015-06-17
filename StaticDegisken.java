package ornekler;

public class StaticDegisken {

	int sayi=5;
	static int sayi2=10;
	
	public static void main(String [] args){
		System.out.println(dondur());
		System.out.println(dondur2());
	}
	static int dondur(){
		
		return sayi; //static tanýmlanmyan sayi degiskeni dondurulemez
	}
	
	 static int dondur2(){
		return sayi2; // satatic olan sayi2 degiskeni dondurulur.
	}
} //bu program hata verecektir. dondur metodun daki static olmayan degeri 
 // dondurmeye çalýþtýðý için.
