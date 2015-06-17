package veriAl;
import javax.swing.JOptionPane;

public class veriAl2 {
	public static void main (String [] args){
		String sayi = JOptionPane.showInputDialog("Bir sayi giriniz");
		int yenisayi = Integer.parseInt(sayi);
		String mesaj = "Girdiðiniz sayi:"+yenisayi+"  ";
		JOptionPane.showMessageDialog(null, mesaj);
	}

}
