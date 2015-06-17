package interfaceOrnek;

public class arayuzOrnek {

	public static void main(String[] args) {
		isci ic=new isci();
		ic.calisanBolum();
		ic.ucretBelirle(2000.0);
		System.out.println("iþçi maaþý : "+ic.ucret());
		mudur mc=new mudur();
		mc.calisanBolum();
		mc.ucretBelirle(3500.0);
		System.out.println("Yönetici maaþý : "+mc.ucret());
		satisElemani sec=new satisElemani();
		sec.calisanBolum();
		sec.satisKomisyonunuBelirle(250);
		sec.ucretBelirle(1800.0);
		System.out.println("Satýþ Elemaný maaþý : "+sec.ucret());


	}

}
