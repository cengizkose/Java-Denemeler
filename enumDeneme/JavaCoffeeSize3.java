package enumDeneme;

enum CoffeeSize2 {
	SHORT(2), TALL(3), GRANDE(4), VENTI(5);

	CoffeeSize2(int $){
		this.$ = $;
	}

	int $;
	public int get$() {
		return $;
	}
};
public class JavaCoffeeSize3 {
	CoffeeSize2 size;
	public static void main(String []args){
	
		JavaCoffeeSize3 cof = new JavaCoffeeSize3();
		cof.size=CoffeeSize2.GRANDE;
		System.out.println(cof.size);
		System.out.println(cof.size.get$());
		
	}
	

}
