package kalitim;

class Animal{
	public void eat(){
		System.out.println("Yemek yiyor");
	}
}

public class Bird extends Animal {
	public void fly(){
		System.out.println("Kuþ Uçuyor");
	}
	
	public static void main(String []args){
		Bird b = new Bird();
		b.fly();
		b.eat();
	}

}
