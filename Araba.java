package ornekler;

public class Araba {
	String marka;
	String renk;
	boolean durum=false;
	int model;
	int vt=0;
	int vitesarttir(){
		if (vt<5)
			vt++;
		else{
			System.out.println("son vitesdesiniz");
			return vt;
		}
		return vt;
	}
	int vitesdus(){
		if (vt>0)
			vt--;
		else
			System.out.println("1. vitese arttır");
		return vt;
	}
	boolean calistir(){
		return durum=true;
	}
	boolean dur(){
		return durum=false;
	}
	public static void main(String [] args){
		Araba n1=new Araba();	
		n1.marka="opel";
		System.out.println(n1.marka);
		n1.model=2000;
		System.out.println(n1.model);
		n1.renk="mavi";
		System.out.println(n1.renk);
		n1.calistir();
		System.out.println(n1.durum);
		n1.vitesarttir();
		System.out.println(n1.vt);
		n1.vitesarttir();
		System.out.println(n1.vt);
		n1.vitesarttir();
		System.out.println(n1.vt);
		n1.vitesarttir();
		System.out.println(n1.vt);
		n1.vitesarttir();
		System.out.println(n1.vt);
		n1.vitesarttir();
		n1.vitesdus();
		System.out.println(n1.vt);
		n1.dur();
		System.out.println(n1.durum);
	}
}
