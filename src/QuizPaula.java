import java.util.Scanner;

public class QuizPaula {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("HOLIWIS, BIENVENIDOS A EL QUIZ SOBRE PAULA\n ¿Estás listo para empezar?\n");
		System.out.println("1) SIIIII\n2);-;\n");
		String respuesta = input.next();
		String respuestaok = "1";
		if(respuesta.equals(respuestaok)) {
			System.out.println("Vamos allá\nPrimera pregunta: ¿Cual fue mi primer color de pelo(teñido, no con el que nasi, gracias jaja)?\n");
			System.out.println("a) Rojo\nb) Azul");
			Scanner input2 = new Scanner(System.in);
			String respuesta2 = input2.next();
			String respuestafinal2 = respuesta2.toUpperCase();
			if(respuestafinal2.equals("A")) {
				System.out.println("Felicidades, has ganado un Iphone X, pincha en este link YA: www.putocampesinonoganarasnadaentuvida-noteflipes.org");
			}else {
				System.out.println("Te has ganado un spoiler:\nCHANCHANCHANCHAN\nDarth Vader es el padre de Luke\nCHANCHANCHAAAAAN\nAh, lo olvidaba... Has perdido");
			}
		}else {
			System.out.println("Que te jodan campesino");
		}
	}
 
}