package interfaceOrnek;

public class isci implements calisan{
	double ucretSabiti;
	@Override
	public void ucretBelirle(double ucretSabiti) {
		this.ucretSabiti=ucretSabiti;		
	}
	@Override
	public double ucret() {	
		return ucretSabiti*oran;
	}
	@Override
	public void calisanBolum() {
		System.out.println("Ücretli Çalýþan");		
	}
}
