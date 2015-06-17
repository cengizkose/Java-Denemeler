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
class dikdortgen extends Sekil{
	int kkenar,ukenar;
	public dikdortgen(String x, String y, int kkenar, int ukenar){
		super(x,y);
		this.kkenar=kkenar;
		this.ukenar=ukenar;
	}
	void alan(){
		System.out.println("Alan: "+kkenar*ukenar);
	}
	void cevre(){
		System.out.println("Cevre: "+2*(kkenar+ukenar));
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
		System.out.println("Cisimin adı: "+isim+" Cisimin rengi: "+renk	);
	}
	void alan(){
		}
	void cevre(){
		}
	

	public static void main(String[] args) {
		cember c=new cember("Cember","Sari",5);
		c.alan();
		c.cevre();
		dikdortgen d=new dikdortgen("Dikdortgen","yeşil",4,5);
		d.alan();
		d.cevre();
	}

}
