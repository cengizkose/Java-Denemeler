package ornekler;

public class Yapicilar {
	
	void metod(){
		System.out.println("Parametre almayan metod çaðrýldý");
		
	}
	
	void metod1(int sayi){
		System.out.println("parametre alan metod çaðrýldý");
		
	}
	
	public Yapicilar(){ // parametre almayan yapýcý metod
		metod();
	}
	
	public Yapicilar(int sayi1){ //parametre alan yapýcý metod
		metod1(sayi1);
	}
	
	public static void main(String [] args){
		Yapicilar nesne1=new Yapicilar();
		Yapicilar nesne2=new Yapicilar(25);
		
		
	}

}
