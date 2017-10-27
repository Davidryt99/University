import java.util.Scanner;
public class Pruebas {
	public void setCharAt(int index, char ch) {
		
		
	}
 
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al Analizador de Palabras\n\nIntroduzca su palabra: ");
		String palabra;
		palabra = input.next();
		System.out.println("Ha elegido: " + palabra);
		int largo = palabra.length();
		System.out.format("Su palabra tiene %d letras", largo);
		System.out.println("\nDeseo saber si contiene la letra/ conjunto de letras:");
		String letra_compare = input.next();
		String palabramay = palabra.toUpperCase();
		String letra_comparemay = letra_compare.toUpperCase();
		boolean contiene = palabramay.contains(letra_comparemay);
		if (contiene == true) {
			System.out.println("La palabra si contiene " + letra_compare);
			int posicion = palabramay.indexOf(letra_comparemay);
			int posicionreal = posicion +1;
			System.out.println("La letra esta en la posición " + posicionreal);
		} else {
			System.out.println("La palabra no contiene " + letra_compare);
		}
		System.out.println("Ahora voy a deletrear "+ palabra + "\n");
		Thread.sleep(1000);
		int counter = 0;
		while (counter < largo) {
			char Letter = palabra.charAt(counter);
			counter += 1;
			System.out.println(Letter + "\n");
			Thread.sleep(1000);
		}
		System.out.println("Ahora vamos a sustituir la letra:");
		System.out.println("Seleccione la letra a sustituir:");
		String lettersust = input.next();
		String lettersustmay = lettersust.toUpperCase();
		boolean contiene2 = palabramay.contains(lettersustmay);
		int position2 = palabramay.indexOf(lettersustmay);
		if (contiene2 == true) {
			System.out.println("La palabra si contiene " + lettersust);
			
		} else {
			System.out.println("La palabra no contiene " + lettersust);
		}
		System.out.println("Seleccione la letra que que que sustituya a la anterior:");
		String newletter = input.next();
		char character = newletter.charAt(0);
		StringBuffer palabrasust = new StringBuffer(palabra);
		palabrasust.setCharAt(position2, character);
		System.out.println("La palabra resultante es " + palabrasust);
	} 	 
}

