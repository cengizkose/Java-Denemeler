package ornekler;

public class GetterSetter {
	private int deger;
	private String ad;
	
	public int getDeger(){
		return deger;
	}
	public void setDeger(int deger){
		this.deger=deger;
	}
	public String getAd(){
		return ad;
	}
	public void setAd(String ad){
		this.ad=ad;
	}
	public static void main(String [] args){
		GetterSetter n1=new GetterSetter();
		n1.setAd("Cengiz");
		n1.setDeger(24);
		System.out.println(n1.getAd());
		System.out.println(n1.getDeger());
	}
}
