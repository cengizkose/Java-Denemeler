package interfaceOrnek;

public class satisElemani implements calisan{
	double ucretSabiti;
	double komisyon;
	final double komisyonOrani=0.3;
	
	public void satisKomisyonunuBelirle(int adet){
		komisyon=komisyonOrani*adet;
	}
	public void ucretBelirle(double ucretSabiti){
		this.ucretSabiti=ucretSabiti;
	}
	public void calisanBolum(){
		System.out.println("satýþ Elemaný");
	}
	public double ucret(){
		return ((ucretSabiti*oran)+komisyon);
	}
}
