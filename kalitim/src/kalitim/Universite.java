package kalitim;


class Fakulte extends Universite{
	String fAd;

	public Fakulte(String uniAd, String uniSehir, String fAd) {
		super(uniAd, uniSehir);
		this.fAd=fAd;
		yazdir2();
		
	}
	void yazdir2(){
		System.out.println("Fakulte: "+fAd);
	}
}

class Bolum extends Fakulte{
	String bolumAd;
	public Bolum(String uniAd, String uniSehir, String fAd, String bolumAd) {
		super(uniAd, uniSehir, fAd);
		this.bolumAd=bolumAd;
		yazdir3();
		
	}
	void yazdir3(){
		System.out.println("Bolum: "+bolumAd);
	}	
}

public class Universite {
	String uniAd;
	String uniSehir;
	public Universite(String uniAd,String uniSehir){
		this.uniAd=uniAd;
		this.uniSehir=uniSehir;	
		yazdir();
	}
	void yazdir(){
		System.out.println("Universite Adý: "+uniAd+" Universite Sehri: "+uniSehir);
	}
	public static void main(String []args){
		
		Bolum uniB=new Bolum("19 Mayýs","Samsun","Mühendislik","Bilgisayar");
		
		
	}

}
