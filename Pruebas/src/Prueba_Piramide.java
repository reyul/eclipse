import java.util.Scanner;
public class Prueba_Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int filas=0,fila=0,espacios=0,cont =1;
		char char1='i';
		System.out.println("Introduce el numero de filas de la primera piramide");
		filas = input.nextInt();
		System.out.println("Introduce con que quieres que se haga la piramide");
		char1 = input.next().charAt(0);
		fila = filas;
		for(int i=0;i<filas;i++) {
			fila--;
			espacios = fila;
			for(int a=0; a<espacios;a++) {
				
				System.out.print(" ");
				
			}
			for(int e=0;e<cont;e++) {
				
				System.out.print(char1);
				
			}
			cont = cont +2;
			
			
			
			System.out.println("");
			
		}
		
		int filasR=0,espaciosR=0,contR=0;
		
		espaciosR=espacios+1;
		filasR=filas-1;
		contR = cont - 4;
		
		for(int r=0;r<filasR;r++) {
			
			for(int e =0; e<espaciosR;e++) {
				
				System.out.print(" ");
				
			}
			espaciosR++;
			
			for (int u=0; u<contR;u++) {
				
				System.out.print(char1);
				
			}
			contR = contR - 2;
			
			
			
			
			System.out.println("");
			
		}
		
	}

}
