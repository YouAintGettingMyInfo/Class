package intervalos;

public class Main {

	public static void main(String[] args) {
		
		/*************************************/
		System.out.println("\n===== Exercise a =====");
		Intervalo a1 = new Intervalo(2.0, 5.0); // Válido
		Intervalo a2 = new Intervalo(5.0, 2.0); // No válido

		System.out.println(a1.valido());
		System.out.println(a2.valido());

		/*************************************/
		System.out.println("\n===== Exercise b =====");

		System.out.println(a1.longitud());

		/*************************************/
		System.out.println("\n===== Exercise c =====");

		System.out.println(a1.puntoMedio());

		/*************************************/
		System.out.println("\n===== Exercise d =====");

		System.out.println("before: " + a1.toString());
		a1.desplazar(3);
		System.out.println("after: " + a1.toString());

		/*************************************/
		System.out.println("\n===== Exercise e =====");

		Intervalo e = a1.copia(a1);

		System.out.println("Copy: " + e.toString());

		/*************************************/
		System.out.println("\n===== Exercise f =====");

		System.out.println("(" + a1.toString() + " == " + e.toString() + ") " + a1.iguales(e));
		System.out.println("(" + a1.toString() + " == " + a2.toString() + ") " + a1.iguales(a2));

		/*************************************/
		System.out.println("\n===== Exercise g =====");

		System.out.println("(" + a1.toString() + " includes 3.0) " + a1.incluye(3.0));
		System.out.println("(" + a1.toString() + " includes 6.0) " + a1.incluye(6.0));

		/*************************************/
		System.out.println("\n===== Exercise h =====");

		Intervalo h1 = new Intervalo(2.0, 7.0);
		Intervalo h2 = new Intervalo(3.0, 6.0);

		System.out.println("(" + h1.toString() + " includes " + h2.toString() + ") " + h1.incluye(h2));

		/*************************************/
		System.out.println("\n===== Exercise i =====");

		Intervalo i1 = new Intervalo(2.0, 6.0);
		Intervalo[] trozosI1 = i1.troceado(3);

		for (Intervalo trozo : trozosI1) {
		    System.out.println(trozo.toString());
		}

		/*************************************/
		System.out.println("\n===== Exercise j =====");

		Intervalo j1 = new Intervalo(2.0, 6.0);
		j1.escala(2);

		System.out.println("Scaled: " + j1.toString());

		/*************************************/
		System.out.println("\n===== Exercise k =====");

		Intervalo k1 = new Intervalo(2.0, 6.0);
		Intervalo k2 = k1.desplazado(3);

		System.out.println("Original: " + k1.toString());
		System.out.println("Shifted: " + k2.toString());

		/*************************************/
		System.out.println("\n===== Exercise l =====");

		Intervalo l1 = new Intervalo(2.0, 6.0);
		Intervalo l2 = new Intervalo(4.0, 8.0);
		Intervalo interseccionL = l1.interseccion(l2);

		System.out.println("Intersection: " + interseccionL);

		/*************************************/
		System.out.println("\n===== Exercise m =====");

		Intervalo m1 = new Intervalo(2.0, 6.0);
		Intervalo simetricoM = m1.simetrico(m1);

		System.out.println("Symmetric: " + simetricoM);

	}

}
