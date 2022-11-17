package generation.italy.shop;

import java.util.Random;

public class product {
	 int code;
	 float price;
	 String description;
	 String name;
	 float iva;
	 
     public product( String name, String description, float price) {
    	 this.price = price;
    	 this.description = description;
    	 this.name= name;
    	 
    	 Random rnd = new Random();
    	 code = rnd.nextInt(10000, 100000);
    	 
    	 iva = 20;
    	 
	}
     public float price() {
    	 return price;
     }
     
     public float priceIva() {
    	 return price + (price * iva)/(float)100;
     }
     
     public String toString() {
    	 
 		return  "---------------------------------------" +
 				"\nNome prodotto: " + name + "\nDescrizione prodotto: " + description + 
 				"\nCodice prodotto: " + code + "\nPrezzo prodotto = " + price() + 
 				"\nPrezzo incrementato dall'iva = " + priceIva();

 	}
    	 
     
}
