import java.util.Scanner;
public class patata {
 
	public static void main(String[] args) {
		String x = "12345-56789";
		String[] partes= x.split("-");
		String parte1 = partes[0];
		String parte2 = partes[1];
		System.out.println( x );
		System.out.println(parte1);
		System.out.println(parte2);
		int a;
		a = 5;
		a += 5;
		a = ++a;
		System.out.println( a );
		
		
	}
 
}