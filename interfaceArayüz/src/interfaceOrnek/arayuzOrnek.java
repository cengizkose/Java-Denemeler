package interfaceOrnek;

public class arayuzOrnek {

	public static void main(String[] args) {
		isci ic=new isci();
		ic.calisanBolum();
		ic.ucretBelirle(2000.0);
		System.out.println("i��i maa�� : "+ic.ucret());
		mudur mc=new mudur();
		mc.calisanBolum();
		mc.ucretBelirle(3500.0);
		System.out.println("Y�netici maa�� : "+mc.ucret());
		satisElemani sec=new satisElemani();
		sec.calisanBolum();
		sec.satisKomisyonunuBelirle(250);
		sec.ucretBelirle(1800.0);
		System.out.println("Sat�� Eleman� maa�� : "+sec.ucret());


	}

}
