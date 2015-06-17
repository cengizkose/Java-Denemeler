package enumDeneme;

enum CoffeeSize{ SHORT, TALL, GRANDE, VENTI
	
};

class JavaCoffee{
	CoffeeSize size;
}
public class JavaCoffeeSize {
	public static void main(String [] args){
		JavaCoffee coffee = new JavaCoffee();
		coffee.size = CoffeeSize.VENTI;
		System.out.println(coffee.size);
	}

}
