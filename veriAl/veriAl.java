package veriAl;
import java.util.Scanner;

public class veriAl {
	public static void main(String []args){
		Scanner v_al = new Scanner(System.in);
		int [] sayi = new int [3];
		for(int i=0;i<3;i++){
			sayi[i]=Integer.valueOf(v_al.next());
		}
		for(int j=0;j<3;j++){
			System.out.println(sayi[j]);
		}
	}

}
