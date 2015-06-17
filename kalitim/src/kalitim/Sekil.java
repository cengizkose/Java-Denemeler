package kalitim;

class cember extends Sekil{
	int yaricap;
	public cember(String adi,String rengi,int yaricap){
		super(adi,rengi);
		this.yaricap=yaricap;
	}
	void alan(){
		System.out.println("Çemberin Alaný: "+(int)Math.PI*yaricap*yaricap);
	}
	void cevre(){
		System.out.println("Çemberin Alaný: "+(int)Math.PI*yaricap*2);
	}
	
}

public class Sekil {
	String isim;
	String renk;
	public Sekil(String isim, String renk){
		this.isim=isim;
		this.renk=renk;
		yazdir();
		
	}
	void yazdir(){
		System.out.println("Cisimin adý: "+isim+" Cisimin rengi: "+renk	);
	}
	void alan(){
		}
	void cevre(){
		}
	

	public static void main(String[] args) {
		cember c=new cember("Cember","Sarý",5);
		c.alan();
		c.cevre();

		
	}

}
