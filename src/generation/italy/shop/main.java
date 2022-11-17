package generation.italy.shop;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci nome prodotto: ");
		String name = sc.nextLine();
		
		System.out.print("Inserisci descrizione prodotto: ");
		String description = sc.nextLine();
		
		System.out.print("Inserisci prezzo prodotto: ");
		float price = sc.nextFloat();
		
		product prod = new product(name, description, price);
		System.out.println(prod);
		
	}
}
