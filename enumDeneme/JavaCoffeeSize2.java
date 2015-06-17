package enumDeneme;

class JavaCof {

	protected enum CoffeeSize {
		SHORT, TALL, GRANDE, VENTI
	};

	CoffeeSize size;

}
public class JavaCoffeeSize2 {
	public static void main(String[] args) {
		JavaCof coffee = new JavaCof();
		coffee.size = JavaCof.CoffeeSize.GRANDE;
		System.out.println(coffee.size);
	}

}
