package ornekler;

public class Yapicilar {
	
	void metod(){
		System.out.println("Parametre almayan metod �a�r�ld�");
		
	}
	
	void metod1(int sayi){
		System.out.println("parametre alan metod �a�r�ld�");
		
	}
	
	public Yapicilar(){ // parametre almayan yap�c� metod
		metod();
	}
	
	public Yapicilar(int sayi1){ //parametre alan yap�c� metod
		metod1(sayi1);
	}
	
	public static void main(String [] args){
		Yapicilar nesne1=new Yapicilar();
		Yapicilar nesne2=new Yapicilar(25);
		
		
	}

}
