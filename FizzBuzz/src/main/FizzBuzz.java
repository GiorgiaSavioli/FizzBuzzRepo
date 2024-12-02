package main;

public class FizzBuzz {

	public static void main(String[] args) {
		int numero = 1;
		
		for (numero = 1; numero <= 50; numero++) {   //Inizializzazione e dichiarazione variabile; condizione numero minore uguale a 50 incrementare il contatore di 1 ogni volta.
			if (numero % 3 == 0 && numero % 5 == 0) { // se il numero è divisibile per 3 e SOLO SE se è divisibile anche per 5
				System.out.println("FizzBuzz");   //stampa Fizz Buzz
			}else if (numero % 3 == 0) {   // se il numero è divisibile per 3
				System.out.println("Fizz");  //stampa Fizz
			}else if (numero % 5 == 0) {  // se il numero è divisibile per 5
				System.out.println("Ciao, sono un numero divisibile per 5");  //stampa Ciao, sono un numero divisibile per 5
			}else {
				System.out.println(numero);  //Altrimenti stampa il numero (in cifra)
			}
		}	  

	}
}
