package kalitim;

class Hayvan {
	void nefesAl(){
		System.out.println("Hayfan Nefes alıyor");
		
	}
	int yas;
	int kilo;
}
class At extends Hayvan {
	
}

public class kalitimOrnek {

	public static void main(String[] args) {
		
		At nesne = new At();
		nesne.nefesAl();
		nesne.kilo=150;
		nesne.yas=5;
		System.out.println("yas "+nesne.yas+"   kilo "+nesne.kilo);
		
	}

}
