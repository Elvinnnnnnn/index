package vucut;

import java.util.Scanner;

public class Vucut {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Boyunuzu Giriniz : ");
		
		double boy = scanner.nextDouble();
		
		System.out.print("Kilonuzu Giriniz : ");
		
		double kilo = scanner.nextDouble();
		
		double index = kilo/(boy*boy);
		
		System.out.print("Vucut Kitle İndexiniz : " + index);
		
		
		
		
		
		
		
		
		
		

	}

}
