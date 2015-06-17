package ornekler;

public class islem {
	int carp(int x, int y){ //islem sýnýfýnýn carp metodu
		return x*y;
	}
	int topla(int x, int y){
		return x+y;
	}
	public static void main(String [] args){
		islem islem1=new islem();
		islem islem2=new islem();
		System.out.println(islem1.carp(3, 5));
		System.out.println(islem2.topla(3, 5));
	}

}
