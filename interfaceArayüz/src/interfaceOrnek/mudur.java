package interfaceOrnek;

public class mudur implements calisan{
	double ucretSabiti;
	
	public double ucret(){
		return ucretSabiti*oran;
	}
	public void calisanBolum(){
		System.out.println("y�netici");
	}
	public void ucretBelirle(double ucretSabiti){
		this.ucretSabiti=ucretSabiti;
	}

}
