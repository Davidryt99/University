public class convertirhorminseg {
 
	public static void main(String[] args) {
		final int CONST = 60;
		int horas;
		int minutos;
		int segundos;
		horas = 3;
		minutos = 118;
		segundos = 195;
		System.out.println("Tiempo antes del ajuste: "+horas +"h	"+minutos +"m	"+segundos+"s");
		if (segundos > CONST) {
			int nuevosmin = segundos/CONST;
			segundos = segundos%CONST;
			minutos += nuevosmin;
		}if (minutos >CONST) {
			int nuevashor = minutos/CONST;
			minutos = minutos%CONST;
			horas += nuevashor;	
		}
		
		System.out.println(horas +"h	"+minutos +"m	"+segundos+"s");
	}
 
}

/*
INICIO

...
ESCRIBIR "INTRODUCE UN TIEMPO:”;
...
READ horas;
READ minutos;
READ segundos;
INICIALIZAR CONSTANTE = 60;

...
   SI segundos >= CONSTANTE;
      INICIALIZAR nuevosmin = segundos/CONSTANTE;
      minutos = minutos+nuevosmin;
      segundos = segundos%60;
   SI minutos >= CONSTANTE;
      INICIALIZAR nuevoshor = minutos/CONSTANTE;
      horas = horas+nuevoshor;
      minutos = minutos%60;

ESCRIBIR "HORA TRANSFORMADA: "+horas+”h”+minutos”m”+segundos”s”;
...
FIN
*/