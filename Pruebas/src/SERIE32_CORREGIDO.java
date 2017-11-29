
public class SERIE32_CORREGIDO {
	static final int kINICIO = 2; // NO ES NECESARIA
	static final int kTRES = 3;
	static final int kDOS = 2;

	public static void main(String[] args) {

		// Declaracion e inicializacion de variables estaticas

		// Declaracion e inicializacion de variables
		int contador = 0;
		int lineas = 1;

		// Inicializo mi contador
		contador = kINICIO;
		System.out.print(contador + " ");

		do {

			if (lineas % 10 == 0) // MEJORA, cada 20 impresiones, bajo de linea
				System.out.println();

			// imprime los dos siguientes numeros de la serie
			contador = contador + kTRES;
			System.out.print(contador + " ");
			contador = contador + kDOS;
			System.out.print(contador + " ");
			lineas++;

		} while (contador <= 1800); // Sigue mientras el contador no llegue a 1800

		// MEJORA Para no sobrepasar los 1800
		// }while (contador<1797);
		// System.out.print(1800);
	}

	// TODO Auto-generated method stub

}
